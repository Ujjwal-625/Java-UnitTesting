public class BankAccount {
    private static float balance=100;

    public  static  float getBalance(){
        return balance;
    }

    public static void setBalance(){
        balance=100;
    }

    public static void deposit(float a){
        balance+=a;
    }

    public static void withdrawl(float amount ) throws Exception{
        if(amount<=balance){
            balance-=amount;
        }
        else{
            throw new Exception("Amount can not be greater than Balance");
        }
    }
}
