package id.ic.vokta.rest.service;

import id.ic.vokta.controller.WaterTankController;
import id.ic.vokta.model.WaterTankBrand;
import id.ic.vokta.model.WaterTankDetail;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("tank")
@Singleton
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class WaterTankService extends BaseService{

    @Inject
    private WaterTankController waterTankController;

    public WaterTankService() {
        log = getLogger(this.getClass());
    }

    @GET
    @Path("brands")
    public Response getTankBrandList() {
        final String methodName = "getTankBrandList";
        start(methodName);
        log.debug(methodName, "GET /tank/brands");

        List<WaterTankBrand> brands = waterTankController.getTankBrands();
        Response response = buildSuccessResponse(brands);

        completed(methodName);
        return response;
    }
    @GET
    @Path("type")
    public Response getTankType(@QueryParam("brandUid") String brandUid,
                                @QueryParam("filter") String filter) {
        final String methodName = "getTankBrandList";
        start(methodName);
        log.debug(methodName, "GET /tank/type?brandUid=" + brandUid + "&filter=" + filter);

        List<WaterTankDetail> tankType = waterTankController.getWaterTankType(brandUid, filter);

        Response response = buildSuccessResponse(tankType);

        completed(methodName);
        return response;
    }
}
