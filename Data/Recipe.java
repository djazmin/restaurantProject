package Data;

public class Recipe {
    public String name;
    public float price;
    public String ingredients;

    public Recipe(String nameRecipe, float priceRecipe, String ingredientsRecipe){
        this.name = nameRecipe;
        this.price = priceRecipe;
        this.ingredients = ingredientsRecipe;
    }
}
