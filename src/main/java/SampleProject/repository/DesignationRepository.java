package SampleProject.repository;

import SampleProject.entity.designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepository extends JpaRepository<designation,Long> {
}
