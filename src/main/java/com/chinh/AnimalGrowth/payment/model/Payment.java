package com.chinh.AnimalGrowth.payment.model;

import com.chinh.AnimalGrowth.batch.model.Batch;
import com.chinh.AnimalGrowth.enums.PaymentMethod;
import com.chinh.AnimalGrowth.product.model.Product;
import com.chinh.AnimalGrowth.sale.model.Sale;
import jakarta.persistence.*;
import lombok.*;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "payment_id")
    private Long paymentId;

    @Column(name = "payment_date", nullable = false)
    private LocalDateTime paymentDate;

    @Column(name = "paid_amount", nullable = false)
    private DecimalFormat paidAmount;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_method", nullable = false)
    private PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "batch_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @Column(name = "batch", nullable = false)
    private Batch batch;

    @ManyToOne
    @JoinColumn(name = "sale_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @Column(name = "sale", nullable = false)
    private Sale sale;
}
