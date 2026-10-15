public class sliding_window {
    int[] sales = {2, 1, 5, 1, 3, 2};
int k = 3;

int sum = 0;
for (int i = 0; i < k; i++) {
    sum += sales[i];            // pehli window
}
int max = sum;

for (int i = k; i < sales.length; i++) {
    sum = sum + sales[i] - sales[i - k];   // naya aaya, purana gaya
    max = Math.max(max, sum);
}
System.out.println(max);   // 9
}
