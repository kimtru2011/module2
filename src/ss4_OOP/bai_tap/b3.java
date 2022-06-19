package ss4_OOP.bai_tap;
//[Bài tập] Xây dựng lớp FanAssignment
public class b3 {
    public static class Fan {
        private final int SLOW = 1;
        private final int MEDIUM = 2;
        private final int FAST = 3;
        private int speed;
        private boolean on;
        private double radius;
        private String color;
        public Fan() {
            speed =0;
            on = false;
            radius =5;
            color = "blue";
        }
        public Fan (int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
            if(on==false) speed=0;
        }
        public double getRadius() {
            return radius;
        }
        public void setRadius(int radius) {
            this.radius = radius;
        }
        public int getSpeed() {
            return speed;
        }
        public void setSpeed (int speed) {
            this.speed = speed;
        }
        public String getColor() {
            return color;
        }
        public void setColor (String color) {
            this.color = color;
        }
        public boolean isOn() {
            return on;
        }
        public void setOn (boolean on) {
            this.on = on;
            if(on==true) this.speed = this.SLOW;
        }
        public String toString() {
            String str = "fan is on";
            if(this.on==false) str = "fan is off";
            return "Fan { on= "+on+", speed= "+speed+", radius= "+radius+", color= "+color+'\''+", "+str+" "+ '}';
        }
    }
    public static void main(String[] args) {
        Fan fan1=new Fan(3,true,10,"yellow");
        Fan fan2=new Fan(2,false,5,"blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }
}
