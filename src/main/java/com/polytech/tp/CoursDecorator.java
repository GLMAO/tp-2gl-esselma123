package com.polytech.tp;

public abstract class CoursDecorator implements ICours {
    protected final ICours coursDecore;  // NOM EXACTEMENT CELUI-CI

    public CoursDecorator(ICours coursDecore) {
        this.coursDecore = coursDecore;
    }
    // TODO: Forcer l'implémentation des méthodes de ICours

    @Override public String getDescription() { return coursDecore.getDescription(); }
    @Override public double getDuree() { return coursDecore.getDuree(); }
}