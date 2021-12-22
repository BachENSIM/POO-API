package mytp.com.example.tp5.controller;


import mytp.com.example.tp5.consumingrest.FeatureList;
import mytp.com.example.tp5.consumingrest.Forecast;
import mytp.com.example.tp5.consumingrest.ForecastList;
import mytp.com.example.tp5.consumingrest.Geometry;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

@Controller
public class MeteoController {
    // clé API de MétéoConcept
    // cc1ccc9f259fb81c2b3484daca4b38f91dd2f90103cc78b53b3aa3fe1ac047ae
    @PostMapping("/meteo")
    public void getAddress(@RequestParam(value = "address") String address, Model model) {
        String url = "https://api-adresse.data.gouv.fr/search/?q=" + address;
        RestTemplate template = new RestTemplateBuilder().build();
        FeatureList fl = template.getForObject(url, FeatureList.class);
        System.out.println(url);
        String codePostal = fl.getFeatures().get(1).getProperties().getPostcode();
        String nameCity = fl.getFeatures().get(1).getProperties().getCity();
        String nameAddress = fl.getFeatures().get(1).getProperties().getName();

        model.addAttribute("codePostal", codePostal);
        model.addAttribute("nameCity", nameCity);
        model.addAttribute("nameAddress", nameAddress);
        System.out.println(nameAddress + " - " + codePostal + " - " + nameCity);
        /*model.addAttribute("featureList", fl);
        model.addAttribute("nameAddr", address);*/

        String token = "cc1ccc9f259fb81c2b3484daca4b38f91dd2f90103cc78b53b3aa3fe1ac047ae";
        Geometry geo = fl.getFeatures().get(1).getGeometry();
        model.addAttribute("latitude", geo.getCoordinates().get(1).doubleValue()) ;
        model.addAttribute("longtitude", geo.getCoordinates().get(0).doubleValue()) ;
        System.out.println(geo.getCoordinates());
        String url2 = "https://api.meteo-concept.com/api/forecast/daily?token="+ token + "&latlng=" + geo;
        System.out.println(url2);
        ForecastList forecastList = template.getForObject(url2, ForecastList.class);
        //Forecast forecast = forecastList.getForecast().get(0);
        //System.out.println(forecastList.toString());
        Double temperatureMax = forecastList.getForecast().get(0).getTmax();
        Double temperatureMin = forecastList.getForecast().get(0).getTmin();
        int probaRain = forecastList.getForecast().get(0).getProbarain();
        int sunHours = forecastList.getForecast().get(0).getSun_hours();
        Date d = forecastList.getForecast().get(0).getDatetime();
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

//        String date = DateTimeFormatter.ofPattern("yyyy-MM-dd").format((TemporalAccessor) d);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
//        String date = dtf.format(d);

        System.out.println( " Date : " + date + " ProbaRain " + probaRain +  " SunHours " + sunHours
                + " TemperatureMax " + temperatureMax +  " TemperatureMin " + temperatureMin);

        model.addAttribute("tmax", temperatureMax);
        model.addAttribute("tmin", temperatureMin);
        model.addAttribute("pRain", probaRain);
        model.addAttribute("sHours", sunHours);
        model.addAttribute("date", date);

        /*for (Forecast f : forecastList.getForecast() ) {
            System.out.println( "Day : " + f.getDay() + " ProbaRain " + f.getProbarain() +  " SunHours " + f.getSun_hours()
                    + " TemperatureMax " + f.getTmax() +  " TemperatureMin " + f.getTmin());
        }*/
    }
}
