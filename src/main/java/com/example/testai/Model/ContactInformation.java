package com.example.testai.Model;

import jakarta.persistence.Embeddable;

@Embeddable
public class ContactInformation {
    private String email;

    private String mobile;

    private String twitter;

    private String instagram;
}