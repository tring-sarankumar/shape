package assignment.shape;
import java.util.Scanner;
public class App 
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("1.Triangle,2.rectangle, 3.circle, 4.Cancel . Enter 1/2/3/4");
        int shapetype =sc.nextInt();
        if(shapetype==1){
            System.out.println("Enter The Length 1:");
            Float trilength1=sc.nextFloat();
            System.out.println("Enter The Length 2:");
            Float trilength2=sc.nextFloat();
            System.out.println("Enter The Length 3:");
            Float trilength3=sc.nextFloat();
            ShapeLogic obj = new ShapeLogic("triangle", trilength1,trilength2,trilength3);
            System.out.println("The Perimeter of Triangle is "+obj.perimeter());
            System.out.println("The Area of Triangle is "+obj.area());
            System.out.println();
        }
        else if(shapetype==2){
            System.out.println("Enter The Length:");
            Float rectanglelength=sc.nextFloat();
            System.out.println("Enter The width:");
            Float rectanglewidth=sc.nextFloat();
            ShapeLogic obj = new ShapeLogic("rectangle", rectanglelength,rectanglewidth);
            System.out.println("The Perimeter of Rectangle is "+obj.perimeter());
            System.out.println("The Area of Rectangle is "+obj.area());
            System.out.println();
        }
        else if(shapetype==3){
            System.out.println("Enter The Radius:");
            Float circleradius=sc.nextFloat();
            ShapeLogic obj = new ShapeLogic("circle", circleradius);
            System.out.println("The Perimeter of Circle is "+obj.perimeter());
            System.out.println("The Area of Circle is "+obj.area());
            System.out.println();
        }
        else if(shapetype==4){
            break;
        }
    }
    }

}
