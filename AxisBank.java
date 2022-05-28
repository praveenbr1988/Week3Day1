package Week3Day1;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("deposit in Axis");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AxisBank ab = new AxisBank();
		ab.savings();
		ab.fixed();
		ab.deposit();
		
		BankInfo bi = new BankInfo();
		bi.deposit();
		
	}

}
