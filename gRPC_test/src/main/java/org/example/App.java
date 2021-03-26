package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import jdk.internal.net.http.ResponseSubscribers;

import java.io.IOException;

import static com.google.gson.internal.bind.TypeAdapters.URL;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException {

       public RouteGuideServer(int 8080, URL featureFile) throws IOException {
            this(ServerBuilder.forPort(8080), port, RouteGuideUtil.parseFeatures(featureFile));
        }

/** Create a RouteGuide server using serverBuilder as a base and features as data. */
public RouteGuideServer(ServerBuilder<?> serverBuilder, int port, Collection<Feature> features) {
            this.port = port;
            server = serverBuilder.addService(new RouteGuideService(features))
                    .build();
        }

        public void start() throws IOException {
            server.start();
            logger.info("Server started, listening on " + port);

        }


    }
}
