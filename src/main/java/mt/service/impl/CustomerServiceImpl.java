package mt.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;












import javax.activation.DataHandler;
import javax.servlet.jsp.jstl.sql.Result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mt.helper.DataBaseHelper;
import mt.model.Customer;
import mt.service.ICustomerService;
import mt.util.CastUtil;
import mt.util.PropsUtil;

/**
 * @author zj
 *
 */
public class CustomerServiceImpl implements ICustomerService {
	
	private static Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	/**
	 * 获取客户列表
	 * @return list
	 */
	public List<Customer> getList(){
		
		Connection conn = null;
		try {
			List<Customer> customers = new ArrayList<Customer>();
			String sql = "select * from T_CUSTOMER_INFO";
			/*conn = DataBaseHelper.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			while(result.next()){
				Customer customer =  new Customer();
				customer.setId(result.getString("ID"));
				customer.setName(result.getString("NAME"));
				customer.setPhoneNo(result.getString("PHONE_NO"));
				customer.setEmail(result.getString("EMAIL"));
				customer.setContact(result.getString("CONTACT"));
				customer.setRemark(result.getString("REMARK"));
				
				customers.add(customer);
			}*/
			
			return DataBaseHelper.queryEntityList(Customer.class, sql);
		} catch (Exception e) {
			log.error("execute sql failure",e);
		}
		return null;
	}
	
	/**
	 * 获取客户信息
	 * @param customerId
	 * @return
	 */
	public Customer getCustomerInfo(String customerId){
		//TODO
		return null;
	}

	/**
	 * 新建客户
	 * @param map
	 * @return
	 */
	public boolean createCustomer(Map<String, Object> map){
		//TODO
		return false;
		
	}
	
	/**
	 * 更新客户
	 * @param map
	 * @return
	 */
	public boolean updateCustomer(Map<String, Object> map){
		//TODO
		return false;
		
	}
	
	/**
	 * 删除客户
	 * @param map
	 * @return
	 */
	public boolean deleteCustomer(Map<String, Object> map){
		//TODO
		return false;
		
	}
}
