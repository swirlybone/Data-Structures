public class Station {
    private String stationName;


    public Station(String stationName){
        this.stationName=stationName;
    }

    public String getStationName(){
        return this.stationName;
    }

    public void setStationName(String stationName){
        this.stationName=stationName;
    }

    public String toString(){
        String s ="\nStation Name:" + stationName;
        return s;
    }
}
