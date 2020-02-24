package guru.springframework.myreceipe.services;

import guru.springframework.myreceipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
