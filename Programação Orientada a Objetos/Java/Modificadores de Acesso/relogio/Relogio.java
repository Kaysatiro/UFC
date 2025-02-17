class Relogio {
    private int hour;
    private int minute;
    private int second;

    public Relogio(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void nextSecond() {
        this.second++;
        if(second > 59) {
            this.minute++;
            this.second = 0;
        }
        if(minute > 59) {
            this.hour++;
            this.minute = 0;
        }
        if(hour > 23) {
            this.hour = 0;
        }
    }

    public void setSecond(int second) {
        if(second >= 0 && second <= 59) {
            this.second = second;
            return;
        }
        System.out.println("fail: segundo invalido");
    }
    public void setMinute(int minute) {
        if(minute >= 0 && minute <= 59) {
            this.minute = minute;
            return;
        }
        System.out.println("fail: minuto invalido");
    }
    public void setHour(int hour) {
        if(hour >= 0 && hour <= 23) {
            this.hour = hour;
            return;
        }
        System.out.println("fail: hora invalida");
    }

    public int getSecond() {
        return this.second;
    }
    public int getMinute() {
        return this.minute;
    }
    public int getHour() {
        return this.hour;
    }

    public String toString() {
       return String.format("%02d", this.hour) + ":" + 
               String.format("%02d", this.minute) + ":" + 
               String.format("%02d", this.second);
    }
}