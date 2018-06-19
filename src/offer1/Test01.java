package offer1;


public class Test01 {

    public static void main(String[] args) {

        int[][] array = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = 1;
            }
        }

        Test01 s = new Test01();
        boolean a = s.Find2(1, array);
        System.out.println(a);

        int q = (1+6)/2;//int 直接舍去尾数
        int p = (-1-6)/2;
        System.out.println(p);

    }

    /**
     * 普通全部遍历（m*n）
     * 运行时间：219ms
     * 占用内存：17448k
     */
    public static boolean Find(int target, int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }

        }
        return false;
    }

    /**
     * 折半查找遍历逐行遍历（nlogn）
     * 运行时间：219ms
     * 占用内存：17448k
     */
    public static boolean Find2(int target, int[][] array) {

            for(int i=0;i<array.length;i++){
                int low=0;
                int high=array[i].length-1;
                while(low<=high){
                    int mid=(low+high)/2;
                    if(target>array[i][mid])
                        low=mid+1;
                    else if(target<array[i][mid])
                        high=mid-1;
                    else
                        return true;
                }
            }
            return false;
    }

    /**
     * 实例三（m+n）（这个是有问题的）例：
     * 1
     * 2
     * 3  6
     * 5  10 11 12 13           当查找6时查找不到所以错误
     * 运行时间：202ms
     * 占用内存：16464k
     */

    public static boolean Find3(int target, int[][] array) {
        Boolean found = false;
        if (array.length == 0)
            return found;
        int rows, columns, row, column;
        rows = array.length;
        columns = array[0].length;
        row = 0;
        column = columns - 1;
        while (row < rows && column >= 0) {
            if (array[row][column] == target) {
                found = true;
                break;
            } else if (array[row][column] > target)
                --column;
            else
                ++row;
        }
        return found;
    }
}
