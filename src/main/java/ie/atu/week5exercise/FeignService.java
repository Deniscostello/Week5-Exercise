package ie.atu.week5exercise;

public class FeignService {
    private final TodoClient todoClient;
    public FeignService(TodoClient todoClient){
        this.todoClient=todoClient;
    }

    public TodoResponse fetchData(){
        TodoResponse td = todoClient.fetchData();
        return td;
    }

    public TodoResponse fetchTodoData(){
        TodoResponse td = todoClient.fetchTodoData();
        return td;
    }
}
