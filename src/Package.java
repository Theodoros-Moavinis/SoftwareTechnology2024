import java.time.LocalDate;

public class Package {
    public LocalDate StartDate;
    public LocalDate EndDate;
    public String Accomodation;
    public String Transportation;
    
    public Package(String accomodation, String transportation){
        Accomodation = accomodation;
        Transportation = transportation;
        StartDate = null;
        EndDate = null;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
    }

    public String getAccomodation() {
        return Accomodation;
    }

    public void setAccomodation(String accomodation) {
        Accomodation = accomodation;
    }

    public String getTransportation() {
        return Transportation;
    }

    public void setTransportation(String transportation) {
        Transportation = transportation;
    }

    
}
