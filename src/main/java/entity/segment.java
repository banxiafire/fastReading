package java.entity;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.time.Duration;

public class segment {

    private final Duration startTime;
    private final Duration endTime;
    private String text = null;
    private BufferedImage image = null;


    public segment(Duration startTime, Duration endTime, String text){
        this.startTime = startTime;
        this.endTime = endTime;
        this.text = text;
    }

    public Duration getStartTime(){
        return this.startTime;
    }

    public Duration getEndTime(){
        return this.endTime;
    }

    public String getText(){
        return this.text;
    }

    public void attachPhoto(String imagePath) throws IOException{
        this.image = ImageIO.read(new File(imagePath));
    }
}