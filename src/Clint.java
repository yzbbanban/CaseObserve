public class Clint {
    public static void main(String[] args){
        WeatherSubject weatherSubject=new WeatherSubject();

        WeatherObserver observerGirl=new WeatherObserver();
        observerGirl.setObserverName("uu");
        observerGirl.setObserverRemind("去哪里玩呢");

        WeatherObserver observerMum=new WeatherObserver();
        observerMum.setObserverName("mum");
        observerMum.setObserverRemind("去哪吃");

        weatherSubject.subscribe(observerGirl);
        weatherSubject.subscribe(observerMum);

        weatherSubject.setWeatherSubjectState("今天天气不错哇");
    }
}
