package service;

import model.Departments;

import java.util.List;

public interface DepartmentsService {
    List<Departments> getAllDepartmentByHospital(Long id);
    Departments findDepartmentByName(String name);
}
