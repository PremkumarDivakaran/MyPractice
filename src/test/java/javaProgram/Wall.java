package javaProgram;

public class Wall {

    private double width;
    private double height;

    public Wall(){
        this(1.0, 2.0);
        System.out.println("adfd");
    }

    private Wall(double width, double height){
        setHeight(height);
        setWidth(width);
    }

    public void setWidth(double width){
        if (width >= 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public double getWidth(){
        return this.width;
    }

    public void setHeight(double height){
        if (height >= 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public double getHeight(){
        return this.height;
    }

    public double getArea(){
        return (this.height * this.width);
    }

}
