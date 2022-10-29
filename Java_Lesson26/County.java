public class County extends City {

    private String name;
    
    public County(String name) {
        this.name = name;
        //parametized constructor
    }

    public void cityName() {
        System.out.println("hello from my county");
        //overload
    }

    public void cityName(String name) {
        System.out.println("hello from" + name + "county");
        //overload 
    }

    public void displayName() {
        System.out.println("the county name is: " name);
        //override
    }



} 
    

