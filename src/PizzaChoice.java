import java.util.Scanner;

class PizzaChoice{
    public static void main(String[] args) {
        float [] pricePizzaList = {6.99f,8.99f,12.50f,15.00f};
        float pricePizza = -1.0f;
        String sizePizza ="";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your size choice ");
        sizePizza = scan.nextLine();
        boolean check = true;
        switch (sizePizza) {
            case "S" -> {
                pricePizza = pricePizzaList[0];
            }
            case "M" -> {
                pricePizza = pricePizzaList[1];
            }
            case "L" -> {
                pricePizza = pricePizzaList[2];
            }
            case "X" -> {
                pricePizza = pricePizzaList[3];
            }
            default -> check = false;
        }
        if(check){
            System.out.print("Your size and price of pizza "+sizePizza+" "+pricePizza);
        }
        else{
            System.out.print("error input");
        }

    }
}

