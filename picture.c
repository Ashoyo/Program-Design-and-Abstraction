// my code uses 3 nest for loops to make an triangle 
public class AsciiArt {
public static final int SCALE = 10;
public static void main(String[] args) {
drawing();
}
public static void drawing() {
System.out.println("           _");
for (int line = 1; line <= SCALE - 1; line++) {
for (int dots = 1; dots <= SCALE - line * 1; dots++) {
System.out.print(" ");
}
System.out.print("/");
for (int dots = 1; dots <= SCALE - (SCALE - line * 2); dots++) {
System.out.print(" ");
}
System.out.println("\\");
}
for (int i =1; i <= SCALE - 2 ; i++) {
System.out.print("  _");
}
}
}
