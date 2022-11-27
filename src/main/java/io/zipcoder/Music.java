package io.zipcoder;

import static java.lang.Math.abs;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        Integer buttonForwardCount = 0;
        Integer buttonBackwardCount = 0;
        for (int i = 0; i < playList.length; i++){
            if (playList[i].equals(selection)){
                buttonForwardCount = i - startIndex ;
                buttonBackwardCount = startIndex - i + playList.length;
            }
        }
        if (buttonBackwardCount > buttonForwardCount) return abs(buttonForwardCount);
        else return abs(buttonBackwardCount);
    }
}
