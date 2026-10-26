class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println("Enter value for n");
    int space = Input.readInt();
    System.out.println(spaces(space)+"done");
  }
  String spaces(int n){
    String s = " ";
    for(int x=0; x<= n; x++){
      s += " ";;
    }
    return s;
  }

  
}