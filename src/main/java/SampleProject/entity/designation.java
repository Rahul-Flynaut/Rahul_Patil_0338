package SampleProject.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table (name = "designation")
public class designation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long designationID;
    private String designationName;


    private boolean isActive;
    private String createdBy;
    private LocalDateTime createDate;
    private String updateBy;
    private LocalDateTime updateDate;

}
