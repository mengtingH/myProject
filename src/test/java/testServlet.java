import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import mt.model.Customer;
import mt.service.impl.CustomerServiceImpl;
public class testServlet {

	private final CustomerServiceImpl customerService;
	
	public testServlet(){
		customerService = new CustomerServiceImpl();
	}
	
	@Before
	public void init(){
		
	}
	
	@Test
	public void getList(){
		
		List<Customer> customers =  new ArrayList<Customer>();
		customers = customerService.getList();
		System.out.println(customers.size());
//		Assert.assertEquals(2, customers.size());
	}
	
}
