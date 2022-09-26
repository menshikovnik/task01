import java.util.Scanner;

public class Main {

    public static double area(double r)
    {
        return Math.PI * (r * r);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double r1 = readNumber("Введите r1:");
        double r2 = readNumber("Введите r2:");
        double s1 = area(r1);
        double s2 = area(r2);
        double s3 = s2 - s1; //площадь пространства между двух кругов
        double s4 = s3/4 * 3; //площадь заштрихованного в этом пространстве
        double s5 = s2/4; //площадь заштрихованного в малом круге
        double sideSquare = r2 * 2; //сторона квадрата
        double sk = areaSquare(sideSquare); //площадь квадрата
        double s6 = (sk - s2)/4; //площадь кголков в квадрте
        double S0 = s4 + s5 + s6; //общая площадь заштрихованных фигур
        System.out.println(S0);

    }

static double readNumber(String text) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(text);
    return scanner.nextDouble();
}
static double areaSquare(double a){
        return a * a;
}
        }

