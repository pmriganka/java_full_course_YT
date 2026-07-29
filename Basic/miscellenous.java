class Miscellenous {
    public static void main(String[] args) {
        byte b = 127;
        int a = 1000;
        float f = 5.6f;
        int i = (int) f;

        a = b; // implicit conversion , happening automatically
        System.out.println(a);

        b = (byte) a; // explicit conversion , happening manually
        System.out.println(b);
        
        System.out.println(i);
    }
}
