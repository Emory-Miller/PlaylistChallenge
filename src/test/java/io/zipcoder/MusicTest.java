package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class MusicTest {

    @Test
    public void selectionTest1(){

        String[] playlist = {"wheniseeyouagain","borntorun","nothingelsematters","cecelia"};
        Music music = new Music(playlist);
        Integer startingIndex = 1;
        String selection = "cecelia";
        Integer expected = 2;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest2(){

        String[] playlist = {"dancinginthedark","rio","liveoak","liveoak"};
        Music music = new Music(playlist);
        Integer startingIndex = 0;
        String selection = "liveoak";
        Integer expected = 1;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest3(){

        String[] playlist = {"wheniseeyouagain","borntorun","nothingelsematters","cecelia","dancinginthedark","rio","heartbreaker","liveoak"};
        Music music = new Music(playlist);
        Integer startingIndex = 1;
        String selection = "cecelia";
        Integer expected = 2;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest4(){

        String[] playlist = {"wheniseeyouagain","borntorun","nothingelsematters","cecelia","dancinginthedark","rio","heartbreaker","liveoak"};
        Music music = new Music(playlist);
        Integer startingIndex = 4;
        String selection = "cecelia";
        Integer expected = 1;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest5(){

        String[] playlist = {"wheniseeyouagain","borntorun","nothingelsematters","cecelia","dancinginthedark","rio","heartbreaker","liveoak"};
        Music music = new Music(playlist);
        Integer startingIndex = 4;
        String selection = "borntorun";
        Integer expected = 3;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest6(){

        String[] playlist = {"wheniseeyouagain","borntorun","nothingelsematters","cecelia","dancinginthedark","rio","heartbreaker","liveoak"};
        Music music = new Music(playlist);
        Integer startingIndex = 5;
        String selection = "wheniseeyouagain";
        Integer expected = 3;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

}
