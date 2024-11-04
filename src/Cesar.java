import java.util.concurrent.Callable;

public class Cesar {

    public static String encrypt(String plaintext, int shift) {
        StringBuilder ciphertext = new StringBuilder();

        for (char c : plaintext.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char encrypted = (char) (((c - base + shift) % 26) + base);
                ciphertext.append(encrypted);
            } else {
                ciphertext.append(c);
            }
        }

        return ciphertext.toString();
    }

    public static String decrypt(String ciphertext, int shift) {
        return encrypt(ciphertext, 26 - shift);
    }

    public String getString() {
        String string = "Lorem ipsum odor amet, consectetuer adipiscing elit. Conubia etiam tempor scelerisque rhoncus faucibus. Sagittis curabitur duis mauris proin proin hendrerit. Ornare quisque aliquet nisl consequat torquent ad mauris primis est. Ex volutpat placerat congue lacinia donec massa. Eu vivamus montes platea et blandit venenatis maximus vehicula tempor. Penatibus class blandit elementum feugiat porttitor dolor. Condimentum cubilia semper suscipit velit luctus ornare rutrum. Neque libero turpis iaculis maximus est quam sagittis ullamcorper. Mauris semper ut at elit justo dapibus diam ultricies turpis.\n" +
                "\n" +
                "Fusce himenaeos inceptos ullamcorper elementum vel porttitor quisque netus. Egestas duis vehicula consequat ac eros imperdiet. Hac eget in volutpat, facilisis luctus feugiat. Lobortis maecenas vivamus cubilia senectus placerat gravida dui. Vitae taciti nascetur fusce nisi phasellus convallis tortor tellus felis. Mauris maecenas vivamus consectetur; phasellus est vivamus per conubia! Tempus aenean ante magna aliquam ridiculus magna dapibus tempor. Venenatis consequat nec blandit mollis, accumsan fringilla urna habitant.\n" +
                "\n" +
                "Curae molestie litora aenean ipsum nunc ut posuere. Congue consectetur dis mi conubia erat. Sed quisque lorem massa fermentum gravida eget. Lectus luctus lorem inceptos id sollicitudin eleifend. Pretium maximus molestie augue phasellus himenaeos leo porta magna. Id ornare velit elit fringilla congue eu hendrerit blandit tincidunt? Metus dui enim dictumst scelerisque sed purus integer lectus consectetur. Dis consectetur vulputate in volutpat dictumst curae taciti.\n" +
                "\n" +
                "Ullamcorper praesent a fusce netus fermentum magna et. Aquam mauris justo tempus taciti viverra montes litora. Pharetra vel tellus duis tempor, conubia cras finibus sit. Urna cubilia ullamcorper sem neque facilisis arcu porttitor praesent. Neque arcu metus sociosqu aliquet sociosqu. Nisl libero volutpat ad felis nisi neque habitasse.\n" +
                "\n" +
                "Pulvinar fermentum fames praesent egestas consectetur pellentesque neque ligula. Interdum in lacinia torquent leo imperdiet. Senectus suspendisse magna dolor primis nullam eleifend suscipit. Imperdiet turpis mauris vehicula proin nisl fermentum inceptos netus. Lorem habitasse potenti torquent tellus proin mollis. In id nisl fringilla ante est libero elit.";
        String encryptedString = encrypt(string, 5);

				return encryptedString;
				// System.out.println(encryptedString);
    }
}

