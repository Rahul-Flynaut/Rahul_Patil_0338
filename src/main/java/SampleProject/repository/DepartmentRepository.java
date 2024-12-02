package SampleProject.repository;

import SampleProject.entity.department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<department,Long> {
}
