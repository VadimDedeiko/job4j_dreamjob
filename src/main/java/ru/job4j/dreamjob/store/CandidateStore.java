package ru.job4j.dreamjob.store;

import ru.job4j.dreamjob.model.Candidate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CandidateStore {
    private static final CandidateStore INST = new CandidateStore();

    private final Map<Integer, Candidate> candidates = new ConcurrentHashMap<>();


    private CandidateStore() {
        candidates.put(1, new Candidate(1, "Александр", "Кандидат Junior java developer", LocalDateTime.now()));
        candidates.put(2, new Candidate(2, "Виталий", "Кандидат Middle java developer", LocalDateTime.now()));
        candidates.put(3, new Candidate(3, "Екатерина", "Кандидат Senior java developer", LocalDateTime.now()));
    }

    public static CandidateStore instOf() {
        return INST;
    }

    public Collection<Candidate> findAll() {
        return candidates.values();
    }

    public boolean add(Candidate candidate) {
        return candidates.put(candidate.getId(), candidate) == null;
    }

    public Candidate findById(int id) {
        return candidates.get(id);
    }

    public Candidate update(Candidate candidate) {
        return candidates.replace(candidate.getId(), candidate);
    }
}