package com.sale.Campaign.Controller;

import com.sale.Campaign.Model.Product;
import com.sale.Campaign.Model.dto.ProductDto;
import com.sale.Campaign.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/add")
    public List<Product> addProduct(@RequestBody List<Product> products) {
        return productService.addProduct(products);
    }

    @GetMapping("/get")
    public ProductDto getListByPageNumber(@RequestParam Integer pageNo,Integer PageSize) {
        return productService.getListByPageNumber(pageNo,PageSize);
    }

}
