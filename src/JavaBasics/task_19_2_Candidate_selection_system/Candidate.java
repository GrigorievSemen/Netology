package JavaBasics.task_19_2_Candidate_selection_system;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Candidate {
    private final static Set<Candidate> candidates = new TreeSet<>(Comparator.comparing(Candidate::getRelevance).thenComparing(Candidate::getRating).reversed());
    private String fullName;
    private String sex;
    private int age;
    private int relevance;
    private int rating;

    public Candidate(String fullName, String sex, int age, int relevance, int rating) {
        this.fullName = fullName;
        this.sex = sex;
        this.age = age;
        this.relevance = relevance;
        this.rating = rating;
        addToSetCandidates();
    }

    public static Set<Candidate> getCandidates() {
        return candidates;
    }

    public int getRelevance() {
        return relevance;
    }

    public int getRating() {
        return rating;
    }

    private void addToSetCandidates() {
        candidates.add(this);
    }

    @Override
    public String toString() {
        return "Candidate: " +
                "Полное имя - " + fullName +
                ", Пол - " + sex +
                ", Возраст - " + age +
                ", Релевантность - " + relevance +
                ", Оценка - " + rating;
    }
}
