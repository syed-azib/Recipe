package azib.springrecipe.services;

import azib.springrecipe.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findRecupeIdAndIngredientId(Long recipeId, Long ingredientId);
}
