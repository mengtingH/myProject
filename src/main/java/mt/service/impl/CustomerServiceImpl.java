package mt.service.impl;

import java.util.List;
import java.util.Map;

import mt.model.Customer;
import mt.service.ICustomerService;

/**
 * @author zj
 *
 */
public class CustomerServiceImpl implements ICustomerService {
	
	/**
	 * 获取客户列表
	 * @param key
	 * @return list
	 */
	public List<Customer> getList(String key){
		return null;
	//TODO	
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
