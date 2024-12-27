class Rectangle{
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length + width);
    }
    public void displayinfo(){
        System.out.println("Length :"+length+"\nWidth :"+width);
        System.out.println("Area :"+getArea());
        System.out.println("Perimeter :"+getPerimeter());
    }  
}

public class Main3 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(6,4);
        Rectangle rect2 = new Rectangle(5,4);
        System.out.println("Rectangle 1:");
        rect1.displayinfo();
        System.out.println("Recxtangle 2:");
        rect2.displayinfo();
    }
    
}
