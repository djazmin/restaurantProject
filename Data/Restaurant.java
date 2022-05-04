package Data;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public static String name = "Alfredo's Restaurant";
    public List<Recipe> menu;

    public Restaurant(){
        this.menu = new ArrayList<>();
    }
    public void addRecipeToMenu(Recipe recipe){
        this.menu.add(recipe);
    }

    public void replaceForVeggieRecipe(int option,Recipe recipe){
        this.menu.set(option,recipe);
    }

    public int getAmountRecipes(){
        return this.menu.size();
    }

    public List<String> getMenuList(){
        List<String> menuList = new ArrayList<>();
        for(int i = 0; i<this.getAmountRecipes();i++){
            menuList.add("Recipe: "+this.menu.get(i).name+" - Price:"+this.menu.get(i).price);
        }
        return menuList;
    }

}
