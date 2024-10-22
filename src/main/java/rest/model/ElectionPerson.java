package rest.model;

public class ElectionPerson {
    private int listennummer;
    private String name;
    private int stimmenanzahl;

    public ElectionPerson(int listennummer, String name, int stimmenanzahl) {
        this.listennummer = listennummer;
        this.name = name;
        this.stimmenanzahl = stimmenanzahl;
    }

    public int getListennummer() {
        return listennummer;
    }

    public void setListennummer(int listennummer) {
        this.listennummer = listennummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStimmenanzahl() {
        return stimmenanzahl;
    }

    public void setStimmenanzahl(int stimmenanzahl) {
        this.stimmenanzahl = stimmenanzahl;
    }
}
