/* Copyright (C) 2016 MINHAP, Gobierno de España
   This program is licensed and may be used, modified and redistributed under the terms
   of the European Public License (EUPL), either version 1.1 or (at your
   option) any later version as soon as they are approved by the European Commission.
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
   or implied. See the License for the specific language governing permissions and
   more details.
   You should have received a copy of the EUPL1.1 license
   along with this program; if not, you may find it at
   http://joinup.ec.europa.eu/software/page/eupl/licence-eupl */

package es.mpt.dsic.inside.util.xml;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import es.mpt.dsic.inside.xml.inside.MetadatoAdicional;
import es.mpt.dsic.inside.xml.inside.TipoMetadatosAdicionales;

/**
 * Handler para expedientes
 * 
 * @author jcamacho
 * 
 */
public class HandlerExpedient extends DefaultHandler {

	private StringBuilder value;
	private TipoMetadatosAdicionales metadatosAdicionales;
	private MetadatoAdicional metadatoAdicional;

	/**
	 * Parse de documento.
	 * Parsea también Metadatos adicionales con origen Archive (eniexpmeta:metadatoAdicional)
	 * 
	 * @param is
	 *            inputStream
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws UtilException
	 *             en caso de error
	 */
	public HandlerExpedient(InputStream is) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser;
		parser = factory.newSAXParser();
		parser.parse(is, this);
	}

	/**
	 * Crea el objeto documento
	 */
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		value = new StringBuilder();
		String[] elements = qName.split(":");
		String element = elements[elements.length - 1];
		if (element.equals("metadatosAdicionales")) {
			metadatosAdicionales = new TipoMetadatosAdicionales();
		}
		if (element.equals("MetadatoAdicional")) {
			metadatoAdicional = new MetadatoAdicional();
			metadatoAdicional.setNombre(attributes.getValue("nombre"));
			metadatoAdicional.setTipo(attributes.getValue("tipo"));
		}
		if (element.equals("metadatoAdicional")) {
			metadatoAdicional = new MetadatoAdicional();
			metadatoAdicional.setNombre(attributes.getValue("id"));
			metadatoAdicional.setTipo("string");
		}
	}

	/**
	 * 
	 */
	public void endElement(String uri, String localName, String qName) throws SAXException {
		String[] elements = qName.split(":");
		String element = elements[elements.length - 1];
		if (element.equals("valor")) {
			metadatoAdicional.setValor(value.toString());
		}
		if (element.equals("metadatoAdicional")) {
			metadatoAdicional.setValor(value.toString());
			metadatosAdicionales.getMetadatoAdicional().add(metadatoAdicional);
		}
		if (element.equals("MetadatoAdicional")) {
			metadatosAdicionales.getMetadatoAdicional().add(metadatoAdicional);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) {
		if (length == 0)
			return;
		int end = (start + length) - 1;
		while (ch[start] <= '\u0020') {
			if (start == end)
				return;
			start++;
			length--;
		}
		while (ch[end] <= '\u0020') {
			if (end == start)
				return;
			length--;
			end--;
		}
		value.append(ch, start, length);
	}

	public TipoMetadatosAdicionales getMetadatosAdicionales() {
		return metadatosAdicionales;
	}

}
