package ie.atu.week5exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
public class FeignController {
    private final FeignService feignService;

    public FeignController(FeignService feignService){
        this.feignService=feignService;
    }

    @GetMapping("/feign")
    public String getFeignData() throws Exception, InterruptedException{
        return feignService.fetchData()
    }
}
