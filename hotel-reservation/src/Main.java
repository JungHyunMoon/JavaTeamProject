import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    private static Map<String, Reservation> reservations;
    public static void main(String[] args) {
        reservations = new HashMap<>();

        displayMenu();
    }

    private static void displayMenu() {
        System.out.println("서비스를 선택해주세요.");
        System.out.println("1. 예약하기");
        System.out.println("2. 예약 조회하기");
        System.out.println("3. 예약 취소하기");

        handleMenuInput();
    }

    private static void handleMenuInput() {
        Scanner sc = new Scanner(System.in);

        int menu = sc.nextInt();
        switch (menu) {
            case 1 -> makeReservation();
        }
    }

    private static void makeReservation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해주세요: ");
        String name = sc.next();

        System.out.print("\n전화번호를 입력해주세요: ");
        String phone = sc.next();

        System.out.print("\n소지 금액을 입력해주세요: ");
        int cash = sc.nextInt();

        // 1. 고객 존재 확인 -> 없으면 신규

        // 2. 예약 가능한 방 출력, 예약할 방 입력

        // 3. 불가능하면 예외처리

        // 4. 예약 정보 저장
        String rId = UUID.randomUUID().toString();
    }
}