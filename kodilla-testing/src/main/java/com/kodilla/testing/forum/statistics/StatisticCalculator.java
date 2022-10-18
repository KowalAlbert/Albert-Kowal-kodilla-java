package com.kodilla.testing.forum.statistics;

public class StatisticCalculator {
    private double numberOfUsers;
    private double numberOfPosts;
    private double numberOfComments;
    private double averageOfPostsPerUser;
    private double averageOfCommentsPerUser;
    private double averageOfCommentsPerPost;

    public StatisticCalculator (Statistics statistics) {
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();

        if (numberOfPosts > 0) {
            this.numberOfPosts = statistics.postsCount();
        }
        if (numberOfPosts <= 0) {
            this.numberOfPosts = 0;
        }

        if (numberOfComments > 0) {
            this.numberOfComments = statistics.commentsCount();
        }
        if (numberOfComments <= 0) {
            this.numberOfComments = 0;
        }

        if (numberOfUsers > 0) {
            this.averageOfPostsPerUser = numberOfPosts / numberOfUsers;
            this.averageOfCommentsPerUser = numberOfComments / numberOfUsers;
        }
        if (numberOfUsers <= 0) {
            this.averageOfPostsPerUser = 0;
            this.averageOfCommentsPerUser = 0;
        }

        if (numberOfPosts > 0) {
            this.averageOfCommentsPerPost = numberOfComments / numberOfPosts;
        }
        if (numberOfPosts <= 0) {
            this.averageOfCommentsPerPost = 0;
        }
    }

    public String showStatistics() {
        return ("Number of Users: " + numberOfUsers
        + " | Number of Posts: " + numberOfPosts
        + " | Number of Comments: " + numberOfComments
        + " | Number of Posts per User: " + averageOfPostsPerUser
        + " | Number of Comments per User: " + averageOfCommentsPerUser
        + " | Number of Comments per Post: " + averageOfCommentsPerPost);
    }
}
