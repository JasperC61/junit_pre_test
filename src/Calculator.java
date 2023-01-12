public class Calculator {
    /*
    *計算機程式
    * @author
    * @veraion
    * @param
    * @return
    *
    *
    */


     /*
      *傳入 initialValue
      */
        int total=0;
    public void setTotal(int initialValue){
        total=initialValue;

    }
    /*
     *@return
     */
    public int getTotal(){
        return  total;

    }

    public void add(int value)
    {
        total=total+value;
    }

    public void subtract(int value)
    {
        total=total-value;
    }
}
