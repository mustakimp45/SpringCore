package org.example.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Cricket {
    private List<Integer> runs;
    private Set<Integer> wickets;
    private Map<String,String> ground;

    public Cricket(List<Integer> runs, Set<Integer> wickets, Map<String, String> ground) {
        this.runs = runs;
        this.wickets = wickets;
        this.ground = ground;
    }

    public Cricket() {
    }

    @Override
    public String toString() {
        return "Cricket{" +
                "runs=" + runs +
                ", wickets=" + wickets +
                ", ground=" + ground +
                '}';
    }

    public List<Integer> getRuns() {
        return runs;
    }

    public void setRuns(List<Integer> runs) {
        this.runs = runs;
    }

    public Set<Integer> getWickets() {
        return wickets;
    }

    public void setWickets(Set<Integer> wickets) {
        this.wickets = wickets;
    }

    public Map<String, String> getGround() {
        return ground;
    }

    public void setGround(Map<String, String> ground) {
        this.ground = ground;
    }
}
