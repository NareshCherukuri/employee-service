package employee.service.employeeserviceAPI.mapper;

import employee.service.employeeserviceAPI.dto.EmployeeDTO;
import employee.service.employeeserviceAPI.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeMapper extends GenericMapper<Employee, EmployeeDTO> {
    @Override
    @Mapping(target = "id", ignore = true)
    Employee asEntity(EmployeeDTO dto);
}