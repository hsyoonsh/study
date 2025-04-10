package study.study.common.status

enum class Dormitory(val desc: String) {
    GEA("고운A"),
    GEB("고운B"),
    GEC("고운C"),
    GS11("경상11"),
    GS12("경상12"),
    GS13("경상13"),
    GS14("경상14"),
}

enum class Gender(val desc: String) {
    MAN("남"),
    WOMAN("여")
}
enum class ResultCode(val msg: String) {
    SUCCESS("정상 처리 되었습니다."),
    ERROR("에러가 발생했습니다.")
}

enum class ROLE {
    MEMBER
}