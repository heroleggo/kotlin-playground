public class Lecture2Java {
    // not safe (str이 null이면 안됨)
    public boolean startsWithA(String str) {
        return str.startsWith("A");
    }

    // safe method
    public Boolean startsWithASafe(String str) {
        // method 1
        if (str == null) {
            throw new IllegalArgumentException("Null is not allowed");
        }
        // method 2
        if (str == null) {
            return false;
        }

        // method 3
        if (str == null) {
            // casting return type to Boolean
            return null;
        }

        return str.startsWith("A");
    }
}
