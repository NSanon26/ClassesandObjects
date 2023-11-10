public class Circle {
    public int radius;


    public Circle(int pRadius){
        radius = pRadius;
    }
    public void display(){
        System.out.println("The radius is " + radius + ".");
    }

    public void getArea(){
        System.out.println("The area is " + (3.14 * radius * radius) + ".");
    }
    public void getCircumference(){
        System.out.println("The Circumference is " +(2*3.14*radius) );
    }
}

