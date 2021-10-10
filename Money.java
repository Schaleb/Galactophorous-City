public class Money
{
	private int balance;
	private int bank;
	private int interest;
	
	/**
	* changeBal
	* For changing the user's balance
	* @param amount How much the user's balance should be changed by
	*/
	public void changeBal(int amount)
	{
		balance += amount;
	}

	/**
	* showMoney
	* Shows the user their curren financial info
	*/
	public void showMoney()
	{
		System.out.println("\nBalance: $" + balance + "\nBank: $" + bank + "\nInterest Gained: $" + interest);
	}

	// getters
	public int getBalance()
	{
		return balance;
	}
	public int getBank()
	{
		return bank;
	}
	public int getInterest()
	{
		return interest;
	}
}