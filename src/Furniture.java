import java.util.Scanner;

public class Furniture {
    int price;
    String type;
    Furniture(int select_cus){
        switch (select_cus) {
            case 1 -> {
                this.type = "pine";
                this.price = 100;
            }
            case 2 -> {
                this.type = "oak";
                this.price = 225;
            }
            case 3 -> {
                this.type = "mahogany";
                this.price = 300;
            }
            default -> {
                this.type = null;
                this.price = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int choice;
        System.out.println("""
                1: pine
                2: oak
                3: mahogany""");
        System.out.print("enter your choice ");
        choice = Integer.parseInt(scn.nextLine());
        var wood = new Furniture(choice);
        System.out.println("type: " + wood.type + "\nprice: " + wood.price);
    }
}
