package recipe.recipes_book.recipe_book.service.impl;

import org.springframework.stereotype.Service;
import recipe.recipes_book.recipe_book.model.Ingredient;
import recipe.recipes_book.recipe_book.service.IngredientService;

import java.util.LinkedHashMap;
import java.util.Map;
@Service
public class IngredientServiceImpl implements IngredientService {

    public Map<Long, Ingredient> ingredientMap = new LinkedHashMap<>();

    private static Long id = 1L;

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        return ingredientMap.put(id++,ingredient);
    }

    @Override
    public Ingredient getIngredient(Long id) {
        if (ingredientMap.containsKey(id)){
            return ingredientMap.get(id);
        } else {
            throw new RuntimeException("id не найден!");
        }
    }
}
