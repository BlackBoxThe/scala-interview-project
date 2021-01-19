package io.gatling.interview.repository

import io.gatling.interview.model.Computer

class ComputerRepository() {
  def fetchAll(): Seq[Computer] = {
    Seq(Computer(1L, "toto", None, None), Computer(2L, "tata", None, None))
  }
}
