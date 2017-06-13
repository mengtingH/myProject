package mt.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import mt.util.CollectionUtil;
import mt.util.PropsUtil;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataBaseHelper {

private static Logger log = LoggerFactory.getLogger(DataBaseHelper.class);

private static final QueryRunner QUERY_RUNNER = new QueryRunner();

private static final ThreadLocal<Connection> CONNECTION_HOLDER = new ThreadLocal<Connection>();
	
	private static final String DRIVER;
	private static final String URL;
	private static final String USERNAME;
	private static final String PASSWORD;
	
	static{
		Properties conf = PropsUtil.loadProps("config.properties");
		DRIVER = conf.getProperty("jdbc.driver");
		URL = conf.getProperty("jdbc.url");
		USERNAME = conf.getProperty("jdbc.username");
		PASSWORD = conf.getProperty("jdbc.passwd");
		
		try{
			Class.forName(DRIVER);
		}catch(ClassNotFoundException e){
			log.error("can not load jdbc driver",e);
		}
	}
	
	/**
	 * 创建数据库连接
	 * @return
	 */
	public static Connection getConnection(){
		Connection conn = CONNECTION_HOLDER.get();
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			log.error("create connection failure",e);
		}finally{
			CONNECTION_HOLDER.set(conn);
		}
		return conn;
	}
	
	/**
	 * 关闭数据库连接
	 * @param conn
	 */
	public static void closeConnection() {
		Connection conn = CONNECTION_HOLDER.get();
		if(conn!=null){
			try {
				conn.close();
			} catch (Exception e) {
				log.error("close connection failure",e);
			}finally{
				CONNECTION_HOLDER.remove();
			}
		}
	}
	
	
	/**
	 * 查询实体列表
	 * @param entityClass
	 * @param conn
	 * @param sql
	 * @param params
	 * @return
	 */
	public static <T>List<T> queryEntityList(Class<T> entityClass,String sql,Object... params){
		List<T> entityList;
		try {
			Connection conn = getConnection();
			entityList = QUERY_RUNNER.query(conn, sql,new BeanListHandler<T>(entityClass),params);
		} catch (Exception e) {
			log.error("query entity List failure",e);
			throw new RuntimeException(e);
		}finally{
			closeConnection();
		}
		return entityList;
	}
	
	/**
	 * 查询实体
	 * @param entityClass
	 * @param sql
	 * @param params
	 * @return
	 */
	public static <T> T queryEntity(Class<T> entityClass,String sql,Object... params){
		
		T entity;
		try {
			Connection conn = getConnection();
			entity = QUERY_RUNNER.query(conn, sql,new BeanHandler<T>(entityClass),params);
		} catch (Exception e) {
			log.error("query entity List failure",e);
			throw new RuntimeException(e);
		}finally{
			closeConnection();
		}
		return entity;
		
	}
	
	/**
	 * 复合查询
	 * @param sql
	 * @param params
	 * @return
	 */
	public static List<Map<String, Object>> executeQuery(String sql,Object... params){
		List<Map<String, Object>> result;
		try {
			Connection conn = getConnection();
			result = QUERY_RUNNER.query(conn, sql,new MapListHandler(),params);
		} catch (Exception e) {
			log.error("execute entity List failure",e);
			throw new RuntimeException(e);
		}finally{
			closeConnection();
		}
		return result;
	}
	
	/**
	 * 更新（up，ins，del）
	 * @param sql
	 * @param params
	 * @return
	 */
	public static int executeUpdate(String sql, Object... params){
		int rows = 0;
		try{
			Connection conn = getConnection();
			rows = QUERY_RUNNER.update(conn, sql,params);
		}catch (Exception e) {
			log.error("execute update failure",e);
			throw new RuntimeException(e);
		}finally{
			closeConnection();
		}
		return rows;
	}
	
	public static <T> boolean insertEntity(Class<T> entityClass,Map<String, Object>map){
		if(CollectionUtil.isEmpty(map)){
			log.error("can not insert entity:map is empty");
			return false;
		}
		
		String sql = "insert into "+getTableName(entityClass);
	}
}
