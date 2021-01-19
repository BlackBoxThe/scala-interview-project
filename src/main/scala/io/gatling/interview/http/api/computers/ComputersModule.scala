package io.gatling.interview.http.api.computers

import cats.effect.Effect
import io.finch._
import io.gatling.interview.model.Computer
import io.gatling.interview.repository.ComputerRepository


class ComputersModule[F[_]: Effect] (computerRepository: ComputerRepository) extends Endpoint.Module[F] {

  private val computers: Endpoint[F, Seq[Computer]] = get("computers") {
    val computers = computerRepository.fetchAll()
    Ok(computers)
  }

  private[api] val endpoints = computers
}
