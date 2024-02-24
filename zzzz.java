

class Marks {
    public int id;
    public float javaMarks;
    public float cMarks;
    public float cppMarks;

    public void setMarks(int i, float j, float c, float cp) {
        id = i;
        javaMarks = j;
        cMarks = c;
        cppMarks = cp;
    }

    public void displayMarks() {
        System.out.println("Id: " + id);
        System.out.println("Java marks: " + javaMarks);
        System.out.println("C marks: " + cMarks);
        System.out.println("Cpp marks: " + cppMarks);
    }
}

class Result extends Marks {
    public float total;
    public float avg;

    public void compute() {
        total = javaMarks + cMarks + cppMarks;
        avg = (float) (total / 3);
    }

    public void showResult() {
        super.displayMarks();
        System.out.println("Total: " + total);
        System.out.println("Avg: " + avg);
    }
}


  
public class zzzz {
    public static void main(String[] str) {
      
        Marks m = new Marks();

        int i =102;
        float j = 103;
        float c = 103;
        float cp = 103;

        m.setMarks(i, j, c, cp);

        Result r = new Result();
        // r.setMarks(i, j, c, cp); // You need to set marks for Result object as well

        r.compute();
        r.showResult();
        
    }
}
