public class StringPermutation {
    public static void main(String[] args) {
        new Permutation("abcd");
    }

    public static class Permutation{
        private boolean[] used;
        private StringBuilder out = new StringBuilder();
        private final String in;

        Permutation(String str){
            in = str;
            used = new boolean[str.length()];
            permute();
        }

        public void permute(){
            if(out.length() == in.length()){
                System.out.println(out);
                return;
            }
            for(int i = 0; i < in.length(); i++){
                if(used[i]) continue;
                out.append(in.charAt(i));
                used[i]= true;
                permute();
                used[i] = false;
                out.setLength(out.length() - 1);
            }
        }
    }
}
