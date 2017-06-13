import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import mt.model.Customer;
import mt.service.ICustomerService;
import mt.service.impl.CustomerServiceImpl;
import junit.framework.Assert;
import junit.framework.TestCase;


public class CustomerServiceTest extends TestCase {

private final ICustomerService customerService;
	
	public CustomerServiceTest(){
		customerService = new CustomerServiceImpl();
	}
	
	@Before
	public void init(){
	}
	
	public void testAdd(){
		List<Customer> customers =  new ArrayList<Customer>();
		System.out.println(2);
		customers = customerService.getList();
		System.out.println(1);
		System.out.println(customers.get(0).getId());
//		Assert.assertEquals(2, customers.size());
	}
	
	@Test
	public void getList(){
		
		List<Customer> customers =  new ArrayList<Customer>();
		customers = customerService.getList();
		Assert.assertEquals(2, customers.size());
	}
}
