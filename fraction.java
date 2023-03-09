
public class Fraction {
    public static void main(String[] args) {
        Fraction f1=new Fraction(2,4);
        System.out.println("The First Fraction : "+f1);
        Fraction f2=new Fraction(155,21);
        System.out.println("The First Fraction : "+f2);
        System.out.println(f1+" + "+f2+" = "+f1.add(f2));
       
     }
    private int numerator,denominator;
    public Fraction(int n, int d){
        int g=gcd(n,d);
        this.numerator = n/g;
        this.denominator = d/g;
        if(this.denominator==0)
            throw new ArithmeticException ();
    }
    public int gcd(int a,int b){
        if(b!=0)
            return gcd(b,a%b);
        return a;
    }
    public int getNum(){return this.numerator;}
public int getDenom(){return this.denominator;}
public void setNum(int n){this.numerator=n;}
public void setDenom(int d){ 
    this.denominator = d;
        if(this.denominator==0)
            throw new ArithmeticException ();}
    
    public boolean equal(Fraction other) {
        
        if (this.numerator != other.numerator) {
            return false;
        }
        if (this.denominator != other.denominator) {
            return false;
        }
        return true;
    }
    
    public Fraction add(Fraction t){
        int a=this.numerator;
        int b=this.denominator;
        int c=t.numerator;
        int d=t.denominator;
        int e,f;
        e=(a*d+b*c);
        f=b*d;
        return new Fraction(e,f);
    }
    public String toString(){
        return ""+numerator+"/"+denominator;
    }
   
}
