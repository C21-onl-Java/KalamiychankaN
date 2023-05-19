package ru.teachmeskills.homework08.Task2;

public class Main {
    public static void main(String[] args) {
        TreatmentPlan plan = new TreatmentPlan(1); // Создание плана лечения с кодом 1
        Patient patient = new Patient(plan); // Создание пациента и назначение ему плана лечения

        patient.assignDoctor(); // Назначение врача согласно плану лечения и выполнение метода лечить
    }
}