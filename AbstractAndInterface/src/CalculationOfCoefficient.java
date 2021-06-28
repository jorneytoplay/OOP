public abstract class CalculationOfCoefficient {
 private int meteorWeight = 120000;
 String coefficient(int weightMachine){
  if(meteorWeight/weightMachine>1){
   return "Масса метеорита больше данного траспорта";
  }
  else if(meteorWeight/weightMachine<1){
   return "Масса метеорита меньше данного транспорта";
  }
  else {
   return "Масса метеорита равна данному трансопрту";
  }
 }
}