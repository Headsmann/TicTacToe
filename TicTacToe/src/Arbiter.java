public class Arbiter {
    private int player = 1;
    private String[][] gameValues = new String[3][3];

    public void setGame() {
        gameValues = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameValues[i][j] = "";
            }
        }
    }


    public boolean hasWinner() {
        //ROWS:
        if((!"".equals(this.gameValues[0][0])) && (!"".equals(this.gameValues[0][1]) && (!"".equals(this.gameValues[0][2])))){
            if ((this.gameValues[0][0].equals(this.gameValues[0][1])) && (this.gameValues[0][0].equals(this.gameValues[0][2]))) {
                return true;
            }
        }
        if((!"".equals(this.gameValues[1][0])) && (!"".equals(this.gameValues[1][1]) && (!"".equals(this.gameValues[1][2])))) {
            if ((this.gameValues[1][0].equals(this.gameValues[1][1])) && (this.gameValues[1][0].equals(this.gameValues[1][2]))) {
                return true;
            }
        }
        if((!"".equals(this.gameValues[2][0])) && (!"".equals(this.gameValues[2][1]) && (!"".equals(this.gameValues[2][2])))) {
            if ((this.gameValues[2][0].equals(this.gameValues[2][1])) && (this.gameValues[2][0].equals(this.gameValues[2][2]))) {
                return true;
            }
        }
        //COLUMNS:
        if((!"".equals(this.gameValues[0][0])) && (!"".equals(this.gameValues[1][0]) && (!"".equals(this.gameValues[2][0])))) {
            if ((this.gameValues[0][0].equals(this.gameValues[1][0])) && (this.gameValues[0][0].equals(this.gameValues[2][0]))) {
                return true;
            }
        }
        if((!"".equals(this.gameValues[0][1])) && (!"".equals(this.gameValues[1][1]) && (!"".equals(this.gameValues[2][1])))) {
            if ((this.gameValues[0][1].equals(this.gameValues[1][1])) && (this.gameValues[0][1].equals(this.gameValues[2][1]))) {
                return true;
            }
        }
        if((!"".equals(this.gameValues[0][2])) && (!"".equals(this.gameValues[1][2]) && (!"".equals(this.gameValues[2][2])))) {
            if ((this.gameValues[0][2].equals(this.gameValues[1][2])) && (this.gameValues[0][2].equals(this.gameValues[2][2]))) {
                return true;
            }
        }
        //DIAGONALS:
        if((!"".equals(this.gameValues[0][0])) && (!"".equals(this.gameValues[1][1]) && (!"".equals(this.gameValues[2][2])))) {
            if ((this.gameValues[0][0].equals(this.gameValues[1][1])) && (this.gameValues[0][0].equals(this.gameValues[2][2]))) {
                return true;
            }
        }
        if((!"".equals(this.gameValues[0][2])) && (!"".equals(this.gameValues[1][1]) && (!"".equals(this.gameValues[2][0])))) {
            if ((this.gameValues[0][2].equals(this.gameValues[1][1])) && (this.gameValues[0][2].equals(this.gameValues[2][0]))) {
                return true;
            }
        }
        return false;
    }

    public void setText(int x, int y) {
        if(player == 0) {
            gameValues[x][y] = "X";
            switchPlayer(1);
        } else {
            gameValues[x][y] = "O";
            switchPlayer(0);
        }
    }

    public String getBoardValue(int x, int y) {
        return gameValues[x][y];
    }

    public String[][] getBoardValues() {
        return gameValues;
    }

    private void switchPlayer(int newPlayer) {
        this.player = newPlayer;
    }
}