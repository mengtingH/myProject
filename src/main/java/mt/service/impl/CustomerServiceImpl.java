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
	 * ��ȡ�ͻ��б�
	 * @param key
	 * @return list
	 */
	public List<Customer> getList(String key){
		return null;
	//TODO	
	}
	
	/**
	 * ��ȡ�ͻ���Ϣ
	 * @param customerId
	 * @return
	 */
	public Customer getCustomerInfo(String customerId){
		//TODO
		return null;
	}

	/**
	 * �½��ͻ�
	 * @param map
	 * @return
	 */
	public boolean createCustomer(Map<String, Object> map){
		//TODO
		return false;
		
	}
	
	/**
	 * ���¿ͻ�
	 * @param map
	 * @return
	 */
	public boolean updateCustomer(Map<String, Object> map){
		//TODO
		return false;
		
	}
	
	/**
	 * ɾ���ͻ�
	 * @param map
	 * @return
	 */
	public boolean deleteCustomer(Map<String, Object> map){
		//TODO
		return false;
		
	}
}
