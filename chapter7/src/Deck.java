public class Deck{
    final int CARD_NUM=52;
    Card[] cardAry=new Card[CARD_NUM];

    Deck(){
        int i=0;
        for(int k=Card.KIND_MAX;k>0;k--)
            for(int n=0;n<Card.NUM_MAX;n++)
                cardAry[i++]=new Card(k,n+1);
    }
    Card pick(int index){
        return cardAry[index];
    }
    Card pick(){
        int index=(int)(Math.random()*CARD_NUM);
        return pick(index);
    }
    void shuffle(){
        for(int i=0;i<cardAry.length;i++){
            int r=(int)(Math.random()*CARD_NUM);

            cardAry[i].number = cardAry[i].number + cardAry[r].number;
            cardAry[r].number = cardAry[i].number - cardAry[r].number;
            cardAry[i].number = cardAry[i].number - cardAry[r].number;

            cardAry[i].kind = cardAry[i].kind + cardAry[r].kind;
            cardAry[r].kind = cardAry[i].kind - cardAry[r].kind;
            cardAry[i].kind = cardAry[i].kind - cardAry[r].kind;
        }
    }
}