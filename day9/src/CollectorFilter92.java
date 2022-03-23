import java.util.*;
import java.util.stream.Collectors;
class StudentD{
    int Id;
    String Name;
    int Mark;
    public StudentD(int Id, String Name, int Mark) {
        this.Id = Id;
        this.Name = Name;
        this.Mark = Mark;
    }
}
public class CollectorFilter92 {
    public static void main(String[] args) {
        List<StudentD> StudentList = new ArrayList<StudentD>();
        //Adding Student
        StudentList.add(new StudentD(1,"Siva",459));
        StudentList.add(new StudentD(2,"Sri",178));
        StudentList.add(new StudentD(3,"Mathevan",458));
        StudentList.add(new StudentD(4,"Lama",399));
        StudentList.add(new StudentD(5,"Selva",400));
        List<Integer> MarkList =  StudentList.stream()
                .filter(m ->m.Mark> 450)   // filtering mark
                .map(ma ->ma.Mark)          // fetching mark
                .collect(Collectors.toList());
        System.out.println(MarkList);

    }
}