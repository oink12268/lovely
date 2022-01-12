package com.happy.lovely;

//import org.junit.runner.RunWith;
import com.happy.lovely.presentation.api.UserRestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(SpringRunner.class)
@WebMvcTest(controllers = UserRestController.class)
//@SpringBootTest
class LovelyApplicationTests {

//    @Test
//    void contextLoads() {
//    }

//    @Autowired
//    private MockMvc mvc;

//    @Test
//    public void hello가_리턴된다() throws Exception {
//        String hello = "hello1";
//
//        mvc.perform(get("/api/admin/list"))
//                .andExpect(status().isOk())
//                .andExpect(content().string(hello));
//    }

}
