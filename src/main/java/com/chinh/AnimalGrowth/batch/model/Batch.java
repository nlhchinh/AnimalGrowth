package com.chinh.AnimalGrowth.batch.model;

import com.chinh.AnimalGrowth.enums.PaymentStatus;
import com.chinh.AnimalGrowth.enums.StockpileStatus;
import com.chinh.AnimalGrowth.product.model.Product;
import com.chinh.AnimalGrowth.role.model.Role;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "batch")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "batch_id")
    private Long batchId;

    @Column(name = "stock_in_date", nullable = false)
    private LocalDateTime stockInDate;

    @Column(name = "last_update_date", nullable = false)
    private LocalDateTime lastUpdateDate;

    @Column(name = "total_batch_quantity", nullable = false)
    private int totalBatchQuantity;

    @Column(name = "total_cost_price", nullable = false)
    private int totalCostPrice;

    @Column(name = "description")
    private String description;

    @Column(name = "supplier")
    private String supplier;

    @Column(name = "confirmed_by")
    private String confirmedBy;

    @Column(name = "delivered_by")
    private String delivered;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_status", nullable = false)
    private PaymentStatus paymentStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "stockpile_status", nullable = false)
    private StockpileStatus stockpileStatus;
}
