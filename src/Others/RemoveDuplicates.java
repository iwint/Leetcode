package Others;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Iwin";

        str = str.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()){

            String convertedCharacter = Character.toString(ch);

            if(!result.toString().contains(convertedCharacter)){
               result.append(convertedCharacter);
            }

        }

        System.out.println(result);
    }
}
