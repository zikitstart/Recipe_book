package recipes.recipe_book.recipe_book.service;

import recipes.recipe_book.recipe_book.model.Ingredient;

public interface IngredientService {
    Ingredient addIngredient(String id,Ingredient ingredient);

    Ingredient getIngredient(String id);
}
