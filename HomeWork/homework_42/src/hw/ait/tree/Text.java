package hw.ait.tree;

import java.util.Objects;

public class Text {
    private String letter;
    private String word;

    public Text(String letter, String word) {
        this.letter = letter;
        this.word = word;
    }

    public String getLetter() {
        word.substring(0);
        return letter;
    }

    public String getString() {

        return word;
    }

    @Override
    public String toString() {
        return letter + ", " + word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(letter, text.letter) && Objects.equals(word, text.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(letter, word);
    }
}
