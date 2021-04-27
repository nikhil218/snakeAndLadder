public class snakeAndLadder {
   public static void main(String[] args) {

      System.out.println("Welcome to snake and ladder problem");

      int player_position = 0 ;
      int winning_position = 100 ;

      while (player_position <  winning_position) {
         int dice_value = (int)Math.floor(Math.random() * 10) % 6 + 1;
         int player_option_check = (int)Math.floor(Math.random() * 10) % 3 ;
         switch (player_option_check) {
         case 0:
            System.out.println("No move");
            break;
         case 1:
            System.out.println("Case of Ladder");
            player_position += dice_value;
            System.out.println(player_position);
            break;
          case 2:
            System.out.println("Case of Snake");
            if ( (player_position - dice_value) >= 0 ){
               player_position -= dice_value;
            }
            System.out.println(player_position);
            break;
         }
      }
   }
}
