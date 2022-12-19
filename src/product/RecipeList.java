package product;

import java.util.Set;

public class RecipeList {
    private Set<Recipe> recipes;

    public RecipeList(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void addRecipe(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть в списке!");
        }
        recipes.add(recipe);
    }
    public void deleteRecipe(Recipe recipe) {
        recipes.remove(recipe);
    }

    @Override
    public String toString() {
        return "Список рецептов: " + recipes;
    }
}
