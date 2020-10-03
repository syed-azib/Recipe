package azib.springrecipe.controllers;

import azib.springrecipe.services.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;

class IndexControllerTest {

    @Mock
    public RecipeService recipeService;

    IndexController indexController;

    @Mock
    Model model;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        indexController = new IndexController(recipeService);
    }

    @Test
    void getIndexPage() {
        String viewName = indexController.getIndexPage(model);
        assertEquals("recipes",viewName);
        Mockito.verify(recipeService , times(1)).getRecipes();
        Mockito.verify(model , times(1)).addAttribute(eq("recipes"),anySet());

    }
}