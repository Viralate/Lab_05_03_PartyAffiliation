import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //initalize scanner
        Scanner scanner = new Scanner(System.in);

        //output and input
        System.out.println("Please enter your Political pary affiliation (D,R,I or other):");
        String affiliation = scanner.next();

        //process
        if (affiliation.equalsIgnoreCase("D")){
            System.out.println("You get a Democratic Donkey.");

        } else if ( affiliation.equalsIgnoreCase("R")){
            System.out.println("You get a Republican Elephant.");
        } else if (affiliation.equalsIgnoreCase("I")){
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }
    }
}
