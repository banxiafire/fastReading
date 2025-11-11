package java.dataAccess;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.useCases.getAudioFromVideo.AudioExtractor;

public class AudioExtractorInstance implements AudioExtractor {

    @Override
    public void extractAudio(File videoFile, File outputAudioFile) throws IOException {
        String command = String.format(
                "ffmpeg -i \"%s\" -q:a 0 -map a \"%s\" -y",
                videoFile.getAbsolutePath(),
                outputAudioFile.getAbsolutePath()
        );
        Runtime.getRuntime().exec(command);
    }

    @Override
    public double getAudioDuration(File videoFile) throws IOException {
        String command = String.format(
                "ffprobe -v error -select_streams a:0 -show_entries stream=duration " +
                        "-of default=noprint_wrappers=1:nokey=1 \"%s\"",
                videoFile.getAbsolutePath()
        );

        Process process = Runtime.getRuntime().exec(command);

        // read output
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {

            String line = reader.readLine();
            if (line != null && !line.isEmpty()) {
                return Double.parseDouble(line.trim());
            }
        } catch (NumberFormatException e) {
            return 0;
        }

        return 0;
    }

    @Override
    public boolean hasAudio(File videoFile) {
        try {
            String command = String.format(
                    "ffprobe -v error -select_streams a -show_entries stream=codec_type " +
                            "-of csv=p=0 \"%s\"",
                    videoFile.getAbsolutePath()
            );

            Process process = Runtime.getRuntime().exec(command);

            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()))) {
                String line = reader.readLine();
                return (line != null && line.contains("audio"));
            }
        } catch (IOException e) {
            return false;
        }
        }
}
