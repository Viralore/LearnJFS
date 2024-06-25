package lambdademo;

public class BankAccount
{
	private static int nextAccno = 101;
	int accno;
	double balance;
	int custID;
	String ifsc;
	public BankAccount(double balance, int custID, String ifsc) 
	{
		super();
		this.accno = nextAccno++;
		this.balance = balance;
		this.custID = custID;
		this.ifsc = ifsc;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", balance=" + balance + ", custID=" + custID + ", ifsc=" + ifsc + "]";
	}
}