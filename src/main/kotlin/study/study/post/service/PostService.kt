package study.study.post.service

import org.springframework.stereotype.Service
import study.study.post.dto.PostRequest
import study.study.post.dto.PostResponse
import study.study.post.repository.PostRepository
import study.study.post.domain.Post

@Service
class PostService(
    private val postRepository: PostRepository
) {
    fun createPost(request: PostRequest): PostResponse {
        val post = Post(
            title = request.title,
            content = request.content,
            author = request.author
        )
        val saved = postRepository.save(post)
        return PostResponse(
            id = saved.id,
            title = saved.title,
            content = saved.content,
            author = saved.author,
            createdAt = saved.createdAt,
            updatedAt = saved.updatedAt
        )
    }
}
