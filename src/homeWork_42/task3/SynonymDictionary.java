package homeWork_42.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SynonymDictionary {

    HashMap<String, List<String>> dictionary = new HashMap<>();

    public void addSynonym(String word, String synonym) {
        if (synonym.isEmpty() || word.isEmpty() || synonym == null || word == null) {
            return;
        }
        List<String> synonyms = dictionary.get(word);

        if (synonyms == null) {
            synonyms = new ArrayList<>();
            dictionary.put(word, synonyms); // добавили слово в словарь
        }

        if (!synonyms.contains(synonym)) {
            synonyms.add(synonym); // Добавили синоним
        }
    } // addSynonym


    public List<String> getSynonyms(String word){
        return dictionary.getOrDefault(word, new ArrayList<>());

    }// getSynonyms


    // todo

    private boolean removeSynonym(String word, String synonym){
        if (synonym.isEmpty() || word.isEmpty() || synonym == null || word == null) {
          return false;
        }
        List<String> synonyms = dictionary.get(word);


        return true;

    }

    // Todo
    /*
    updateSynonyms(String word, List synonyms) — обновляет список синонимов для слова.
    removeWord(String word) — удаляет слово и все его синонимы из словаря.
     */
}

