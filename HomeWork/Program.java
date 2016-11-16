import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("чья площадь нужна?" + "\n" + "1:Круг"+"\n" +"2:Прямоугольник"+"\n" +"3:треугольник"+"\n" );
        int s= sc.nextInt();
            Stars stars = new Stars();

        switch (s){
            case 1:
                System.out.println("Ввидите Диамтр");
                int r = sc.nextInt();
                Circle circle1 = new Circle (r);
                        System.out.println(circle1.area()); //answer;
                break;

            case 2:
                System.out.println("Ввидите стороны");
               int a = sc.nextInt();
                int b = sc.nextInt();
                Rectangle rectangle = new Rectangle(a,b);
                  System.out.println(rectangle.area()); //answer;
                break;

            case 3:
                System.out.println("Ввидите сторону и высоту");
                 a = sc.nextInt();
                int h = sc.nextInt();
                Triangle triangle = new Triangle(a,h);
                         System.out.println(triangle.area()); //answer;
                break;

            default:
                 System.out.print(":D");

        }
        stars.www();

    }
}