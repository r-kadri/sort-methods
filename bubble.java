class Bubble {
    public static void main(String[] args) {

        int[] mix = AskNumbers.ask();

        boolean change = true;
        while(change) {
            change = false;
            for (int i = 0; i < mix.length-1; i++) {
                if(mix[i] > mix[i+1]) {
                    change = true;
                    int tmp = mix[i];
                    mix[i] = mix[i+1];
                    mix[i+1] = tmp;
                }
            }
        }
        
    }
}