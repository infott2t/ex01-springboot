package org.example.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest
public class HelloResponseDtoTest {

   @Autowired
   private MockMvc mvc;

   @Test
   public void hello가_리턴된다() throws Exception {
      String hello = "hello";

      mvc.perform(get("/hello"))
              .andExpect(status().isOk())
              .andExpect(content().string(hello));
   }

   @Test
    public void 롬복_기능_테스트() {
       //given
       String name="test";
       int amount = 1000;

       //when
       HelloResponseDto dto = new HelloResponseDto(name, amount);

       //then
       assertThat(dto.getName()).isEqualTo(name);
       assertThat(dto.getAmount()).isEqualTo(amount);
   }
}
