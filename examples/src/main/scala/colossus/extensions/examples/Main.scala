package colossus.extensions.examples

import akka.actor._
import colossus._

object Main extends App {

  println( """ _______  _______  _        _______  _______  _______           _______ """)
  println( """(  ____ \(  ___  )( \      (  ___  )(  ____ \(  ____ \|\     /|(  ____ \""")
  println( """| (    \/| (   ) || (      | (   ) || (    \/| (    \/| )   ( || (    \/""")
  println( """| |      | |   | || |      | |   | || (_____ | (_____ | |   | || (_____ """)
  println( """| |      | |   | || |      | |   | |(_____  )(_____  )| |   | |(_____  )""")
  println( """| |      | |   | || |      | |   | |      ) |      ) || |   | |      ) |""")
  println( """| (____/\| (___) || (____/\| (___) |/\____) |/\____) || (___) |/\____) |""")
  println( """(_______/(_______)(_______/(_______)\_______)\_______)(_______)\_______)""")

  implicit val actorSystem = ActorSystem("COLOSSUS")

  implicit val ioSystem = IOSystem("examples", numWorkers = Some(4))

  val redisBackedMongoServer = MongoBackedRedisExample.start(9000)

}
