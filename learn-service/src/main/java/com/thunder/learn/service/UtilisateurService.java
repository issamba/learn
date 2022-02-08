package com.thunder.learn.service;

import com.thunder.learn.bvo.UtilisateurBVO;

public interface UtilisateurService {
    UtilisateurBVO authentificate(String loging, String password);
}
