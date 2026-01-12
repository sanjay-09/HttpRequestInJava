package org.example;

public class Todo{
	private int id;
	private boolean completed;
	private String title;
	private int userId;

	public int getId(){
		return id;
	}

	public boolean isCompleted(){
		return completed;
	}

	public String getTitle(){
		return title;
	}

	public int getUserId(){
		return userId;
	}

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", completed=" + completed +
                ", title='" + title + '\'' +
                ", userId=" + userId +
                '}';
    }
}
