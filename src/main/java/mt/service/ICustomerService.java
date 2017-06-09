package mt.service;

import java.util.List;
import java.util.Map;

import mt.model.Customer;

public interface ICustomerService {

	/**
	 * ��ȡ�ͻ��б�
	 * @param key
	 * @return list
	 */
	public List<Customer> getList(String key);
	
	/**
	 * ��ȡ�ͻ���Ϣ
	 * @param customerId
	 * @return
	 */
	public Customer getCustomerInfo(String customerId);
	
	/**
	 * �½��ͻ�
	 * @param map
	 * @return
	 */
	public boolean createCustomer(Map<String, Object> map);
	
	/**
	 * ���¿ͻ�
	 * @param map
	 * @return
	 */
	public boolean updateCustomer(Map<String, Object> map);
	
	/**
	 * ɾ���ͻ�
	 * @param map
	 * @return
	 */
	public boolean deleteCustomer(Map<String, Object> map);
}
