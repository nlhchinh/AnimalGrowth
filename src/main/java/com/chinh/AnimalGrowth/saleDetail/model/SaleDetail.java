package com.chinh.AnimalGrowth.saleDetail.model;

import com.chinh.AnimalGrowth.batchProduct.model.BatchProduct;
import com.chinh.AnimalGrowth.sale.model.Sale;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "sale_detail")
public class SaleDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sale_detail_id")
    private Long saleDetailId;

    @Column(name = "amount", nullable = false)
    private int amount;

    @ManyToOne
    @JoinColumn(name = "batch_product_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @Column(name = "batch_product", nullable = false)
    private BatchProduct batchProduct;

    @ManyToOne
    @JoinColumn(name = "sale_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @Column(name = "sale", nullable = false)
    private Sale sale;
}
