

//data class User(val id: Int, val name: String, val email: String)
//
//// Initialize an in-memory list to store our data
//val users = mutableListOf<User>()
//
//// CREATE - function to add a new user to the list
//fun createUser(name: String, email: String) {
//    val id = if (users.isNotEmpty()) users.last().id + 1 else 1
//    users.add(User(id, name, email))
//}

//// READ - function to retrieve all users from the list
//fun getUsers(): List<User> {
//    return users
//}
//
//// UPDATE - function to update a user's email
//fun updateUserEmail(id: Int, newEmail: String) {
//    val index = users.indexOfFirst { it.id == id }
//    if (index != -1) {
//        users[index] = users[index].copy(email = newEmail)
//    }
//}
//
//// DELETE - function to remove a user from the list
//fun deleteUser(id: Int) {
//    users.removeIf { it.id == id }
//}
//
//// Example usage:
//createUser("John Doe", "john@example.com")
//createUser("Jane Doe", "jane@example.com")
//println(getUsers()) // [User(id=1, name=John Doe, email=john@example.com), User(id=2, name=Jane Doe, email=jane@example.com)]
//updateUserEmail(1, "john.doe@example.com")
//println(getUsers()) // [User(id=1, name=John Doe, email=john.doe@example.com), User(id=2, name=Jane Doe, email=jane@example.com)]
//deleteUser(2)
//println(getUsers()) // [User(id=1, name=John Doe, email=john.doe@example.com)]


//SCROLL


//To create CRUD operations in Kotlin, you will need to perform the following steps:

/* Define a data class that represents the entity you want to perform CRUD operations on.
For example, if you want to perform CRUD operations on a "User" entity, you could define a data class like this:*/

//data class User(
//    val id: Int,
//    val name: String,
//    val email: String
//)



//Create an interface that defines the CRUD operations you want to perform. For example, you could create an interface like this

//interface UserRepository {
//    fun create(user: User): User
//    fun read(id: Int): User?
//    fun update(user: User): User
//    fun delete(id: Int): Boolean
//}



//Implement the interface in a class that will perform the CRUD operations. For example, you could create a class like this

//class InMemoryUserRepository : UserRepository {
//    private val users = mutableListOf<User>()
//    private var nextId = 1
//
//    override fun create(user: User): User {
//        val newUser = user.copy(id = nextId++)
//        users.add(newUser)
//        return newUser
//    }
//
//    override fun read(id: Int): User? {
//        return users.find { it.id == id }
//    }
//
//    override fun update(user: User): User {
//        val index = users.indexOfFirst { it.id == user.id }
//        if (index == -1) throw IllegalArgumentException("User not found")
//        users[index] = user
//        return user
//    }
//
//    override fun delete(id: Int): Boolean {
//        val index = users.indexOfFirst { it.id == id }
//        if (index == -1) return false
//        users.removeAt(index)
//        return true
//    }
//}


