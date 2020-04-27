import java.util.*;
class One {

    int real , imag;
    One(One q1) {
        System.out.println("Constructor Overloading is Here...");
        this.real=q1.real;
        this.imag=q1.imag;
    }
    One(int real,int imag) {
        this.real = real;
        this.imag = imag;
    }
public static void main(String []args){
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter real and imaginary number : ");
    int real = obj.nextInt();
    int imag = obj.nextInt();
    One q1 = new One(real,imag);
    System.out.println("Real of q1 : "+q1.real+" Imag of q1 : "+q1.imag);
    One q2 = new One(q1);
    System.out.println("Real of q2 : "+q2.real+" Imag of q2 : "+q2.imag);
}
}
