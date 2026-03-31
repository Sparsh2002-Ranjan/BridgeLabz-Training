
import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() { return type; }
    public double getAmount() { return amount; }
}

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = List.of(
            new Claim("Health", 5000),
            new Claim("Vehicle", 8000),
            new Claim("Health", 7000)
        );

        Map<String, Double> avgClaim =
            claims.stream()
                  .collect(Collectors.groupingBy(
                      Claim::getType,
                      Collectors.averagingDouble(Claim::getAmount)
                  ));

        System.out.println(avgClaim);
    }
}
