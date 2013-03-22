package fr.miage.temporel;

public class Heure {
    private int heureVar;
    private int minute;
    private int seconde;

    public Heure(int heureV, int minute, int seconde) {
            this.heureVar = heureV;
            this.minute = minute;
            this.seconde = seconde;
    }

    public int getHeureVar() {
        return heureVar;
    }

    public void setHeureVar(int heureVar) {
        this.heureVar = heureVar;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconde() {
        return seconde;
    }

    public void setSeconde(int seconde) {
        this.seconde = seconde;
    }
	
}
