package org.example;

public class ExceptionSecond{

    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 3, 4, 5};

        try {
            for (int i = 0; i < arr.length+1; i++) {
                System.out.print(arr[i]);
            }
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("error thrown" + a);
        }

        String value = "naveen";
        int n=value.length();
        try{
            for(int i=0;i<=n;i++){
                System.out.print(value.charAt(i));
            }
        }catch(StringIndexOutOfBoundsException b){
            System.out.println("show error " + b);
        }

    }
}
