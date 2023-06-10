package Spring1.SpringCoreBasic.member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberID);
}
