package day02;

public class GetterSetterDriver {
	public static void main(String[] args) {
		GetterSetter gs = new GetterSetter();
		gs.setAccNo(2223);
		gs.setAccOwnerName("John");
		gs.setBalance(500000);
		System.out.println("Account Number : "+gs.getAccNo());
		System.out.println("Account Holder Name : "+gs.getAccOwnerName());
		System.out.println("Account Balance : "+gs.getBalance());
		System.out.println("================================================");
		GetterSetter gs1 = new GetterSetter();
		gs1.setAccNo(25623);
		gs1.setAccOwnerName("Jenny");
		gs1.setBalance(1000000);
		System.out.println("Account Number : "+gs1.getAccNo());
		System.out.println("Account Holder Name : "+gs1.getAccOwnerName());
		System.out.println("Account Balance : "+gs1.getBalance());
		System.out.println("================================================");
	}
}
