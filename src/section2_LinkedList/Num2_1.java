package section2_LinkedList;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import org.junit.jupiter.api.Test;

/**
 * title : 중복 없애기
 * content : 정렬되어 있지 않은 연결리스트가 주어졌을 때 이 리스트에서 중복되는 원소를 제거하는 코드를 작성하라.
 * additional : 임시 버퍼를 사용할 수 없다면 어떻게 풀 수 있을까?
 */
public class Num2_1 {

    /**
     * List에 원소로 들어올 수 있는 데이터는 동일성 검사가 가능한 primitive type이라고 가정한다.
     * short, int, long, char, float, double
     * set에 계수 정렬 하는것처럼 순차적으로 탐색하며 있는 경우 리스트에서 제거하고 없는경우 set에 추가한다.
     * @param list
     */
    public void removeDuplicateElements(LinkedList<Integer> list){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (set.contains(list.get(i))) {
                list.remove(i);
                i--;
            }else{
                set.add(list.get(i));
            }
        }
        for (Object o : list) {
            System.out.println(o);
        }
    }

    /**
     * 정렬을 해서 i-1과 i가 일치하는경우 해당 인덱스를 계속 지우면서 진행한다.
     * @param list
     */
    public void removeDuplicateElements_noneBuffer(LinkedList<Integer> list){
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == list.get(i - 1)){
                list.remove(i);
                i--;
            }
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    @Test
    void 중복_없애기(){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            list.add(1);
        }
        LinkedList<Integer> list2 = (LinkedList<Integer>) list.clone();
        removeDuplicateElements(list);
        System.out.println("======");
        removeDuplicateElements_noneBuffer(list2);
    }
}
