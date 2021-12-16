import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kullanıcıadı = "Java";
        String Parola = "159159357357";
        System.out.println("****************************************************");
        System.out.println("LogIn Programı");
        System.out.println("----------------------------------------------------");
        System.out.print("Lütfen Kullanıcı Adınızı Giriniz : ");
        String kullanıcıadı1 = scanner.nextLine();
        System.out.print("Lütfen Kullanıcı Şifrenizi Giriniz : ");
        String parola = scanner.nextLine();
        System.out.println("----------------------------------------------------");
        if (kullanıcıadı1.equals(kullanıcıadı)&& parola.equals(Parola)) {
            System.out.println("Giriş Başarılı, Hoşgeldiniz...");
        }
        else if(!kullanıcıadı1.equals(kullanıcıadı)&& !parola.equals(Parola)){
            System.out.println("Hatalı Kullanıcı Adı veya Parola");
        }
        else if(!kullanıcıadı1.equals(kullanıcıadı)&& parola.equals(Parola)){
            System.out.println("Hatalı Kullanıcı Adı veya Parola");
        }
        else {
            System.out.println("Hatalı Şifre Girildi. ");
            System.out.println("Şifrenizi unuttuysanız ve değiştirmek istiyorsanız lütfen 1'e basınız...");
            System.out.println("Çıkış Yapmak İçin q'ya basınız...");
            String button = scanner.nextLine();
            if (button.equals("1")) {
                System.out.print("Lütfen yeni parolanızı giriniz: ");
                String newpassword = scanner.nextLine();
                if (newpassword.equals(Parola)) {
                    System.out.println("Girilen yeni parola değeri ile önceki parola değeri aynı. Lütfen başka bir şifre giriniz.");
                }
                else{
                    System.out.println("Parola Oluşturuldu...");
                    newpassword = newpassword;
                }
            }
        }
    }
}
