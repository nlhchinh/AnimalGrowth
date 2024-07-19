package com.chinh.AnimalGrowth.sale.model;

import com.chinh.AnimalGrowth.batch.model.Batch;
import com.chinh.AnimalGrowth.batchProduct.model.BatchProduct;
import com.chinh.AnimalGrowth.enums.PaymentStatus;
import com.chinh.AnimalGrowth.payment.model.Payment;
import jakarta.persistence.*;
import lombok.*;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "sale")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sale_id")
    private Long saleId;

    @Column(name = "sale_date", nullable = false)
    private LocalDateTime saleDate;

    @Column(name = "total_sale_amount", nullable = false)
    private int totalSaleAmount;

    @Column(name = "total_cost", nullable = false)
    private DecimalFormat totalCost;

    @Column(name = "payment_status", nullable = false)
    private Payment payment;

    @Column(name = "buyer_name")
    private String buyerName;

    @Column(name = "address")
    private String address;


}
