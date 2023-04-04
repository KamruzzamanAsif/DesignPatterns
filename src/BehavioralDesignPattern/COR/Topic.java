package BehavioralDesignPattern.COR;

public class Topic {
    public enum Topics {
        PRINT_TOPIC (1),
        PAPER_ORIENTATION_TOPIC(2),
        APPLICATION_TOPIC(3),
        NO_HELP_TOPIC(-1);


        private final int value;

        Topics(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
