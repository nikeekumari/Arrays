public class gcd {
    public static int greatestCommonDivisor(int a, int b){
        if(a==0){
        return b;
        }
        if(b==0){
            return a;
        }
        if(a==b){
        return a;
    }
    if(a>b){
        return greatestCommonDivisor(a-b, b);
    }
        else{
        return greatestCommonDivisor(a, b-a);
        }
    }
        public static void main(String[] args){
          int  a=98;
       int  b=56;
            System.out.println("gcd of"+" " + a +" "+ "and" +" "+ b +" " + "is" +" " + greatestCommonDivisor(a, b));
        }
    }


