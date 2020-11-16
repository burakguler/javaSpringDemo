package springIntro;

public class CustomerDal implements ICustomerDal{ //Oracle islemleri icin dal
	public void add() {
		System.out.println("Oracle veritabanina eklendi!");
	}
}
