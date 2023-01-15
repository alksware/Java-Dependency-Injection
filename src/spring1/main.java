package spring1;

public class main {
	public static void main(String[] args) {
		CustomerManager manager = new CustomerManager(new CustomerDal());
		manager.add();
	}
}
