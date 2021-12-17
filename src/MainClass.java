public class MainClass {
    /*
    Depency Injection:Implement Loosely Coupled
     */
    public static void main(String[] args) {
        BillingRecords br=new BillingRecords();
        DoctorPrescri dp=new DoctorPrescri();
        MediatorClass mc=new MediatorClass();
        mc.setInterPgm(br);
        mc.printMethod1();
    }
}
