package com.chinh.AnimalGrowth.batchProduct.model;

import com.chinh.AnimalGrowth.batch.model.Batch;
import com.chinh.AnimalGrowth.product.model.Product;
import jakarta.persistence.*;
import lombok.*;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

@Entity
@Table(name = "batch_product")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BatchProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "batch_product_id")
    private Long batchProductId;

    @Column(name = "create_date", nullable = false)
    private LocalDateTime createDate;

    @Column(name = "expiration_date", nullable = false)
    private LocalDateTime expirationDate;

    @Column(name = "last_update_date", nullable = false)
    private LocalDateTime lastUpdateDate;

    @Column(name = "single_purchase_price", nullable = false)
    private DecimalFormat singlePurchasePrice;

    @Column(name = "selling_price", nullable = false)
    private DecimalFormat singleSellingPrice;

    @Column(name = "quantity", nullable = false)
    private String quantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @Column(name = "product", nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "batch_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @Column(name = "batch", nullable = false)
    private Batch batch;
}
