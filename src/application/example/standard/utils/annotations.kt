package application.example.standard.utils


annotation class Entity

annotation class Id
annotation class OneToMany
annotation class OneToOne
annotation class ManyToOne
annotation class ManyToMany

annotation class Transactional
annotation class Service
annotation class Controller
annotation class HasRole(val role: String)
annotation class Post(val path: String = "")
annotation class Get(val path: String = "")
annotation class Put(val path: String = "")
annotation class Patch(val path: String = "")
annotation class Delete(val path: String = "")

interface Repository<EntityType, PrimaryKeyType>