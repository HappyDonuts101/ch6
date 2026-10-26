public static double gauss(double x, int n) {
  double term = 1.0;
  double sum = 0.0;

    for (int i = 0; i < n; i++) {
        sum = sum + term;
        term = term * (-x * x) / (i + 1);
    }

    return sum;
}
