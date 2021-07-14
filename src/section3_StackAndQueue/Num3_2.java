package section3_StackAndQueue;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Created by gonuu on 2021-07-14
 * Email : prayzz12@gmail.com
 * Blog : http://devonuu.tistory.com
 * Github : http://github.com/devonuu
 *
 * title : 스택 min
 * content : 기본적인 push와 pop 기능이 구현된 스택에서 최솟값을 반환하는 min할수를 추가하려고 한다.
 *          어떻게 설계할 수 있겠는가? push, pop, min연산은 모두 O(1) 시간에 동작해야 한다.
 */
public class Num3_2 {
    /**
     * push pop 할때마다 min값을 업데이트 처리하면 되지 않을까?
     *
     * hint 1 : 각각의 스택 노드에서 추가 데이터를 저장하고 있다면 어떨까?
     *          어떤 종류의 데이터를 갖고 있어야 문제를 풀기 쉬워지나?
     * hint 2 : 각각의 노드가 자신을 포함해서 자신보다 아래이 있는 모든 원소의 최소값을 알고 있다고 가정하자.
     */
    static ArrayList<Object> list = new ArrayList<>();
    static int min = Integer.MAX_VALUE;

    public void push(int data){
        min = Math.min(min, data);
        list.add(new Node(data, min));
    }

    public int pop(){
        if (list.size() == 0){
            throw new NoSuchElementException("stack is empty()");
        }
        Node remove = (Node) list.remove(list.size() - 1);
        min = remove.getMin();
        return remove.getData();
    }

    public int min(){
        return min;
    }

    class Node{
        private int data;
        private int min;

        public Node(int data, int min) {
            this.data = data;
            this.min = min;
        }

        public int getData() {
            return data;
        }

        public int getMin() {
            return min;
        }
    }
}
