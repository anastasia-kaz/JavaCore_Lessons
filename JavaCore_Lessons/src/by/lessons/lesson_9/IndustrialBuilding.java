package by.lessons.lesson_9;

public class IndustrialBuilding extends Building{

    //1.3 Создать класс Промышленном здание (IndustrialBuilding). Промышленные здания наследуются от Постройки. Поля которые можно определить в Промышленном здании: отрасль (Отрасль в которой здание задействовано (машиностроительная, легкая промышленность, целлюлозная промышленность, сельское хозяйство)
    private String industry;

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public IndustrialBuilding(String street, String material, int year, String industry) {
        super(street, material, year);
        this.industry = industry;
    }

    @Override
    public String toString() {
        return "IndustrialBuilding{" +
                "industry='" + industry + '\'' +
                '}';
    }
}
