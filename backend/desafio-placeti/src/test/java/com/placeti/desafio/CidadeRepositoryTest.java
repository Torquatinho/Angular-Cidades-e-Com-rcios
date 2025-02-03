@SpringBootTest
public class CidadeRepositoryTest {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Test
    public void testFindById() {
        Cidade cidade = cidadeRepository.save(new Cidade("Kanto"));
        Optional<Cidade> result = cidadeRepository.findById(cidade.getId());
        assertTrue(result.isPresent());
        assertEquals("São Paulo", result.get().getNome());
    }
}
