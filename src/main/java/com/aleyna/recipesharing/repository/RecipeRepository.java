package com.aleyna.recipesharing.repository;

import com.aleyna.recipesharing.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe,Long> {
}
