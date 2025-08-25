public class Reservation {
    private static int pnrCounter = 1001;

    private int pnr;
    private String passengerName;
    private String trainNumber;
    private String from;
    private String to;
    private String date;
    private String classType;

    public Reservation(String passengerName, String trainNumber, String from, String to, String date, String classType) {
        this.pnr = pnrCounter++;
        this.passengerName = passengerName;
        this.trainNumber = trainNumber;
        this.from = from;
        this.to = to;
        this.date = date;
        this.classType = classType;
    }

    public int getPnr() {
        return pnr;
    }

    public String getDetails() {
        return "PNR: " + pnr + "\nPassenger: " + passengerName + "\nTrain No: " + trainNumber +
               "\nFrom: " + from + " To: " + to + "\nDate: " + date + "\nClass: " + classType;
    }
}
