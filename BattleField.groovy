package GroovyKnights
class BattleField {
	
	List knights = []

	def init() {
		6.times { i ->
			knights << new Knight(name: i, hitPoints: 100)
		}
	}

	Knight getWinner() {
		knights.size() == 1 ? knights.first() : null
	}

	def fight() {
		if (!knights) 
			init()

		if (winner) return;

		knights[0].hit(knights[1])
		if (knights[1].dead) {
			println "Knight ${knights[1].name} is dead"
			knights.removeAt(1)
		}
		knights = knights.drop(1) + knights.first()
	}

}