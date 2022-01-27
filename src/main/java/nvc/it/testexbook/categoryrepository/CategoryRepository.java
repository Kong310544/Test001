package nvc.it.testexbook.categoryrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.testexbook.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
    
}
