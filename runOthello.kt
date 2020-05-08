fun main (){
    val b = Othello()
    //gameOnAlBe and gameOnMinimaxCustom they only take three parameters
    //First parameter indicates how many moves to look ahead for black;
    //Second parameter indicates how many moves to look ahead for white;
    //Third parameter indicates whether user want white player to play random instead of using minimax or alphabeta pruning
    b.gameOnAlBeHuman(3, false)
    //b.gameOnMinimaxCustom(3,1,false)

    //This run simulation whether both player only choose the best move to go.
    //b.gameOnChooseTheBest()
}