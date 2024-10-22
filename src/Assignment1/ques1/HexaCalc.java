package Assignment1.ques1;

public class HexaCalc {

	public static void main(String[] args) {
		String a = "1A";
		String b = "1AB";
         HexaCalcService service = new HexaCalcService();
		 System.out.println(service.decToHexa(427)); 
		 System.out.println(service.add(a, b));
		  System.out.println(service.subtract(a, b));
		  System.out.println(service.multiply(a, b));
		  System.out.println(service.divide(a, b));
		  System.out.println(service.comparator(a, b,">"));
	}

}
