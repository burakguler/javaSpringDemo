package springIntro;

public class MySqlCustomerDal implements ICustomerDal {  //MySql islemleri icin dal

	@Override
	public void add() {
		System.out.println("MySql veritabanina eklendi!");
		
	}

}
