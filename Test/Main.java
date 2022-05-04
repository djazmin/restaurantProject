package Test;

import Data.Recipe;
import Data.Restaurant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant();
        Recipe recipe1 = new Recipe("Ajiaco",20000,"Pollo,papas,etc");
        Recipe recipe2 = new Recipe("Pollo asado",25000,"Pollo y papas,etc");
        Recipe recipe3 = new Recipe("Baby Beef",30000,"Baby beef");
        Recipe recipe4 = new Recipe("Sandwich cubano",17000,"-");
        Recipe recipe5 = new Recipe("Arroz con pollo",23000,"-");

        myRestaurant.addRecipeToMenu(recipe1);
        myRestaurant.addRecipeToMenu(recipe2);
        myRestaurant.addRecipeToMenu(recipe3);
        myRestaurant.addRecipeToMenu(recipe4);
        myRestaurant.addRecipeToMenu(recipe5);

        printRestaurantInfo(myRestaurant);
    }
    public static void printRestaurantInfo (Restaurant myRestaurant){
        boolean out = false;


        while (!out){
            System.out.println("Selecciona una de las siguientes opciones: ");
            System.out.println("1. Reemplazar la tercera opción del menú por una opción Veggie");
            System.out.println("2. Imprimir la cantidad de recetas del menú");
            System.out.println("3. Imprimir el menú del restaurante");
            System.out.println("4. Salir");
            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();

            switch (option){
                case 1:
                    System.out.println("Se cambiará la opción 3 por la receta de lasagna veggie");
                    Recipe veggieRecipe = new Recipe("Lasagna Veggie",15000,"Berenjenas, tomate, queso feta");
                    myRestaurant.replaceForVeggieRecipe(2,veggieRecipe);
                    break;
                case 2:
                    System.out.println("Cantidad de recetas en el menú: "+myRestaurant.getAmountRecipes());
                    break;
                case 3:
                    System.out.println("Alfredo's Menú");
                    for(int i=0;i<myRestaurant.getMenuList().size();i++){
                        System.out.println(myRestaurant.getMenuList().get(i));
                    }
                    break;
                case 4:
                    out=true;
                    break;
                default:
                    break;
            }

        }

    }
}
