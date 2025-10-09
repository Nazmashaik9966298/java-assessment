package com.careandshare.Donation.repository;
import com.careandshare.user.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DonationRepository extends JpaRepository<Donation, Long> {
    List<Donation> findByUserUserId(Long userId);
    List<Donation> findByItemType(String itemType);
    List<Donation> findByDonationStatus(String status);
}
