package ss4_OOP.bai_tap;

import java.util.Date;

public class b2 {
    public class StopWatch {
        private Date starTime, endTime;

        public StopWatch() {
            starTime = new Date();
        }

        public Date getStarTime() {
            return starTime;
        }

        public void setStarTime(Date starTimes) {
            this.starTime = starTimes;
        }

        public Date getEndTime() {
            return endTime;
        }

        public void setEndTime(Date endTime) {
            this.endTime = endTime;
        }

        public void start() {
            starTime = new Date();
        }

        public void stop() {
            endTime = new Date();
        }

        public long getElapsedTime() {
            long time1 = ((starTime.getHours() * 60 + starTime.getMinutes()) * 60 + starTime.getSeconds()) * 1000;
            long time2 = ((endTime.getHours() * 60 + endTime.getMinutes()) * 60 + endTime.getSeconds()) * 1000;
            return time2 - time1;
        }
    }
}

