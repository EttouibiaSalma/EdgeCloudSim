/*
 * Title:        EdgeCloudSim - Scenarion Factory interface
 * 
 * Description: 
 * ScenarioFactory responsible for providing customizable components
 * such as  Network Model, Mobility Model, Edge Orchestrator.
 * This interface is very critical for using custom models on EdgeCloudSim
 * This interface should be implemented by EdgeCloudSim users
 * 
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 * Copyright (c) 2017, Bogazici University, Istanbul, Turkey
 */

package edu.boun.edgecloudsim.core;

import edu.boun.edgecloudsim.cloud_server.CloudServerManager;
import edu.boun.edgecloudsim.edge_client.MobileDeviceManager;
import edu.boun.edgecloudsim.edge_client.mobile_processing_unit.MobileServerManager;
import edu.boun.edgecloudsim.edge_orchestrator.EdgeOrchestrator;
import edu.boun.edgecloudsim.edge_server.EdgeServerManager;
import edu.boun.edgecloudsim.mobility.MobilityModel;
import edu.boun.edgecloudsim.task_generator.LoadGeneratorModel;
import edu.boun.edgecloudsim.network.NetworkModel;
// The core simulation module is responsible for loading
// and running the Edge Computing scenarios from the configuration files.
// In addition, it offers a logging mechanism to save the simulation results
// into the files. The results are saved in (CSV) data format by default.
/** **************** LOOK DOWN ************************** **/
public interface ScenarioFactory {
	//  The Java version returns a reference to a class object
	/**
	 * provides abstract Load Generator Model
	 */
	public LoadGeneratorModel getLoadGeneratorModel();

	/**
	 * provides abstract Edge Orchestrator
	 */
	public EdgeOrchestrator getEdgeOrchestrator();

	/**
	 * provides abstract Mobility Model
	 */
	public MobilityModel getMobilityModel();

	/**
	 * provides abstract Network Model
	 */
	public NetworkModel getNetworkModel();

	/**
	 * provides abstract Edge Server Model
	 */
	public EdgeServerManager getEdgeServerManager();

	/**
	 * provides abstract Cloud Server Model
	 */
	public CloudServerManager getCloudServerManager();

	/**
	 * provides abstract Mobile Server Model
	 */
	public MobileServerManager getMobileServerManager();

	/**
	 * provides abstract Mobile Device Manager Model
	 */
	public MobileDeviceManager getMobileDeviceManager() throws Exception;
}
//Le motif de conception Abstract Factory (fabrique abstraite) permet de fournir
// une interface unique pour instancier des objets d'une même famille sans avoir
// à connaître les classes à instancier.
//L'utilisation de ce motif est pertinente lorsque :
//Le système doit être indépendant de la création des objets qu'il utilise
//Le système doit être capable de créer des objets d'une même famille
//Le principal avantage de ce motif de conception est d'isoler la création
// des objets retournés par la fabrique. L'utilisation d'une fabrique abstraite
// permet de facilement remplacer une fabrique par une autre selon les besoins.
