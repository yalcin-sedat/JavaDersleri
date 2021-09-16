package OOP.TelevisionSimulation;

public class MusicChannel extends TvChannels {

    private String musicType;

    public MusicChannel(String channelName, int channelNo,String musicType) {
        super(channelName, channelNo);
        this.musicType= musicType;
    }
}
