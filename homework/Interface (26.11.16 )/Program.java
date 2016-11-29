import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        Figure figure1 = new Circle();
        Figure figure2 = new Oval();

         Test(figure1);
         Test(figure2);
    }

    public static void Test (Figure figure){
     figure.Draw();

    }
}
