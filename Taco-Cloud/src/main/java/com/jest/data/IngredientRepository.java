package com.jest.data;
import com.jest.Ingredient;
import org.springframework.data.repository.CrudRepository;


public interface IngredientRepository
extends  CrudRepository<Ingredient, String> {

}
