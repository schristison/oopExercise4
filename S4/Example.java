//this is just like the Main.java file in the Treehouse coursework
public class Example{

    public static void main(String args[]){

        //Person is a data type
        //create persons
        Person student1 = new Person("Josh",30);        
        Person student2 = new Person("Sandie",20);
        Person student3 = new Person("Mimi",15);
        Person student4 = new Person("Jim",40);   
        
        Animal animal1 = new Animal("Nala","Cat");
        Animal animal2 = new Animal("Cuddles","Cat");
        Animal animal3 = new Animal("Fluffy","Cat");
        Animal animal4 = new Animal("Dopey","Cat");

        animal1.attacks(student1.getName());
        animal2.attacks(student3.getName());
        animal3.attacks(student2.getName());
        animal4.attacks(student4.getName());
               
        student1.printP();
        student2.printP();
        student3.printP();
        student4.printP();

        
        //variables

        student1.sayHello(student2.getName());

        
    }

}