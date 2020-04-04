# Quick Sort
## 采用分治思想，将原始数组划分为左右两部分。左边的所有元素比基准值小，右边的所有元素比基准值大。比较完毕之后将基准值放在中间。
1. 将数组第一个元素作为基准值，
2. 从数组最右端开始遍历数组，直到该分块的结尾。如果该元素比基准值大，那么数组下标左移一个，如果该元素值比基准值小，停下来。右指针停留在该位置。
3. 从数组最左边开始遍历数组，直到该分块的结尾。如果该元素比基准值小，那么数组下标右移一个，如果该元素值比基准值大，停下来。左指针停留在该位置。
4. 交换基准值和右指针所指向的值。
5. 检测两个指针是否重合或者左指针大于右指针。若重合则返回右指针（较小的那个指针）
6. 接着对左右两个子数组分别排序，使用递归算法重复以上步骤。直到该区域只剩一个元素。停止。

# Bubble Sort
 ## 连续比较相邻的两个元素，如果后面的比前面的大，交换。从第一个元素开始遍历到结尾

# cloud work

自行搭建微服务框架demo
