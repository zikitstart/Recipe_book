package recipe.recipes_book.recipe_book.service;

import recipe.recipes_book.recipe_book.model.Ingredient;

public interface IngredientService {
    Ingredient addIngredient(Ingredient ingredient);

    Ingredient getIngredient(Long id);
}
