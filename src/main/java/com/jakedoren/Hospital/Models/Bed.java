package com.jakedoren.Hospital.Models;

public class Bed {
    private User patientOccupying;

    public Bed(User patientOccupying) {
        this.patientOccupying = patientOccupying;
    }

    public User getPatientOccupying() {
        return patientOccupying;
    }

    public void setPatientOccupying(User patientOccupying) {
        this.patientOccupying = patientOccupying;
    }

}
