import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nom : ");
        String nom = scanner.nextLine();
        System.out.println("prenom : ");
        String prenom = scanner.nextLine();
        System.out.println("Telephone : ");
        String tel = scanner.nextLine();
        System.out.println("Adresse : ");
        String adress = scanner.nextLine();
        System.out.println("E-Mail : ");
        String mail = scanner.nextLine();

        scanner.close();

        Client client = new Client(nom,prenom,adress,tel,mail);
        Commande cd = new Commande(client);
        System.out.println("Voulez vous ajouter un article ? O/N ");
        Scanner scanner = new Scanner(System.in);
        String rep = scanner.nextLine();
        while(rep == "O") {
            System.out.println("quel article : ");
            String lib = scanner.nextLine();
            System.out.println("Quelle quantité de lib : ");
            int qtt = scanner.nextInt();
            while (qtt > 0) {
                Article art = new Article(lib, 3.47f, lib += ": des");
                cd.addArt(art);
            }
        }
        scanner.close();
        System.out.println(client);
        System.out.println(cd);
    }
}
