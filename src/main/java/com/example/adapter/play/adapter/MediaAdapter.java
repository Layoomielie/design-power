package com.example.adapter.play.adapter;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 13:37
 */

import com.example.adapter.play.advance.AdvancedMediaPlayer;
import com.example.adapter.play.advance.FlvPlayer;
import com.example.adapter.play.advance.Mp4Player;

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("flv") ){
            advancedMusicPlayer = new FlvPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("flv")){
            advancedMusicPlayer.playFlv(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
