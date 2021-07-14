package section2_LinkedList;

import java.util.LinkedList;
import org.junit.jupiter.api.Test;

/**
 * title : 중간 노드 삭제
 * content : 단방향 연결리스트가 주어졌을 때 중간
 *          (정확히 가운데 노드일 필요는 없고 처음과 끝 노드만 아니면 된다)에 있는
 *          노드 하나를 삭제하는 알고리즘을 구현하라.
 *          단, 삭제할 노드에만 접근 할 수 있다.
 */
public class Num2_3 {

    /**
     * 처음과 끝 노드가 아니기 때문에
     * list.size() > 2 라는 조건이라고 가정한다.
     * list.size()를 2로 나눈 값이 중간 값이다.
     * @param list
     */
    public void removeMidElement(LinkedList<Object> list){
        int mid = list.size() / 2;
        list.remove(mid);
        for (Object o : list) {
            System.out.println(o.toString());
        }
    }

    @Test
    void 중간_노드_삭제(){
        LinkedList<Object> list = new LinkedList<>();
        list.add("e");
        list.add("d");
        list.add("c");
        list.add("b");
        list.add("a");
        removeMidElement(list);
    }
}
