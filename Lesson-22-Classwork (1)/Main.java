class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   String[] friends ={"sarah","elly","katelyn"};

   double[] temp = {4,67,90,35,102,81};
   double[] f = convert(temp);
    
  }
  double[] convert(double[] celcius){
    double[] farh = new double[celcius.length];
    for(int x=0; x<=celcius.length-1;x++){
      farh[x]=celsiusToFarhenheit(celcius[x]);
    }
    return farh;
  }

  

  double celsiusToFarhenheit(double c){
        return c*(9/5)+32;
  }
}