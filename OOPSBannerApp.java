import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8 – OOPS Banner using HashMap
 *
 * @author Developer
 * @version 8.0
 */
public class OOPSBannerApp {

    /**
     * Utility method to build and return the banner map
     * @return Map of character to pattern array
     */
    public static Map<Character, String[]> buildBannerMap() {

        Map<Character, String[]> bannerMap = new HashMap<>();

        bannerMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        bannerMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        bannerMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return bannerMap;
    }

    /**
     * Render banner message
     * @param message word to print
     * @param bannerMap map containing patterns
     */
    public static void renderBanner(String message, Map<Character, String[]> bannerMap) {

        int height = 7; // number of rows

        for (int row = 0; row < height; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);
                String[] pattern = bannerMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("  ");
                }
            }

            System.out.println(lineBuilder);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> bannerMap = buildBannerMap();

        renderBanner("OOPS", bannerMap);
    }
}
