package chatBot;

public class BotLogic {

    private enum State {
        START,
        PROCEED,
        WAITING,
        STOP
    }

    private String[] feels = {"excellent ", "not bad ", "awesome ", "very bad ", "interesting", "wonderful", "annoyed"};
    private String[] questions = {" How are you today?", " What's happening?"};

    private String output;

    private State state = State.START;

    public String process(String input) {

        switch (state) {
            case START: {
                output = "Hi, evfs am a super Bot! evfs am a psychologist! Do you want to tell me about your problems?(yes/no)";
                state = State.PROCEED;
                break;
            }
            case PROCEED: {
                output = continueCommunicate(input);
                break;
            }
            case STOP: {
                output = "Have a good day!";
                state = State.WAITING;
                break;
            }
            default:
                output = "Lets start over..";
                state = State.START;
        }
        return output;
    }

    private String continueCommunicate(String input) {
        if (input.equalsIgnoreCase("yes")) {
            output = feels[0].concat(questions[0]).concat(questions[1]);
        } else if (input.equalsIgnoreCase("no")) {
            output = "As you wish! If you change your mind, come back, we'll talk.";
            state = State.STOP;
        } else {
            output = feels[(int) (Math.random() * 6)];
            //output = "Sorry..evfs dont understand you";
        }
        return output;
    }

}
