public class Main {

    public static void main (String[] args){

        StringBuffer stringBuffer = new StringBuffer();
        int length = args.length;
        long sum = 0;
        long multi = 1;

        for (int i = 0; i < length; i++) {

            int var = Integer.parseInt(args[i]);
            sum += var;
            multi *= var;
        }

        System.out.println(sum);
        System.out.println(multi);
    }
}
