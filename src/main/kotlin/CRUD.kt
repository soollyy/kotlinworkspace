

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
