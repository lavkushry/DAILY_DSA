package Array;

 class Demo{
     public void add(int a, int b)
     {
         System.out.println(a+b);
     }
     private void add(int a, float b)
     {
         System.out.println(a+b);
     }
    public static void main(String[] args) {
       Demo obj= new Demo();
       obj.add(10,20f);

    }
}