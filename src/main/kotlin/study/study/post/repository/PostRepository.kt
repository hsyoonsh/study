package study.study.post.repository

import org.springframework.data.jpa.repository.JpaRepository
import study.study.post.domain.Post

interface PostRepository : JpaRepository<Post, Long>
