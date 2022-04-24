package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Enrollment {
    public Long id;
    public LocalDate enrollmentDate = LocalDate.now();

    public Customer customer;
    public List<Assessment> assessments = new ArrayList<>();
//methods

    public Assessment getLastAssessment() {
      int indexLastAssessment = this.assessments.size() - 1;
      Assessment lastAssessment =  this.assessments.get(indexLastAssessment);
  return lastAssessment;

}
public Assessment getAssessmentByDate(LocalDate dateAssement) {
    Assessment assessment = this.assessments.stream()
            .filter(a -> a.getAssessmentDate().equals(dateAssement))
            .findFirst()
            .orElseThrow(() -> {
                throw new RuntimeException("Assessment not found.");
            });
    return assessment;

}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Assessment> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<Assessment> assessments) {
        this.assessments = assessments;
    }
}
