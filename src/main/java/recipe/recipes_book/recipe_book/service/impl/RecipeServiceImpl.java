package recipe.recipes_book.recipe_book.service.impl;

import org.springframework.stereotype.Service;
import recipe.recipes_book.recipe_book.model.Recipe;
import recipe.recipes_book.recipe_book.service.RecipeService;

import java.util.LinkedHashMap;
import java.util.Map;
@Service
public class RecipeServiceImpl implements RecipeService {

    private final Map<Long, Recipe> recipeMap = new LinkedHashMap<>();

    private static Long id = 1L;

    @Override
    public Recipe addRecipe(Recipe recipe) {
        return recipeMap.put(id++, recipe);
    }

    @Override
    public Recipe getRecipe(Long id) {
        if (recipeMap.containsKey(id)) {
            return recipeMap.get(id);
        } else {
            throw new RuntimeException("id не найден!");
        }
    }
}
