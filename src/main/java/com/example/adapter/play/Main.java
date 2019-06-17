package com.example.adapter.play;/**
 * ${tag}
 *
 * @author zhanghongjian
 * @Date 2019/6/14 13:44
 */

/**
 * @author：张鸿建
 * @time：2019/6/14
 * @desc：
 **/
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("flv", "far far away.flv");
        audioPlayer.play("avi", "mind me.avi");

    }
}
