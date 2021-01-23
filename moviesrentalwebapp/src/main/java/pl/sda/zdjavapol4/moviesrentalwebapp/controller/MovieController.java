package pl.sda.zdjavapol4.moviesrentalwebapp.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.sda.zdjavapol4.moviesrentalwebapp.model.Genre;
import pl.sda.zdjavapol4.moviesrentalwebapp.service.MovieService;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MovieController {


    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping({"/movies"})
    public String getMovieIndex(Model model){
        model.addAttribute("movies", movieService.getAll());
        return "movies/index";
    }

    @GetMapping({"/movies/action"})
    public String getAction(Model model){
        model.addAttribute("genre", Genre.ACTION);
        model.addAttribute("movies", movieService.findByGenre(Genre.ACTION));
        return "movies/action";
    }

    @GetMapping(value = "/movies/action/delete") //Todo update?
    public String deleteAction(@RequestParam Long id, Model model){
        movieService.delete(id);
        return "redirect:/movies/action";
    }

    @GetMapping({"/movies/delete"})
    public String deleteMoviesFromAll(@RequestParam Long id, Model model){
        movieService.delete(id);
        return "redirect:/movies";
    }

    @GetMapping({"/movies/biographical"})
    public String getBiographical(Model model){
        model.addAttribute("genre", Genre.BIOGRAPHICAL);
        model.addAttribute("movies", movieService.findByGenre(Genre.BIOGRAPHICAL));
        return "movies/biographical";
    }

    @GetMapping(value = "/movies/biographical/delete") //Todo update?
    public String deleteBiographical(@RequestParam Long id, Model model){
        movieService.delete(id);
        return "redirect:/movies/biographical";
    }

    @GetMapping({"/movies/catastrophic"})
    public String getCatastrophic(Model model){
        model.addAttribute("genre", Genre.CATASTROPHIC);
        model.addAttribute("movies", movieService.findByGenre(Genre.CATASTROPHIC));
        return "movies/catastrophic";
    }

    @GetMapping(value = "/movie/catastrophic/delete") //Todo update?
    public String deletedCatastrophic(@RequestParam Long id, Model model){
        movieService.delete(id);
        return "redirect:/movies/catastrophic";
    }

    @GetMapping({"/movies/documentary"})
    public String getDocumentary(Model model){
        model.addAttribute("genre", Genre.DOCUMENTARY);
        model.addAttribute("movies", movieService.findByGenre(Genre.DOCUMENTARY));
        return "movies/documentary";
    }

    @GetMapping(value = "/movies/documentary/delete") //Todo update?
    public String deletedDocumentary (@RequestParam Long id, Model model){
        movieService.delete(id);
        return "redirect:/movies/documentary";
    }

    @GetMapping({"/movies/drama"})
    public String getDrama(Model model){
        model.addAttribute("genre", Genre.DRAMA);
        model.addAttribute("movies", movieService.findByGenre(Genre.DRAMA));
        return "movies/drama";
    }

    @GetMapping(value = "movies/drama/delete") //Todo update?
    public String deletedDrama(@RequestParam Long id, Model model){
        movieService.delete(id);
        return "redirect:/movies/drama";
    }

    @GetMapping({"/movies/fantasy"})
    public String getFantasy(Model model){
        model.addAttribute("genre", Genre.FANTASY);
        model.addAttribute("movies", movieService.findByGenre(Genre.FANTASY));
        return "movies/drama";
    }

    @GetMapping(value = "movies/fantasy/delete") //Todo update?
    public String deletedFantasy(@RequestParam Long id, Model model){
        movieService.delete(id);
        return "redirect:/movies/fantasy";
    }

    @GetMapping({"/movies/historical"})
    public String getHistorical(Model model){
        model.addAttribute("genre", Genre.HISTORICAL);
        model.addAttribute("movies", movieService.findByGenre(Genre.HISTORICAL));
        return "movies/historical";
    }

    @GetMapping(value = "movies/historical/delete") //Todo update?
    public String deletedHistorical(@RequestParam Long id, Model model){
        movieService.delete(id);
        return "redirect:/movies/historical";
    }

    @GetMapping({"/movies/horror"})
    public String getHorror (Model model){
        model.addAttribute("genre", Genre.HORROR);
        model.addAttribute("movies", movieService.findByGenre(Genre.HORROR));
        return "movies/horror";
    }

    @GetMapping(value = "movies/horror/delete") //Todo update?
    public String deletedHorror(@RequestParam Long id, Model model){
        movieService.delete(id);
        return "redirect:/movies/horror";
    }

    @GetMapping({"/movies/kids"})
    public String getKids (Model model){
        model.addAttribute("genre", Genre.KIDS);
        model.addAttribute("movies", movieService.findByGenre(Genre.KIDS));
        return "movies/kids";
    }

    @GetMapping(value = "movies/kids/delete") //Todo update?
    public String deletedKids(@RequestParam Long id, Model model){
        movieService.delete(id);
        return "redirect:/movies/kids";
    }
    @GetMapping({"/movies/romance"})
    public String getRomance (Model model){
        model.addAttribute("genre", Genre.ROMANCE);
        model.addAttribute("movies", movieService.findByGenre(Genre.ROMANCE));
        return "movies/romance";
    }

    @GetMapping(value = "movies/romance/delete") //Todo update?
    public String deletedRomance(@RequestParam Long id, Model model){
        movieService.delete(id);
        return "redirect:/movies/romance";
    }
    @GetMapping({"/movies/sciFi"})
    public String getSciFi (Model model){
        model.addAttribute("genre", Genre.SCI_FI);
        model.addAttribute("movies", movieService.findByGenre(Genre.SCI_FI));
        return "movies/sciFi";
    }

    @GetMapping(value = "movies/sciFi/delete") //Todo update?
    public String deletedSciFi(@RequestParam Long id, Model model){
        movieService.delete(id);
        return "redirect:/movies/sciFi";
    }
    @GetMapping({"/movies/thriller"})
    public String getThriller (Model model){
        model.addAttribute("genre", Genre.THRILLER);
        model.addAttribute("movies", movieService.findByGenre(Genre.THRILLER));
        return "movies/thriller";
    }

    @GetMapping(value = "movies/thriller/delete") //Todo update?
    public String deletedThiller(@RequestParam Long id, Model model){
        movieService.delete(id);
        return "redirect:/movies/thriller";
    }
    @GetMapping({"/movies/western"})
    public String getWestern (Model model){
        model.addAttribute("genre", Genre.WESTERN);
        model.addAttribute("movies", movieService.findByGenre(Genre.WESTERN));
        return "movies/western";
    }

    @GetMapping(value = "movies/western/delete") //Todo update?
    public String deletedWestern(@RequestParam Long id, Model model){
        movieService.delete(id);
        return "redirect:/movies/western";
    }

}
