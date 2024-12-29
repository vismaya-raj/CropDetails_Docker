package com.vismayawork.cropwise.repository;



import com.vismayawork.cropwise.model.CropStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CropStockRepository extends JpaRepository<CropStock, Long> {
}
