package java.entity;

import java.time.Duration;

public class segmentFactory implements Factory{
    @Override
    public segment produceSegment(Duration startTime, Duration endTime, String text){
        return new segment(startTime, endTime, text);
    }
}
