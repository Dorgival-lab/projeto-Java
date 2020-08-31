package me.zhulin.shopapi.service;


import me.zhulin.shopapi.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Criado por Dorgival Fernando em 30/08/2020.
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    // Todos os produtos de venda
    Page<ProductInfo> findUpAll(Pageable pageable);
    // Todos os produtos
    Page<ProductInfo> findAll(Pageable pageable);
    // Todos os produtos em uma categoria
    Page<ProductInfo> findAllInCategory(Integer categoryType, Pageable pageable);

    // aumentar o estoque
    void increaseStock(String productId, int amount);

    //diminuir estoque
    void decreaseStock(String productId, int amount);

    ProductInfo offSale(String productId);

    ProductInfo onSale(String productId);

    ProductInfo update(ProductInfo productInfo);
    ProductInfo save(ProductInfo productInfo);

    void delete(String productId);


}
