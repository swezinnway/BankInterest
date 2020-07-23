package BANK;

public class ChildBranch extends Bank implements Bankfunction{
public ChildBranch(double amt) {
		super(amt);
		// TODO Auto-generated constructor stub
	}


	


	@Override
	public void increment(double amt) {
		// TODO Auto-generated method stub
		super.totalAmount+=amt;
		System.out.println("Increased balance:"+totalAmount);
	}


	@Override
	public void decrement(double amt) {
		// TODO Auto-generated method stub
		super.totalAmount-=amt;
		System.out.println("Decrement balance:"+totalAmount);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildBranch chb=new ChildBranch(1000);
chb.increment(20000);
chb.decrement(10000);

	}

}
