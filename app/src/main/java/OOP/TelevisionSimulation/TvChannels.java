package OOP.TelevisionSimulation;

public class TvChannels {
    private String channelName;
    private  int channelNo;

    public TvChannels(String channelName, int channelNo) {
        this.channelName = channelName;
        this.channelNo = channelNo;

    }

    public String getName() {
        return channelName;
    }

    public void setName(String channelName) {
        this.channelName = channelName;
    }

    public int getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(int channelNo) {
        this.channelNo = channelNo;
    }

    public String showChannelInfo(){
        return "Adi :"+channelName+ "Numarasi : "+channelNo;
    }
}
