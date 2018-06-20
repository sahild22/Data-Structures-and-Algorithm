public class CountCommentsFSM {

    public static void main(String[] args) {
        int[][] state = {
                {0, 1, 4},
                {0, 2, 3},
                {2, 2, 2},
                {3, 3, 3},
                {0, 5, 4},
                {0, 0, 0}};

        String[] input = new String[]
                {"abcnkjsbdcibkjsdb",
                "//adadasdadss",
                "aaaaaa//aaaaaa",
                "/*aaaaaaa/",
                "dsed//",
                "aaaa*/",
                "*/gfgjfjg",
                "gfg/*",
                "aaaa//"
                };

        int slcc = 0;
        int bcc = 0;
        boolean inBlock = false;

        for(String s: input){
            int fs = 0;
            for(int i = 0; i < s.length(); i++){
                fs = state[fs][getIndex(s.charAt(i))];
            }
            if(fs == 3){
                inBlock = true;
            }
            if(!inBlock){
                if(fs == 2){
                    slcc++;
                }
            }

            if(fs == 5 && inBlock){
                bcc++;
                inBlock = false;
            }
        }

        System.out.println("SLCC = " + slcc);
        System.out.println("BCC = " + bcc);
    }

    private static int getIndex(char c){
        switch(c){
            case '/':
                return 1;
            case '*':
                return 2;
            default:
                return 0;
        }
    }
}
