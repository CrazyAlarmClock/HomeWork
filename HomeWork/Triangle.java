/**
 * Created by chrx on 14.11.16.
 */
public class Triangle {
    int h;
    int a;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    Triangle (int a, int h){
        this.a=a;
        this.h=h;
    }

    Triangle(){
        this (666,666);
    }
    Triangle(int lol){
        this.a=this.h=lol;
    }
     int area(){
        return (this.h/2*this.a);
    }

}
