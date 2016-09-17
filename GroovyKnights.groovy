package GroovyKnights

class GroovyKnights {
	static void main (String... args) {
		println "GroovyKnights! Woohwooh"
		println "Starting battle"

		BattleField battle = new BattleField()
		Knight winner
		while(!(winner = battle.winner)) {
			battle.fight()
		}
		println "Knight ${winner.name} wins the battle!"
	}
}