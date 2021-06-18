package com.topicosdeprogramacion.practica_6.componentes
import android.content.Context

class BotPlayer(context: Context, shapeId: Int?, game: Game?) : Player(context, shapeId) {

    var game: Game?

    init {
        movVec.x = 8f
        updateRate = 100
        this.game = game
    }

    override fun update() {
        if (shouldUpdate) {
            super.update()
            if (game!!.ball.movVec.y > 0 && location.centerX().toInt() == game!!.bounds.centerX()) {
                return
            }
            location.offset(movVec.x, movVec.y)
            if (game?.ball?.location!!.centerX() > location.right ||
                game?.ball?.location!!.centerX() < location.left && game!!.ball.movVec.y < 0
            ) {
                if ((location.centerX() - game?.ball?.location!!.centerX()) * movVec.x > 0) {
                    movVec.x = -movVec.x
                }
            } else if (location.left <= 0 || location.right >= game!!.bounds.width()) {
                movVec.x = -movVec.x
            }
        }
    }
}