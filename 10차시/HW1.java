public class HW1 {
    public static void main(String[] args) {
        // word1: 단어 AnTs를 문자 배열로 선언 및 초기화
        char[] word1 = {'A','n','T','s'};

        // word2: 단어 CasuAl을 문자 배열로 선언 및 초기화
        char[] word2 = {'C','a','s','u','A','l'};

        // 정수형 변수. wordList의 인덱스 값
        int[] arr1 = {1, 2, 3, 0};
        int[] arr2 = {5, 4, 9, 8, 7, 6};

        // 문자 배열 wordList 선언
        char[] wordList = new char[10];

        // 반복문 for을 사용하여 arr1의 값을 wordList의 인덱스로 사용하여 word1의 값을 삽입
        for (int i = 0; i < word1.length; i++)
            wordList[arr1[i]] = word1[i];
        // 반복문 for을 사용하여 arr2의 값을 wordList의 인덱스로 사용하여 word2의 값을 삽입
        for (int j = 0; j < word2.length; j++)
            wordList[arr2[j]] = word2[j];

        // enhance-for: wordList 출력. 결과: __________
        for (char k : wordList)
            System.out.print(k);
    }
}
