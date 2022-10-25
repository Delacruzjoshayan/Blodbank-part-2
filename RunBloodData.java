import java.util.Scanner;
public class RunBloodData{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BloodData bd = new BloodData();
        System.out.print("Enter blood type of patient: ");
        String input1 = sc.nextLine();
        System.out.print("Enter the Rhesus factor (+ or -): ");
        String input2 = sc.nextLine();
        String ui = input1 + input2;

        if(ui.isEmpty()){
            bd.display();
        }
        else if(ui.equals("A+")||ui.equals("A-")|| 
        	ui.equals("B+")||ui.equals("B-")||
        	ui.equals("AB+")||ui.equals("AB-")||
        	ui.equals("O+")||ui.equals("O-")){
            bd.setBloodType(input1);
            bd.setRhFactor(input2);
            bd.display();
        }
        else{
            System.out.print("Invalid input!");
        }
        sc.close();



    }
}