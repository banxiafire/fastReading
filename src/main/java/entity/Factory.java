package java.entity;

import java.time.Duration;
import java.util.List;

public interface Factory {
    default segment produceSegment(Duration startTime, Duration endTime, String text){
        throw new UnsupportedOperationException("produceSegment method haven't been " +
                "implemented yet or you used wrong class.");
    }

    default segmentList produceSegmentList(String language, List<segment> segments){
        throw new UnsupportedOperationException("segmentList method haven't been implemented" +
                " yet or you used wrong class");
    }

}
