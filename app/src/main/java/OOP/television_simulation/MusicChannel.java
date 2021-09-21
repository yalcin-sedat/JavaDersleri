package OOP.television_simulation;

public class MusicChannel extends TvChannels {

    private String musicType;

    public MusicChannel(String channelName, int channelNo,String musicType) {
        super(channelName, channelNo);
        this.musicType= musicType;
    }
}
