package human.resource.mgmt.api;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import human.resource.mgmt.query.*;

@RestController
public class ScheduleQueryController {

  private final QueryGateway queryGateway;

  public ScheduleQueryController(QueryGateway queryGateway) {
      this.queryGateway = queryGateway;
  }
  

  @GetMapping("/schedules")
  public CompletableFuture<List<Schedule>> findAll() {
      return queryGateway.query(new ScheduleQuery(), ResponseTypes.multipleInstancesOf(Schedule.class));
  }

}

