package repository.impl;

import model.Category;
import repository.CategoryRepository;

public class InMemoryCategoryRepository extends InMemoryAbstractRepository<Category, Long> implements CategoryRepository {
}
