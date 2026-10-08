
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		System.out.println("Enter gpa");
		double GPA = Input.readDouble();
		System.out.println(gpa(GPA));

		System.out.println("Enter grade level");
		int year = Input.readInt();
		System.out.println("Enter total amount of credits");
		double cred = Input.readDouble();
		System.out.println(isGrad(year, cred));

  }
  double gpa(double value){
	if(value>90)
		return value*1.1;
	else
		return value;
  }

 
  boolean isGrad(int grade, double credit){
	if(grade>11 && credit>=44)
		return true;
	else
		return false;
  }

}