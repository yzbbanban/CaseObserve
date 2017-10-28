public class WeatherObserver implements Observer{
    private String observerName;

    private String weatherOserverState;

    private String observerRemind;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeatherOserverState() {
        return weatherOserverState;
    }

    public void setWeatherOserverState(String weatherOserverState) {
        this.weatherOserverState = weatherOserverState;
    }

    public String getObserverRemind() {
        return observerRemind;
    }

    public void setObserverRemind(String observerRemind) {
        this.observerRemind = observerRemind;
    }

    @Override
    public void updateWeather(Subject subject) {
        weatherOserverState=((WeatherSubject)subject).getWeatherSubjectState();
        System.out.println(observerName+""+weatherOserverState+""+observerRemind );
    }
}
