package java.useCases.getAudioFromVideo;

import java.io.File;
import java.io.IOException;

public interface AudioExtractor {
    /**
     * Extract audio from the video
     *
     * @param videoFile input video file
     * @param outputAudioFile out put audio file
     * @throws IOException if reading or extracting fails.
     */
    void extractAudio(File videoFile, File outputAudioFile) throws IOException;

    /**
     * get the length of the audio file
     *
     * @param videoFile video file.
     * @return length of the audio file in seconds.
     * @throws IOException if the output fails.
     */
    double getAudioDuration(File videoFile) throws IOException;

    /**
     * check whether the videoFile contains audio.
     *
     * @param videoFile video file
     * @return contains video file.
     */
    boolean hasAudio(File videoFile);
}
