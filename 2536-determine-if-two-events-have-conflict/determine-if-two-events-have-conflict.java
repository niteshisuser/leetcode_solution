class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        String event1St = event1[0];
        String ev1St[] = event1St.split(":");
        int event1StartTime = Integer.parseInt(ev1St[0])*60+Integer.parseInt(ev1St[1]);

        String event1Et = event1[1];
        String ev1Et[] = event1Et.split(":");
        int event1EndTime = Integer.parseInt(ev1Et[0])*60+Integer.parseInt(ev1Et[1]);

        String event2St = event2[0];
        String ev2St[] = event2St.split(":");
        int event2StartTime = Integer.parseInt(ev2St[0])*60+Integer.parseInt(ev2St[1]);

        String event2Et = event2[1];
        String ev2Et[] = event2Et.split(":");
        int event2EndTime = Integer.parseInt(ev2Et[0])*60+Integer.parseInt(ev2Et[1]);
        //System.out.println("event1StartTime:"+event1StartTime+",Event1EndTime:"+event1EndTime+",Evnet2StartTime:"+event2StartTime+",Event2EndTime:"+event2EndTime);
        return (event1StartTime>=event2StartTime && event1StartTime<=event2EndTime) || (event1EndTime>=event2StartTime && event1EndTime<=event2EndTime) || ((event2StartTime>=event1StartTime && event2StartTime<=event1EndTime) || (event2EndTime>=event1StartTime && event2EndTime<=event1EndTime));


    }
}