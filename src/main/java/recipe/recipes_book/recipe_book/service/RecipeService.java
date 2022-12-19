package recipe.recipes_book.recipe_book.service;

import recipe.recipes_book.recipe_book.model.Recipe;

public interface RecipeService {
    Recipe addRecipe(Recipe recipe);

    Recipe getRecipe(Long id);
}
