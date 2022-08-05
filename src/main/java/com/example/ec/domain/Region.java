package com.example.ec.domain;



public enum Region {
    Cetnral_coast("Central Coast"), Southern_California("Southern_California"), Northern_California("Northern_California");
    private String label;
    private Region(String label) {this.label = label;}

    public static Region findByLabel(String byLabel){

        for (Region r : Region.values()) {
            if(r.label.equalsIgnoreCase(byLabel))
                return r;
        }
        return null;
    }
    
    
}
