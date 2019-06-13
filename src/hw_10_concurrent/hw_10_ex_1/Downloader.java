package hw_10_concurrent.hw_10_ex_1;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class Downloader implements Runnable {
    private static final List<String> FILE_URL = Arrays.asList("URL1", "URL2", "URL3", "URL4");

    @Override
    public void run() {
        downloadFile();
    }

    private static synchronized void downloadFile() {
        for (String url : FILE_URL) {
            try (BufferedInputStream downl = new BufferedInputStream(new URL(url).openStream())) {
                downl.read();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
