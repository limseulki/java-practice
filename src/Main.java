import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        float rate = sc.nextFloat(); // 입력된 값을 Float 실수로 받는다.
        sc.nextLine(); // 앞단에서 버퍼에 남아있는 \n 처리
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String input3 = sc.nextLine();
        String input4 = sc.nextLine();
        String input5 = sc.nextLine();
        String input6 = sc.nextLine();
        String input7 = sc.nextLine();
        String input8 = sc.nextLine();
        String input9 = sc.nextLine();
        String input10 = sc.nextLine();

        System.out.println("[ "+title+" ]");
        int intRate = (int)rate;
        double percent = intRate/5.0*100;
        System.out.println("별점 : "+intRate+" ("+percent+"%)");
        System.out.println("1. "+input1);
        System.out.println("2. "+input2);
        System.out.println("3. "+input3);
        System.out.println("4. "+input4);
        System.out.println("5. "+input5);
        System.out.println("6. "+input6);
        System.out.println("7. "+input7);
        System.out.println("8. "+input8);
        System.out.println("9. "+input9);
        System.out.println("10. "+input10);
    }
}