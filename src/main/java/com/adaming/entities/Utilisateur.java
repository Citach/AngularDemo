package com.adaming.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Utilisateur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nom;
private String prenom;
@ManyToMany()
@JoinTable(name="profil", joinColumns=@JoinColumn(name="id"), inverseJoinColumns=@JoinColumn(name="idRole"))
private Set<Role> roles= new HashSet<>();
public Utilisateur(Long id, String nom, String prenom) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
}

public Utilisateur(Long id, String nom, String prenom, Set<Role> roles) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.roles = roles;
}

public Utilisateur(String nom, String prenom, Set<Role> roles) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.roles = roles;
}

public Utilisateur() {
	super();
}
public Utilisateur(String nom, String prenom) {
	super();
	this.nom = nom;
	this.prenom = prenom;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public Set<Role> getRoles() {
	return roles;
}

public void setRoles(Set<Role> roles) {
	this.roles = roles;
}


}
