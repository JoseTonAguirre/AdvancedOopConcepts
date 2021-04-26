public class UseBook {
    public static void main(String[] args)
    {
        Fiction aStory = new Fiction("The Very Hungry Caterpillar");
        NFiction aNovel= new NFiction("She Persisted");
        System.out.println("Fiction " + aStory.getTitle() + " costs: $" + aStory.getPrice());
        System.out.println("Non-Fiction " + aNovel.getTitle() + " costs: $" + aNovel.getPrice());
    }
}
