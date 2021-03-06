/**
 * Created by charlie on 3/24/16.
 */
public class ClassroomSecondGrade extends Classroom {

    /**
     * Second grade classes get 45 minutes of nap time
     */
    @Override
    void napTime() {
        try {
            System.out.println("Take a nap");
            Thread.sleep(1000 * 60 * 45);
            System.out.println("Time to wake up");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
