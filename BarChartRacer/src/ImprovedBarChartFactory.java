/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imtisal
 */
public class ImprovedBarChartFactory implements BarChartAbstractFactory{
    ArialFont arial = new ArialFont();
    VisibleCountryName visible = new VisibleCountryName();

    @Override
    public CountryName visibleCountryName() {
       return visible;
    }

    @Override
    public Font fontType() {
        return arial;
    }
    
}
