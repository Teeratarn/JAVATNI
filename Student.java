public class Student {
    public String name;
    public String id;
    public int score = 0;

    //method
    //+ doHomework(point:int):void
    public void doHomework(int point){
        score += point;
        System.out.println(name + "did homework" + point + "points");
    }
    // takeExam(point:int):void
    public void takeExam(int point){
        score += point;
        System.out.println(name + "took exam" + point +"points");
    }
    //getResult():String
    public String getResult(){
        if (score>=50)
            return "PASS";
        return "FAIL";
    }
    //showStatus():void
    public void showStatus(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Score : " + score);
        System.out.println("Result : " + getResult());
    }

}
