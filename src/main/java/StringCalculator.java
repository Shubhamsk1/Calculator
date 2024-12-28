public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        String[] splitNumbers = numbers.split("[,\n" +
                "]");
        int sum = 0;
        for (String num : splitNumbers) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
