package base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Animation {
    public Animation() {

    }

    public List<File> loadIcons(String path, int num) {
        String index = "";
        for (int i=0; i<num; i++) {
            if (i < 10) {
                index = "0" + i;
            } else {
                index = String.valueOf(i);
            }

            List<File> images = new ArrayList<File>;
            return images;
        }
    }


    public void play(Animation anim) {

    }
}
