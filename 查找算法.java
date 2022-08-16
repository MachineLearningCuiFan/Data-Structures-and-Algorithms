
public class FindArray {
	public static void main(String[] args) {
//		String[] arr = new String[]{"JJ","DD","MM","BB","GG","AA"};
		
		//查找（或搜索）
		
		//1、线性查找：
//		String target = "BB";
//		boolean flag = false;
//		for(int i=0;i<arr.length;i++){
//			if(target.equals(arr[i])){
//				System.out.println("找到了指定的元素，位置为：" + i);
//				flag = true;}
//			if(flag){
//				System.out.println("很遗憾，没有找到的啦！");}
//		}
//		
		//2、二分法查找： 
		// 前提: 所有查找的数组必须有序
		int[] arr = new int[]{-98,-34,2,34,54,66,79,105,210,333};
		int target = 66;
		int star = 0;
		int end = arr.length-1;
		while(star<=end){
			int mid = (star+end)/2;
			if(target==arr[mid]){
				System.out.println("找到了");
			}
			else if (target>arr[mid]) {
				star = mid+1;
			}
			else{
				end = mid-1;
			}
		}
	}
}
