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
  }

  String madlib(String adj, String noun, String verb){
		String result = "The " + adj + " " + noun+ " " + verb+".";
		return result;
	}
	
	double areaOfSqu(double side){
		double result = side * side;
		return result;
	}
  
 
}