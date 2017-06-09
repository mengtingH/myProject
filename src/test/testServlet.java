package test;

import mt.service.ICustomerService;
public class testServlet {

	private final ICustomerService customerService;
	
	public CustomerServiceTest(){
		customerService = new ICustomerService();
	}
	
	@Before
	public void init(){
		
	}
	
	
}
