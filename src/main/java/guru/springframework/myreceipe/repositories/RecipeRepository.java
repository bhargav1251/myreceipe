package guru.springframework.myreceipe.repositories;

import guru.springframework.myreceipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
