package edu.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        var person1 = new Person();
        var person2 = new PersonLombok();

        person1.setAge(1);
        person2.setAge(1);

        person1.setName("Maks");
        person2.setName("Maks");

        System.out.println(person1);
        System.out.println(person2);
    }
}
