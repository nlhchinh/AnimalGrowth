package com.chinh.AnimalGrowth.product.model;

import com.chinh.AnimalGrowth.category.model.Category;
import com.chinh.AnimalGrowth.enums.FeedType;
import com.chinh.AnimalGrowth.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "create_date", nullable = false)
    private LocalDateTime createDate;

    @Column(name = "last_update_date", nullable = false)
    private LocalDateTime lastUpdateDate;

    @Column(name = "weight", nullable = false)
    private int weight;

    @Column(name = "total_quantity", nullable = false)
    private int totalQuantity;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @Column(name = "branch", nullable = false)
    private String branch;

    @OneToMany
    @JoinColumn(name = "category_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @Column(name = "category", nullable = false)
    private Category category;

    @Enumerated(EnumType.STRING)
    @Column(name = "feed_type", nullable = false)
    private FeedType feedType;
}
