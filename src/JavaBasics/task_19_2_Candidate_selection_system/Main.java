package JavaBasics.task_19_2_Candidate_selection_system;

public class Main {
    public static void main(String[] args) {

        Candidate can_1 = new Candidate("Иванов Иван Иванович", "М", 20, 3, 4);
        Candidate can_2 = new Candidate("Сидорова Ирина Михайловна", "Ж", 22, 4, 2);
        Candidate can_3 = new Candidate("Фотьев Сергей Дмитриевич", "М", 24, 2, 5);
        Candidate can_4 = new Candidate("Маркин Денис Витальевич", "М", 30, 3, 1);
        Candidate can_5 = new Candidate("Серова Мария Ивановна", "Ж", 19, 5, 4);
        Candidate can_6 = new Candidate("Куранова Дарья Павловна", "Ж", 25, 3, 4);
        Candidate can_7 = new Candidate("Миронов Вадим Петрович", "М", 42, 3, 5);
        Candidate can_8 = new Candidate("Петрова Алена Федотовна", "Ж", 33, 5, 4);
        Candidate can_9 = new Candidate("Кирьянов Игорь Максимович", "М", 26, 2, 2);
        Candidate can_10 = new Candidate("Ритузов Павел Валерьевич", "М", 20, 4, 4);
        Candidate can_11 = new Candidate("Киранова Наталия Дмитриевна", "Ж", 24, 2, 4);
        Candidate can_12 = new Candidate("Петров Петр Петрович", "М", 19, 1, 3);

        for (Candidate candidate : Candidate.getCandidates()) {
            System.out.println(candidate);
        }
    }
}
