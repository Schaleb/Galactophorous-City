import java.util.*;
public class Choice
{
	
	/**
	* yesNo
	* Shortcut for using giveChoice with only the options "Yes" and "No"
	* @param choice What should be printed to let the user know what they are choosing from
	* @return An integer representing which option the user chose
	*/
	public int yesNo(String choice)
	{
		String[] yesNoArr = {"Yes", "No"};
		return giveChoice(choice, yesNoArr);
	}

	/**
	* giveChoice
	* Prints a list of options for the user to pick from
	*
	* @param choice What should be printed to let the user know what they are choosing from
	* @param String An array of the options the user should pick from
	* @return An integer representing which option the user chose
	*/
	public int giveChoice(String choice, String[] options)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(choice);
		for(int i = 0; i < options.length; ++i)
		{
			System.out.println(i+1 + ": " + options[i]);
		}
		int answer = scan.nextInt();
		return answer;
	}
}