/*
Case đăng ký , gồm các trường :
- Họ
- Tên
- Email
- Số điện thoại
- Giới tính
- Ngày sinh
- Mật khẩu
 */
public class Case1 {
    public String checkSurname(String input){
        if(input=="[^0-9]"){
            System.out.println("Surname can't have number");
        } else if (input==" "){
            System.out.println("Surname can't have space");
        } else if (input=="[/!@#$%^&*<>?|//\\//]") {
            System.out.println("Surname can't have special character");
        }else
            System.out.println("Correct");
        return input;
    }
}
