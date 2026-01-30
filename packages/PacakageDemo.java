import tools.*;

class PacakageDemo{
	
	public static void main(String args[]){

		Calculator cal= new Calculator();
		int res=cal.add(2,3);
		System.out.println("Result: " + res);

		AdvancedCalculator advCal= new AdvancedCalculator();
		double sqrt=advCal.squareRoot(9);
		System.out.println("squareRoot: " + sqrt);

	}
}