package javaProgram;

import org.testng.annotations.Test;

public class SubWall extends Wall {

    public SubWall(){

    }

    public SubWall(int testNumber){
        this();
    }

    @Test
    public void testin(){

    }


    // constructor :
    // ============
    // No Return Type, Same name as className (First letter Caps), overloading can be,
    // One constructor can be called in another constructor (same class or sub class.
    // Same class - this(), sub class - super() ). But calling should happen in first
    // line. And from methods constructor are not called.
    // private is acceptable. But sub class cannot call constructor if that is private.
    // By default constructor is present in all classes even if its not defined
    // Creating object means calling constructor (using new keyword)


}
