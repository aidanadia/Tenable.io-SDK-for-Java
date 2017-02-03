package com.tenable.io.api.workbenches.models;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


/**
 * Copyright (c) 2017 Tenable Network Security, Inc.
 */
public class ExportOptions {
    private String format;
    private String report;
    private Integer startDate;
    private String chapter;
    private Integer dateRange;
    private List<Filter> filters;
    private String searchType;
    private Boolean minimumVulnInfo;
    private Integer pluginId;
    private String assetId;


    /**
     * The file format to use (Nessus, HTML, PDF, or CSV).
     *
     * @return the format
     */
    public String getFormat() {
        return format;
    }


    /**
     * The file format to use (Nessus, HTML, PDF, or CSV).
     *
     * @param format the format
     */
    public void setFormat( String format ) {
        this.format = format;
    }


    /**
     * The type of workbench report to be exported
     *
     * @return the report
     */
    public String getReport() {
        return report;
    }


    /**
     * The type of workbench report to be exported
     *
     * @param report the report
     */
    public void setReport( String report ) {
        this.report = report;
    }


    /**
     * The date (in unixtime) at which the exported results should begin to be included. Defaults to today.
     *
     * @return the start date
     */
    @JsonProperty( "start_date" )
    public Integer getStartDate() {
        return startDate;
    }


    /**
     * The date (in unixtime) at which the exported results should begin to be included. Defaults to today.
     *
     * @param startDate the start date
     */
    @JsonProperty( "start_date" )
    public void setStartDate( Integer startDate ) {
        this.startDate = startDate;
    }


    /**
     * Semicolon-separated list of chapters to include for vulnerabilities/hosts reports (vuln_by_plugin, vuln_by_asset,
     * vuln_hosts_summary) or a single chapter for Executive Summary (exec_summary) or Differential reports (diff).
     * Currently, only vuln_by_asset is supported for .nessus workbench exports.
     *
     * @return the chapter
     */
    public String getChapter() {
        return chapter;
    }


    /**
     * Semicolon-separated list of chapters to include for vulnerabilities/hosts reports (vuln_by_plugin, vuln_by_asset,
     * vuln_hosts_summary) or a single chapter for Executive Summary (exec_summary) or Differential reports (diff).
     * Currently, only vuln_by_asset is supported for .nessus workbench exports.
     *
     * @param chapter the chapter
     */
    public void setChapter( String chapter ) {
        this.chapter = chapter;
    }


    /**
     * The number of days of data prior to and including start_date that should be returned. If not specified,
     * data for all dates is returned.
     *
     * @return the date range
     */
    @JsonProperty( "date_range" )
    public Integer getDateRange() {
        return dateRange;
    }


    /**
     * The number of days of data prior to and including start_date that should be returned. If not specified,
     * data for all dates is returned.
     *
     * @param dateRange the date range
     */
    @JsonProperty( "date_range" )
    public void setDateRange( Integer dateRange ) {
        this.dateRange = dateRange;
    }


    /**
     * An array containing filters to apply to the exported scan report.
     *
     * @return the filters
     */
    public List<Filter> getFilters() {
        return filters;
    }


    /**
     * An array containing filters to apply to the exported scan report.
     *
     * @param filters the filters
     */
    public void setFilters( List<Filter> filters ) {
        this.filters = filters;
    }


    /**
     * The type of search to be used.
     *
     * @return the search type
     */
    @JsonProperty( "filter.search_type" )
    public String getSearchType() {
        return searchType;
    }


    /**
     * The type of search to be used.
     *
     * @param searchType the search type
     */
    @JsonProperty( "filter.search_type" )
    public void setSearchType( String searchType ) {
        this.searchType = searchType;
    }


    /**
     * When true, only a minimal subset of scan details will be returned for each result, excluding plugin attributes.
     * In this case, only plugin_output and vulnerability_state fields are always returned; first_found, last_found
     * and last_fixed are also returned if possible.
     *
     * @return boolean
     */
    @JsonProperty( "minimum_vuln_info" )
    public Boolean getMinimumVulnInfo() {
        return minimumVulnInfo;
    }


    /**
     * When true, only a minimal subset of scan details will be returned for each result, excluding plugin attributes.
     * In this case, only plugin_output and vulnerability_state fields are always returned; first_found, last_found
     * and last_fixed are also returned if possible.
     *
     * @param minimumVulnInfo boolean
     */
    @JsonProperty( "minimum_vuln_info" )
    public void setMinimumVulnInfo( Boolean minimumVulnInfo ) {
        this.minimumVulnInfo = minimumVulnInfo;
    }


    /**
     * Restrict the export data to only vulnerabilities found by the plugin with this id.
     *
     * @return the plugin id
     */
    @JsonProperty( "plugin_id" )
    public Integer getPluginId() {
        return pluginId;
    }


    /**
     * Restrict the export data to only vulnerabilities found by the plugin with this id.
     *
     * @param pluginId the plugin id
     */
    @JsonProperty( "plugin_id" )
    public void setPluginId( Integer pluginId ) {
        this.pluginId = pluginId;
    }


    /**
     * Restrict the export data to only findings the asset with this id. Note that this id is a UUID
     *
     * @return the asset id
     */
    @JsonProperty( "asset_id" )
    public String getAssetId() {
        return assetId;
    }


    /**
     * Restrict the export data to only findings the asset with this id. Note that this id is a UUID
     *
     * @param assetId the asset id
     */
    @JsonProperty( "asset_id" )
    public void setAssetId( String assetId ) {
        this.assetId = assetId;
    }
}
