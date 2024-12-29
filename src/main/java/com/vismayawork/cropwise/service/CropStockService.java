package com.vismayawork.cropwise.service;
import com.vismayawork.cropwise.model.CropStock;
import com.vismayawork.cropwise.repository.CropStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CropStockService {

    @Autowired
    private CropStockRepository cropStockRepository;

    // Get all crop stocks
    public List<CropStock> getAllCropStocks() {
        return cropStockRepository.findAll();
    }

    // Get crop stock by ID
    public Optional<CropStock> getCropStockById(Long id) {
        return cropStockRepository.findById(id);
    }

    // Add or update a crop stock
    public CropStock addCropStock(CropStock cropStock) {
        return cropStockRepository.save(cropStock);
    }

    // delete a crop stock
    public void deleteCropStock(Long id) {
        cropStockRepository.deleteById(id);
    }
}
