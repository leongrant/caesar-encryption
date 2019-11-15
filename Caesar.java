// Caesar-Verschluesselung v1 |  @grantleo |   GdP Uebung 2
import java.util.ArrayList;

class Caesar
{
	public static void main (String[] args)
	{
		int argsCount = args.length;
		ArrayList<String> inputs = new ArrayList<String>();

		int k = Integer.parseInt(args[0]);

		for(int i=1; i < argsCount; i++)
		{
			inputs.add(args[i]);
		}

		for(String arg : inputs)
		{
			char[] argChar  = arg.toCharArray();

			for(char ch : )
			{

			}
		}
		//char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		//char[] alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	}
}
