package service.impl;

import dataBase.DataBase;
import model.Hospital;
import model.Patient;
import myException.MyException;
import service.HospitalService;

import java.util.List;
import java.util.Map;

public class HospitalServiceImpl implements HospitalService {
    private DataBase dataBase;
    private Long hospitalId = 1L;
    @Override
    public String addHospital(Hospital hospital) {
        hospital.setId(hospitalId++);
        DataBase.hospitals.add(hospital);
        return "successfully add";
    }

    @Override
    public Hospital findHospitalById(Long id) {
        try {
            for (Hospital hospital: DataBase.hospitals){
                if (hospital.getId().equals(id)){
                    return hospital;
                }
            }
            throw new MyException("not found id");
            }catch (MyException myException){
            System.out.println(myException.getMessage());
        }
        return null;
    }

    @Override
    public List<Hospital> getAllHospital() {
        return DataBase.hospitals;
    }

    @Override
    public List<Patient> getAllPatientFromHospital(Long id) {
        try {
            for (Patient patient: DataBase.patients){

            }
        }
        return null;
    }

    @Override
    public String deleteHospitalById(Long id) {
        try {
            for (Hospital hospital : DataBase.hospitals) {
                if (hospital.getId().equals(id)) {
                    DataBase.hospitals.remove(hospital);
                    return "hospital successfully delete";
                }
            }
            throw new MyException("not found hospital id!");
        } catch ( MyException exceptions) {
            System.out.println(exceptions.getMessage());
        }
        return null;
    }

    @Override
    public Map<String, Hospital> getAllHospitalByAddress(String address) {
        return null;
    }
}
