package com.learning.juhesdk.listener;


public abstract class RewardAdListener  implements RMAdListener {
    public abstract void onVideoPlayFinish();
    public abstract void onReward(RewardModel rewardModel);


}
