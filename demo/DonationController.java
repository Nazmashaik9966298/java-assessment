package com.careandshare.Donation.controller;

import com.careandshare.Donation.service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/donations")
@CrossOrigin(origins = "*")
public class DonationController<Donation> {
    @Autowired
    private DonationService donationService;

    @GetMapping
    public List<Donation> getAllDonations() {
        return donationService.getAllDonations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Donation> getDonationById(@PathVariable Long id) {
        Optional<Donation> donation = donationService.getDonationById(id);
        return donation.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/user/{userId}")
    public List<Donation> getDonationsByUser(@PathVariable Long userId) {
        return donationService.getDonationsByUserId(userId);
    }

    @GetMapping("/type/{itemType}")
    public List<Donation> getDonationsByType(@PathVariable String itemType) {
        return donationService.getDonationsByType(itemType);
    }

    @GetMapping("/status/{status}")
    public List<Donation> getDonationsByStatus(@PathVariable String status) {
        return donationService.getDonationsByStatus(status);
    }

    @PostMapping("/user/{userId}")
    public ResponseEntity<Donation> createDonation(@PathVariable Long userId, @RequestBody Donation donation) {
        try {
            Donation createdDonation = donationService.createDonation(donation, userId);
            return ResponseEntity.ok(createdDonation);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<Donation> updateDonationStatus(@PathVariable Long id, @RequestBody String status) {
        try {
            Donation updatedDonation = donationService.updateDonationStatus(id, status);
            return ResponseEntity.ok(updatedDonation);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDonation(@PathVariable Long id) {
        try {
            donationService.deleteDonation(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
