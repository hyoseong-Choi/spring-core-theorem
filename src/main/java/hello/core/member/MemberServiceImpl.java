package hello.core.member;

public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;
    
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    
    @Override
    public void join(Member member) {
        memberRepository.save(member);//메모리멤버에있는세이브호출
    }
    
    @Override
    public Member findMember(Long memberId) {
        
        return memberRepository.findById(memberId);
    }
    
}