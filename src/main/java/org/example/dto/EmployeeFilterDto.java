package org.example.dto;

import jakarta.ws.rs.QueryParam;

public class EmployeeFilterDto {

    @QueryParam("depId") Integer depId;
    @QueryParam("limit") Integer limit;
    @QueryParam("offset") int offset;
    @QueryParam("JobId") Integer JobId;
    @QueryParam("HireDate") String HireDate;

    public String HireDate() {

        return HireDate;
    }

    public void setJobId(String HireDate) {
        this.HireDate = HireDate;
    }
    public Integer getJobId() {

        return JobId;
    }

    public void setJobId(Integer JobId) {
        this.JobId = JobId;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }


    @Override
    public String toString() {
        return "EmployeeFilterDto{" +
                "depId=" + depId +
                ", limit=" + limit +
                ", offset=" + offset +
                ", JobId=" + JobId +
                ", HireDate='" + HireDate + '\'' +
                '}';
    }
}