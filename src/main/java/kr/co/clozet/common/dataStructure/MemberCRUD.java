package kr.co.clozet.common.dataStructure;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * packageName:kr.co.clozet.common.dataStructure
 * fileName        :MemberCRUD.java
 * author          : sungsuhan
 * date            :2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09           sungsuhan      최초 생성
 **/
public class MemberCRUD {

    // domain
    @Data @NoArgsConstructor
    static class Member{
        protected String userid, name, password, profileImg, phone, email;

        public Member(Builder builder) {
            this.userid = builder.userid;
            this.name = builder.name;
            this.password = builder.password;
            this.profileImg = builder.profileImg;
            this.phone = builder.phone;
            this.email = builder.email;
        }
        static class Builder{
            private String userid, name, password, profileImg, phone, email;
            public Builder(String userid){this.userid=userid;}
            public Builder name(String name){this.name=name;return this;}
            public Builder password(String password){this.password=password;return this;}
            public Builder profileImg(String profileImg){this.profileImg=profileImg;return this;}
            public Builder phone(String phone){this.phone=phone;return this;}
            public Builder email(String email){this.email=email;return this;}
            Member build(){return new Member(this);}
        }
        @Override public String toString(){
            return String.format("[사용자 스펙] userid: %s, name: %s, password: %s, profileImg: %s, phone: %s, email: %s",
                    userid, name, password, profileImg, phone, email);
        }
    }

    // controller
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MemberService service = new MemberServiceImpl();
        while (true) {
            System.out.println("0.exit 1.save 2.update 3.delete 4.findById 5.findByName 6.findAll 7.count 8.existsById 9.clear");
            switch (s.next()){
                case "0":
                    System.out.println("exit");
                    return;
                case "1":
                    Member han = new Member.Builder("han")
                            .email("swhanss@naver.com")
                            .password("1234")
                            .name("한성수")
                            .phone("010-3375-2890")
                            .profileImg("han.jpg")
                            .build();
                    service.save(han);
                    Member woo = new Member.Builder("woo")
                            .email("woo@naver.com")
                            .password("4321")
                            .name("우지현")
                            .phone("010-2886-9338")
                            .profileImg("woo.jpg")
                            .build();
                    service.save(woo);
                    break;
                case "2":

                    break;
                case "3":
                    Member del = new Member();
                    del.setUserid(s.next());
                    service.delete(del);
                    break;
                case "4":
                    System.out.println("어떤 ID 정보 볼래요?");
                    System.out.println(service.findById(s.next()));
                    break;
                case "5":
                    Member find =new Member();
                    find.setName(s.next());
                    service.findByName(find.name);
                    String res1= find.name==null?"해당 이름을 가진 가입자가 없습니다.":"해당 이름을 가진 가입자가 있습니다.";
                    System.out.println(res1);
                    break;
                case "6":
                    System.out.println("총 회원목록: "+service.findAll());
                    break;
                case "7":
                    System.out.println("총 회원 수: "+service.count()+" 명");
                    break;
                case "8":
                    System.out.println("어떤 ID 확인 할래요?");
                    System.out.println(service.existsById(s.next()));
                    break;
                case "9":
                    service.clear();
                    break;
                default:break;
            }
        }
    }

    // service
    interface MemberService{
        void save(Member member);
        void update(Member member);
        void delete(Member member);
        Member findById (String id);
        List<Member> findByName (String name);
        List<Member> findAll();
        int count();
        boolean existsById (String id);
        void clear();
    }

    static class MemberServiceImpl implements MemberService{
        private final Map<String, Member> map;

        public MemberServiceImpl(){
            this.map = new HashMap<>();
        }

        @Override
        public void save(Member member){
            map.put(member.getUserid(), member);
        }

        @Override
        public void update(Member member) {
            map.replace(member.getUserid(), member);
        }

        @Override
        public void delete(Member member) {
            map.remove(member.getUserid());
        }

        @Override
        public Member findById(String id) {
            return map.get(id);
        }

        @Override
        public List<Member> findByName(String name) {
            return (List<Member>) map.get(name);
        }

        @Override
        public List<Member> findAll() {
            return (List<Member>) map.values();
        }

        @Override
        public int count() {
            return map.size();
        }

        @Override
        public boolean existsById(String id) {
            return map.containsKey(id);
        }

        @Override
        public void clear() {
            map.clear();
        }


    }











}
