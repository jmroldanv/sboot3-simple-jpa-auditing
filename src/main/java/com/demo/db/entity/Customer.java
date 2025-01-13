package com.demo.db.entity;

import com.demo.db.audit.Audit;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Table(name="customers")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Audit audit = new Audit();

    public Customer(String name) {
        this.name = name;
    }
}
