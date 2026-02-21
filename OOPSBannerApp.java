/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * This version stores banner lines in a String array and prints them
 * using a loop to improve modularity and readability.
 *
 * @author Developer
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

            "  *****     *****    ******     *****  ",
            " **   **   **   **   **   **   **   ** ",
            " **   **   **   **   **   **   **      ",
            " **   **   **   **   ******     *****  ",
            " **   **   **   **   **             ** ",
            " **   **   **   **   **       **   **  ",
            "  *****     *****    **        *****   "
        };

        // Print banner using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}