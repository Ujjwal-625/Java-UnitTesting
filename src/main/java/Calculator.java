public class Calculator {
    public float add(float a,float b){
        return a+b;
    }
    public float sub(float a,float b){
        return a-b;
    }
    public float multiply(float a,float b){
        return a*b;
    }
    public float division(float a,float b)  {
        if(b==0){
            throw new ArithmeticException("Can not divide by zero");
        }
        return a/b;
    }
}
