package ru.teachmeskills.homework08.Task2;

public class Patient {
    private TreatmentPlan treatmentPlan;

    public Patient(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void assignDoctor() {
        int planCode = treatmentPlan.getCode();
        Doctor doctor;

        if (planCode == 1) {
            doctor = new Surgeon();
        } else if (planCode == 2) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }

        doctor.treat();
    }
}