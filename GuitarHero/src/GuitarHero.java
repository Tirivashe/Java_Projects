public class GuitarHero {
    public static void main(String[] args) {
        String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";
        GuitarString []array = new GuitarString[37];
        int numDots = 0;

        for(int i = 0; i < array.length;i++){
            array[i] = new GuitarString(440 * (Math.pow(1.05956, i - 24)));
        }
        while (true){
            if(StdDraw.hasNextKeyTyped()){
                char key = StdDraw.nextKeyTyped();
                if(keyboard.indexOf(key) != -1){
                    array[keyboard.indexOf(key)].pluck();
                }

            }
            double sample = 0.5;

            for(int i = 0; i < array.length; i++){
                double hold = sample;
                sample = hold + array[i].sample();
            }
            for(int i = 0; i < array.length; i++){
                array[i].tic();
            }
            StdAudio.play(sample);
        }

    }
}
