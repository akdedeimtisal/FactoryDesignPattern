/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imtisal
 */
public class NormalBarChartFactory implements BarChartAbstractFactory {

    SansSerifFont sansSerif = new SansSerifFont();
    NonvisibleCountryName nonvisible = new NonvisibleCountryName();

    @Override
    public CountryName visibleCountryName() {
        return nonvisible;
    }

    @Override
    public Font fontType() {
        return sansSerif;
    }

}
