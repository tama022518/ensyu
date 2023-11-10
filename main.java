import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1人目の身長(cm)を入力してください。");
        double height = Double.parseDouble(sc.nextLine());
        System.out.println("1人目の体重(kg)を入力してください。");
        double weight = Double.parseDouble(sc.nextLine());

        height /= 100;

        Double BMI = weight / height / height;

        String ans = String.format("%.2f", BMI);

        System.out.println("1人目ののBMIは" + ans );
    }
}
