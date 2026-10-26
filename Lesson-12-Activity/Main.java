class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println("Enter credit card number");
    String numb = Input.readString();
    String poop = creditCard(numb);
    System.out.println(poop);

    System.out.println("Enter a word");
    String pig = Input.readString();
    System.out.println(pigLatin(pig));

    System.out.println("Enter your zip code");
    String code = Input.readString();
    String zipcode = nycLocate(code);
    System.out.println(zipcode);
  }


  String creditCard(String number){
      if(number.substring(0,1).equals("4"))
        return "Visa";
      else if(number.substring(0,2).equals("34") || number.substring(0,2).equals(37))
        return "American Express";
      else if(number.substring(0,2).equals("26"))
        return "Diner Club";
      else if(number.substring(0,2).equals("55") || number.substring(0,2).equals("51"))
        return "Mastercard";
      else if(number.substring(0,4).equals("6011") || number.substring(0,2).equals("65"))
        return "Discovery";
      else
        return "?";
  }

  String pigLatin(String word){
    String thing = word.substring(1) + word.substring(0,1) + "ay";
    return thing;
  }

  String nycLocate(String zip){
    if(zip.substring(0,3).equals(100) || zip.substring(0,3).equals(101) || zip.substring(0,3).equals(102))
      return "Manhatten";
    else if(zip.substring(0,3).equals(103))
      return "Staten Island";
    else if(zip.substring(0,3).equals(104))
      return "Bronx";
    else if(zip.substring(0,3).equals(112))
      return "Brooklyn";
    else if(zip.substring(0,3).equals(113) || zip.substring(0,3).equals(114) || zip.substring(0,3).equals(111))
      return "Queens";
    else
      return "Not in nyc";
    }
}