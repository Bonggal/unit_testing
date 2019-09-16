package main.java.Calculator;

public class Calculator {
    public int addition(int num1, int num2){
        return num1+num2;
    }

    public int substraction(int num1, int num2){
        return num1-num2;
    }

    public int multiplication(int num1, int num2){
        return num1*num2;
    }

    public double division(int num1, int num2){
        return (double) num1/num2;
    }

    public double squareRoot(int num1){
        return Math.sqrt(num1);
    }

    public double power(int num1, int num2){
        return Math.pow(num1,num2);
    }

    public double modulus(double num1, double num2){
        return num1%num2;
    }
}
