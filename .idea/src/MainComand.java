import java.util.Scanner;

public class MainComand {
    public static void main(String[] args) {
        String username = "John Doe";
        String password = "JohnDoe";

        System.out.println("Unesite Vaš Username");
        Scanner UsernameScan = new Scanner(System.in);
        System.out.println("Unesite Vaš Password");
        Scanner PasswordScan = new Scanner(System.in);

        String usernameInput = UsernameScan.nextLine();
        String PasswordInput = PasswordScan.nextLine();

        if(usernameInput.equals ("John Doe") && PasswordInput.equals ("JohnDoe")){
            System.out.println("Dobro došli na Vaš profil " + username);
        }else{
            System.out.println("Username ili lozinka koju ste unijeli je pogrešna,pokušajte ukucati ponovo");
        }
        if(usernameInput.equals ("John Doe") && PasswordInput.equals ("JohnDoe")){
        System.out.println("Odaberite predmet iz kog želite vidjeti ocjene");
        System.out.println("Njemački - 1");
        System.out.println("Bosanski - 2");
        System.out.println("Matematika - 3");
        System.out.println("Informatika - 4");
        System.out.println("Biologija - 5");
        int odabraniPredmet = new Scanner(System.in).nextInt();
        switch (odabraniPredmet) {
            case 1:
                System.out.println("Ocjene iz njemačkog su:");
                System.out.println("5,5,4,4,5");
                break;
            case 2:
                System.out.println("Ocjene iz bosanskog su:");
                System.out.println("5,5,5,5,5,5,3,2,5");
                break;
            case 3:
                System.out.println("Ocjene iz matematike su:");
                System.out.println("5,5,5,5,5");
                break;
            case 4:
                System.out.println("Ocjene iz informatike su:");
                System.out.println("5,5,5,4");
                break;
            case 5:
                System.out.println("ocjene iz biologije su:");
                System.out.println("5,3,5,5");
                break;
        }
        }
    }
}
