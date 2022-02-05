package com.thunder.learn.endpoint.rest;

import com.thunder.learn.wvo.AdminWVO;
import com.thunder.learn.wvo.MembreWVO;

public interface UtilisateurEndpoint {

    MembreWVO createMembre(MembreWVO membre);
    AdminWVO createAdmin(MembreWVO membre);
}
