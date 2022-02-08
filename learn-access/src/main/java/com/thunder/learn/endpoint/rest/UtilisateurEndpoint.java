package com.thunder.learn.endpoint.rest;

import com.thunder.learn.wvo.AdminWVO;
import com.thunder.learn.wvo.MembreWVO;
import com.thunder.learn.wvo.UtilisateurWVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface UtilisateurEndpoint {

    MembreWVO createMembre(MembreWVO membre);

    AdminWVO createAdmin(AdminWVO membre);

    @GetMapping("/authentificate")
    UtilisateurWVO authentificate(@RequestParam String login, @RequestParam String password);
}
