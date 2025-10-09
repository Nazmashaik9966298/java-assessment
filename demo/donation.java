package com.careandshare.Donation.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.apache.catalina.User;

import java.time.LocalDateTime;

@Entity
@Table(name = "donated_items")
public class donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long donationId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String itemName;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private String itemType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Condition condition;

    private String imageUrl;

    private String donationStatus = "Pending";

    @Column(nullable = false)
    private String pickupAddress;

    private LocalDateTime createdAt;

    // Constructors, Getters, and Setters
    public donation() {}

    public donation(User user, String itemName, Integer quantity, String itemType,
                    Condition condition, String pickupAddress) {
        this.user = user;
        this.itemName = itemName;
        this.quantity = quantity;
        this.itemType = itemType;
        this.condition = condition;
        this.pickupAddress = pickupAddress;
        this.createdAt = LocalDateTime.now();
    }

    // Getters and Setters
    public Long getDonationId() { return donationId; }
    public void setDonationId(Long donationId) { this.donationId = donationId; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public String getItemType() { return itemType; }
    public void setItemType(String itemType) { this.itemType = itemType; }

    public Condition getCondition() { return condition; }
    public void setCondition(Condition condition) { this.condition = condition; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getDonationStatus() { return donationStatus; }
    public void setDonationStatus(String donationStatus) { this.donationStatus = donationStatus; }

    public String getPickupAddress() { return pickupAddress; }
    public void setPickupAddress(String pickupAddress) { this.pickupAddress = pickupAddress; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}

enum Condition {
    GOOD, USED
}
