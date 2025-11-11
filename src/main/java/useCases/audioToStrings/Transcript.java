package java.useCases.audioToStrings;

import java.entity.segment;
import java.entity.segmentList;
import java.entity.timeStringMap;
import java.io.File;
import java.util.List;

public interface Transcript {

    // generate the final segmentLists.
    segmentList generateSegmentLists();

    // download the Vosk model
    void downloadModel();

    // generate specific data type based on the model.
    timeStringMap wrapperTimeAndText();


}
