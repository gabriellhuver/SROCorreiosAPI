# SROCorreiosAPI
Api em Java para rastreamento de objetos
Como usar
  

	SROCorreiosAPI correiosAPI = new SROCorreiosAPI();
	String searchObject = correiosAPI.SearchObject("PP999999999BR");
	System.out.println(searchObject);
	
	
	Adcionado metodo que retorna um Document
	public Document searchObjectTomlDocument(String objecto);

Download .Jar file: https://github.com/gabriellhuver/SROCorreiosAPI/blob/master/build/SROCorreiosSOAP-0.0.1-SNAPSHOT.jar
