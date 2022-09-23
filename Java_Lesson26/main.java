/**
 * Felipe Ruiz 
 * Lesson 26 - polymorphism , overriding, overloading
 * arrays 
 * / */

public class main {

    public static void main(String args[]){
        City myhail = new City();
        myhail.hail();

        County myCounty = new County();
        myCounty.hail();//overloading
        myCounty.hail("hello county");//overriding 

        City myCity = new City();
        myCity.displayName();

        County myCountyN = new County();
        myCountyN.displayName();
    

    }
    
}
