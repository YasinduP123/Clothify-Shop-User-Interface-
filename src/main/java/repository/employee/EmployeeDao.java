package repository.employee;

import dto.Employee;
import entity.EmployeeEntity;
import javafx.collections.ObservableList;
import repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<EmployeeEntity> {
	ObservableList<Long> getEmpIds();

	EmployeeEntity findById(Long id);

	ObservableList<EmployeeEntity> findByEmail(String email);

	EmployeeEntity findRegistrationByEmail(String email);
}
