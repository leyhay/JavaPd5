class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    print(penny);
    print(tworand);
  }
  void penny(){
    count+=0;
    while(!(p<5.00)){
      double pen = Math.pow(0.01,count);
    }
    print("It takes " +penny+" amount of days for the penny to double to get to or surpass 5 dollars.");
  }
  void tworand(){
    int first = randInt(1,10);
    int second = randInt(1,10);
    int ans = first+second;
    print("Guess the sum of two positive integers under 21.");
    int guess = Input.readInt();
    while(!(guess==ans)){
      print("Hah, what a loser. Try again!");
      guess = Input.readInt();
    }
    print("Yay! You guessed correctly!");
  }
  
  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}