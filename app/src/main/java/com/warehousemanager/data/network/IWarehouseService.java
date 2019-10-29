package com.warehousemanager.data.network;

import com.warehousemanager.data.db.entities.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface IWarehouseService {

    @POST("products")
    Call<Product> createProduct(@Body Product product);

    @GET("products")
    Call<List<Product>> getAllProducts();
}