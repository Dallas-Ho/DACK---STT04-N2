# DACK---STT04-N2
Đồ án cuối kì môn Công Nghệ Ứng Dụng Kiểm Thử
----------------------------------------------
A. Manual Testing:
SV làm tất cả các testcase có thể có cho các chức năng trong trang web đã lựa chọn cho 3 level: unit test, intergration test và system test.
Testcase nào bug thì tô màu đỏ.
( Lưu ý:  tạo 3 sheet riêng cho từng level.)
Do số lượng testcase khá nhiều nên đối với phần Manual testing các thành viên phải phân chia nhau để viết testcase.
Trong sheet "phân công" ghi rõ thành viên nào đảm nhận test chức năng nào, v.vv
Sử dụng template đính kèm để hoàn thành phần A.
----------------------------------------------
B. API:
Dựa vào trang web lựa chọn, thiết kế database cho phù hợp với dữ liệu trên web.
Làm đầy đủ các quy trình có thể có (giống như theo tác trên web)
Viết testcase như check status code, check value trả về, kiểm tra giá trị input, v.vv
Chạy runner + newman 
-----------------------------------------------------
Quay video ghi lại toàn bộ quá trình chạy API step by step -> tải lên google drive và nộp link vào assignment.
Publish collection + export file json.
Nén file json server chứa source code 
Tạo folder API và tải toàn bộ lên repository của nhóm.
-----------------------------------------------------
C. Selenium:
Những task nào làm auto selenium trong file testcase thì note vào "Yes"
Quay video chạy các testcase auto -> tải lên google drive và nộp link vào assignment.
Nén file source code đồ án, tạo folder Selenium và tải toàn bộ lên  link github repository của nhóm.
-----------------------------------------------------
D. JMeter:
Kiểm thử hiệu năng đối với 3 thông số sau cho trang web mà nhóm lựa chọn:
Thread group (users): 100/1000/10000
Ram up: 10-100-1000
Loop: 1
Sau khi chạy jmeter, dựa vào Listener là View Results Tree/Grapth Results/ Aggregate Report, đưa ra các kết luận, nhận xét về kết quả đạt được cũng như giải pháp đề xuất để nâng cấp hệ thống (nếu có).
