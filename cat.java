// my function prints the song I desired in an order
// process for this function- I found the pattern in the song and make an method 
for each and calls each other in the functions
public class song {
    public static void main (String[] args) {
    // calls each other in the function 
    cat();
    hen();
    duck();
    goose();
    sheep();
    pig();
    }
    // method made for each patturn varibles
    public static void cat1() {
        System.out.println("Cat goes fiddle-i-fee.\n");
    }
    public static void hen1() {
        System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
        cat1();
    }
    public static void duck1() {
        System.out.println("Duck goes quack, quack,");
        hen1();
    }
    public static void goose1() {
        System.out.println("Goose goes hissy, hissy,");
        duck1();
    }
    public static void sheep1() {
        System.out.println("Sheep goes baa, baa,");
        goose1();
        
    }
    public static void pig1() {
        System.out.println("Pig goes oink, oink,");
        sheep1();
        
    }
    // calls each other for the printed lines so the correct methods will be 
displayed
    
    public static void cat() {
        System.out.println("Bought me a cat and the cat pleased me,\nI fed my cat 
under yonder tree.");
        cat1();
    }
    public static void hen() {
        System.out.println("Bought me a hen and the hen pleased me,\nI fed my hen 
under yonder tree.");
        hen1();
    
    }
    public static void duck() {
        System.out.println("Bought me a duck and the duck pleased me,\nI fed my 
duck under yonder tree.");
        duck1();
    }
    public static void goose() {
        System.out.println("Bought me a goose and the goose pleased me,\nI fed my 
goose under yonder tree.");
        goose1();
 
    }
    public static void sheep() {
        System.out.println("Bought me a sheep and the sheep pleased me,\nI fed my 
sheep under yonder tree.");
        sheep1();
    }
    public static void pig() {
        System.out.println("Bought me a pig and the pig pleased me,\nI fed my pig 
under yonder tree.");
        pig1();
    }
}
  
    
