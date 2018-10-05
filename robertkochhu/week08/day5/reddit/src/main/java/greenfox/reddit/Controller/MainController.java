package greenfox.reddit.Controller;

import greenfox.reddit.Controller.models.Post;
import greenfox.reddit.services.PostService;
import greenfox.reddit.services.PostServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    private PostService postService;

    public MainController(PostService postService) {
        this.postService = postService;
    }

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
        Iterable<Post> posts = postService.findAllByOrderByPopularDesc();
        model.addAttribute("posts", posts);
        return ("main");
    }

    @GetMapping("/main/{id}/upvote")
    public String upvoteFunction(@PathVariable(value = "id") long id) {
        postService.upvotePost(id);
        return ("redirect:/main");
    }

    @GetMapping("/main/{id}/downvote")
    public String downvoteFunction(@PathVariable(value = "id") long id) {
        postService.downvotePost(id);
        return ("redirect:/main");
    }
}