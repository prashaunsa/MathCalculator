package pjn.math.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pjn.math.exception.InvalidOperationInputException;
import pjn.math.interfaces.Operation;
import pjn.math.model.OperationFactory;
import pjn.math.util.Constants;



@Path("/calculator")
public class MathCalculatorController {
	
	private static Logger logger = LoggerFactory.getLogger(MathCalculatorController.class);
	
	OperationFactory operationFactory = new OperationFactory();
	Operation operation;

	@GET
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)  
    public Response add(@QueryParam("operand1") Float operand1, @QueryParam("operand2") Float operand2)
    {
		logger.debug("Operand1 : {} | Operand2: {}", new Object[] {operand1, operand2});
		
		JSONObject response = new JSONObject();
		try {			
		
			operation = operationFactory.getOperation(Constants.OPERATION_ADD);
			response.put(Constants.RESPONSE_PARAM_OPERATION_RESULT, operation.calculate(operand1, operand2));
			
			logger.debug("Response : {}", response);
			
	        return Response.status(Response.Status.OK).entity(response.toString()).build();
	        
		} catch (InvalidOperationInputException e) {
			logger.error(e.getMessage(), e);
			response.put(Constants.RESPONSE_PARAM_OPERATION_ERROR, e.getMessage());
			return Response.status(Response.Status.BAD_REQUEST).entity(response.toString()).build();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			response.put(Constants.RESPONSE_PARAM_OPERATION_ERROR, Constants.INTERVAL_SERVER_ERROR);
			return Response.status(Response.Status.BAD_REQUEST).entity(response.toString()).build();
		}
    }
	
	@GET
	@Path("/subtract")
	@Produces(MediaType.APPLICATION_JSON)  
    public Response subtract(@QueryParam("operand1") Float operand1, @QueryParam("operand2") Float operand2)
    {
		logger.debug("Operand1 : {} | Operand2: {}", new Object[] {operand1, operand2});
		JSONObject response = new JSONObject();
		try {			
		
			operation = operationFactory.getOperation(Constants.OPERATION_SUBTRACT);
			response.put(Constants.RESPONSE_PARAM_OPERATION_RESULT, operation.calculate(operand1, operand2));
			
			logger.debug("Response : {}", response);
	        return Response.status(Response.Status.OK).entity(response.toString()).build();
	        
		} catch (InvalidOperationInputException e) {
			logger.error(e.getMessage(), e);
			response.put(Constants.RESPONSE_PARAM_OPERATION_ERROR, e.getMessage());
			return Response.status(Response.Status.BAD_REQUEST).entity(response.toString()).build();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			response.put(Constants.RESPONSE_PARAM_OPERATION_ERROR, Constants.INTERVAL_SERVER_ERROR);
			return Response.status(Response.Status.BAD_REQUEST).entity(response.toString()).build();
		}
    }
	
	@GET
	@Path("/multiply")
	@Produces(MediaType.APPLICATION_JSON)  
    public Response multiply(@QueryParam("operand1") Float operand1, @QueryParam("operand2") Float operand2)
    {
		logger.debug("Operand1 : {} | Operand2: {}", new Object[] {operand1, operand2});
		JSONObject response = new JSONObject();
		try {			
		
			operation = operationFactory.getOperation(Constants.OPERATION_MULTIPLY);
			response.put(Constants.RESPONSE_PARAM_OPERATION_RESULT, operation.calculate(operand1, operand2));
			
			logger.debug("Response : {}", response);
	        return Response.status(Response.Status.OK).entity(response.toString()).build();
	        
		} catch (InvalidOperationInputException e) {
			logger.error(e.getMessage(), e);
			response.put(Constants.RESPONSE_PARAM_OPERATION_ERROR, e.getMessage());
			return Response.status(Response.Status.BAD_REQUEST).entity(response.toString()).build();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			response.put(Constants.RESPONSE_PARAM_OPERATION_ERROR, Constants.INTERVAL_SERVER_ERROR);
			return Response.status(Response.Status.BAD_REQUEST).entity(response.toString()).build();
		}
    }
	
	@GET
	@Path("/divide")
	@Produces(MediaType.APPLICATION_JSON)  
    public Response divide(@QueryParam("operand1") Float operand1, @QueryParam("operand2") Float operand2)
    {
		logger.debug("Operand1 : {} | Operand2: {}", new Object[] {operand1, operand2});
		JSONObject response = new JSONObject();
		try {			
		
			operation = operationFactory.getOperation(Constants.OPERATION_DIVIDE);
			response.put(Constants.RESPONSE_PARAM_OPERATION_RESULT, operation.calculate(operand1, operand2));
			
			logger.debug("Response : {}", response);
	        return Response.status(Response.Status.OK).entity(response.toString()).build();
	        
		} catch (InvalidOperationInputException e) {
			logger.error(e.getMessage(), e);
			response.put(Constants.RESPONSE_PARAM_OPERATION_ERROR, e.getMessage());
			return Response.status(Response.Status.BAD_REQUEST).entity(response.toString()).build();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			response.put(Constants.RESPONSE_PARAM_OPERATION_ERROR, Constants.INTERVAL_SERVER_ERROR);
			return Response.status(Response.Status.BAD_REQUEST).entity(response.toString()).build();
		}
    }
}
