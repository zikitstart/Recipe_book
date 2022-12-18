package recipes.recipe_book.recipe_book.service;

import recipes.recipe_book.recipe_book.model.Recipe;

public interface RecipeService {
    Recipe addRecipe(String id,Recipe recipe);

    Recipe getRecipe(String id);
}
