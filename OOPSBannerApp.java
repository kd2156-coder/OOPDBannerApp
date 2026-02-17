/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * This class improves UC2 by using String.join() to construct
 * each line of the banner more efficiently and clearly.
 *
 * @author Developer
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Letter O
        String[] O = {
            "  *****  ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            "  *****  "
        };

        // Letter P
        String[] P = {
            " ******  ",
            " **   ** ",
            " **   ** ",
            " ******  ",
            " **      ",
            " **      ",
            " **      "
        };

        // Letter S
        String[] S = {
            "  *****  ",
            " **   ** ",
            " **      ",
            "  *****  ",
            "      ** ",
            " **   ** ",
            "  *****  "
        };

        // Print 7 lines using String.join()
        for (int i = 0; i < 7; i++) {
            System.out.println(String.join(" ", O[i], O[i], P[i], S[i]));
        }
    }
}
