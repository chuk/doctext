package com.tagcmd.model;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by matthewtomich on 17/08/2016.
 */
public class DocumentText {

    @NotBlank
    private String contentHash;

    @NotBlank
    private String documentText;

    private int customerId;

    public String getContentHash() {
        return contentHash;
    }

    public void setContentHash(String contentHash) {
        this.contentHash = contentHash;
    }

    public String getDocumentText() {
        return documentText;
    }

    public void setDocumentText(String documentText) {
        this.documentText = documentText;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public DocumentText(String contentHash, String documentText, int customerId) {
        this.contentHash = contentHash;
        this.documentText = documentText;
        this.customerId = customerId;
    }

    public DocumentText() {
    }


}
