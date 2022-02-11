package com.jakedoren.Hospital.Models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Hospitals")
public class Hospital {
    private String HospitalName;
    private Room[] rooms;

    public Hospital(String hospitalName) {
        HospitalName = hospitalName;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String hospitalName) {
        HospitalName = hospitalName;
    }

}
