package ru.netology.nmedia

data class Post(
    val id: Long,
    val author: String,
    val content: String,
    val published: String,
    var likes: Int = 1099,
    var likedByMe: Boolean = false,
    var sharedByMe: Boolean = false,
    var views: Int = 1,
    var shared: Int = 0
)