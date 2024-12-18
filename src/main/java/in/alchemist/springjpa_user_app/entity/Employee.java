package in.alchemist.springjpa_user_app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="emp_tbl")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empId;
    private String empName;
    private Double empSalary;
    private String empGender;
    private String dept;
    @CreationTimestamp
    @Column(name = "date_created",updatable = false)
    private LocalDateTime dateCreated;
    @UpdateTimestamp
    @Column(name = "last_updated",insertable = false)
    private LocalDateTime lastUpdated;
}
