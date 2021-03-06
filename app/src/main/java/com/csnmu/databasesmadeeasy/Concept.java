package com.csnmu.databasesmadeeasy;

import java.io.Serializable;
import java.util.List;

public class Concept implements Serializable {

    private String conceptTitle;
    private String conceptSummary;
    private List<Page> conceptPages;
    private int videoRawResId;
    private List<Quiz> quizList;

    public Concept() {
    }

    public Concept(String title, String summary, List<Page> pages, int videoRawResId, List<Quiz> quizzes){
        this.conceptTitle = title;
        this.conceptSummary = summary;
        this.conceptPages = pages;
        this.videoRawResId = videoRawResId;
        this.quizList = quizzes;
    }

    public String getConceptTitle() {
        return conceptTitle;
    }

    public void setConceptTitle(String conceptTitle) {
        this.conceptTitle = conceptTitle;
    }

    public String getConceptSummary() {
        return conceptSummary;
    }

    public void setConceptSummary(String conceptSummary) {
        this.conceptSummary = conceptSummary;
    }

    public List<Page> getConceptPages() {
        return conceptPages;
    }

    public void setConceptPages(List<Page> conceptPages) {
        this.conceptPages = conceptPages;
    }

    public void setVideoRawResId(int videoRawResId) {
        this.videoRawResId = videoRawResId;
    }

    public void setQuizList(List<Quiz> quizList) {
        this.quizList = quizList;
    }

    public int getVideoRawResId() {
        return videoRawResId;
    }

    public List<Quiz> getQuizList() {
        return quizList;
    }
}
