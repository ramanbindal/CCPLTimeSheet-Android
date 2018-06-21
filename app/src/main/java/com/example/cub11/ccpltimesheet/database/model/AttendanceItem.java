package com.example.cub11.ccpltimesheet.database.model;

import android.content.ContentValues;

import java.util.Objects;

public class AttendanceItem {

    public static final String TABLE = "attendance_item_table";

    public static final String ID = "_id";
    public static final String IN_DATE = "in_date";
    public static final String OUT_DATE = "out_date";
    public static final String TOTAL_TIME = "total_time";
    public static final String IN_TIME = "in_time";
    public static final String OUT_TIME = "out_time";
    public static final String TYPE = "type";
    public static final String MILLISECONDS="milliseconds";

    private long id;
    private String inDate;
    private String outDate;
    private String totalTime;
    private String inTime;
    private String outTime;
    private String type;
    private long milliSeconds;

    public AttendanceItem() {
    }

    public AttendanceItem(String inDate, String outDate, String totalTime, String inTime, String outTime, String type, long milliSeconds) {
        this.inDate = inDate;
        this.outDate = outDate;
        this.totalTime = totalTime;
        this.inTime = inTime;
        this.outTime = outTime;
        this.type = type;
        this.milliSeconds = milliSeconds;
    }

    public long getMilliSeconds() {
        return milliSeconds;
    }

    public void setMilliSeconds(long milliSeconds) {
        this.milliSeconds = milliSeconds;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static final class Builder {
        private final ContentValues values = new ContentValues();

        public Builder id(long id) {
            values.put(ID, id);
            return this;
        }

        public Builder inDate(String inDate) {
            values.put(IN_DATE, inDate);
            return this;
        }
        public Builder outDate(String outDate) {
            values.put(OUT_DATE, outDate);
            return this;
        }


        public Builder inTime(String inTime) {
            values.put(IN_TIME, inTime);
            return this;
        }

        public Builder type(String type) {
            values.put(TYPE, type);
            return this;
        }

        public Builder totalTime(String totalTime) {
            values.put(TOTAL_TIME, totalTime);
            return this;
        }

        public Builder outTime(String outTime) {
            values.put(OUT_TIME, outTime);
            return this;
        }
        public Builder milliSeconds(long milliSeconds) {
            values.put(MILLISECONDS, milliSeconds);
            return this;
        }



        public ContentValues build() {
            return values;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttendanceItem that = (AttendanceItem) o;
        return id == that.id &&
                milliSeconds == that.milliSeconds &&
                Objects.equals(inDate, that.inDate) &&
                Objects.equals(outDate, that.outDate) &&
                Objects.equals(totalTime, that.totalTime) &&
                Objects.equals(inTime, that.inTime) &&
                Objects.equals(outTime, that.outTime) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, inDate, outDate, totalTime, inTime, outTime, type, milliSeconds);
    }
}
