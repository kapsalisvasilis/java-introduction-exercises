class BankAccount
{
	public double amount;
	
	public void deposit(double x){
		amount += x;
	}
	
	public double withdraw(double x){
		if (x > amount){
			return 0;
		}else{
			amount -= x;
			return x;
		}
	}
	
	public void printStatement(){
		System.out.println("The balance in the account is "+amount);
	}
}

class TestBankAccount
{
	public static void main(String[] args){
		BankAccount myAccount = new BankAccount();
		myAccount.deposit(300);
		double pocketMoney = myAccount.withdraw(50);
		myAccount.deposit(100);
		pocketMoney += myAccount.withdraw(200);
		myAccount.printStatement();
		System.out.println("Pocket money is "+pocketMoney);
	}
}
