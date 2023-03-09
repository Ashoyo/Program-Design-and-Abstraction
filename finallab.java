
// The criteri that I have selected using the following code is ment to find the 
students with the highestest gpa 
// with this process we could miss students who would are great programmers with 
low gpa
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Student implements Allstudents<Student> {
    public static void main(String[] args) throws FileNotFoundException {
        String prev;
        Scanner sc = new Scanner(new File("students.csv"));
        String prev = sc.nextLine();
        ArrayList<Student> list = new ArrayList<>();
        while (sc.hasNextLine()) {
                String stu = sc.nextLine();
                String[] words = stu.split("\t");
                Student s = new Student(words[0], words[1], words[2], words[3], 
words[4], words[5], words[6], words[7],
                                Double.parseDouble(words[8]), words[9], words[10]);
                list.add(s);
        }
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : list) {
                String s1 = s.languages.toLowerCase();
                if (s1.contains("java ")||s1.contains(" java ")||s1.contains(" 
java")) {
                        result.add(s);
                }
        }
        
        Collections.sort(result);
        System.out.println("the 10 students are: ");
        for(int i=0;i<10 && i<result.size();i++){
                System.out.println(result.get(i));
        }
}
        String zip;
        String region;
        String languages;
        double gpa;
        String major;
        String university;
        String last_name;
        String first_name;
        String phone;
        String email;
        String address;
        @Override
        public String toString() {
                return last_name + "," + first_name + "," + phone + "," + email + 
"," + address + "," + zip + "," + region
                                + ", " + languages + ", " + gpa + "," + major + ","
+ university;
        }
        public Student(String last_name, String first_name, String phone, String 
email, String address, String zip,
                        String region, String laguages, double gpa, String major, 
String university) {
                this.region = region;
                this.languages = laguages;
                this.gpa = gpa;
                this.major = major;
                this.university = university;          
                this.last_name = last_name;
                this.first_name = first_name;
                this.phone = phone;
                this.email = email;
                this.address = address;
                this.zip = zip;
        }
        @Override
        public int compareTo(Student A) {
                if (gpa > A.gpa) {
                        return -1;
                } else if (gpa < A.gpa) {
                        return 1;
                } else {
                        return 0;
                }
        }
}
