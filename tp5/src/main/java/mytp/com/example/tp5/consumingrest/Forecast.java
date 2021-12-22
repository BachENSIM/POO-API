package mytp.com.example.tp5.consumingrest;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Forecast {

    private int probarain;
    //private int sunHours;
    private int sun_hours;
    private double tmin; //temperatureMin
    private double tmax; //temperatureMax
    /*private DateFormat date;*/
    private int day;
    private Date datetime;

    public Forecast() {
    }

    public int getProbarain() {
        return probarain;
    }

    public void setProbarain(int probarain) {
        this.probarain = probarain;
    }

    public int getSun_hours() {
        return sun_hours;
    }

    public void setSun_hours(int sun_hours) {
        this.sun_hours = sun_hours;
    }

    public double getTmin() {
        return tmin;
    }

    public void setTmin(double tmin) {
        this.tmin = tmin;
    }

    public double getTmax() {
        return tmax;
    }

    public void setTmax(double tmax) {
        this.tmax = tmax;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}
