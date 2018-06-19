package offer1;

public class Test02 {
    public static void main(String[] args) {
        String aa= "aa aa aa";
        String bb = aa.replace(" ","%20");
        System.out.println(bb);

        //StringBuffer的replace是三个参数
        StringBuffer cc= new StringBuffer("aa aa aa");
        StringBuffer dd= cc.replace(2,3,"%20");
        System.out.println(dd);


        /**
         * 运行时间：28ms
         * 占用内存：9460k
         */
        String str3 = cc.toString();
        String ee =str3.replace(" ","%20");

    }
}
