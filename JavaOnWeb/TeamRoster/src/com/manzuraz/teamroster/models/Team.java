package com.manzuraz.teamroster.models;

import java.util.ArrayList;

public class Team {
	private String team_name;
	private static int id;
	private static ArrayList<Player> players = new ArrayList<Player>();
	private static int NumOfPlayers;
	public static ArrayList<Team> teams = new ArrayList<Team>();

	public Team(String name) {
		this.team_name = name;
		id++;
		teams.add(this);
	}
	
	public void addPlayer(Player p) {
		players.add(p);
		NumOfPlayers++;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Team.id = id;
	}

	public static ArrayList<Player> getPlayers() {
		return players;
	}

	public static void setPlayers(ArrayList<Player> players) {
		Team.players = players;
	}

	public static int getNumOfPlayers() {
		return NumOfPlayers;
	}

	public static void setNumOfPlayers(int numOfPlayers) {
		NumOfPlayers = numOfPlayers;
	}
	
	public static ArrayList<Team> getTeams() {
		return teams;
	}
	
	public static Team findTeams(int id) {
		return teams.get(id);
	}
	
}
