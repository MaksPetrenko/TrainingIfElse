import java.util.Scanner;
public class TrainingIfElse {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.print("введіть довільний символ = ");
        char guk = s.next().charAt(0);
        if (Character.isDigit(guk))
        {
            System.out.println("це цифра");
        }
        else if ( Character.isLetter(guk))
        {
            System.out.println("це буква");
        }
        else {
            System.out.println("це довільний символ");
        }

    }
}
