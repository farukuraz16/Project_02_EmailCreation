package Project_02_EmailCreation;

import java.util.Scanner;

public class EmailApp {

    String firstName;
    String lastName;
    String password;
    String departmend;
    String email;
    String emailSuffix = "clarusway.com";//şirket domain
    int mailboxCapacity = 1000;
    int defaultPasswordlenght = 12;

    public EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmend=setDepartment();//aşağıda oluşturduğumuz method ile departmend atanıyor.
        //System.out.println("Department: "+departmend);

        this.password= randomPassword(defaultPasswordlenght);//aşağıda oluşturduğumuz method ile password atanıyor.
        //System.out.println("password: " + password);

        this.email = firstName.toLowerCase()+lastName.toLowerCase()+"@"+departmend+emailSuffix;
    }

    /*
    testautomation.
    fullstackdeveloper.
    salesforce.
    hicbiri
     */

    public String setDepartment() {
        System.out.println("\n1--> testautomation" +
                "\n2--> fullstackdeveloper" +
                "\n3--> salesforce" +
                "\n0--> hicbiri"+
                "\nLütfen yukarıda belirtilen departmanlardan herhangi birini seçiniz:");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1)
            return "testautomation";
        else if (option == 2)
            return "fullstackdeveloper";
        else if (option == 3)
            return "salesforce";
        else
            return "";
    }
    //ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi
    //int lenght = 12;
    public String randomPassword(int lenght){
String passWordSet = ("ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi");
char [] password = new char[lenght];
        for (int i = 0; i < lenght; i++) {
            int random = (int) (Math.random() * passWordSet.length());
            //Math.random--> 0 ile 1 arasında random olarak double bir değer seçer.
            //0-1 arasında değil de passWordSet'deki metin uzunluğunda bir değer seçmesi için böyle yaptık.
            //yani 0 ile 62 arasında bir değer seçecek. bir double seçecek.
            //bu double'ı da int yaptık. başına (int) koyduk.

password[i] = passWordSet.charAt(random);
        }


        return new String(password);
   }

public String showInfo (){


return "Ad Soyad: "+firstName+" "+lastName+
        "\nDepartman: "+departmend+
        "\nCapacity: "+mailboxCapacity+"mb"+
        "\nE-mail: "+email+
        "\nPassword: "+password;
}

}
