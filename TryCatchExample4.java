import java.util.* ;

class InvalidExp extends Exception{
    public String toString(){
        return "Cannot add 8 & 9 " ;
    }
    public String getMessage(){
        return super.getMessage();
    }
}
class CannotDivideByZero extends Exception {
    public String toString(){
        return "Cannot divide by zero" ;
    }
    public String getMessage(){
        return super.getMessage();

    }
}
class MaxInput extends Exception{
    public String toString(){
        return "Cannot exceed 2422232 " ;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

class CustomCal {
    double add(double a, double b) throws InvalidExp , MaxInput{
        if(a>100000 || b >1000000){
            throw new MaxInput() ;
        }
        if(a== 8 && b ==9){
            throw new InvalidExp() ;
        }
        return a+b ;
    }
    double subs(double a, double b) throws MaxInput{
        if(a>100000 || b >1000000){
            throw new MaxInput() ;
        }
        return a-b ;
    }
    double multi(double a, double b) throws MaxInput{
        if(a>100000 || b >1000000){
            throw new MaxInput() ;
        }
        return a*b ;
    }
    double div(double a, double b) throws CannotDivideByZero , MaxInput{
        if(a>100000 || b >1000000){
            throw new MaxInput() ;
        }
        if(b==0){
            throw new CannotDivideByZero();
        }
        return a/b ;
    }
}

public class TryCatchExample4 {
    public static void main(String[] args) throws InvalidExp,CannotDivideByZero,MaxInput {
        CustomCal cs = new CustomCal() ;

        System.out.println(cs.add(8, 9));
        System.out.println(cs.div(24, 1));
        System.out.println(cs.div(242, 0));
        System.out.println(cs.add(242424242,424232424));


    }

}