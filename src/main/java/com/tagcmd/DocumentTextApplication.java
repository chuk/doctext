package com.tagcmd;

import com.tagcmd.resources.DocumentTextResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DocumentTextApplication extends Application<DocumentTextConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DocumentTextApplication().run(args);
    }

    @Override
    public String getName() {
        return "DocumentText";
    }

    @Override
    public void initialize(final Bootstrap<DocumentTextConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DocumentTextConfiguration configuration,
                    final Environment environment) {

        environment
                .jersey()
                .register(new DocumentTextResource());

    }

}
