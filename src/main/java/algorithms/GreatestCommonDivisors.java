package algorithms;

public class GreatestCommonDivisors {

    public int euclideanAlgorithm(int first, int second) {

        if (second == 0) {
            return first;
        }
        int remain = first % second;
        return euclideanAlgorithm(second, remain);
    }
}
