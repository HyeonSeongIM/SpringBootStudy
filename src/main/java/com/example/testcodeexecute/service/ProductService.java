package com.example.testcodeexecute.service;


import com.example.testcodeexecute.data.dto.ProductDto;
import com.example.testcodeexecute.data.dto.ProductResponseDto;


public interface ProductService {

    ProductResponseDto getProduct(Long number);

    ProductResponseDto saveProduct(ProductDto productDto);

    ProductResponseDto changeProductName(Long number, String name) throws Exception;

    void deleteProduct(Long number) throws Exception;

}