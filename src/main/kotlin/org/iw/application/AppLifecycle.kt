package org.iw.application

import org.jboss.logging.Logger
import javax.enterprise.context.ApplicationScoped
import io.quarkus.runtime.ShutdownEvent
import javax.enterprise.event.Observes
import io.quarkus.runtime.StartupEvent

@ApplicationScoped
class AppLifecycle {
    private val logger = Logger.getLogger(AppLifecycle::class.java)


    fun onStart(@Observes ev: StartupEvent) {
        logger.info("The application is starting...")

    }

    fun onStop(@Observes ev: ShutdownEvent) {
        logger.info("The application is stopping...")
    }
}
