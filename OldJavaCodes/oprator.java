package college.cjava;

public class oprator 
{
    public static void main(String[] args) 
    {
        int a=50,b=10;
        boolean x=true,y=false;
        
        
        System.out.println("\n\nfor arithmatic opration");
        System.out.println("sum is : "+(a+b));
        System.out.println("sub is : "+(a-b));
        System.out.println("mul is : "+(a*b));
        System.out.println("div is : "+(a/b));
        System.out.println("remeinder is : "+(a%b)+"\n\n");
        
        System.out.println("for relational opration ");
        System.out.println("grater than is : "+(a>b));
        System.out.println("less than is : "+(a<b));
        System.out.println("equal to is : "+(a==b));
        System.out.println("not equal to is : "+(a!=b)+("\n\n"));
        
        System.out.println("for logical opration ");
        System.out.println("and is : "+(x&&y));
        System.out.println("or is : "+(x||y));
        System.out.println("not is : "+(!y)+"\n\n");
        
        System.out.println("for assignment opration ");
        a=b;
        System.out.println("a=b is : "+(a));
        a+=b;
        System.out.println("a=a+b is : "+(a));
        a-=b;
        System.out.println("a=a-b is : "+(a));
        a*=b;
        System.out.println("a=a*b is : "+(a));
        a/=b;
        System.out.println("a=a/b is : "+(a)+"\n\n");
        
        System.out.println("for bitwise opration ");
        a=8;b=4;
        System.out.println("and is : "+(a&b));
        System.out.println("or is : "+(a|b));
        System.out.println("xor is : "+(a^b));
        System.out.println("not is : "+(~a));
    }
}
