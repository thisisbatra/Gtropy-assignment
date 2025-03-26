public class Main {
    public static void main(String[] args) {
        Dictionary data=new Dictionary();
        // Passing File path in String will be root level to the project!
        System.out.println(data.dictionaryLoader("datalist.txt"));
        System.out.println(data.searchWord(""));
        System.out.println(data.searchWithSuggestion("abases"));
    }
}