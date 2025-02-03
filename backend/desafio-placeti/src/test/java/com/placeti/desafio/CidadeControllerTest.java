@SpringBootTest
@AutoConfigureMockMvc
public class CidadeControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testGetCidades() throws Exception {
        mockMvc.perform(get("/api/cidades"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$", hasSize(2)));  // Exemplo para se for a expectativa de 2 cidades
    }
}
