package ie.gmit;

public class Calculator {

    int firstNum;
    int secondNum;
    int sum;

    public int getFirstNum() {
        return firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public int getSum() {
        sum = firstNum + secondNum;
        return sum;
    }
}
