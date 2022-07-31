import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
            int heat;
             Scanner input = new Scanner(System.in);

             System.out.print("Sicaklik degerini giriniz: ");
             heat = input.nextInt();

             if (heat<5){
                 System.out.println("kayak yapabilirsiniz.");
             } else if ((15>heat) && (heat>5)) {
                 System.out.println("Sinemaya gidebilirisiniz.");
             } else if ((25>heat) && (heat>15)) {
                 System.out.println("Piknik yapabilirsiniz.");
             } else if ((25<heat)) {
                 System.out.println("Yuzmeye gidebilirsiniz.");
             }


    }
}



