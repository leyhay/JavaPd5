
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

		System.out.println("Enter weight in pounds");
		double w = Input.readDouble();
		System.out.println("Enter height in inches");
		double h = Input.readDouble();
		System.out.println(BMI(w,h));

		System.out.println("Enter weight in pounds of item");
		double we = Input.readDouble();
		System.out.println(shippingCost(we));

		System.out.println("Enter light frequency in THz");
		int blue = Input.readInt();
		System.out.println(blueOrViolet(blue));

  }
  double gpa(double value){
	if(value>90)
		return value*1.1;
	else
		return value;
  }

  String isGrad(int grade, double credit){
	if(grade>11 && credit>=44)
		return "Student is graduating";
	else
		return "Student is not graduating";
  }

  String BMI(double weight, double height){
	double bmi = (weight/(height*height))*703;
	if(bmi<=18.4)
		return "Underweight";
	else if(bmi>=18.5&&bmi<=24.9)
		return "Normal";
	else if(bmi>=25.0&&bmi<=39.9)
		return "Overweight";
	else
		return "Obese";
  }

  double shippingCost(double weight){
	if(weight<=10)
		return 0.00;
	else if(weight>10&&weight<=15)
		return 5.00;
	else if(weight>15&&weight<=25)
		return 10.00;
	else
		return 10.0+((weight-25)*0.02);
  }

  String blueOrViolet(int THz){
	if(THz>600&&THz<670)
		return "true";
	else if(THz>700&&THz<750)
		return "false";
	else
		return "N/A";
  }

}