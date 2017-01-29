package nat.chung.mediadecoderplayer;

import android.media.MediaFormat;

/**
 * Created by Nat on 2017/1/29.
 */

public class PlayerDecorator implements IPlayer {

    private IPlayer iPlayer;

    public PlayerDecorator(IPlayer iPlayer) {
        this.iPlayer = iPlayer;
    }


    @Override
    public void addVideoFrame(byte[] data, long timestamp) {

    }

    @Override
    public void setup(String mineType, MediaFormat format) {

    }

    @Override
    public void stop() {

    }
}
