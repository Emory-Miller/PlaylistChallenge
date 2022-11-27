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
        Integer loopForwardCount = 0;
        for (int i = 0; i < playList.length; i++){
            if (playList[i].equals(selection)){
                buttonForwardCount = i - startIndex;
                buttonBackwardCount = startIndex - i + playList.length;
                loopForwardCount = i - startIndex + playList.length;
                System.out.println(loopForwardCount);
                System.out.println(buttonBackwardCount);
                System.out.println(buttonForwardCount);
            }
        }
        if (abs(buttonBackwardCount) >= abs(buttonForwardCount) && abs(loopForwardCount) > abs(buttonForwardCount)) return abs(buttonForwardCount);
        else if (abs(buttonForwardCount) > abs(buttonBackwardCount) && abs(loopForwardCount) > abs(buttonBackwardCount)) return abs(buttonBackwardCount);
        else if (abs(buttonForwardCount) > abs(loopForwardCount) && abs(buttonBackwardCount) > abs(loopForwardCount)) return abs(loopForwardCount);
        else return 0;
    }

}
