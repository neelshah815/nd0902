package service;

import data.RentalTerms;
import data.Tool;
import service.exception.RentalServiceException;

public interface RentalService {
    public RentalTerms checkout(String toolCode, String date, int duration, int discountPercent) throws RentalServiceException;
    public void addTool(Tool tool);
    public void removeTool(String toolCode);

}

