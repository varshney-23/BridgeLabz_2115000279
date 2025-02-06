import java.util.*;

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
    }

    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Dr. " + name + " is consulting " + patient.getName());
        } else {
            System.out.println(patient.getName() + " is not assigned to Dr. " + name);
        }
    }
}
class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }
}

class Hospital {
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital() {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showDoctors() {
        System.out.println("Doctors in Hospital:");
        for (Doctor doc : doctors) {
            System.out.println("- " + doc.getName());
        }
    }

    public void showPatients() {
        System.out.println("Patients in Hospital:");
        for (Patient pat : patients) {
            System.out.println("- " + pat.getName());
        }
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor AyuDoctor = new Doctor("Ayu");
        Doctor pranDoctor = new Doctor("Pran");
        hospital.addDoctor(AyuDoctor);
        hospital.addDoctor(pranDoctor);

        Patient patient1 = new Patient("patient1");
        Patient patient2 = new Patient("patient2");
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        AyuDoctor.addPatient(patient1);
        AyuDoctor.addPatient(patient2);
        pranDoctor.addPatient(patient2);
        hospital.showDoctors();
        hospital.showPatients();

        AyuDoctor.consult(patient1);
        pranDoctor.consult(patient2);
        pranDoctor.consult(patient1); 
    }
}