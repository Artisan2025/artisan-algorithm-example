package artisan.algorithm.binarysearch;


/**
 * @author puxianfeng
 * @description 二分查找
 * @date 2021/12/6 6:19 下午
 */
class BinarySearchTest {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 5, 6};

        int index = BinarySearch.search(nums, 4);
        System.out.println(index==3);
    }
}