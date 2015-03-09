package ac.pusan.stem;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Marshaller;

import net.opengis.indoorgml.core.v_1_0.IndoorFeaturesType;
import net.opengis.indoorgml.core.v_1_0.ObjectFactory;

public class TestMain {

	IndoorFeaturesType mIndoorGMLFeature;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestMain testMain = new TestMain();
		
		JFileChooser open = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter( "IndoorGML Document", "gml" );
		open.setFileFilter(filter);
		int result = open.showOpenDialog(null);
		if( result == JFileChooser.CANCEL_OPTION ) {
			System.exit(1);
		}
		File input = open.getSelectedFile();
		
		testMain.unMarshall(input);
		testMain.marshall();
	}
	
	public void unMarshall(File xmlFile) throws Exception {
		JAXBContext jaxbContext = JAXBContext.newInstance("net.opengis.indoorgml.core.v_1_0");
		mIndoorGMLFeature = (IndoorFeaturesType) JAXBIntrospector.getValue( jaxbContext.createUnmarshaller().unmarshal(xmlFile));
		//mIndoorGMLFeature = ((JAXBElement<IndoorFeaturesType>)jaxbContext.createUnmarshaller().unmarshal(xmlFile)).getValue();
	}

	public void marshall() throws Exception {
		JAXBContext jaxbContext = JAXBContext.newInstance("net.opengis.indoorgml.core.v_1_0");
		ObjectFactory factory = new ObjectFactory();
		
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.opengis.net/indoorgml/1.0/navigation indoorgmlnavi.xsd");
		
		
		IndoorFeaturesType indoorGMLFeature = factory.createIndoorFeaturesType();
		
		indoorGMLFeature.setBoundedBy( mIndoorGMLFeature.getBoundedBy() );
		indoorGMLFeature.setDescription( mIndoorGMLFeature.getDescription() );
		indoorGMLFeature.setDescriptionReference( mIndoorGMLFeature.getDescriptionReference() );
		indoorGMLFeature.setId( mIndoorGMLFeature.getId() );
		indoorGMLFeature.setIdentifier( mIndoorGMLFeature.getIdentifier() );
		indoorGMLFeature.setLocation( mIndoorGMLFeature.getLocation() );
		indoorGMLFeature.setMultiLayeredGraph( mIndoorGMLFeature.getMultiLayeredGraph() );
		indoorGMLFeature.setPrimalSpaceFeatures( mIndoorGMLFeature.getPrimalSpaceFeatures() );

		JAXBElement<IndoorFeaturesType> je = factory.createIndoorFeatures(indoorGMLFeature);
		
		JFileChooser save = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter( "IndoorGML Document", "gml" );
		save.setFileFilter(filter);
		int result = save.showSaveDialog(null);
		if( result == JFileChooser.CANCEL_OPTION ) {
			System.exit(1);
		}
		File output = save.getSelectedFile();

		marshaller.marshal(je, output);
		
	}

}
