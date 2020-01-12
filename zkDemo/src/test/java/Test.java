import java.util.*;

/**
 * @Description
 * @Date 2019/12/26 14:54
 * @Authod ZG
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        int j = 100;
        int[] rs = new int[]{6,17,22,25,31,32,13};//3, 4, 7, 15, 20, 24, 12
        System.out.println("最终次数："+result(rs, 0));


    }

    public static int result(int[] rs, int count) {
        Long bTime = System.currentTimeMillis();
        boolean flag = true;
        while(flag){
            Set<Integer> set = new HashSet();
            while (set.toArray().length != 6) {
                while (set.size() != 6) {
                    set.add((int) (Math.random() * 32) + 1);
                }
            }
            Set<Integer> sortSet = new TreeSet<Integer>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            });
            sortSet.addAll(set);

           List arrayList = new ArrayList();
            for (Integer i : sortSet) {
                arrayList.add(i);
            }

            boolean b = true;
            arrayList.add((int) (Math.random() * 15) + 1);
            for (int i = 0; i < arrayList.size(); i++) {
                if (rs[i] != (int) arrayList.get(i)) {
                    b = false;
                }
            }
            if(b){
                flag = false;
                System.out.println("最终次数："+count + "集合为："+ method1(arrayList));
            }else{
                count++;
                flag = true;
                System.out.println("次数："+count + "集合为："+ method1(arrayList));
            }
        }
        Long eTime = System.currentTimeMillis();
        System.out.println("用时："+(eTime-bTime)/1000);
        return count;
    }

    public static String method1(List ls){
        String result = "";
        for (int i = 0; i < ls.size(); i++) {
            result += ls.get(i);
            if(i != ls.size()-1){
                result += ",";
            }
        }
        return result;
    }
}
