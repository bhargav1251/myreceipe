package guru.springframework.myreceipe.controllers;

import guru.springframework.myreceipe.domain.Recipe;
import guru.springframework.myreceipe.services.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
@RequiredArgsConstructor
public class RecipeController {
    private final RecipeService recipeService;

    @RequestMapping({"", "/", "/recipes"})
    public String getRecipes(Model recipe) {
        Set<Recipe> recipeSet = recipeService.getRecipes();
        recipe.addAttribute("recipes", recipeSet);
        return "index";
    }
}
