package OOP.TelevisionSimulation;

public class NewsTvChannel  extends TvChannels {

    private String channelType;

    public NewsTvChannel(String channelName, int channelNo,String channelType) {
        super(channelName, channelNo);
        this.channelType=channelType;
    }
}
