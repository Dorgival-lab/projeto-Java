package me.zhulin.shopapi.enums;

import lombok.Getter;

/**
 * Criado por Dorgival Fernando em 30/08/2020.
 */

@Getter
public enum ResultEnum  {

    PARAM_ERROR(1, "Erro de parâmetro!"),
    PRODUCT_NOT_EXIST(10, "O produto não sai!"),
    PRODUCT_NOT_ENOUGH(11, "Não há produtos suficientes em estoque!"),
    PRODUCT_STATUS_ERROR(12, "O status está incorreto!"),
    PRODUCT_OFF_SALE(13,"O produto está em promoção!"),
    PRODUCT_NOT_IN_CART(14,"O produto não está no carrinho!"),
    CART_CHECKOUT_SUCCESS(20, "Check-out com sucesso! "),

    CATEGORY_NOT_FOUND(30, "A categoria não sai!"),

    ORDER_NOT_FOUND(60, "A categoria não sai!"),
    ORDER_STATUS_ERROR(61, "O status não está correto"),


    VALID_ERROR(50, "Informação errada"),
    USER_NOT_FOUNT(40,"Usuário não encontrado!")
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
