/*
 * Title:        EdgeCloudSim - Edge Orchestrator
 * 
 * Description: 
 * EdgeOrchestrator is an abstract class which is used for selecting VM
 * for each client requests. For those who wants to add a custom 
 * Edge Orchestrator to EdgeCloudSim should extend this class and provide
 * a concrete instance via ScenarioFactory
 *               
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 * Copyright (c) 2017, Bogazici University, Istanbul, Turkey
 */

package edu.boun.edgecloudsim.edge_orchestrator;

import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.core.SimEntity;

import edu.boun.edgecloudsim.edge_client.Task;
// The edge orchestrator module is the decision maker of the system.
// It uses the information collected from the other modules to decide
// how and where to handle incoming client requests.
// In the first version, we simply use a probabilistic approach to decide
// where to handle incoming tasks,but more realistic edge orchestrator
// can be added by extending this class.
public abstract class EdgeOrchestrator extends SimEntity{
	protected String policy;
	protected String simScenario;
	
	public EdgeOrchestrator(String _policy, String _simScenario){
		super("EdgeOrchestrator");
		policy = _policy;
		simScenario = _simScenario;
	}

	/*
	 * Default Constructor: Creates an empty EdgeOrchestrator
	 */
	public EdgeOrchestrator() {
        	super("EdgeOrchestrator");
	}

	/*
	 * initialize edge orchestrator if needed
	 */
	public abstract void initialize();
	
	/*
	 * decides where to offload
	 */
	public abstract int getDeviceToOffload(Task task);
	
	/*
	 * returns proper VM from the edge orchestrator point of view
	 */
	public abstract Vm getVmToOffload(Task task, int deviceId);
}
