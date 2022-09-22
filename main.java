public class main {
    public static void main(String args[]) {
        Shape myShape = new Shape();
        myShape.area();

        Triangle myTriangle = new Triangle();//method 
        myTriangle.area();//overloading 
        myTriangle.area(" here");//overriding

        Circle myCircle = new Circle();
        myCircle.area();
        myCircle.area(" Here");

        Rectangle myRectangle = new Rectangle();
        myRectangle.area();
        myRectangle.area(" Here ");


        
    }
}
