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
public class Case2 {
    public String Name(String input){
        if(input=="[^0-9]"){
            System.out.println("Name can't have number");
        } else if (input==" "){
            System.out.println("Name can't have space");
        } else if (input=="[/!@#$%^&*<>?|//\\//]") {
            System.out.println("Name can't have special character");
        }else
            System.out.println("Correct");
        return input;
    }
}
