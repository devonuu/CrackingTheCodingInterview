package section2_LinkedList;

import java.util.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * title : 뒤에서 k번째 원소 구하기
 * content : 단방향 연결리스트가 주어졌을 때 뒤에서 k번째 원소를 찾는 알고리즘을 구현하라.
 */
public class Num2_2 {

    /**
     * 여기서 조건은 (1 <= k <= n)이라고 가정 하겠음
     * 단방향 연결리스트는 fifo임
     * 연결 리스트의 size가 n이라고 할 때 뒤에서 k번째 원소면
     * n-k 하면 해당 원소의 index가 나옴
     */
    public Object getKthElement(LinkedList<Object> list, int k){
        return list.get(list.size() - k);
    }

    @Test
    void 뒤에서_k번째_원소_구하기(){
        LinkedList<Object> list = new LinkedList<>();
        list.add(new String("A"));
        list.add(new String("b"));
        list.add(new String("C"));
        list.add(new String("d"));

        Assertions.assertEquals("C", getKthElement(list, 2));
    }
}
