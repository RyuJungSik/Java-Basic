package Chapter14.Ex14;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx6 {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("aaa", 3, 300),
                new Student("bbb", 1, 200),
                new Student("ccc", 2, 100),
                new Student("ddd", 2, 150),
                new Student("eee", 1, 200),
                new Student("fff", 3, 290)
        };


        List<String> names = Stream.of(stuArr).map(Student::getName).collect(Collectors.toList());
        System.out.println(names);

        Student[] stuArr2 = Stream.of(stuArr).toArray(Student[]::new);
        for (Student s : stuArr2) {
            System.out.println(s);
        }

        Map<String, Student> stuMap=Stream.of(stuArr).collect(Collectors.toMap(s->s.getName(),p->p));





    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", totalScore=" + totalScore +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}
