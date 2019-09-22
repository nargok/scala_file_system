package com.rtjvm.scala.oop.commands
import com.rtjvm.scala.oop.files.Directory
import com.rtjvm.scala.oop.filesystem.State

class Mkdir(name: String) extends Command {

  override def apply(state: State): State = {
    val wd = state.wd
    if (wd.hasEntry(name)) {
      state.setMessage("Entry" + name + "is already exists!")
    } else if (name.contains(Directory.SEPARATOR)) {
      state.setMessage(name + "must not contain separator!")
    } else if (checkIllegal(name)) {
      state.setMessage(name + "Illegal entry name")
    } else {
      doMkdir(state, name)
    }
  }

  def checkIllegal(str: String): Boolean = {
    name.contains(".")
  }

  def doMkdir(state: State, str: String): Unit = {
    ???
  }
}
