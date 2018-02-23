package main;

import java.io.OutputStreamWriter;
import java.net.URLConnection;

import net.doPost;
import util.PostBuilder;

/**
 * @author = Gabriell Huver
 * @category = API
 * @since = 2/22/2018
 * @version = 1 Api em SOAP desenvolvido com base no manual do Web Service do
 *          Correios
 * @see <a> https://github.com/gabriellhuver/SROCorreiosAPI <a>
 *      {@link} https://github.com/gabriellhuver/SROCorreiosAPI
 */

public class SROCorreiosAPI {

	/**
	 * @param Codigo
	 *            de rastreamento
	 * @return Xml contendo os dados em forma de String
	 */
	public String SearchObject(String objecto) {
		String response = null;
		try {
			URLConnection conn = doPost.createURLConnection();
			OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
			String xml = PostBuilder.buildStringPostSingleObject(objecto);
			response = doPost.DoPost(conn, wr, xml);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return response;
	}

}
