package com.project.ecommerce.exceptions;

public class ProductNotExistException extends Exception {
    public ProductNotExistException(String msg) {
        super(msg);
    }
}
