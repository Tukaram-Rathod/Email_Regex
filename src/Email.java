import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", "abc.xyz@bridgelabz.co.in"));//true
        //Email UC1 To begin with lets validate the mandatory part and start with abc
        System.out.println(Pattern.matches("^[a-z{a,b,c}+_.-]+@[a-z0-9._[a-z{2}._a-z{2}]]+$", "abc.xyz@bridgelabz.co.in"));//true
        // Email UC2 Ensure @ and validate the mandatory 2nd part i.e.bridgelabz
        System.out.println(Pattern.matches("^[a-z{a,b,c}+_.-]+@[a-z{bridgelabz}._[a-z{2}._a-z{2}]]+$", "abc.xyz@bridgelabz.co.in"));//true
        // Email UC3 Ensure “.” after bridgelabz and validate the mandatory 3rd part i.e. co
        System.out.println(Pattern.matches("^[a-z{a,b,c}+_.-]+@[a-z{bridgelabz}._[a-z{co}._a-z{2}]]+$", "abc.xyz@bridgelabz.co.in"));//true
        // Email UC4 Ensure make sure only following are valid special characters _,+,-,.proceeding to xyz
        System.out.println(Pattern.matches("^[a-z{a,b,c}+_\\.-]+@[a-z{bridgelabz}\\._[a-z{co}\\._+\\.a-z{2}]]+$", "abc.xyz@bridgelabz.co.in"));//true
        // Email UC5Top Level Domains (TLD) in the last part is the optional country code and its 2 characters only
        System.out.println(Pattern.matches("^[a-z{a,b,c}+_\\.-]+@[a-z{bridgelabz}[0-9]{2}\\._[a-z{co}\\._+\\.a-z{2}]]+$", "abc.xyz@bridgelabz.co.in"));//true


    }
}
