package java.entity;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class timeStringMap {
    private List<Duration> durations;
    private Map<Duration, String> texts;

    public timeStringMap(){
        this.durations = new ArrayList<>();
        this.texts = new HashMap<>();
    }

    public void add(Duration when, String where){
        this.durations.add(when);
        this.texts.put(when, where);
    }

    public List<Duration> getDurations(){
        return this.durations;
    }

    public Map<Duration, String> getTexts(){
        return this.texts;
    }

}
