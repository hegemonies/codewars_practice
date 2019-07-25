public class DnaStrand {
    public static String makeComplement(String dna) {
        return dna.chars()
                .mapToObj(c -> (char)c)
                .map(DnaStrand::change)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    private static char change(char a) {
        switch (a) {
            case 'T':
                a = 'A';
                break;
            case 'A':
                a = 'T';
                break;
            case 'G':
                a = 'C';
                break;
            case 'C':
                a = 'G';
                break;
            default:
                break;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println("ATTGC = " + DnaStrand.makeComplement("ATTGC"));
    }
}
