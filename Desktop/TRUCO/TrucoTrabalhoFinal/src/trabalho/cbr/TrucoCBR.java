package trabalho.cbr;

import java.util.Collection;

import jcolibri.casebase.LinealCaseBase;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.connector.PlainTextConnector;
import jcolibri.exception.ExecutionException;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Interval;
import jcolibri.method.retrieve.NNretrieval.similarity.local.ontology.OntCosine;
import jcolibri.method.retrieve.selection.SelectCases;
import jcolibri.test.test5.Region;
import jcolibri.test.test5.TravelDescription;
import jcolibri.util.*;

public class TrucoCBR {
	Connector _connector;
	CBRCaseBase _caseBase;
	TrucoDescription current_best_case = null;
	TrucoDescription current_worst_case = null;


int current_tipo_consulta = 0;
static final int DEFAULT = 0;
static final int ENVIDO = 1;
static final int TRUCO = 2;
static final int CARTA = 3;


//inicialize
public void configure() throws ExecutionException {
	
	try {
		_connector = new PlainTextConnector();
		_connector.initFromXMLfile(jcolibri.util.FileIO.findFile("TrucoTrabalhoFinal/src/trabalho.cbr/plaintextconfig.xml"));
		_caseBase = new LinealCaseBase();
	} catch (Exception e) {
		throw new ExecutionException(e);
	}
}

//openconnection
 public CBRCaseBase preCycle() throws ExecutionException {
	 _caseBase.init(_connector);
	
	 return _caseBase;
 }

 //execute Query
 public Collection<RetrievalResult> executeQuery(CBRQuery query, int tipoConsulta) throws ExecutionException{
	 NNConfig simConfig = new NNConfig();
	 simConfig.setDescriptionSimFunction(new Average());
	 
	// PesosConsulta pesos = new PesosConsulta();
	//if (tipoConsulta == ENVIDO) {
	//	 pesos.setPesosEnvido();
	// } else if (tipoConsulta == TRUCO) {
	//	 pesos.setPesosTruco();
	// } else if (tipoConsulta == CARTA) {
	//	 pesos.setPesosCarta();
	// } else {
	//	 pesos.setPesosDefault();
	// }
	
	 
	 
	Attribute JogadorMao = new Attribute("JogadorMao", TrucoDescription.class);
	simConfig.addMapping(JogadorMao, new Equal());
	simConfig.setWeight(JogadorMao, 1.0);
	
	Attribute CartaAltaRobo = new Attribute("CartaAltaRobo", TrucoDescription.class);
	simConfig.addMapping(CartaAltaRobo, new Interval(130));
	simConfig.setWeight(CartaAltaRobo, 1.0);
	
	Attribute CartaMediaRobo = new Attribute("CartaMediaRobo", TrucoDescription.class);
	simConfig.addMapping(CartaMediaRobo, new Interval(130));
	simConfig.setWeight(CartaMediaRobo, 1.0);
	
	Attribute CartaBaixaRobo = new Attribute("CartaBaixaRobo", TrucoDescription.class);
	simConfig.addMapping(CartaBaixaRobo, new Interval(130));
	simConfig.setWeight(CartaBaixaRobo, 1.0);
	
	
	
	simConfig.addMapping(new Attribute("HolidayType", TrucoDescription.class), new Equal());
	simConfig.addMapping(new Attribute("NumberOfPersons", TravelDescription.class), new Equal());
	
	// Configure the OntCosine() function for the similarity of Season
	simConfig.addMapping(new Attribute("Season", TravelDescription.class), new OntCosine());
	
	simConfig.addMapping(new Attribute("Region",   TravelDescription.class), new Average());
	simConfig.addMapping(new Attribute("region",   Region.class), new Equal());
	simConfig.addMapping(new Attribute("city",     Region.class), new Equal());
	simConfig.addMapping(new Attribute("airport",  Region.class), new Equal());
	simConfig.addMapping(new Attribute("currency", Region.class), new Equal());

	
	System.out.println("Query:");
	System.out.println(query);
	System.out.println();
	
	
 }
 public void postCycle() throws ExecutionException {
		this._caseBase.close();

	}
 
 public int ConsultaEnvido(TrucoDescription gamestate, int rodada) {
	 System.out.println("Consultando Envido");
	 
	 TrucoDescription best = getBestResult(gamestate, ENVIDO);
	 int alta = best.getCartaAltaRobo();
	 int media = best.getCartaMediaRobo();
	 int baixa = best.getCartaBaixaRobo();
	 
	 
	 
	 
 }
 
	 	 
Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(_caseBase.getCases(), query, simConfig){
	eval = SelectCases.selectTopKRR(eval, 5);
	
	return eval;
}
 
 
private TrucoDescription getBestResult (TrucoDescription game_state, int tipoConsulta) {
	
	boolean nova_consulta = true;
	// verifica se o estado atual ja foi setado
	if (current_best_case != null) {
		
		boolean the_same = game_state.equals(current_game_state);
		if (the_same && (tipoConsulta = current_tipo_consulta)) {
			nova_consulta = false;
		}
	}
	if (nova_consulta) {
		System.out.println("Fazendo nova consulta");
		try {
			CBRQuery query = new CBRQuery();
			query.setDescription(game_state);
			Collection<RetrievalResult> results = executeQuery(query, tipoConsulta);
			current_best_case = (TrucoDescription) results.iterator().next().get_case().getDescription();
			System.out.println("melhor encontrado:"+current_best_case.CASEID);
			System.out.println("com similaridade"+results.iterator().next().getEval());
		} catch (ExecutionException e) {
				org.apache.commons.logging.LogFactory.getLog(TrucoCBR.class).error(e);
			}
		}
		current_game_state = new TrucoDescription(game_state);
		current_tipo_consulta = tipoConsulta;
		return current_best_case;
	}
}
}
