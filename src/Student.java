public class Student extends Person{
    private String program;
    private int yearLevel;

    public void setProgram(String Program) {
        this.program = Program;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getProgram() {
        return program;
    }

    public int getYearLevel() {
        return yearLevel;
    }
}
