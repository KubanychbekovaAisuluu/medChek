package service.impl;

import dataBase.DataBase;
import model.Departments;
import service.DepartmentsService;

import java.util.List;

public class DepartmentsServiceImpl implements DepartmentsService {
    private DataBase dataBase;
    private Long departmentId = 1L;
    @Override
    public List<Departments> getAllDepartmentByHospital(Long id) {
        return null;
    }

    @Override
    public Departments findDepartmentByName(String name) {
        return null;
    }
}
