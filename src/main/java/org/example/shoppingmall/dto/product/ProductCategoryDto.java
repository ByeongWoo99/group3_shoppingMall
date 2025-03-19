package org.example.shoppingmall.dto.product;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class ProductCategoryDto {  //ī�װ� DTO
    private String categoryId;
    private String parentCategoryId;
    private String name;
    private String description;
    private int order;
    private boolean activeFlag;

}
