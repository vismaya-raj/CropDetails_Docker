package com.vismayawork.cropwise.controller;
import com.vismayawork.cropwise.model.CropStock;
import com.vismayawork.cropwise.service.CropStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/crops")
public class CropStockController {

    @Autowired
    private CropStockService cropStockService;

    // GET all crops
    @GetMapping
    public ResponseEntity<List<CropStock>> getAllCrops() {
        List<CropStock> crops = cropStockService.getAllCropStocks();
        return ResponseEntity.ok(crops);
    }

    // GET crop by ID
    @GetMapping("/{id}")
    public ResponseEntity<CropStock> getCropById(@PathVariable Long id) {
        Optional<CropStock> cropStock = cropStockService.getCropStockById(id);
        return cropStock.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // POST add a new crop
    @PostMapping
    public ResponseEntity<CropStock> addCrop(@Valid @RequestBody CropStock cropStock) {
        CropStock savedCrop = cropStockService.addCropStock(cropStock);
        return new ResponseEntity<>(savedCrop, HttpStatus.CREATED);
    }

    // PUT update an existing crop
    @PutMapping("/{id}")
    public ResponseEntity<CropStock> updateCrop(@PathVariable Long id, @Valid @RequestBody CropStock cropStock) {
        Optional<CropStock> existingCrop = cropStockService.getCropStockById(id);
        if (existingCrop.isPresent()) {
            cropStock.setId(id); // Ensure ID is maintained
            CropStock updatedCrop = cropStockService.addCropStock(cropStock);
            return ResponseEntity.ok(updatedCrop);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE crop by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCrop(@PathVariable Long id) {
        Optional<CropStock> existingCrop = cropStockService.getCropStockById(id);
        if (existingCrop.isPresent()) {
            cropStockService.deleteCropStock(id); // Call service method to delete the crop by ID
            return ResponseEntity.noContent().build(); // Return 204 No Content status on successful deletion
        } else {
            return ResponseEntity.notFound().build(); // Return 404 Not Found if the crop does not exist
        }
    }

}