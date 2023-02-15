public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        // This constructor has one parameter, name.
        System.out.println("Puppy name is: " + name );
    }

    public void setPuppyAge( int age ) {
        puppyAge = age;
    }

   public int getPuppyAge () {
        System.out.println("Puppy age is: " + puppyAge);

        return puppyAge;
   }


    public static void main(String []args) {
        // Following statement would create an object myPuppy
        Puppy myPuppy = new Puppy( "tommy" );

        myPuppy.setPuppyAge(2);

        myPuppy.getPuppyAge();

        System.out.println("My puppy age: " + myPuppy.puppyAge);
    }
}
