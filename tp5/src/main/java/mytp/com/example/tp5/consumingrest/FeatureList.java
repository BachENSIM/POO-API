package mytp.com.example.tp5.consumingrest;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FeatureList {

    private List<Feature> features;

    public FeatureList() {

    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    @Override
    public String toString() {
        return "FeatureList{" +
                "features=" + features +
                '}';
    }
}
