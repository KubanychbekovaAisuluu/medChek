package model;

import java.util.List;

public class Hospital {
    private Long id;
    private String hospitalName;
    private String address;

    public Hospital(Long id, String hospitalName, String address) {
        this.id = id;
        this.hospitalName = hospitalName;
        this.address = address;
    }

    public Hospital() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "id=" + id +
                ", hospitalName='" + hospitalName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
