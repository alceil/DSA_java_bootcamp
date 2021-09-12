class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            int li = 0;
            int ri = image[0].length-1;
            while(li<ri)
            {
               int temp = image[i][li];
               image[i][li] =image[i][ri];
                image[i][ri] = temp;   
               li++;
               ri--;
            }
        }
            for(int i = 0;i<image.length;i++)
            {
                for(int j = 0;j<image[i].length;j++)
                {
                    if(image[i][j]==0)
                    {
                        image[i][j]=1;
                    }else{
                        image[i][j]=0;
                    }
                }
            }
        return image;
        }
  
    }
