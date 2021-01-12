class Darts {
    private double x;
    private double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        int score = 0;
        double distance = distanceFromOrigin();
        
        if(distance <= 1)
            score += 10;
        else if(distance <= 5)
            score += 5;
        else if(distance <= 10)
            score += 1;

        return score;
    }

    double distanceFromOrigin(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

}
