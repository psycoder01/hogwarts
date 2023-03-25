package filesystem

import files.Directory
import java.util.Scanner
import commands.Command

@main def hello: Unit =
  object Filesystem extends App:
    val root = Directory.ROOT
    var state = State(root, root)
    val scanner = new Scanner(System.in)

    while (true) {
      state.show
      state = Command.from(scanner.nextLine())(state)
    }

  Filesystem
