package org.example.shoppingmall.controller.product;

import org.example.shoppingmall.dto.product.ProductCategoryDto;
import org.example.shoppingmall.dto.product.ProductDto;
import org.example.shoppingmall.service.product.ProductCategoryService;
import org.example.shoppingmall.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ProductController {
    private final ProductService productService;
    private final ProductCategoryService productCategoryService;

    @Autowired
    public ProductController(ProductService productService,  ProductCategoryService productCategoryService) {
        this.productService = productService;
        this.productCategoryService = productCategoryService;
    }

//    Ȩ �̵�
    @GetMapping("/")
    public String home(Model model) {
        ArrayList<ProductDto> products = productService.getProductData();
        model.addAttribute("products", products);
        System.out.println( products);
        for(ProductDto productDto : products) {
            System.out.println(productDto);
        }
        return "index";
    }

//    �� ������ �̵�
    @GetMapping("/productDetail")
    public String productDetail(String prdId, Model model) {
        System.out.println("prdId:"+prdId);
        model.addAttribute("prdId", prdId);

        // ���� �� ������ ��: ��ǰ ID�� ���� ProductDto ��������
        ProductDto product = productService.getProductById(prdId);
        model.addAttribute("product", product);

        return "indexDetail";
    }

//    ī�װ� �̵�
    @GetMapping("/category")
    public String category(Model model) {
        ArrayList<ProductCategoryDto> categoryList  = productCategoryService.getCategoryListAll();
        model.addAttribute("categoryList", categoryList);
        return "/product/category";
    }
}
