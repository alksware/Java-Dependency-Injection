package spring1;

public class MySqlCustomerDal implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("add to mysql");
	}

}
