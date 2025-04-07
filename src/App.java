
public class App {
    public static void main(String[] args) throws Exception { 
        String a = "hola";
        String b = "hola";
        System.out.println(a == b); // true, because both refer to the same string literal in the string pool
        System.out.println(a.equals(b)); // true, because the content of both strings is the same

        // byte b1 = 129; 
        // Byte b2 = Byte.valueOf(b1);

        short s1 = 129; // This is valid, as short can hold values from -32768 to 32767
        Short s2 = Short.valueOf(s1);
        System.out.println("s2: " + s2); // 129

        int i1 = 2147483647; // This is valid, as int can hold values from -2147483648 to 2147483647
        Integer i2 = Integer.valueOf(i1);
        System.out.println("i2: " + i2); // 2147483647

        long l1 = 9223372036854775807L; // This is valid, as long can hold values from -9223372036854775808 to 9223372036854775807
        Long l2 = Long.valueOf(l1);
        System.out.println("l2: " + l2); // 9223372036854775807
        
        float f1 = 3.14f; // This is valid, as float can hold values from approximately -3.40282347E+38 to 3.40282347E+38
        Float f2 = Float.valueOf(f1);
        System.out.println("f2: " + f2); // 3.14
        
        double d1 = 3.14; // This is valid, as double can hold values from approximately -1.7976931348623157E+308 to 1.7976931348623157E+308
        Double d2 = Double.valueOf(d1);
        System.out.println("d2: " + d2); // 3.14
        
        char c1 = 'A'; // This is valid, as char can hold values from 0 to 65535
        Character c2 = Character.valueOf(c1);
        System.out.println("c2: " + c2); // A
        
        boolean bool1 = true; // This is valid, as boolean can hold only two values: true or false
        Boolean bool2 = Boolean.valueOf(bool1);
        System.out.println("bool2: " + bool2); // true
    }
}