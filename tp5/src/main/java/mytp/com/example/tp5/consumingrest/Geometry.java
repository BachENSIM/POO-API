package mytp.com.example.tp5.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Geometry {

    private List<Double> coordinates;

    public Geometry() {
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return coordinates.get(1) + "," + coordinates.get(0);
    }
}
