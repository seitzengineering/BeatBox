package com.seitzsoftwaresolutions.android.beatbox;

/**
 * Created by Kevin on 2/28/2016.
 */
public class Sound {
    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] componets = assetPath.split("/");
        String filename = componets[componets.length - 1];
        mName = filename.replace(".wav", "");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }
}
