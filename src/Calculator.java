public class Calculator {

    public static <Num1 extends Number, Num2 extends Number> double sum(Num1 num1, Num2 num2){
        return num1.doubleValue() + num2.doubleValue();
    }
    public static <Num1 extends Number, Num2 extends Number> double subtraction(Num1 num1, Num2 num2){
        return num1.doubleValue() - num2.doubleValue();
    }
    public static <Num1 extends Number, Num2 extends Number> double multiply(Num1 num1, Num2 num2){
        return num1.doubleValue() * num2.doubleValue();
    }
    public static <Num1 extends Number, Num2 extends Number> double divide(Num1 num1, Num2 num2){
        return num1.doubleValue() / num2.doubleValue();
    }

}
