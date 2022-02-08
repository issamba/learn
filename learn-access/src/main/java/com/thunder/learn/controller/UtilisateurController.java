package com.thunder.learn.controller;

import com.thunder.learn.endpoint.rest.UtilisateurEndpoint;
import com.thunder.learn.service.UtilisateurService;
import com.thunder.learn.wvo.AdminWVO;
import com.thunder.learn.wvo.MembreWVO;
import com.thunder.learn.wvo.UtilisateurWVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController extends BaseController implements UtilisateurEndpoint {

    @Autowired
    private UtilisateurService utilisateurService;

    @Override
    public MembreWVO createMembre(MembreWVO membre) {
        return null;
    }

    @Override
    public AdminWVO createAdmin(AdminWVO membre) {
        return null;
    }

    @Override
    public UtilisateurWVO authentificate(@RequestParam String login,@RequestParam String password) {
        return bvoToWvo(utilisateurService.authentificate(login, password), UtilisateurWVO.class);
    }
}
