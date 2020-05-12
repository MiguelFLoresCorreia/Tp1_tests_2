package Default;

public class RomanNumber {

	public String convert(int number) {
		
		StringBuilder sb = new StringBuilder();
		
		if(number >= 20) {
			return "XX";
		}
		else if(number >= 10) {
			return "X";
		}
		else {
			for(int i = 0;i < number;i++)
			{
				sb.append("I");
			}
		}
		
		return sb.toString();
	}
	
}
