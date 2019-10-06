
public class Count3s {

	public static void main(String[] args) {
		ReadInt32BitLE myReader = new ReadInt32BitLE("threesData.bin");
		myReader.open();
		while (false == myReader.EOF()) {
			int newValue = myReader.read();
		}
		System.out.println(myReader.getThreesCount().toString());

	}

}
