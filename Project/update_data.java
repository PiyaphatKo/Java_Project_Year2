package Project;

public class update_data extends all_data{

    void setName(int loop, String name){
        super.name.set(loop, name) ;
    } // .set(ตัวแรก คือ เข้าถึงตำแหน่งใน ArrayList ตัวที่สองคือ ข้อมูลที่ต้องการเปลี่ยนแปลง)

    void setBooking_date(int loop, String booking_date){
        super.booking_date.set(loop, booking_date) ;
    }

    void setCheck_in_time(int loop, String check_in_time){
        super.check_in_time.set(loop, check_in_time) ;
    }

    void setCheck_out_time(int loop, String check_out_time){
        super.check_out_time.set(loop, check_out_time) ;
    }

    void setParking_floor(int loop, String parking_floor){
        super.parking_floor.set(loop, parking_floor) ;
    }

    void setParking_slot(int loop, int parking_slot){
        super.parking_slot.set(loop, parking_slot) ;
    }

    void setStatus(int loop, String status){
        super.status.set(loop, status) ;
    }

    void setFee(int loop, int fee){
        super.fee.set(loop, fee) ;
    }

}
