package Default;

public class RomanNumber {

	public String convert(int number) {
		
		StringBuilder sb = new StringBuilder();
		
		int reste = number;
		
		if(reste >= 4000) {
			return "error : out of limit";
		}
		
		if(reste <= 0) {
			return "error : not allowed";
		}
		
		while(reste >= 1000) {
			sb.append("M");
			reste = reste - 1000;
		}
		
		while(reste >= 900) {
			sb.append("CM");
			reste = reste - 900;
		}
		
		while(reste >= 500) {
			sb.append("D");
			reste = reste - 500;
		}
		
		while(reste >= 400) {
			sb.append("CD");
			reste = reste - 400;
		}
		
		while(reste >= 100) {
			sb.append("C");
			reste = reste - 100;
		}
	
		while(reste >= 90) {
			sb.append("XC");
			reste = reste - 90;
		}
		
		while(reste >= 50) {
			sb.append("L");
			reste = reste - 50;
		}
		
		while(reste >= 40) {
			sb.append("XL");
			reste = reste - 40;
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
