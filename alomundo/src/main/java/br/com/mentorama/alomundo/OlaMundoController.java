package br.com.mentorama.alomundo;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/olamundo")
public class OlaMundoController {

    private final List<Message>  messages;

    public OlaMundoController() {
        this.messages = new ArrayList<>();
    }
    @GetMapping
    public List<Message> olamundo(){
        return messages;

    }
    @PostMapping
    public Integer add(@RequestBody final Message message){
        if (message.getId() == null){
            message.setId(messages.size() + 1);
        }
        messages.add(message);
        return message.getId();
    }

    @PutMapping
    public void update(@RequestBody final Message message){
        messages.stream().filter(msg -> msg.getId().equals(message.getId()))
                .forEach(msg -> msg.setMessage(message.getMessage()));

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        messages.removeIf(msg -> msg.getId().equals(id));
    }
}
