package section3_StackAndQueue;

/**
 * title : 한 개로 세 개
 * content : 배열 한 개로 스택 세 개를 어떻게 구현할지 설명하라.
 */
public class Num3_1 {
    /**
     * 배열의 데이터 타입은 기본 자료형(primitive type)이라고 가정한다.
     * 시작점을 3개를 만든다.
     * pointer를 3씩 증가하게끔 하면 해결되지 않을까.
     */
    static int firstIndex = 0;
    static int secondIndex = 1;
    static int thirdIndex = 2;

    private static final int WEIGHT = 3;
    static int[] arr = new int[10000];


    /*--------------스택 하나-----------------*/
    public void pushFirst(int data){
        arr[firstIndex] = data;
        firstIndex += WEIGHT;
    }

    public int peekFirst(){
        return arr[firstIndex];
    }

    public int popFirst(){
        int answer = arr[firstIndex];
        arr[firstIndex] = 0;
        firstIndex -= WEIGHT;
        return answer;
    }

    /*------------------스택 둘----------------*/
    public void pushSecond(int data){
        arr[secondIndex] = data;
        secondIndex += WEIGHT;
    }

    public int peekSecond(){
        return arr[secondIndex];
    }

    public int popSecond(){
        int answer = arr[secondIndex];
        arr[secondIndex] = 0;
        secondIndex -= WEIGHT;
        return answer;
    }

    /*------------------스택 셋----------------*/

    public void pushThird(int data){
        arr[thirdIndex] = data;
        thirdIndex += WEIGHT;
    }

    public int peekThird(){
        return arr[thirdIndex];
    }

    public int popThird(){
        int answer = arr[thirdIndex];
        arr[thirdIndex] = 0;
        thirdIndex -= WEIGHT;
        return answer;
    }
}
