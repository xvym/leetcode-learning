import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Xv
 * @Date: 2020/12/30 0:00
 * @Description:
 */
public class Leetcode_22 {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack("", 0, 0, result, n);
        return result;
    }

    public static void backtrack(String currentString, int leftCount, int rightCount, List<String> result, int n) {
        if (leftCount == n && rightCount == n) {
            result.add(currentString);
        } else if (leftCount > rightCount && leftCount <= n) {
            backtrack(currentString + ")", leftCount, rightCount + 1, result, n);
            backtrack(currentString + "(", leftCount + 1, rightCount, result, n);
        } else if (leftCount == rightCount) {
            backtrack(currentString + "(", leftCount + 1, rightCount, result, n);
        }
    }
}
