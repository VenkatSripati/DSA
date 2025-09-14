public class LinearSearch{
    public static void main(String[] args){

        int nums[] = {2,4,5,7,9};
        int target = 9;

        int result = BinarySearch(nums, target);

        if(result !=-1){
            System.out.println("The target was found :"+ result);
        }else{
            System.out.println("The target was not found");
        }
    }
        public static int LinearSearch(int[] nums, int target){
            for(int i=0; i<nums.length; i++){
                if(nums[i] == target){
                    return i;
                }
                
            }
            return -1;
        }

        public static int BinarySearch (int[] nums, int target){
            int left = 0;
            int right = nums.length-1;

            while (left <= right) {
                int mid = (left + right)/2;

                if(nums[mid] == target){
                    return mid;
                }
                else if(nums[mid]<target){
                    return left = mid+1;
                }
                else{
                    return right = mid-1;
                }
                
            }
            return -1;
        }
    }
    