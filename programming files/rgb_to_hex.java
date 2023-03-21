public class rgb_to_hex {
    public static void main(String[] args) {
        //intialize rgb values
        int r = 255;
        int g = 127;
        int b = 0;
        //pass values in to rbgToHex
        String hexColor = rgbToHex(r, g, b);
        System.out.println("RGB color (" + r + ", " + g + ", " + b + ") = " + hexColor);
    }

    public static String rgbToHex(int r, int g, int b) {
        //change these to hexadicemal and return the string
        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));
        return String.format("%02X%02X%02X", r, g, b);
    }
}

//Test with RGB color (255, 127, 0) = FF7F00


