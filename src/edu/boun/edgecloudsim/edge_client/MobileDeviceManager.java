package edu.boun.edgecloudsim.edge_client;

import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.UtilizationModel;

import edu.boun.edgecloudsim.utils.TaskProperty;
//DatacenterBroker:  is responsible for mediating negotiations between SaaS and Cloud providers;
//and such negotiations are driven by QoS requirements. It acts on behalf of applications.
//It discovers suitable Cloud service providers by querying the CIS and undertakes online
//negotiations for allocation of resources/services that can meet the application’s QoS needs.
//Researchers and system developers must extend this class for evaluating and testing custom
//brokering policies. The broker represents the customer (i.e. decisions of these components
//are made in order to increase user-related performance metrics), whereas the CloudCoordinator
//acts on behalf of the data center, i.e. it tries to maximize the overall performance of
//the data center, without considering the needs of specific customers.
public abstract class MobileDeviceManager  extends DatacenterBroker {

	public MobileDeviceManager() throws Exception {
		super("Global_Broker");
	}
	
	/*
	 * initialize mobile device manager if needed
	 */
	public abstract void initialize();
	
	/*
	 * provides abstract CPU Utilization Model
	 */
	public abstract UtilizationModel getCpuUtilizationModel();
	
	public abstract void submitTask(TaskProperty edgeTask);
}
