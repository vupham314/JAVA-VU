package exeArray;

public class Prices {

    public static void main(String[] args) {
        float [] pricesList = new float[20];
        float sumPrices = 0f;
        float averagePrices;
        for(int x = 0; x < 20; x++){
            pricesList[x] = (float)(Math.random()*10);
        }
        for(float ele : pricesList){
            sumPrices += ele;
        }
        System.out.println("This is all number have value less than or equal 5 ");
        for(float x : pricesList){
            if (x < 5){
                System.out.printf("%f \t", x);
            }
        }
        averagePrices = sumPrices/(pricesList.length);
        System.out.println("\nAverage of List = "+ averagePrices);
        System.out.println("These are all number have value higher than averagePrices ");
        for (float x : pricesList){
            if (x < averagePrices){
                System.out.printf("%f \t",x);
            }
        }

    }
}

