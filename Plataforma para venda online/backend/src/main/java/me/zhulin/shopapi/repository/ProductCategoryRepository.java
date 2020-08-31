package me.zhulin.shopapi.repository;

import me.zhulin.shopapi.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Criado por Dorgival Fernando em 30/08/2020.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    // Alguma categoria
    List<ProductCategory> findByCategoryTypeInOrderByCategoryTypeAsc(List<Integer> categoryTypes);
    // Todas as categorias
    List<ProductCategory> findAllByOrderByCategoryType();
    // Uma categoria
    ProductCategory findByCategoryType(Integer categoryType);
}
