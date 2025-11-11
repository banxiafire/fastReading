package java.entity;


import java.util.List;

public class segmentList extends language{
    private List<segment> segments;

    public segmentList(String language, List<segment> segments){
        super(language);
        this.segments = List.copyOf(segments);
    }

    public boolean addSegment(segment candidate){
        this.segments.add(candidate);
        return true;
    }
}
