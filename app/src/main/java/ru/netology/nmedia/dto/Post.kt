package ru.netology.nmedia.dto

data class Post(
    val id: Long,
    val author: String,
    val content: String,
    val published: String,
    val likedByMe: Boolean = false,
    var likes: Int = 1099,
    var views: Int = 1,
    var shared: Int = 0,
    var video: String? = "https://youtu.be/dQw4w9WgXcQ"
)