package ru.rambler.sqlitevsrealm.models;

public class Student {
    private long id;
    private String name;
    private long groupId;
    private int averageScore;

    public Student(long id, String name, int averageScore, long groupId) {
        this.averageScore = averageScore;
        this.groupId = groupId;
        this.id = id;
        this.name = name;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public long getGroupId() {
        return groupId;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
