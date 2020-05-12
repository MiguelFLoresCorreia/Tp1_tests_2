package Default;

public class RomanNumber {

	public String convert(int number) {
		
		StringBuilder sb = new StringBuilder();
		
		int reste = number;
		
		while(reste >= 50) {
			sb.append("L");
			reste = reste - 50;
		}
		
		while(reste >= 10) {
			sb.append("X");
			reste = reste - 10;
		}
		
		while(reste >= 9) {
			sb.append("IX");
			reste = reste - 9;
		}
		
		while(reste >= 5) {
			sb.append("V");
			reste = reste - 5;
		}
		
		while(reste >= 4) {
			sb.append("IV");
			reste = reste - 4;
		}
	
		while(reste >= 1){
			sb.append("I");
			reste = reste - 1;
		}
		
		return sb.toString();
	}
	
}
