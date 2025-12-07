import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez le programme :");
        String A = sc.nextLine();
        
        System.out.println("\nANALYSE LEXICALE :");
        LexicalProjet.analyserLexical(A);
        
        System.out.println("\nANALYSE SYNTAXIQUE :");
        SyntaxiqueProjet.analyserSyntaxique(A);
    }
}