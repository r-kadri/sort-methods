public class BubbleSort {

    private int[] numbers;

    public BubbleSort(int[] numbers) {
        this.numbers = numbers;
        System.out.println("------------------------------ Bubble Sort ------------------------------");
        show();
        sort();
        show();
        System.out.println("-------------------------------------------------------------------------");
    }

    private void sort() {
        boolean change = true;
        while(change) {
            change = false;
            for (int i = 0; i < this.numbers.length-1; i++) {
                if(this.numbers[i] > this.numbers[i+1]) {
                    change = true;
                    int tmp = this.numbers[i];
                    this.numbers[i] = this.numbers[i+1];
                    this.numbers[i+1] = tmp;
                }
            }
        }
    }

    private void show() {
        for (int i=0; i<this.numbers.length-1; i++) {
            System.out.print(this.numbers[i] + " ; ");
        }
        System.out.println(this.numbers[this.numbers.length-1]);
    }



}
