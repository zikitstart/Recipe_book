package recipes.recipe_book.recipe_book.controller;

import org.springframework.web.bind.annotation.*;
import recipes.recipe_book.recipe_book.model.Recipe;
import recipes.recipe_book.recipe_book.service.impl.RecipeServiceImpl;

import java.util.Collections;
import java.util.Set;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    private final RecipeServiceImpl recipeService;

    public RecipeController(RecipeServiceImpl recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping("/createRecipe/{id}")
    public Recipe createRecipe(@PathVariable("id")String id,@RequestBody Recipe recipe) {
        return this.recipeService.addRecipe(id,recipe);
    }

    @GetMapping("/getRecipes/{id}")
    public Set<String> getAllRecipes(@PathVariable("id") String id ) {
        return Collections.singleton(this.recipeService.getRecipe(id).toString());
    }
}
