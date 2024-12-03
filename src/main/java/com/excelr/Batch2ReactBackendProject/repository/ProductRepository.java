package com.excelr.Batch2ReactBackendProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.Batch2ReactBackendProject.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>
{

}
