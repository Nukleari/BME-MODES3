package hu.bme.mit.inf.modes3.messaging.communication.factory

import hu.bme.mit.inf.modes3.components.util.jopt.ArgumentRegistry
import hu.bme.mit.inf.modes3.messaging.mms.MessagingService
import hu.bme.mit.inf.modes3.messaging.mms.dispatcher.ProtobufMessageDispatcher
import hu.bme.mit.inf.modes3.transports.config.loaders.ArgumentBasedTransportConfigurationLoader
import hu.bme.mit.inf.modes3.transports.mqtt.MQTTTransport
import org.slf4j.ILoggerFactory

class CommunicationStackFactory {

	def static createMQTTStack(ArgumentRegistry argumentRegistry, ILoggerFactory factory) {
		return new CommunicationStack(
			new MessagingService(factory),
			new MQTTTransport(ArgumentBasedTransportConfigurationLoader.loadMQTTConfiguration(argumentRegistry), factory),
			new ProtobufMessageDispatcher(factory)
		)
	}

}
