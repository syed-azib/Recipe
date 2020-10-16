package azib.springrecipe.services;

import azib.springrecipe.commands.RecipeCommand;
import azib.springrecipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
