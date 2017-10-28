public class WeatherSubject extends Subject {
    private String weatherSubjectState;

    public String getWeatherSubjectState() {
        return weatherSubjectState;
    }

    public void setWeatherSubjectState(String weatherSubjectState) {
        this.weatherSubjectState = weatherSubjectState;
        this.notifyObservers();
    }

}
