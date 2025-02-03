@ExtendWith(SpringExtension.class)
@MockBean(CidadeRepository.class)
public class CidadeServiceTest {

    @Autowired
    private CidadeService cidadeService;

    @MockBean
    private CidadeRepository cidadeRepository;

    @Test
    public void testFindCidadeById() {
        Cidade cidade = new Cidade();
        cidade.setId(1L);
        cidade.setNome("Kanto");
        when(cidadeRepository.findById(1L)).thenReturn(Optional.of(cidade));

        Cidade result = cidadeService.findCidadeById(1L);
        assertEquals("Kanto", result.getNome());
    }
}
