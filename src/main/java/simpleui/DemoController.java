package simpleui;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.views.View;

@Controller("/demo")
public class DemoController
{
    @View("/index")
    @Produces(MediaType.TEXT_HTML)
    @Get
    public HttpResponse<?> index() {
        return HttpResponse.ok();
    }
}
