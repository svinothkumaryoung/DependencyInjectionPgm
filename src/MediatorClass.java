public class MediatorClass {
    private InterPgm interPgm;

    public void setInterPgm(InterPgm interPgm) {
        this.interPgm = interPgm;//br
    }
    public void printMethod1()
    {
        this.interPgm.printData();
    }
}
