package recipes.recipe_book.recipe_book.controller;

import org.springframework.web.bind.annotation.*;
import recipes.recipe_book.recipe_book.model.Ingredient;
import recipes.recipe_book.recipe_book.service.impl.IngredientServiceImpl;

import java.util.Collections;
import java.util.Set;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    private final IngredientServiceImpl ingredientService;

    public IngredientController(IngredientServiceImpl ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping("/createIngredient/{id}")
    public Ingredient createIngredient(@PathVariable("id")String id, @RequestBody Ingredient ingredient) {
        return this.ingredientService.addIngredient(id,ingredient);
    }

    @GetMapping("/getIngredients/{id}")
    public Set<String> getAllIngredients(@PathVariable("id") String id ) {
        return Collections.singleton(this.ingredientService.getIngredient(id).toString());
    }
}