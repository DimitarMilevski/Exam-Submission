package oop.design;

/**
 * Created by Zaqc on 8/16/2016.
 */
public  class EmployeeAbstract   {


        public String employeeDuties(String position){
            String duty= "";

            switch (position){
                case "CEO" :
                case "ceo" : duty = "Your job is to run the company";
                    break;

                case "Tester" :
                case "tester" : duty = "Your job is to test the new software";
                    break;

                case "Developer" :
                case "developer" : duty = "Your job is to develop the new software";
                    break;

                case "BA":
                case "ba": duty = "Your job is to translate business requirements in to software requirements";
                    break;
            }
            return duty;
      }


}
