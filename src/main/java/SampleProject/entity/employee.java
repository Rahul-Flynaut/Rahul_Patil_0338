package SampleProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.GenerationType;

import java.time.LocalDateTime;

@Entity
@Data
@Table (name = "EmployeeInfo")
public class employee {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeAge;
    private String employeeContactNumber;
    private String employeeDOJ;
    private String employeeAddress;
    private String employeeSalary;
    private String email;
    
    private boolean isActive;
    private String createdBy;
    private LocalDateTime createDate;
    private String updateBy;
    private LocalDateTime updateDate;

}