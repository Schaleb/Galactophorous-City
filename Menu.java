public class Menu
{
	private String[] menuOptions = {"Go to...", "Check Balance", "Save", "Quit"};
	private int userChoice;

	/**
	* showMenu
	* Shows the main menu of the game
	*/
	public boolean showMenu()
	{
		Choice choice = new Choice();
		userChoice = choice.giveChoice("\nMenu: ", menuOptions);
		if(userChoice == 1)
		{
			return true;
		}
		else if(userChoice == 2)
		{
			Money money = new Money();
			money.showMoney();
			return false;
		}
		else if(userChoice == 3)
		{
			System.out.println("\nSAVED (fake)");
			return false;
		}
		else if(userChoice == 4)
		{
			userChoice = choice.yesNo("Are you sure you want to quit? Any unsaved progress will be deleted.")
			if(userChoice == 1)
			{
				System.out.println("\nExiting...");
				System.exit(0);
			}
			else if(userChoice == 2)
			{
				return 0;
			}
		}
	}
}