
public class Circle {
    final double pi = 3.14;
    double diameter;

    public double getPi() {
        return pi;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }


    double area(){
        return (this.diameter * this.diameter * pi);
    }
    Circle(double r) {
        this.diameter = r;
    }
    Circle(){
        this(666);
    }

    Circle(int lol){
        this.diameter=lol;
    }
}