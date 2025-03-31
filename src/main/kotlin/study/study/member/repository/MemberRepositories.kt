package study.study.member.repository

import study.study.member.entity.Member
import org.springframework.data.jpa.repository.JpaRepository
import study.study.common.status.Gender

interface MemberRepository : JpaRepository<Member, Long> {
    fun findByLoginId(loginId: String): Member?
}
