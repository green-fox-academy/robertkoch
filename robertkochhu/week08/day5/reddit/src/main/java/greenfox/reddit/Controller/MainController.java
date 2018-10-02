package greenfox.reddit.Controller;

import greenfox.reddit.Controller.models.Post;
import greenfox.reddit.services.PostService;
import greenfox.reddit.services.PostServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    private PostService postService;

    public MainController(PostService postService) {
        this.postService = postService;
    }

    /*@GetMapping("/main")
    public String mainPage() {
        return ("main");
    }*/
    @GetMapping("/add")
    public String addPage() {
        return ("add");
    }

    @PostMapping("/submit")
    public String addNew(Model model, String submitLink, String submitTitle) {
        postService.create(submitTitle, submitLink);

        return "redirect:/main";
    }

    @GetMapping("/main")
    public String mainPage(Model model) {
        Iterable<Post> posts = postService.findAll();
        model.addAttribute("posts", posts);
        return ("main");
    }
    /*@PostMapping("/upvote")
    public String upVote(Model model){
        model.addAttribute("upvote",)
        return("redirect:/main");
    }*/
}