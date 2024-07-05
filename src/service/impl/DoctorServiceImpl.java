package service.impl;

import dataBase.DataBase;
import model.Doctor;
import service.DoctorService;

import java.util.List;

public class DoctorServiceImpl implements DoctorService {
    private DataBase dataBase;
    private Long doctorId = 1L;
    @Override
    public Doctor findDoctorById(Long id) {
        return null;
    }

    @Override
    public String assignDoctorToDepartment(Long departmentId, List<Long> doctorsId) {
        return null;
    }

    @Override
    public List<Doctor> getAllDoctorsByHospitalId(Long id) {
        return null;
    }

    @Override
    public List<Doctor> getAllDoctorsByDepartmentId(Long id) {
        return null;
    }
}
