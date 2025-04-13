package flashcard.model;

public class FlashCard{
      private String engword;
      private String ruword; 
      private long createTime;
      private Side side;
      
      FlashCard(String engword, String ruword){
           this.engword = engword;
           this.ruword = ruword;
           this.createTime = System.currentTimeMillis();
           this.side = Side.En;
      }
      
}
