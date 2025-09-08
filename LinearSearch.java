public class LinearSearch{
    public static void main(String[] args){

        int nums[] = {2,4,5,7,9};
        int target = 7;

        int result = LinearSearch(nums, target);

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
    }