package com.example.recipe;
import java.util.*;

public interface RecipeRepository {
    ArrayList<Recipe> getAllRecipes();
    Recipe getRecipeById(int recepeId);
    Recipe addRecipe(Recipe recipe);
    Recipe updateRecipe(int recipeId, Recipe recipe);
    void deleteRecipe(int recipeId);
}