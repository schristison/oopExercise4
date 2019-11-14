public class Person{
    //Attributes
    //public String name;
    private String name;
    public int age;
    public int points;

    //constructor 
    public Person(String name, int age){

        this.name=name;
        this.age=age;
        this.points=100;
    }

    //create a method - a method is an action that can return something like void, getters

    // this is a typical method
    public void setName(String name){
            this.name=name;
    }

    public String getName(){
        return this.name;
    }
    public void sayHello(String friend){
        System.out.println("Hello " + friend);
        //This is our template for creating persons
    }
    //for the method to work properly, use the reserved word 'this'
    public void printP(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.points);
    }
    //to return the age - it is not a void, so we use public int
    public int getAge(){

        return this.age;
    }
    
}