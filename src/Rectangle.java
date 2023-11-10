public class Rectangle {
    public int width;
    public int length;

    public Rectangle(int pWidth, int pLength){
        width = pWidth;
        length = pLength;

    }
    public void display(){
        System.out.println("The width is " + width + ". The length is " + length + ".");
    }
   public void getArea(){
        System.out.println("The area is " + width * length + ".");
   }
   public void getPerimeter(){
        System.out.println("The Perimeter is " + (width + length) * 2 + ".");
   }

}
