package Project;

import java.util.*;

public class Print {
    public static void main(String[] args) {
        update_data data = new update_data();
        update_data update = new update_data() ;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("1 : Enter data");
            System.out.println("2 : Update data");
            System.out.println("3 : Print data");
            System.out.println("4 : Exit");
            System.out.print("Enter number choose you want : ");

            int choose = scan.nextInt();
            scan.nextLine(); // 🔹 เคลียร์ค่า Enter ที่ค้างอยู่ในบัฟเฟอร์

            if (choose == 1) {
                System.out.println("1 : Enter data");

                System.out.print("Enter name : ");
                String name = scan.nextLine();
                data.setName(name);

                System.out.print("Enter car plate : ");
                String car_plate = scan.nextLine();
                data.setCar_plate(car_plate);

                System.out.print("Enter booking date : ");
                String booking_date = scan.nextLine();
                data.setBooking_date(booking_date);

                System.out.print("Enter check-in time : ");
                String check_in_time = scan.nextLine();
                data.setCheck_in_time(check_in_time);

                System.out.print("Enter check-out time : ");
                String check_out_time = scan.nextLine();
                data.setCheck_out_time(check_out_time);

                System.out.print("Enter parking floor : ");
                String parking_floor = scan.nextLine();
                data.setParking_floor(parking_floor);

                System.out.print("Enter parking slot : ");
                int parking_slot = scan.nextInt();
                scan.nextLine();
                data.setParking_slot(parking_slot);

                System.out.print("Enter status : ");
                String status = scan.nextLine();
                data.setStatus(status);

                System.out.print("Enter fee : ");
                int fee = scan.nextInt();
                scan.nextLine();
                data.setFee(fee);

            } else if (choose == 2) {
                System.out.println("2 : Update data");

                System.out.print("Enter car plate : "); // 🔹 เปลี่ยนจาก println เป็น print
                String car = scan.nextLine();
                System.out.println(data.toString(car));

                for (int loop = 0; loop < data.name.size(); loop++) {
                    if (data.car_plate.get(loop).equalsIgnoreCase(car)) {
                        System.out.println("เลือกหัวข้อที่คุณต้องการจะเปลี่ยน : ");
                        System.out.println("1.name");
                        System.out.println("2.booking_date");
                        System.out.println("3.check_in_time");
                        System.out.println("4.check_out_time");
                        System.out.println("5.parking_floor");
                        System.out.println("6.parking_slot");
                        System.out.println("7.status");
                        System.out.println("8.fee");
                        System.out.print("Enter number your want change : ");

                        int number = scan.nextInt();
                        scan.nextLine(); // 🔹 เคลียร์ค่า \n ที่ค้างอยู่

                        if (number == 1) {
                            System.out.print("Enter new name : ");
                            String name = scan.nextLine();
                            data.setName(loop, name);
                        } else if (number == 2) {
                            System.out.print("Enter new booking_date : ");
                            String booking_date = scan.nextLine();
                            data.setBooking_date(loop, booking_date);
                        } else if (number == 3) {
                            System.out.print("Enter new check_in_time : ");
                            String check_in_time = scan.nextLine();
                            data.setCheck_in_time(loop, check_in_time);
                        } else if (number == 4) {
                            System.out.print("Enter new check_out_time : ");
                            String check_out_time = scan.nextLine();
                            data.setCheck_out_time(loop, check_out_time);
                        } else if (number == 5) {
                            System.out.print("Enter new parking_floor : ");
                            String parking_floor = scan.nextLine();
                            data.setParking_floor(loop, parking_floor);
                        } else if (number == 6) {
                            System.out.print("Enter new parking_slot : ");
                            int parking_slot = scan.nextInt();
                            scan.nextLine(); // 🔹 เคลียร์ค่า \n ที่ค้างอยู่
                            data.setParking_slot(loop, parking_slot);
                        } else if (number == 7) {
                            System.out.print("Enter new status : ");
                            String status = scan.nextLine();
                            data.setStatus(loop, status);
                        } else if (number == 8) {
                            System.out.print("Enter new fee : ");
                            int fee = scan.nextInt();
                            scan.nextLine(); // 🔹 เคลียร์ค่า \n ที่ค้างอยู่
                            data.setFee(loop, fee);
                        }
                    }
                }


            } else if (choose == 3) {
                System.out.println("3 : Print data");

                System.out.print("Enter car plate : "); // 🔹 เปลี่ยนจาก println เป็น print
                String car = scan.nextLine();
                System.out.println(data.toString(car));

            } else if (choose == 4) {
                System.out.println("Bye");
                break;
            } else {
                System.out.println("Please choose another option between 1-4.");
                System.out.println();
            }
        } while (true);
    }
}
