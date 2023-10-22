package ie.atu.week5exercise;

import org.springframework.stereotype.Service;

@Service
public class FeignService {
    private final TodoClient todoClient;
    public FeignService(TodoClient todoClient){
        this.todoClient=todoClient;
    }

    public TodoResponse fetchData(){
        TodoResponse td = todoClient.fetchData();
        return td;
    }
}
