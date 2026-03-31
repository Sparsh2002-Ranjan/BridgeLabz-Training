import java.time.LocalDateTime;
import java.util.*;

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String msg) {
        super(msg);
    }
}

class EmptyMessageException extends Exception {
    public EmptyMessageException(String msg) {
        super(msg);
    }
}

class CallLog {
    private String phoneNumber;
    private String message;
    private LocalDateTime time;

    public CallLog(String phoneNumber, String message, LocalDateTime time)
            throws InvalidPhoneNumberException, EmptyMessageException {

        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Invalid phone number");
        }
        if (message == null || message.trim().isEmpty()) {
            throw new EmptyMessageException("Message is not provided");
        }

        this.phoneNumber = phoneNumber;
        this.message = message;
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return phoneNumber + "  " + message + "  " + time;
    }
}

class Manger {
    private List<CallLog> logs = new ArrayList<>();

    public void addCallLog(CallLog log) {
        logs.add(log);
    }

    public List<CallLog> searchByKeyword(String keywordlogs) {
        List<CallLog> result = new ArrayList<>();
        for (CallLog log : logs) {
            if (log.getMessage().toLowerCase().contains(keywordlogs.toLowerCase())) {
                result.add(log);
            }
        }
        return result;
    }

    public List<CallLog> filterByTime(LocalDateTime start, LocalDateTime end) {
        List<CallLog> result = new ArrayList<>();
        for (CallLog log : logs) {
            if (!log.getTime().isBefore(start) && !log.getTime().isAfter(end)) {
                result.add(log);
            }
        }
        return result;
    }
}

public class TelecomCallTracker {
    public static void main(String[] args) throws Exception {
        Manger manager = new Manger();

        manager.addCallLog(new CallLog(
                "9876543210",
                "issue 1",
                LocalDateTime.now().minusHours(2)
        ));

        manager.addCallLog(new CallLog(
                "9123456789",
                "issue 2",
                LocalDateTime.now().minusMinutes(30)
        ));

        List<CallLog> keywordResult = manager.searchByKeyword("network");
        List<CallLog> timeResult = manager.filterByTime(
                LocalDateTime.now().minusHours(3),
                LocalDateTime.now()
        );

        for (CallLog kres : keywordResult) {
            System.out.println(kres);
        }

        for (CallLog log : timeResult) {
            System.out.println(log);
        }
    }
}
