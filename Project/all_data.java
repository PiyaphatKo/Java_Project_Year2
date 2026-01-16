package Project;

import java.util.ArrayList;

public class all_data {
    // ArrayList คือ ไม่ต้องมีการกำหนดจำนวนที่เก็บได้สินะ (ไม่ต้องกำหนดว่า Array จะมีขนาดเท่าไหร่ในการเก็บข้อมูลต่าง ๆ)
    public ArrayList<String> name = new ArrayList<String>() ; //เก็บชื่อของผู้ที่ทำการจองเข้ามาในระบบ
    public ArrayList<String> car_plate = new ArrayList<String>() ; //เก็บหมายเลขทะเบียนรถแต่ละคันของผู้จอง
    public ArrayList<String> booking_date  = new ArrayList<String>() ; //เก็บวันที่ผู้จองแต่ละคนทำการจอง
    public ArrayList<String> check_in_time  = new ArrayList<String>() ; //เก็บเวลาที่ผู้จองแต่ละคนจะทำการมาจอด
    public ArrayList<String> check_out_time  = new ArrayList<String>() ; //เก็บเวลาที่ผู้จองแต่ละคนจะทำการมานำรถออก
    public ArrayList<String> parking_floor = new ArrayList<String>() ; //เก็บข้อมูลของชั้นแต่ละชั้นที่ผู้จองแต่ละคนทำการจอง
    public ArrayList<Integer> parking_slot = new ArrayList<Integer>() ; //เก็บข้อมูลของช่องที่ผู้จองแต่ละคนทำการจองในชั้นนั้น
    public ArrayList<String> status = new ArrayList<String>() ; //เก็บสถานะของผู้ใช้คนนั้นว่าทำการจ่ายเงินหรือยัง
    public ArrayList<Integer> fee  = new ArrayList<Integer>() ; //เก็บราคาที่ผู้จองต้องทำการจ่ายหลังจากใช้บริการหรือชำระค่าบริการล่วงหน้าก่อนจะมาใช้งาน

    void setName(String name){
        this.name.add(name) ;
    }

    void setCar_plate(String car_plate){
        this.car_plate.add(car_plate) ;
    }

    void setBooking_date(String booking_date){
        this.booking_date.add(booking_date) ;
    }

    void setCheck_in_time(String check_in_time){
        this.check_in_time.add(check_in_time) ;
    }

    void setCheck_out_time(String check_out_time){
        this.check_out_time.add(check_out_time) ;
    }

    void setParking_floor(String parking_floor){
        this.parking_floor.add(parking_floor) ;
    }

    void setParking_slot(int parking_slot){
        this.parking_slot.add(parking_slot) ;
    }

    void setStatus(String status){
        this.status.add(status) ;
    }

    void setFee(int fee){
        this.fee.add(fee) ;
    }

    public String toString(String checkName) {
        String result = "";
        boolean found = false; // ตัวแปรตรวจสอบว่าพบข้อมูลหรือไม่

        for (int loop = 0; loop < name.size(); loop++) {
            if (car_plate.get(loop).equalsIgnoreCase(checkName)) { // equalsIgnoreCase = ตัวสอบว่าเป็นตัวเดียวกันไหม โดยไม่สนใจตัวเล็กหรือตัวใหญ่
                result += "List of numbers : " + (loop + 1) + "\n";
                result += "Name : " + name.get(loop) + "\n";
                result += "Car_plate : " + car_plate.get(loop) + "\n";
                result += "Booking_date : " + booking_date.get(loop) + "\n";
                result += "Check_in_time : " + check_in_time.get(loop) + "\n";
                result += "Check_out_time : " + check_out_time.get(loop) + "\n";
                result += "Parking_floor : " + parking_floor.get(loop) + "\n";
                result += "Parking_slot : " + parking_slot.get(loop) + "\n";
                result += "Status : " + status.get(loop) + "\n";
                result += "Fee : " + fee.get(loop) + "\n";
                result += "-----------------------------\n";
                found = true; // พบข้อมูล
            }
        }

        // ถ้าไม่พบข้อมูลเลย ให้คืนค่า "Not found data"
        if (!found) {
            result = "Not found data";
        }
        //แสดงข้อมูลที่เก็บไว้ใน result ไปยังหน้าจอหลัก
        return result;
    }

}
