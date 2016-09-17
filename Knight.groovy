package GroovyKnights

class Knight {
	String name
	int hitPoints

	boolean isDead() {
		hitPoints <= 0
	}

	def hit(Knight otherKnight) {
		int damage = (Math.random() * 6) as int
		otherKnight.receiveDamage(damage)
		println "Knight $name hit Knight ${otherKnight.name} for $damage points of damage"
	}

	def receiveDamage(int damage) {
		hitPoints = hitPoints - damage
	}
}