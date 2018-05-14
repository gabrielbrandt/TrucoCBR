package trabalho.cbr;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.CaseComponent;
import jcolibri.exception.ExecutionException;
import jcolibri.method.retrieve.RetrievalResult;

public class TrucoDescription implements CaseComponent {
	 String CASEID;
	 Integer JogadorMao;
	 Integer CartaAltaRobo;
	 Integer CartaMediaRobo;
	 Integer CartaBaixaRobo;
	 Integer CartaAltaHumano;
	 Integer CartaMediaHumano;
	 Integer CartaBaixaHumano;
	 Integer PrimeiraCartaRobo;
	 Integer PrimeiraCartaHumano;
	 Integer SegundaCartaRobo;
	 Integer SegundaCartaHumano;
	 Integer TerceiraCartaRobo;
	 Integer TerceiraCartaHumano;
	 Integer GanhadorPrimeiraRodada;
	 Integer GanhadorSegundaRodada;
	 Integer GanhadorTerceiraRodada;
	 Integer RoboCartaVirada;
	 Integer HumanoCartaVirada;
	 Integer QuemPediuEnvido;
	 Integer QuemPediuFaltaEnvido;
	 Integer QuemPediuRealEnvido;
	 Integer PontosEnvidoRobo;
	 Integer PontosEnvidoHumano;
	 Integer QuemNegouEnvido;
	 Integer QuemGanhouEnvido;
	 Integer TentosEnvido;
	 Integer QuemFlor;
	 Integer QuemContraFlor;
	 Integer QuemContraFlorResto;
	 Integer QuemNegouFlor;
	 Integer PontosFlorRobo;
	 Integer PontosFlorHumano;
	 Integer QuemGanhouFlor;
	 Integer TentosFlor;
	 Integer QuemEscondeuPontosEnvido;
	 Integer QuemEscondeuPontosFlor;
	 Integer QuemTruco;
	 Integer QuandoTruco;
	 Integer QuemRetruco;
	 Integer QuandoRetruco;
	 Integer QuemValeQuatro;
	 Integer QuandoValeQuatro;
	 Integer QuemNegouTruco;
	 Integer QuemGanhouTruco;
	 Integer TentosTruco;
	 Integer TentosAnterioresRobo;
	 Integer TentosAnterioresHumano;
	 Integer TentosPosterioresRobo;
	 Integer TentosPosterioresHumano;
	 Integer RoboMentiuEnvido;
	 Integer HumanoMentiuEnvido;
	 Integer RoboMentiuFlor;
	 Integer HumanoMentiuFlor;
	 Integer RoboMentiuTruco;
	 Integer HumanoMentiuTruco;
	 Integer QuemBaralho;

	public TrucoDescription() {
	}

	public String getCASEID() {
		return CASEID;
	}

	public void setCASEID(String cASEID) {
		CASEID = cASEID;
	}

	public Integer getJogadorMao() {
		return JogadorMao;
	}

	public void setJogadorMao(Integer jogadorMao) {
		JogadorMao = jogadorMao;
	}

	public Integer getCartaAltaRobo() {
		return CartaAltaRobo;
	}

	public void setCartaAltaRobo(Integer cartaAltaRobo) {
		CartaAltaRobo = cartaAltaRobo;
	}

	public Integer getCartaMediaRobo() {
		return CartaMediaRobo;
	}

	public void setCartaMediaRobo(Integer cartaMediaRobo) {
		CartaMediaRobo = cartaMediaRobo;
	}

	public Integer getCartaBaixaRobo() {
		return CartaBaixaRobo;
	}

	public void setCartaBaixaRobo(Integer cartaBaixaRobo) {
		CartaBaixaRobo = cartaBaixaRobo;
	}

	public Integer getCartaAltaHumano() {
		return CartaAltaHumano;
	}

	public void setCartaAltaHumano(Integer cartaAltaHumano) {
		CartaAltaHumano = cartaAltaHumano;
	}

	public Integer getCartaMediaHumano() {
		return CartaMediaHumano;
	}

	public void setCartaMediaHumano(Integer cartaMediaHumano) {
		CartaMediaHumano = cartaMediaHumano;
	}

	public Integer getCartaBaixaHumano() {
		return CartaBaixaHumano;
	}

	public void setCartaBaixaHumano(Integer cartaBaixaHumano) {
		CartaBaixaHumano = cartaBaixaHumano;
	}

	public Integer getPrimeiraCartaRobo() {
		return PrimeiraCartaRobo;
	}

	public void setPrimeiraCartaRobo(Integer primeiraCartaRobo) {
		PrimeiraCartaRobo = primeiraCartaRobo;
	}

	public Integer getPrimeiraCartaHumano() {
		return PrimeiraCartaHumano;
	}

	public void setPrimeiraCartaHumano(Integer primeiraCartaHumano) {
		PrimeiraCartaHumano = primeiraCartaHumano;
	}

	public Integer getSegundaCartaRobo() {
		return SegundaCartaRobo;
	}

	public void setSegundaCartaRobo(Integer segundaCartaRobo) {
		SegundaCartaRobo = segundaCartaRobo;
	}

	public Integer getSegundaCartaHumano() {
		return SegundaCartaHumano;
	}

	public void setSegundaCartaHumano(Integer segundaCartaHumano) {
		SegundaCartaHumano = segundaCartaHumano;
	}

	public Integer getTerceiraCartaRobo() {
		return TerceiraCartaRobo;
	}

	public void setTerceiraCartaRobo(Integer terceiraCartaRobo) {
		TerceiraCartaRobo = terceiraCartaRobo;
	}

	public Integer getTerceiraCartaHumano() {
		return TerceiraCartaHumano;
	}

	public void setTerceiraCartaHumano(Integer terceiraCartaHumano) {
		TerceiraCartaHumano = terceiraCartaHumano;
	}

	public Integer getGanhadorPrimeiraRodada() {
		return GanhadorPrimeiraRodada;
	}

	public void setGanhadorPrimeiraRodada(Integer ganhadorPrimeiraRodada) {
		GanhadorPrimeiraRodada = ganhadorPrimeiraRodada;
	}

	public Integer getGanhadorSegundaRodada() {
		return GanhadorSegundaRodada;
	}

	public void setGanhadorSegundaRodada(Integer ganhadorSegundaRodada) {
		GanhadorSegundaRodada = ganhadorSegundaRodada;
	}

	public Integer getGanhadorTerceiraRodada() {
		return GanhadorTerceiraRodada;
	}

	public void setGanhadorTerceiraRodada(Integer ganhadorTerceiraRodada) {
		GanhadorTerceiraRodada = ganhadorTerceiraRodada;
	}

	public Integer getRoboCartaVirada() {
		return RoboCartaVirada;
	}

	public void setRoboCartaVirada(Integer roboCartaVirada) {
		RoboCartaVirada = roboCartaVirada;
	}

	public Integer getHumanoCartaVirada() {
		return HumanoCartaVirada;
	}

	public void setHumanoCartaVirada(Integer humanoCartaVirada) {
		HumanoCartaVirada = humanoCartaVirada;
	}

	public Integer getQuemPediuEnvido() {
		return QuemPediuEnvido;
	}

	public void setQuemPediuEnvido(Integer quemPediuEnvido) {
		QuemPediuEnvido = quemPediuEnvido;
	}

	public Integer getQuemPediuFaltaEnvido() {
		return QuemPediuFaltaEnvido;
	}

	public void setQuemPediuFaltaEnvido(Integer quemPediuFaltaEnvido) {
		QuemPediuFaltaEnvido = quemPediuFaltaEnvido;
	}

	public Integer getQuemPediuRealEnvido() {
		return QuemPediuRealEnvido;
	}

	public void setQuemPediuRealEnvido(Integer quemPediuRealEnvido) {
		QuemPediuRealEnvido = quemPediuRealEnvido;
	}

	public Integer getPontosEnvidoRobo() {
		return PontosEnvidoRobo;
	}

	public void setPontosEnvidoRobo(Integer pontosEnvidoRobo) {
		PontosEnvidoRobo = pontosEnvidoRobo;
	}

	public Integer getPontosEnvidoHumano() {
		return PontosEnvidoHumano;
	}

	public void setPontosEnvidoHumano(Integer pontosEnvidoHumano) {
		PontosEnvidoHumano = pontosEnvidoHumano;
	}

	public Integer getQuemNegouEnvido() {
		return QuemNegouEnvido;
	}

	public void setQuemNegouEnvido(Integer quemNegouEnvido) {
		QuemNegouEnvido = quemNegouEnvido;
	}

	public Integer getQuemGanhouEnvido() {
		return QuemGanhouEnvido;
	}

	public void setQuemGanhouEnvido(Integer quemGanhouEnvido) {
		QuemGanhouEnvido = quemGanhouEnvido;
	}

	public Integer getTentosEnvido() {
		return TentosEnvido;
	}

	public void setTentosEnvido(Integer tentosEnvido) {
		TentosEnvido = tentosEnvido;
	}

	public Integer getQuemFlor() {
		return QuemFlor;
	}

	public void setQuemFlor(Integer quemFlor) {
		QuemFlor = quemFlor;
	}

	public Integer getQuemContraFlor() {
		return QuemContraFlor;
	}

	public void setQuemContraFlor(Integer quemContraFlor) {
		QuemContraFlor = quemContraFlor;
	}

	public Integer getQuemContraFlorResto() {
		return QuemContraFlorResto;
	}

	public void setQuemContraFlorResto(Integer quemContraFlorResto) {
		QuemContraFlorResto = quemContraFlorResto;
	}

	public Integer getQuemNegouFlor() {
		return QuemNegouFlor;
	}

	public void setQuemNegouFlor(Integer quemNegouFlor) {
		QuemNegouFlor = quemNegouFlor;
	}

	public Integer getPontosFlorRobo() {
		return PontosFlorRobo;
	}

	public void setPontosFlorRobo(Integer pontosFlorRobo) {
		PontosFlorRobo = pontosFlorRobo;
	}

	public Integer getPontosFlorHumano() {
		return PontosFlorHumano;
	}

	public void setPontosFlorHumano(Integer pontosFlorHumano) {
		PontosFlorHumano = pontosFlorHumano;
	}

	public Integer getQuemGanhouFlor() {
		return QuemGanhouFlor;
	}

	public void setQuemGanhouFlor(Integer quemGanhouFlor) {
		QuemGanhouFlor = quemGanhouFlor;
	}

	public Integer getTentosFlor() {
		return TentosFlor;
	}

	public void setTentosFlor(Integer tentosFlor) {
		TentosFlor = tentosFlor;
	}

	public Integer getQuemEscondeuPontosEnvido() {
		return QuemEscondeuPontosEnvido;
	}

	public void setQuemEscondeuPontosEnvido(Integer quemEscondeuPontosEnvido) {
		QuemEscondeuPontosEnvido = quemEscondeuPontosEnvido;
	}

	public Integer getQuemEscondeuPontosFlor() {
		return QuemEscondeuPontosFlor;
	}

	public void setQuemEscondeuPontosFlor(Integer quemEscondeuPontosFlor) {
		QuemEscondeuPontosFlor = quemEscondeuPontosFlor;
	}

	public Integer getQuemTruco() {
		return QuemTruco;
	}

	public void setQuemTruco(Integer quemTruco) {
		QuemTruco = quemTruco;
	}

	public Integer getQuandoTruco() {
		return QuandoTruco;
	}

	public void setQuandoTruco(Integer quandoTruco) {
		QuandoTruco = quandoTruco;
	}

	public Integer getQuemRetruco() {
		return QuemRetruco;
	}

	public void setQuemRetruco(Integer quemRetruco) {
		QuemRetruco = quemRetruco;
	}

	public Integer getQuandoRetruco() {
		return QuandoRetruco;
	}

	public void setQuandoRetruco(Integer quandoRetruco) {
		QuandoRetruco = quandoRetruco;
	}

	public Integer getQuemValeQuatro() {
		return QuemValeQuatro;
	}

	public void setQuemValeQuatro(Integer quemValeQuatro) {
		QuemValeQuatro = quemValeQuatro;
	}

	public Integer getQuandoValeQuatro() {
		return QuandoValeQuatro;
	}

	public void setQuandoValeQuatro(Integer quandoValeQuatro) {
		QuandoValeQuatro = quandoValeQuatro;
	}

	public Integer getQuemNegouTruco() {
		return QuemNegouTruco;
	}

	public void setQuemNegouTruco(Integer quemNegouTruco) {
		QuemNegouTruco = quemNegouTruco;
	}

	public Integer getQuemGanhouTruco() {
		return QuemGanhouTruco;
	}

	public void setQuemGanhouTruco(Integer quemGanhouTruco) {
		QuemGanhouTruco = quemGanhouTruco;
	}

	public Integer getTentosTruco() {
		return TentosTruco;
	}

	public void setTentosTruco(Integer tentosTruco) {
		TentosTruco = tentosTruco;
	}

	public Integer getTentosAnterioresRobo() {
		return TentosAnterioresRobo;
	}

	public void setTentosAnterioresRobo(Integer tentosAnterioresRobo) {
		TentosAnterioresRobo = tentosAnterioresRobo;
	}

	public Integer getTentosAnterioresHumano() {
		return TentosAnterioresHumano;
	}

	public void setTentosAnterioresHumano(Integer tentosAnterioresHumano) {
		TentosAnterioresHumano = tentosAnterioresHumano;
	}

	public Integer getTentosPosterioresRobo() {
		return TentosPosterioresRobo;
	}

	public void setTentosPosterioresRobo(Integer tentosPosterioresRobo) {
		TentosPosterioresRobo = tentosPosterioresRobo;
	}

	public Integer getTentosPosterioresHumano() {
		return TentosPosterioresHumano;
	}

	public void setTentosPosterioresHumano(Integer tentosPosterioresHumano) {
		TentosPosterioresHumano = tentosPosterioresHumano;
	}

	public Integer getRoboMentiuEnvido() {
		return RoboMentiuEnvido;
	}

	public void setRoboMentiuEnvido(Integer roboMentiuEnvido) {
		RoboMentiuEnvido = roboMentiuEnvido;
	}

	public Integer getHumanoMentiuEnvido() {
		return HumanoMentiuEnvido;
	}

	public void setHumanoMentiuEnvido(Integer humanoMentiuEnvido) {
		HumanoMentiuEnvido = humanoMentiuEnvido;
	}

	public Integer getRoboMentiuFlor() {
		return RoboMentiuFlor;
	}

	public void setRoboMentiuFlor(Integer roboMentiuFlor) {
		RoboMentiuFlor = roboMentiuFlor;
	}

	public Integer getHumanoMentiuFlor() {
		return HumanoMentiuFlor;
	}

	public void setHumanoMentiuFlor(Integer humanoMentiuFlor) {
		HumanoMentiuFlor = humanoMentiuFlor;
	}

	public Integer getRoboMentiuTruco() {
		return RoboMentiuTruco;
	}

	public void setRoboMentiuTruco(Integer roboMentiuTruco) {
		RoboMentiuTruco = roboMentiuTruco;
	}

	public Integer getHumanoMentiuTruco() {
		return HumanoMentiuTruco;
	}

	public void setHumanoMentiuTruco(Integer humanoMentiuTruco) {
		HumanoMentiuTruco = humanoMentiuTruco;
	}

	public Integer getQuemBaralho() {
		return QuemBaralho;
	}

	public void setQuemBaralho(Integer quemBaralho) {
		QuemBaralho = quemBaralho;
	}

	@Override
	public Attribute getIdAttribute() {
		// TODO Auto-generated method stub
		return null;
	}

	
}


