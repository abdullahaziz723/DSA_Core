public class Setbuilder {
    public static void main(String[] args) {

        String str = "abdullah";
        String str1 = "xbdullah";

        StringBuilder sb = new StringBuilder("tony");
        // System.out.println(sb.reverse());

        /// cha atAtIndex
        System.out.println(sb.charAt(2));
        // set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);
        sb.insert(2, 'n');
        System.out.println(sb);

        // delete char at index 2
        sb.delete(2,3);
        System.out.println(sb);

        sb.append("abcd");
        System.out.println(sb);
    }

}
