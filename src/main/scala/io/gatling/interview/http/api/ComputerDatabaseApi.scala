package io.gatling.interview.http.api

import cats.effect.{ContextShift, Effect}
import com.twitter.finagle.Service
import com.twitter.finagle.http.{Request, Response}
import io.finch._
import io.finch.circe._
import io.gatling.interview.http.api.computers.ComputersModule
import io.gatling.interview.repository.ComputerRepository

class ComputerDatabaseApi[F[_]: Effect: ContextShift](
                                                     computerRepository: ComputerRepository
                                                     ) extends Endpoint.Module[F] {

  private val computersApi: ComputersModule[F] = new ComputersModule[F](computerRepository)

  val service: Service[Request, Response] =
    Endpoint.toService(
        Bootstrap
          .serve[Application.Json](computersApi.endpoints)
          .compile
    )
}

