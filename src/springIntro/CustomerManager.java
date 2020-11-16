package springIntro;

public class CustomerManager implements ICustomerService {

	private ICustomerDal customerDal;
	
	//constructor inhection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		//work rules
		customerDal.add();
	}
	
}
