package mt.service;

import java.util.List;
import java.util.Map;

import mt.model.Customer;

public interface ICustomerService {

	/**
	 * 获取客户列表
	 * @param key
	 * @return list
	 */
	public List<Customer> getList(String key);
	
	/**
	 * 获取客户信息
	 * @param customerId
	 * @return
	 */
	public Customer getCustomerInfo(String customerId);
	
	/**
	 * 新建客户
	 * @param map
	 * @return
	 */
	public boolean createCustomer(Map<String, Object> map);
	
	/**
	 * 更新客户
	 * @param map
	 * @return
	 */
	public boolean updateCustomer(Map<String, Object> map);
	
	/**
	 * 删除客户
	 * @param map
	 * @return
	 */
	public boolean deleteCustomer(Map<String, Object> map);
}
