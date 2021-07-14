package section2_LinkedList;

import java.util.LinkedList;
import org.junit.jupiter.api.Test;

/**
 * title : 분할
 * content : 값 x가 주어졌을 때 x보다 작은 노드들을 x보다 크거나 같은 노드들보다 앞에 오도록 하는 코드를 작성하라.
 *          만약 x가 리스트에 있다면 x는 그보다 작은 원소들보다 뒤에 나오기만 하면 된다. 즉 원소 x는
 *          '오른쪽 그룹' 어딘가에만 존재하면 된다. 왼쪽과 오른쪽 그룹 사이에 있을 필요는 없다.
 */
public class Num2_4 {

    /**
     * 퀵정렬을 한다고 생각하면 될듯함.
     * start랑 end를 움직이면서 리스트 검사 하면 된다.
     * @param list
     * @param x
     */
    public void division(LinkedList<Integer> list, int x){
        int start = 0;
        int end = list.size() - 1;

        while (start <= end){
            while (list.get(start) < x){
                start++;
            }
            while (list.get(end) >= x){
                end--;
            }
            int tmp = list.get(end);
            list.set(end, list.get(start));
            list.set(start, tmp);
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    @Test
    void 분할(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(3);
        division(list, 5);
    }
}
