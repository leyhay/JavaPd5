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
      else if(number.substring(0,4).equals("6011") || number.substring(0,2).equals(65))
        return "Discovery";
      else
        return "?";
  }

  String pigLatin(int word){
    String thing = word.subscript(1) + word.substring(0,1) + "ay";
  }

}