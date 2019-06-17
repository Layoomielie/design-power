package com.example.adapter.play;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 13:43
 */

import com.example.adapter.play.adapter.MediaAdapter;
import com.example.adapter.play.adapter.MediaPlayer;

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("flv")
                || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }
    }
}
