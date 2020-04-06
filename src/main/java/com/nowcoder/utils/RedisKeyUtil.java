package com.nowcoder.utils;

public class RedisKeyUtil {

    private static String SPLIT = ":";
    private static String BIZ_LIKE = "LIKE";
    private static String BIZ_DISLIKE = "DISLIKE";
    private static String BIZ_EVENTQUEUE = "EVENT_QUEUE";

    //粉丝
     private static String BIZ_FOLLOWER = "FOLLOWER";
    //关注对象
     private static String BIZ_FOLLOWEE = "FOLLOWEE";

     //timelineKey
     private static String BIZ_TIMELINE = "TIMELINE";


    public static String getLikeKey(int entityType,int entityId){
        return BIZ_LIKE+SPLIT+entityType+SPLIT+entityId;
    }

    public static String getDislikeKey(int entityType,int entityId){
        return BIZ_DISLIKE+SPLIT+entityType+SPLIT+entityId;
    }

    public static String getEventQueueKey(){
        return BIZ_EVENTQUEUE;
    }

    //某一个实体的关注者
    public static String getFollowerKey(int entityType,int entityId){
        return BIZ_FOLLOWER+SPLIT+entityType+SPLIT+entityId;
    }

    //某一个用户对一类问题的关注
    public static String getFolloweeKey(int userId,int entityType){
        return BIZ_FOLLOWEE+SPLIT+userId+SPLIT+entityType;
    }

    public static String getTimelineKey(int userId){
        return BIZ_TIMELINE+SPLIT+userId;
    }
}

