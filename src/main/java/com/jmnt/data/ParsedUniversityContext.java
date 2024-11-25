package com.jmnt.data;
import com.jmnt.excelparser.ExcelParser;
import com.jmnt.services.UniversityService;

import java.util.List;
import java.util.Map;

public class ParsedUniversityContext {
    private static ParsedUniversityContext instance;

    public Map<Integer, List<University>> getUniversities() {
        return universities;
    }

    private Map<Integer, List<University>> universities;

    public List<UniversityTopField> getScrapedData() {
        return scrapedData;
    }

    private List<UniversityTopField> scrapedData;

    private ParsedUniversityContext() {
        universities = ExcelParser.parse();
        scrapedData = UniversityService.getUniversityRequirements();
    };
    public static ParsedUniversityContext getInstance() {
        if (instance == null) {
            instance = new ParsedUniversityContext();
        }
        return instance;
    }
}
