/**
 * class Body with 2 constructors
 */
public class Body {
    public double xxPos;
    public double yyPos;
    public double xxVel;
    public double yyVel;
    public double mass;
    public String imgFileName;

    public Body(double xP, double yP, double xV, double yV,
    double m, String img){
        xxPos = xP;
        yyPos = yP;
        xxVel = xV;
        yyVel = yV;
        mass = m;
        imgFileName = img;
    }

    public Body(Body b) {
        xxPos = b.xxPos;
        yyPos = b.yyPos;
        xxVel = b.xxVel;
        yyVel = b.yyVel;
        mass = b.mass;
        imgFileName = b.imgFileName;
    }

    public double calcDistance(Body b) {
        double distance = Math.sqrt(
            Math.pow(this.xxPos - b.xxPos, 2) + 
            Math.pow(this.yyPos - b.yyPos, 2)
            );
        return distance;
    }

    public double calcForceExertedBy(Body b) {
        final double G = 6.67e-11;
        double force;
        force = this.mass * b.mass / Math.pow(this.calcDistance(b), 2)  * G;
        return force;
    }

    public double calcForceExertedByX(Body b) {
        double force = this.calcForceExertedBy(b);
        return force * (b.xxPos - this.xxPos) / this.calcDistance(b);
    }

    public double calcForceExertedByY(Body b) {
        double force = this.calcForceExertedBy(b);
        return force * (b.yyPos - this.yyPos) / this.calcDistance(b);
    }

    public double calcNetForceExertedByX(Body[] bodies) {
        double xNetforce = 0;
        for (Body b : bodies) {
            if (!this.equals(b))
                xNetforce += this.calcForceExertedByX(b);
        }
        return xNetforce;
    }

    public double calcNetForceExertedByY(Body[] bodies) {
        double yNetforce = 0.0;
        for (Body b : bodies) {
            if (!this.equals(b))
                yNetforce += this.calcForceExertedByY(b);
        }
        return yNetforce;
    }

    public double update(double dt, double fX, double fY) {
        
    }



}