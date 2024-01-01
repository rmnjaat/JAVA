import java.util.ArrayList;

public class ContainerWithMaxwaater {

    

    public static void main(String[] args) {

        // ArrayList<Integer> height = new ArrayList<>();

        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);

        // int lp = 0;
        // int rp = height.size() - 1;

        // int area = 0;
        // while (lp < rp) {

        // int lph = height.get(lp);

        // int rph = height.get(rp);

        // int hei = Math.min(lph, rph);

        // int wid = rp - lp;

        // int area1 = hei * wid;

        // area = Math.max(area, area1);

        // if (lph < rph) {
        // lp++;
        // } else {
        // rp--;
        // }
        // }

        // System.out.println(area);

        // }
        // }

        ArrayList<Integer> h = new ArrayList<>();

        h.add(1);
        h.add(100);
        h.add(200);
        h.add(1);
        h.add(100);

        int n = mostFrequent(h, 1);

        System.out.println(n);

    }

}
