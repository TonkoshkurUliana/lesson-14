import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){

        TreeSet<Student> st = new TreeSet<>(new AgeComparator());
        st.add(new Student("Vasul",32));
        st.add(new Student("Roman",30));
        st.add(new Student("John",12));
        st.add(new Student("Roman",10));
        st.add(new Student("Ura",89));

        System.out.println("Відсортований список");
        for (Student person : st) {
            System.out.println(person);
        }

    }
}