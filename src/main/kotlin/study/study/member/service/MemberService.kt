package study.study.member.service

import study.study.member.dto.MemberDtoRequest
import study.study.member.entity.Member
import study.study.member.repository.MemberRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service
import study.study.common.exception.InvalidInputException

@Transactional
@Service
class MemberService(
    private val memberRepository: MemberRepository
) {
    /**
     * 회원가입
     */
    fun signup(memberDtoRequest: MemberDtoRequest): String {
        // ID 중복 검사
        var member: Member? = memberRepository.findByLoginId(memberDtoRequest.loginId)
        if (member != null) {
            throw InvalidInputException("loginId", "이미 등록된 ID 입니다.")
        }

        member = memberDtoRequest.toEntity()

        memberRepository.save(member)

        return "회원가입이 완료되었습니다."
    }
}



