package hello.core.member;

public interface MemberRepository {
    void save(Member member);//회원저장기능, 검색기능
    
    Member findById(Long memberId);
}
