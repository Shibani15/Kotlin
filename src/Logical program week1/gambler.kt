import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum

fun main(args:Array<String>) {

    var stake = 0
    var goal = 1
    var trial = 2
    var bets = 0
    var wins = 0
    var t = 0
    for (t in 0..trial) {
        //do gambler ruins simulation//
        var cash = stake
        if (cash in 1 until goal) {
            bets++
        }
        if (Math.random() < 0.5) {
            cash++
        } else {
            cash--
        }
        if (cash == goal)
        {
            var win = 0
            win++
        }
        var percentage  = 100*wins/trial
        var percentage2 = 1.0*bets/trial
        println(wins)
        println(trial)
        println(percentage)
        println(percentage2)



    }
}


