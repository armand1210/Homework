
public class Topic_poll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] topic = new String[4];
		topic[0] = "Sports";
		topic[1] = "Music";
		topic[2] = "Food";
		topic[3] = "Politics";
		topic[4] = "Movies";

		for(int  responses : topic ) {
			Scanner in = new Scanner(System.in);
			System.out.print("Rate %s on importance from 1 to 10", topic[responses]);
			in = nextInt();
			topic[]++;
		}
	}

}
