# Gatling Corp Scala interview project

The goal of this part is to create a CRUD API of computers (just like our demo website: https://computer-database.gatling.io/computers). 

Please code as you would do in your everyday work.

The major libraries you'll need to use are:
- finch
- cats
- h2
- circe

You can find here the basis of the project, feel free to modify the architecture to your taste.

A computer is represented by:
- an id
- a name
- an optional introduced date
- an optional discontinued date

## Specifications

- read the computers in a h2 database (use whichever jdbc layer you prefer, eg: jdbc, doobie, scalikejdbc)
- add an API to insert computer
- add an API to fetch the number of computers introduced after a specific date

## Bonus

- add refined (https://github.com/fthomas/refined)
- link every computer to a company (a company can manufacture multiple computers)
- add tools typically used in a development environment (eg a code formatter)
