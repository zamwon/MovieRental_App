package pl.sda.zdjavapol4.moviesrentalwebapp.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import pl.sda.zdjavapol4.moviesrentalwebapp.service.MovieService;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MovieController {


    private final MovieService movieService;


}
