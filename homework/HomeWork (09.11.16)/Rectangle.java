/**
 * Created by chrx on 14.11.16.
 */
public class Rectangle {
    int a;
    int b;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    int area(){
        return  (this.a*this.b);
    }

    Rectangle(int a, int b){
        this.a=a;
        this.b=b;
    }
    Rectangle(){
        this(666,666);
    }
    Rectangle(int lol){
        this.a=this.b=lol;
    }




}
