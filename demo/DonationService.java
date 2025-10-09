package com.careandshare.Donation.service;

import com.careandshare.Donation.repository.DonationRepository;
import com.careandshare.Donation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonationService {
    @Autowired
    private DonationRepository donationRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    public Optional<Donation> getDonationById(Long id) {
        return donationRepository.findById(id);
    }

    public List<Donation> getDonationsByUserId(Long userId) {
        return donationRepository.findByUserUserId(userId);
    }

    public List<Donation> getDonationsByType(String itemType) {
        return donationRepository.findByItemType(itemType);
    }

    public List<Donation> getDonationsByStatus(String status) {
        return donationRepository.findByDonationStatus(status);
    }

    public Donation createDonation(Donation donation, Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        donation.setUser(user);
        return donationRepository.save(donation);
    }

    public Donation updateDonationStatus(Long id, String status) {
        Donation donation = donationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Donation not found"));

        donation.setDonationStatus(status);
        return donationRepository.save(donation);
    }

    public void deleteDonation(Long id) {
        donationRepository.deleteById(id);
    }
}

}
