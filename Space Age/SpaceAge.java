class SpaceAge {

    private final double EARTH_YEAR = 31557600;
    private double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
       return this.seconds;
    }

    double onEarth() {
        double age = this.seconds / EARTH_YEAR;  
        return Math.round(age * 100.0) / 100.0;
    }

    double onMercury() {
        double year = EARTH_YEAR * 0.2408467;
        double age = this.seconds / year;  
        return Math.round(age * 100.0) / 100.0;
    }

    double onVenus() {
        double year = EARTH_YEAR * 0.61519726;
        double age = this.seconds / year;  
        return Math.round(age * 100.0) / 100.0;    }

    double onMars() {
        double year = EARTH_YEAR * 1.8808158;
        double age = this.seconds / year;  
        return Math.round(age * 100.0) / 100.0;
    }

    double onJupiter() {
        double year = EARTH_YEAR * 11.862615;
        double age = this.seconds / year;  
        return Math.round(age * 100.0) / 100.0;
    }

    double onSaturn() {
        double year = EARTH_YEAR * 29.447498;
        double age = this.seconds / year;  
        return Math.round(age * 100.0) / 100.0;
    }

    double onUranus() {
        double year = EARTH_YEAR * 84.016846;
        double age = this.seconds / year;  
        return Math.round(age * 100.0) / 100.0;
    }

    double onNeptune() {
        double year = EARTH_YEAR * 164.79132;
        double age = this.seconds / year;  
        return Math.round(age * 100.0) / 100.0;
    }

}
