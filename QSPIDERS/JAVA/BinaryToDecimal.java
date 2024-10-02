class BinaryToDecimal {
  public static void main(String[] args) {
    int number = 1101;
    int rem;
    int decimal = 0;
    int base = 1;
    while (number > 0) {
      rem = number % 10;
      decimal += rem * base;
      base = base * 2;
      number /= 10;
    }
    System.out.println(decimal);
  }
}