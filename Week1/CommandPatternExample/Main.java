package CommandPatternExample;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command onCommand = new TurnOnCommand(livingRoomLight);
        Command offCommand = new TurnOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(onCommand);
        remote.pressButton();

        remote.setCommand(offCommand);
        remote.pressButton();
    }
}

