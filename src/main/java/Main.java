public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "5555 № 555555555";
        post.patronymic = "Иванович";
        post.phone = "+7 (555)-555-55-55";
        post.subscription = true;
        post.surname = "Сидоров";
        post.birthsday = new FormDate();
        post.birthsday.day = 13;
        post.birthsday.month = 7;
        post.birthsday.year = 2000;
    }
}
