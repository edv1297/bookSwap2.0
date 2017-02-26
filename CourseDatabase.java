import structure5.*;

public class CourseDatabase {

    protected Vector <Association <Course, Vector>> courseDatabase;

  /*
   *  The constructor for the Course Database, a vector of associations mapping
   *  Courses to book vectors
   */
    public CourseDatabase(Course[] courseList) {
        courseDatabase = new Vector <Association <Course, Vector>> ();

        // Load the courses into the database
        for (int i = 0; i < courseList.length; i++) {
          courseDatabase.add(new Association <Course, Vector>
            (courseList[i], new Vector <Book>()));
      }
    }

    public int courseToIndex(Course course) {
        for (int i = 0; i < courseDatabase.size(); i++) {
            Association <Course, Vector> assoc = courseDatabase.get(i);
            if (assoc.getKey().equals(course)) {
                return courseDatabase.indexOf(assoc);
            }
        }

        return -1;
    }

/*
    public void addBook(Book b) {
        Course course = b.getCourse();
        Association <Course, Vector> assoc = courseDatabase.get(courseToIndex(course));
        assoc.getValue.add(b);
    }
*/

    public String toString() {
        String output = "COURSES";

        for (int i = 0; i < courseDatabase.size(); i++) {
            output += "\n" + "{" + courseDatabase.get(i).getValue().toString() + "}";
        }

        return output;
    }
}
