//taking array list from userinput


import java.util.Scanner;

public class Arraypractice1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("Enter the no.of food items do you want: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter the food:");
            foods[i] = scanner.nextLine();
        }

        for(String food:foods){ //enhanced for loop;for every food in my array of foods
            System.out.print(food + " ");
        }
        scanner.close();




    }
}
