package com.ourTeam.search.dao;

import com.ourTeam.search.pojo.SearchResult;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;

/**
 * @author hcoly1
 * @create 2019-03-12-10:20
 */
public interface SearchDao {
    SearchResult search(SolrQuery query) throws Exception;
}
