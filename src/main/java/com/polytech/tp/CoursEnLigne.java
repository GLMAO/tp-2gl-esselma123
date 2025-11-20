package com.polytech.tp;


public class CoursEnLigne extends CoursDecorator {

    private final String url;

    public CoursEnLigne(ICours cours, String url) {
        //TODO: Implémenter le reste ...
        super(cours);
        this.url = url;
    }

    public CoursEnLigne(ICours cours) {
        this(cours, null);
    }


    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        String base = coursDecore.getDescription();
        return url != null && !url.isBlank()
                ? base + " (En ligne - " + url + ")"
                : base + " (En ligne)";
        }

        @Override
        public double getDuree() {
            return coursDecore.getDuree();
        }
}
