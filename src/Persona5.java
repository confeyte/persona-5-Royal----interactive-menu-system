import java.util.Scanner;

public class Persona5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            showMainMenu();
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    confirmAndContinue("GAME DEVELOPMENT", textDevelopment());
                    break;
                case "2":
                    confirmAndContinue("GAME STORY", textStory());
                    break;
                case "3":
                    confirmAndContinue("CHARACTERS", textCharacters());
                    break;
                case "4":
                    confirmAndContinue("EXTRAS", textExtras());
                    break;
                case "0":
                    System.out.println("\nSee you...");
                    running = false;
                    break;
                default:
                    System.out.println("\nInvalid option. Please enter a number from 1 to 4.\n");
            }
        }

        scanner.close();
    }

    static void showMainMenu() {
        System.out.println("============================================");
        System.out.println("            ★ PERSONA 5 ROYAL ★    ");
        System.out.println("============================================");
        System.out.println("  What do you want to know about?");
        System.out.println();
        System.out.println("  [1] Game Development");
        System.out.println("  [2] Game Story");
        System.out.println("  [3] Characters");
        System.out.println("  [4] Extras (items, music & more)");
        System.out.println("  [0] Exit");
        System.out.println("============================================");
        System.out.print("  Your choice: ");
    }

    static void confirmAndContinue(String title, String content) {
        System.out.println("\n--------------------------------------------");
        System.out.println("  You chose: " + title);
        System.out.println("--------------------------------------------");
        System.out.println("  [continue]   Read the content");
        System.out.println("    [back]     Return to main menu");
        System.out.print("  Your choice: ");

        String answer = scanner.nextLine().trim().toLowerCase();

        if (answer.equals("continue")) {
            showContent(title, content);
        } else {
            System.out.println("\nReturning to main menu...\n");
        }
    }

    static void showContent(String title, String content) {
        System.out.println("\n============================================");
        System.out.println("  " + title);
        System.out.println("============================================");
        System.out.println(content);
        System.out.println("--------------------------------------------");
        System.out.println("  [Z] Return to main menu");
        System.out.println("--------------------------------------------");
        System.out.print("  Your choice: ");

        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("z")) {
                System.out.println("\nReturning to main menu...\n");
                break;
            } else {
                System.out.print("  Press [Z] to go back: ");
            }
        }
    }

    static String textDevelopment() {
        return """
                Persona 5 began development at Atlus around 2011, shortly after
                the release of Persona 4 Golden. The project was led by director
                Katsura Hashino, who also directed P3 and P4.
                
                The central theme from the start was "rebellion" — the idea of
                young people rising up against a corrupt and oppressive society.
                The visual identity was crafted by Shigenori Soejima, built around
                black, red and white, inspired by heist films and Japanese
                underground culture.
                
                The original Persona 5 launched in Japan in September 2016 and
                in the West in April 2017. Persona 5 Royal, the expanded version,
                released in Japan in October 2019 and worldwide in March 2020.
                
                Royal added a brand new third semester, the character Kasumi
                Yoshizawa, therapist Takuto Maruki as a new antagonist, and
                numerous gameplay and story improvements.
                """;
    }

    static String textStory() {
        return """
                The protagonist (nicknamed Joker) is a high school student
                transferred to Tokyo after being falsely accused of assault.
                He is placed on probation and moves into the attic of Cafe
                Leblanc in Yongen-Jaya.
                
                Upon arriving at his new school, Shujin Academy, he discovers
                the Metaverse — an alternate dimension that reflects the
                distorted psyche of corrupt individuals. Together with his
                friends, he forms the Phantom Thieves of Hearts, a group that
                steals the "treasures" of villains to force them to confess
                their crimes.
                
                Throughout the game, the Phantom Thieves face abusive teachers,
                yakuza, corrupt politicians and corporate figures.
                
                In Royal, a third semester reveals that therapist Maruki has
                created an alternate reality built on people's wishes, forcing
                Joker and his friends to question what is real and what is
                merely comfortable illusion.
                """;
    }

    static String textCharacters() {
        return """
                JOKER (Ren Amamiya) — The silent protagonist. His initial
                Persona is Arsene, based on the fictional thief Arsene Lupin.
                
                RYUJI SAKAMOTO — The loyal and hot-headed friend. Uses the
                Persona Captain Kidd. Was a track runner before having his
                leg broken by coach Kamoshida.
                
                ANN TAKAMAKI — Determined and empathetic. Her Persona is
                Carmen. She suffered harassment from Kamoshida and joined
                the Phantom Thieves to protect her best friend Shiho.
                
                YUSUKE KITAGAWA — Artistic and eccentric. Uses the Persona
                Goemon. Foster son of painter Madarame, who stole his works.
                
                MAKOTO NIIJIMA — Intelligent and responsible. Persona: Johanna.
                Student council vice president, initially opposed to the
                Phantom Thieves.
                
                FUTABA SAKURA — Tech genius and hacker. Persona: Necronomicon.
                Sojiro's adopted daughter and the group's navigator.
                
                HARU OKUMURA — Gentle and courageous heiress. Persona: Milady.
                Daughter of CEO Okumura, who treated her as a chess piece.
                
                MORGANA — The mysterious cat who guides the group. Persona: Zorro.
                Believes he is human and tries to uncover his true origins.
                
                [ROYAL] KASUMI YOSHIZAWA — Elite gymnast. Persona: Cendrillon.
                Exclusive new member in Royal, with a story full of twists
                during the third semester.
                """;
    }

    static String textExtras() {
        return """
                ★ ITEMS:
                  - Infiltration Tools: crafted by Joker for use in Palaces
                    (smokebombs, lockpicks, etc.)
                  - SP Adhesive 3: one of the most valuable items, restores
                    SP automatically each turn in battle.
                  - Chocolate Truffles: ideal gift for strengthening female
                    Confidants.
                
                ★ PERSONAS:
                  - Arsene: Joker's starting Persona, based on Arsene Lupin.
                    Weak to Gun and Psy, but evolves into more powerful forms.
                  - Satanael: Joker's ultimate Persona, obtained at the game's
                    climax. Absorbs bullets and carries the power of all
                    Phantom Thieves.
                  - Izanagi-no-Okami Picaro: Royal exclusive version, extremely
                    powerful and visually stunning.
                  - Yoshitsune: considered one of the best battle Personas by
                    the community — Hassou Tobi deals massive damage.
                  - Lucifer: Persona of the Star Arcana, obtained by maxing
                    Sae Niijima's Confidant. One of the hardest to fuse.
                  - Kohryu: powerful Hierophant Arcana Persona, widely used
                    by players focused on support builds.
                
                ★ MUSIC:
                  - Last Surprise: the main battle theme, iconic jazz-funk
                    track composed by Shoji Meguro. Instantly recognizable.
                  - Life Will Change: plays during major boss fights and heist
                    sequences. One of the most hype tracks in the game.
                  - Rivers in the Desert: the final boss theme. A fan favorite
                    and considered one of Meguro's greatest works.
                  - Beneath the Mask: the calm night theme, with acoustic
                    and lo-fi versions depending on the context.
                  - Take Over: Royal's battle theme, replacing Last Surprise
                    in certain story moments during the new semester.
                  - Gentle Madman: Maruki's leitmotif in Royal, hauntingly
                    beautiful and tied to the third semester's atmosphere.
                  - The vocalist for most tracks is Lyn Inaizumi, whose
                    English lyrics became a defining part of P5's identity.
                
                ★ FUN FACTS:
                  - The Metaverse Navigator app plays a specific sound when
                    "opened" — it became a meme in the community.
                  - Morgana says "Let's go to sleep" so many times that
                    players made mashups and remixes of the line.
                  - The Leblanc cafe has appeared in real themed pop-up
                    versions in Tokyo.
                  - Royal added Showtime Attacks — special duo moves between
                    party members with unique animations.
                """;
    }
}