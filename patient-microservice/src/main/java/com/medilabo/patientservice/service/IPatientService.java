package com.medilabo.patientservice.service;

import com.medilabo.patientservice.domain.Patient;
import java.util.List;

/**
 * Any class handling operations on patients
 */

public interface IPatientService {

    List<Patient> getAllPatients();

    Patient getPatient(int patientId);

    Patient updatePatient(Patient patient, int patientId);

    Patient createPatient(Patient patient);

}