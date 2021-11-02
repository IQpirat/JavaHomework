package HW5;

public class Reader {

    private String name;
    private  int ticket;
    private  String facult;
    private  String birthday;
    private  String telephon;

    public Reader(String name, int ticket, String facult, String birthday, String telephon)
    {
        this.name = name;
        this.ticket = ticket;
        this.facult = facult;
        this.birthday = birthday;
        this.telephon = telephon;
    }




    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String getFacult() {
        return facult;
    }

    public void setFacult(String facult) {
        this.facult = facult;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTelephon() {
        return telephon;
    }

    public void setTelephon(String telephon) {
        this.telephon = telephon;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    String getInfo() {
        return "[ФіО: " + name + "\nНомер квитка: " + ticket + "\nФакультет: "
                + facult + "\nДата народження: " + birthday + "\nМобільний: " + telephon + "]";

    }

}
