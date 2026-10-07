class Main {

	

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	System.out.println("Enter an adjective");
	String a = Input.readString();
	System.out.println("Enter a noun");
	String n = Input.readString();
	System.out.println("Enter a verb");
	String v = Input.readString();
	String words = madlib(a,n,v);
	System.out.println(words);
	System.out.println("Enter value for side");
	double s = Input.readDouble();
	double area = areaOfSqu(s);
	System.out.println(area);
	System.out.println("Enter value for radius");
	double r = Input.readDouble();
	double circ = areaOfCirc(r);
	System.out.println(circ);
  }

  String madlib(String adj, String noun, String verb){
		String result = "The " + adj + " " + noun+ " " + verb+".";
		return result;
	}
	
	double areaOfSqu(double side){
		double result = side * side;
		return result;
	}

	double areaOfCirc(double radius){
		double result = Math.PI * Math.pow(radius, 2);
		return result;
	}

	
 
}