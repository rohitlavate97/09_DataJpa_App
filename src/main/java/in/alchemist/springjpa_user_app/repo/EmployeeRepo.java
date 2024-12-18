package in.alchemist.springjpa_user_app.repo;

import in.alchemist.springjpa_user_app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
