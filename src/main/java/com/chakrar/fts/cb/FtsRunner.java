package com.chakrar.fts.cb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FtsRunner implements CommandLineRunner {
	
	/** The Constant logger. */
	private static final Logger log = LoggerFactory.getLogger(FtsRunner.class);
	
	


	@Override
	public void run(String... arg0) throws Exception {
        log.info("...Searching...");

		       
        FullTextSearchService.findByTextMatch("developer");
        
		FullTextSearchService.findByTextFuzzy("sysops");
		
		FullTextSearchService.findByRegExp("[a-z]*lization");
		
        FullTextSearchService.findByRegExp("[a-z]*\\s*reality");
        
		FullTextSearchService.findByPrefix("micro");
        
        FullTextSearchService.findByMatchPhrase("DevOps System Administrators");
        
        FullTextSearchService.findByMatchPhrase("Docker with couchbase");
        
        FullTextSearchService.findByNumberRange(5000, 30000);
        
        FullTextSearchService.findByMatchCombination("aws", "containers");
	}
	
		

}
