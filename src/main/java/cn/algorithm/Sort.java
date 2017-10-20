package cn.algorithm;

import com.alibaba.druid.sql.visitor.functions.Substring;

public class Sort {
	
	public static void main(String[] args) {
//		int[] numbers = new int[]{25,0,36,12,89,789654,51651,51,10};
//		quick_sort(numbers,0,8);
//		for (int i : numbers) {
//			System.out.print(i+" ");
//		}
//		String str = "abcbaedfgedfHijkakjiH";  
//        String result = getPalindrome(str);  
//        System.out.println(result);  
		byte[] bt = new byte[4];  
        bt[0] = 111;  
        bt[1] = 112;  
        bt[2] = 113;  
        bt[3] = 114;  
          
        int i = byteArrayToInt(bt);    
        System.out.println("int--->" + i);  
          
        byte[] b = intToByteArrayl(i);  
        System.out.print("ip--->");  
        for (byte bb : b) {  
           System.out.print(bb + ".");  
        }  
	}
	
	
	
    //BubbleSort
	public static void bubbleSort(int[] numbers)
    {
        int temp = 0;
        int size = numbers.length;
        for(int i = 0 ; i < size-1; i ++)
        {
        for(int j = 0 ;j < size-1-i ; j++)
        {
            if(numbers[j] > numbers[j+1])  //交换两数位置
            {
            temp = numbers[j];
            numbers[j] = numbers[j+1];
            numbers[j+1] = temp;
            }
        }
        }
    }
	
	//选择排序
	public static void selectionSort(int[] num){
		
		for(int i = 0; i < num.length - 1; i++) {// 做第i趟排序
            int k = i;
            for(int j = k + 1; j < num.length; j++){// 选最小的记录
                if(num[j] < num[k]){ 
                    k = j; //记下目前找到的最小值所在的位置
                }
            }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
            if(i != k){  //交换a[i]和a[k]
                int temp = num[i];
                num[i] = num[k];
                num[k] = temp;
            }    
        }
	}
	
	//快速排序
	static void quick_sort(int s[], int l, int r)
	{
	    if (l < r)
	    {
	        int i = l, j = r, x = s[l];
	        while (i < j)
	        {
	            while(i < j && s[j] >= x) // 从右向左找第一个小于x的数
	               j--; 
	            if(i < j)
	                s[i] = s[j];
	            while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数
	               i++; 
	            if(i < j)
	                s[j] = s[i];
	        }
	        s[i] = x;
	        quick_sort(s, l, i - 1); // 递归调用
	        quick_sort(s, i + 1, r);
	    }

	}
	
	//查找最大回文串
	/** 
     * 判断一个字符数组从某一个或两个点开始向两端拓展，是否是回文串，是则返回该子串 
     *  
     * @param ch 
     * @param i 
     * @param j 
     * @return 
     */  
    public static String getEvery(char[] ch, int i, int j) {  
        int length = ch.length;  
        while (i >= 0 && j <= length - 1 && ch[i] == ch[j]) {  
            i--;  
            j++;  
        }  
        return String.valueOf(ch).substring(i + 1, j);// 不可以用ch.toString()，这个方法返回的不是字符数组对应的字符串，而是一个内存地址，  
        // 且此处无论是前面边界退出还是两端值不等退出都应该将ij的值回退，所以sub这两端。  
    }  
  
    /** 
     * 遍历原数组，提取出最长的回文子串 
     *  
     * @param s 
     * @return 
     */  
    public static String getPalindrome(String s) {  
        char[] ch = s.toCharArray();  
        String str = " ";  
        String re = "";  
        for (int i = 0; i < ch.length; i++) {  
            re = getEvery(ch, i, i); // 当以一个字符为中轴也就是回文串为奇数时  
            if (re.length() > str.length()) {  
                str = re;  
            }  
            re = getEvery(ch, i, i + 1); // 当以当前和他后一个字符为轴心，也就是回文串为偶数时  
            if (re.length() > str.length()) {  
                str = re;  
            }  
        }  
        return str;  
    }
    
    /** 
     * * 二分查找算法 * * 
     *  
     * @param srcArray 
     *            有序数组 * 
     * @param des 
     *            查找元素 * 
     * @return des的数组下标，没找到返回-1 
     */   
   public static int binarySearch(int[] srcArray, int des){   
        int low = 0;   
        int high = srcArray.length-1;   
        while(low <= high) {   
            int middle = (low + high)/2;   
            if(des == srcArray[middle]) {   
                return middle;   
            }else if(des <srcArray[middle]) {   
                high = middle - 1;   
            }else {   
                low = middle + 1;   
            }  
        }  
        return -1;  
   }  
    
   //int转ip(字节数组)  
   public static byte[] intToByteArrayl(int i) {     
       byte[] result = new byte[4];     
       result[0] = (byte)((i >> 24) & 0xFF);  
       result[1] = (byte)((i >> 16) & 0xFF);  
       result[2] = (byte)((i >> 8) & 0xFF);   
       result[3] = (byte)(i & 0xFF);  
       return result;  
   }  
     
   //ip(字节数组)转int  
   public static int byteArrayToInt(byte[] b) {  
       int value = 0;  
       for (int i = 0; i < 4; i++) {  
          value |= b[i];  
          if ( i < 3 ) {  
            value = value << 8;  
          }  
       }  
       return value;  
   }  
   
   
    
    
    
}


       



	
	
	

	
	
	
	
	
	
	
	
	
	
	
	

