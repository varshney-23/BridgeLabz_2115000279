public class Patient {
    private static String hospitalName = "Varshney Hospital";
    private static int totalPatients = 0;

    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient(101, "Ayushi's enemy", 22, "Fever");
        Patient patient2 = new Patient(102, "Pranjal's enemy", 24, "Headache");

        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();
        getTotalPatients();
    }
}
