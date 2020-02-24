package guru.springframework.myreceipe.services;

import guru.springframework.myreceipe.domain.Recipe;
import guru.springframework.myreceipe.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class RecipeServiceImplTest {
    private RecipeService recipeService;
    @Mock
    private RecipeRepository recipeRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    void getRecipes() {
        Recipe recipe = new Recipe();
        recipe.setId(1L);
        recipe.setDescription("This is my Description");
        Recipe recipe1 = new Recipe();
        Set<Recipe> recipeSet = new HashSet<>();
        recipeSet.add(recipe);
        recipeSet.add(recipe1);
        when(recipeRepository.findAll()).thenReturn(recipeSet);
        Set<Recipe> recipeSet1 = recipeService.getRecipes();
        assertEquals(2, recipeSet1.size());
        verify(recipeRepository, times(1)).findAll();
    }
}