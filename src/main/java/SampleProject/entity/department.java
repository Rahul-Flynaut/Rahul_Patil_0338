package SampleProject.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table (name = "Department")
public class department {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long departmentID;
    private String departmentName;


    private boolean isActive;
    private String createdBy;
    private LocalDateTime createDate;
    private String updateBy;
    private LocalDateTime updateDate;

}
