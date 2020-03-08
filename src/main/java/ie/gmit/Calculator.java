package ie.gmit;

public class Calculator {

    private int firstNum;
    private int secondNum;


    public Calculator(){
        this.firstNum = 0;
        this.secondNum = 0;
    }

   public int add(int firstNum, int secondNum){
      int result = firstNum + secondNum;
      return result;
   }
}
