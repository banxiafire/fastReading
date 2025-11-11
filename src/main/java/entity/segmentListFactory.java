package java.entity;

import java.util.List;

public class segmentListFactory implements Factory {
    @Override
    public segmentList produceSegmentList(String language, List<segment> segments) {
        return new segmentList(language,segments);
    }
}
