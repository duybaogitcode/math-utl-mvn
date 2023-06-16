package com.duybao.mathutil.core.test;

import com.duybao.mathutil.core.MathUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        Assertions.assertEquals(1, MathUtility.getFactorial(0));
        Assertions.assertEquals(1, MathUtility.getFactorial(1));
        Assertions.assertEquals(120, MathUtility.getFactorial(5));
    }
}


// Học kĩ thuật kiểm thử cho dân dev - kĩ thauatj ddt
//data driven testing -


//tdd: test driven development:
//kĩ thuật lập trình mà dn dev viết code đến đâu thì viết bộ est case đến đó (Junit, Nunit, Mocha) và dùng 2 màu xanh đỏ dể đảm
// bảo chất lượng code/chất lượng hàm!!! đã học xong

//học kĩ thuật kiểm thử cho dân dev-kĩ thuật ddt
//ddt: Data driven testing - bổ trợ cho việc xài unit test
//giuúp các test case dễ đọc hơn, dễ bảo trì hơn
//phần mở rộng thêm của tdd

//là kĩ thuật viết code kiểm thử mà tách bộ data kiểm thử
//ra khỏi câu lệnh assertEquals() cho dễ kiểm soát test case


//DDT  là phần mở rộng thêm cho tdd tức là giúp cho test (Unit test) trở nên dễ dàng đọc, bảo trì, dễ dàng phát hiện thiếu test case


//DDT tách data kiểm thử ra 1 chỗ riêng, thường là mảng 2 chiều(có nhiều cột, các cột chính là data đưa vào và expected) và ta cần có nhiều
//dòng như thế, ứng với các testcase

// và mảng 2 chiều này fill từ từ vào trong hàm asserteEqual(), kĩ thuật tách data test riêng ra 1 chỗ gọi là ddt
//data driven testing - viết code test hướng về việc tách data, data được đưa vào trở lại qua các tham số/biến đại diện
//nên ddt còn gọi là: parameterized testing
//tham số hóa cái data test, biến data test thành tham số và đưa vào hàm asserteEqual()
