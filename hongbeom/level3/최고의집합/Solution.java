package level3.최고의집합;
import java.util.Arrays;

public class Solution {

  public int[] solution(int n, int s) {
    int[] answer;

    if (n > s) {
      return new int[]{-1};
    }
    else {
      answer = new int[n];
      int i = 0;
      while (s > 0) {
        answer[i % n]++;
        i++;
        s--;
      }
    }

    Arrays.sort(answer);
    return answer;
  }

}
