/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery.ticket;

/**
 *
 * @author 37067
 */
public class LotteryTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] lotteryCard = { {20, 15, 7},
                                {8, 7, 19},
                                {7, 13, 47}
        };
        // it's possible to assign values in that way
        int[][] lotteryCard2 = new int[3][3];
        lotteryCard2[0][0] = 20;
        lotteryCard2[0][1] = 15;
        lotteryCard2[0][2] = 7;
        lotteryCard2[1][0] = 8;
        lotteryCard2[1][1] = 7;
        lotteryCard2[1][2] = 19;
        lotteryCard2[2][0] = 7;
        lotteryCard2[2][1] = 13;
        lotteryCard2[2][2] = 47;   
        
        //[row][column]
        // prints lotteryCard number from first line and first column
        System.out.println(lotteryCard[0][0]);
        // prints lotteryCard number from third line and fird column
        System.out.println(lotteryCard2[2][2]);
        System.out.println("----------------");
        
        for(int i = 0; i < 3; i++) {
            System.out.println(lotteryCard[i][i]);
        }
        System.out.println("----------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(lotteryCard[i][j] + " ");
            }
            System.out.println();
        }
        
        
    }
    
}
