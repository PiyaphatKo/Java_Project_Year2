package Project;

import javax.swing.*;
import java.awt.*;

public class Show_data {
    // methode สำหรับการสร้าง JDialog สำหรับการป้อนข้อมูลลงไปใน GUI
    public void showEnterDataDialog(JFrame parentFrame, update_data data) { // รับค่า parameter ที่ถูกส่งมาเก็บไว้ในตัวแปรต่าง ๆ ที่ได้มีการประกาศไว้ในวงเล็บ (หากไม่ได้มีการส่ง data มา ข้อมูลจะไม่มีการเก็บหรือแสดงผลข้อมูลกลับไปยังคลาสอื่นของ object ที่เราทำการสร้างขึ้นมา โดยทำการดึงข้อมูลของคลาสนั้น ๆ มา)
        JDialog dialog = new JDialog(parentFrame, "Enter Data", true); //สร้าง object dialog สำหรับการกรอกข้อมูลลงไปใน GUI (มีการกำหนดหัวข้อว่า "Enter Data" และผู้ใช้งานระบบไม่สามารถทำการโต้ตอบกับ frame ได้ ในขณะที่ dialog กำละงถูกเปิดใช้งาน)
        dialog.setLayout(new GridLayout(10, 2, 5, 5));  // กำหนด layout ของ dialog แบบ Gridlayout โดยมีการกำหนดจำนวน แถว, คอลัมม์, ระยะห่างแนวนอน, และระยะห่างแนวตั้ง

        // ทำการสร้าง TextField หัวข้อต่าง ๆ สำหรับการกำหนดข้อมูลที่ต้องการลงไป
        JTextField nameField = new JTextField(15); // 15 หมายถึง ขนาดของข้อมูลที่สามารถป้อนลงไปใน TextField ได้ เป็นจำนวน 15
        JTextField carPlateField = new JTextField(15); // 15 หมายถึง ขนาดของข้อมูลที่สามารถป้อนลงไปใน TextField ได้ เป็นจำนวน 15
        JTextField bookingDateField = new JTextField(15); // 15 หมายถึง ขนาดของข้อมูลที่สามารถป้อนลงไปใน TextField ได้ เป็นจำนวน 15
        JTextField checkInTimeField = new JTextField(15); // 15 หมายถึง ขนาดของข้อมูลที่สามารถป้อนลงไปใน TextField ได้ เป็นจำนวน 15
        JTextField checkOutTimeField = new JTextField(15); // 15 หมายถึง ขนาดของข้อมูลที่สามารถป้อนลงไปใน TextField ได้ เป็นจำนวน 15
        JTextField parkingFloorField = new JTextField(15); // 15 หมายถึง ขนาดของข้อมูลที่สามารถป้อนลงไปใน TextField ได้ เป็นจำนวน 15
        JTextField parkingSlotField = new JTextField(15); // 15 หมายถึง ขนาดของข้อมูลที่สามารถป้อนลงไปใน TextField ได้ เป็นจำนวน 15
        JTextField statusField = new JTextField(15); // 15 หมายถึง ขนาดของข้อมูลที่สามารถป้อนลงไปใน TextField ได้ เป็นจำนวน 15
        JTextField feeField = new JTextField(15); // 15 หมายถึง ขนาดของข้อมูลที่สามารถป้อนลงไปใน TextField ได้ เป็นจำนวน 15

        // ทำการเพิ่ม Label และ TextField ลงไปใน dialog
        dialog.add(new JLabel("Enter Name:")); // ทำการเพิ่ม label (ป้ายข้อความ) สำหรับการแสดงหัวข้อต่าง ๆ ลงไปใน dialog
        dialog.add(nameField); // ทำการเพิ่ม TextField สำหรับช่องป้อนข้อมูลต่าง ๆ ให้กับผู้ใช้งาน ให้สามารถทำการป้อนข้อมูลต่าง ๆ ลงไปใน GUI ได้
        dialog.add(new JLabel("Enter Car Plate:")); // ทำการเพิ่ม label (ป้ายข้อความ) สำหรับการแสดงหัวข้อต่าง ๆ ลงไปใน dialog
        dialog.add(carPlateField); // ทำการเพิ่ม TextField สำหรับช่องป้อนข้อมูลต่าง ๆ ให้กับผู้ใช้งาน ให้สามารถทำการป้อนข้อมูลต่าง ๆ ลงไปใน GUI ได้
        dialog.add(new JLabel("Enter Booking Date:")); // ทำการเพิ่ม label (ป้ายข้อความ) สำหรับการแสดงหัวข้อต่าง ๆ ลงไปใน dialog
        dialog.add(bookingDateField); // ทำการเพิ่ม TextField สำหรับช่องป้อนข้อมูลต่าง ๆ ให้กับผู้ใช้งาน ให้สามารถทำการป้อนข้อมูลต่าง ๆ ลงไปใน GUI ได้
        dialog.add(new JLabel("Enter Check-in Time:")); // ทำการเพิ่ม label (ป้ายข้อความ) สำหรับการแสดงหัวข้อต่าง ๆ ลงไปใน dialog
        dialog.add(checkInTimeField); // ทำการเพิ่ม TextField สำหรับช่องป้อนข้อมูลต่าง ๆ ให้กับผู้ใช้งาน ให้สามารถทำการป้อนข้อมูลต่าง ๆ ลงไปใน GUI ได้
        dialog.add(new JLabel("Enter Check-out Time:")); // ทำการเพิ่ม label (ป้ายข้อความ) สำหรับการแสดงหัวข้อต่าง ๆ ลงไปใน dialog
        dialog.add(checkOutTimeField); // ทำการเพิ่ม TextField สำหรับช่องป้อนข้อมูลต่าง ๆ ให้กับผู้ใช้งาน ให้สามารถทำการป้อนข้อมูลต่าง ๆ ลงไปใน GUI ได้
        dialog.add(new JLabel("Enter Parking Floor:")); // ทำการเพิ่ม label (ป้ายข้อความ) สำหรับการแสดงหัวข้อต่าง ๆ ลงไปใน dialog
        dialog.add(parkingFloorField); // ทำการเพิ่ม TextField สำหรับช่องป้อนข้อมูลต่าง ๆ ให้กับผู้ใช้งาน ให้สามารถทำการป้อนข้อมูลต่าง ๆ ลงไปใน GUI ได้
        dialog.add(new JLabel("Enter Parking Slot:")); // ทำการเพิ่ม label (ป้ายข้อความ) สำหรับการแสดงหัวข้อต่าง ๆ ลงไปใน dialog
        dialog.add(parkingSlotField); // ทำการเพิ่ม TextField สำหรับช่องป้อนข้อมูลต่าง ๆ ให้กับผู้ใช้งาน ให้สามารถทำการป้อนข้อมูลต่าง ๆ ลงไปใน GUI ได้
        dialog.add(new JLabel("Enter Status:")); // ทำการเพิ่ม label (ป้ายข้อความ) สำหรับการแสดงหัวข้อต่าง ๆ ลงไปใน dialog
        dialog.add(statusField); // ทำการเพิ่ม TextField สำหรับช่องป้อนข้อมูลต่าง ๆ ให้กับผู้ใช้งาน ให้สามารถทำการป้อนข้อมูลต่าง ๆ ลงไปใน GUI ได้
        dialog.add(new JLabel("Enter Fee:")); // ทำการเพิ่ม label (ป้ายข้อความ) สำหรับการแสดงหัวข้อต่าง ๆ ลงไปใน dialog
        dialog.add(feeField); // ทำการเพิ่ม TextField สำหรับช่องป้อนข้อมูลต่าง ๆ ให้กับผู้ใช้งาน ให้สามารถทำการป้อนข้อมูลต่าง ๆ ลงไปใน GUI ได้

        // ทำการสร้างปุ่มกดส่งข้อมูล เพื่อให้ตัวระบบทำการเก็บข้อมูลต่าง ๆ ไว้ในระบบ
        JButton submitButton = new JButton("Submit"); // สร้าง object submitButton โดยมีการกำหนดข้อความของตัวปุ่มไว้ว่า "Submit"
        submitButton.addActionListener(e -> { // ทำการกำหนดเหตุการณ์เมื่อผู้ใช้ทำการกดปุ่ม "Submit" ผ่านคำสั่ง addActionListener
            data.setName(nameField.getText()); // (getText = ดึงข้อมูลต่าง ๆ ที่เก็บไว้ใน TextField ออกมา) จากนั้นทำการส่งค่าของข้อมูลที่ดึงออกมา เข้าไปใน object data ที่มีการดึง super class method มาใช้งาน
            data.setCar_plate(carPlateField.getText());  // (getText = ดึงข้อมูลต่าง ๆ ที่เก็บไว้ใน TextField ออกมา) จากนั้นทำการส่งค่าของข้อมูลที่ดึงออกมา เข้าไปใน object data ที่มีการดึง super class method มาใช้งาน
            data.setBooking_date(bookingDateField.getText());  // (getText = ดึงข้อมูลต่าง ๆ ที่เก็บไว้ใน TextField ออกมา) จากนั้นทำการส่งค่าของข้อมูลที่ดึงออกมา เข้าไปใน object data ที่มีการดึง super class method มาใช้งาน
            data.setCheck_in_time(checkInTimeField.getText());  // (getText = ดึงข้อมูลต่าง ๆ ที่เก็บไว้ใน TextField ออกมา) จากนั้นทำการส่งค่าของข้อมูลที่ดึงออกมา เข้าไปใน object data ที่มีการดึง super class method มาใช้งาน
            data.setCheck_out_time(checkOutTimeField.getText());  // (getText = ดึงข้อมูลต่าง ๆ ที่เก็บไว้ใน TextField ออกมา) จากนั้นทำการส่งค่าของข้อมูลที่ดึงออกมา เข้าไปใน object data ที่มีการดึง super class method มาใช้งาน
            data.setParking_floor(parkingFloorField.getText());  // (getText = ดึงข้อมูลต่าง ๆ ที่เก็บไว้ใน TextField ออกมา) จากนั้นทำการส่งค่าของข้อมูลที่ดึงออกมา เข้าไปใน object data ที่มีการดึง super class method มาใช้งาน
            data.setParking_slot(Integer.parseInt(parkingSlotField.getText()));  // (Integer.parseInt = แปลงข้อมูลที่เป็น String ให้อยู่ในรูปของ Int) (getText = ดึงข้อมูลต่าง ๆ ที่เก็บไว้ใน TextField ออกมา) จากนั้นทำการส่งค่าของข้อมูลที่ดึงออกมา เข้าไปใน object data ที่มีการดึง super class method มาใช้งาน
            data.setStatus(statusField.getText());  // (getText = ดึงข้อมูลต่าง ๆ ที่เก็บไว้ใน TextField ออกมา) จากนั้นทำการส่งค่าของข้อมูลที่ดึงออกมา เข้าไปใน object data ที่มีการดึง super class method มาใช้งาน
            data.setFee(Integer.parseInt(feeField.getText()));  // (Integer.parseInt = แปลงข้อมูลที่เป็น String ให้อยู่ในรูปของ Int) (getText = ดึงข้อมูลต่าง ๆ ที่เก็บไว้ใน TextField ออกมา) จากนั้นทำการส่งค่าของข้อมูลที่ดึงออกมา เข้าไปใน object data ที่มีการดึง super class method มาใช้งาน

            dialog.dispose(); // dispose = ทำการปิดหน้าต่างในส่วนนั้น ๆ โดยในที่นี้ก็คือการปิด dialog (ทำการปิดโปรแกมในส่วนของปุ่มเมนู Enter Data)
        });

        dialog.add(submitButton);  // ทำการเพิ่มปุ่ม "Submit" ที่เก็บอยู่ไว้ใน submitButton ลงไปใน dialog
        dialog.setSize(300, 400);  // ทำการกำหนดขนาดของ dialog ให้มีขนาดตามที่เราต้องการ (หน่วยเป็น px)
        dialog.setLocationRelativeTo(parentFrame);  // กำหนดให้ dialog ปรากฏชึ้นมากลางหน้าจอ
        dialog.setVisible(true);  // กำหนดการแสดงผลของ dialog (หากกำหนดเป็น false ก็จะไม่มีอะไรปรากฏขึ้นมาบนหน้าจอ)
    }

    // methode สำหรับการสร้าง JDialog สำหรับการอัปเดตข้อมูลลงไปใน GUI
    public void showUpdateDataDialog(JFrame parentFrame, update_data data) {
        JDialog dialog = new JDialog(parentFrame, "Update Data", true);
        dialog.setLayout(new GridLayout(11, 2, 5, 5));

        // ทำการสร้าง TextField หัวข้อต่าง ๆ สำหรับการกำหนดข้อมูลที่ต้องการลงไป
        JTextField carPlateField = new JTextField(15);
        JTextField nameField = new JTextField(15);
        JTextField bookingDateField = new JTextField(15);
        JTextField checkInTimeField = new JTextField(15);
        JTextField checkOutTimeField = new JTextField(15);
        JTextField parkingFloorField = new JTextField(15);
        JTextField parkingSlotField = new JTextField(15);
        JTextField statusField = new JTextField(15);
        JTextField feeField = new JTextField(15);

        // ทำการเพิ่ม Label และ TextField ลงไปใน dialog สำหรับทำการค้นหาข้อมูลที่ต้องการเปลี่ยน โดยทำการใช้ตัวทะเบียนรถเป็นตัวในการค้นหา
        dialog.add(new JLabel("Enter Car Plate to Update:"));
        dialog.add(carPlateField);

        JButton searchButton = new JButton("Search");
        dialog.add(searchButton);
        dialog.add(new JLabel("")); // ทำการเพิ่ม

        dialog.add(new JLabel("Enter New Name:"));
        dialog.add(nameField);
        dialog.add(new JLabel("Enter New Booking Date:"));
        dialog.add(bookingDateField);
        dialog.add(new JLabel("Enter New Check-in Time:"));
        dialog.add(checkInTimeField);
        dialog.add(new JLabel("Enter New Check-out Time:"));
        dialog.add(checkOutTimeField);
        dialog.add(new JLabel("Enter New Parking Floor:"));
        dialog.add(parkingFloorField);
        dialog.add(new JLabel("Enter New Parking Slot:"));
        dialog.add(parkingSlotField);
        dialog.add(new JLabel("Enter New Status:"));
        dialog.add(statusField);
        dialog.add(new JLabel("Enter New Fee:"));
        dialog.add(feeField);

        // ฟังค์ชั่นจะทำการแสดงข้อมูลต่าง ๆ ที่บันทึกไว้ออกมาเมื่อทำการกดปุ่ม search
        searchButton.addActionListener(e -> {
            String carPlate = carPlateField.getText();
            boolean found = false;
            for (int i = 0; i < data.name.size(); i++) {
                // setText = กำหนดหรือแสดงข้อความที่อยู่ในนั้นออกมา
                if (data.car_plate.get(i).equalsIgnoreCase(carPlate)) {
                    nameField.setText(data.name.get(i));
                    bookingDateField.setText(data.booking_date.get(i));
                    checkInTimeField.setText(data.check_in_time.get(i));
                    checkOutTimeField.setText(data.check_out_time.get(i));
                    parkingFloorField.setText(data.parking_floor.get(i));
                    parkingSlotField.setText(String.valueOf(data.parking_slot.get(i)));
                    statusField.setText(data.status.get(i));
                    feeField.setText(String.valueOf(data.fee.get(i)));
                    found = true;
                    break;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(dialog, "Car plate not found!", "Error", JOptionPane.ERROR_MESSAGE); // ERROR_MESSAGE = แสดงไอคอนรูปเครื่องหมาย Error
            }
        });

        // ฟังค์ชั่นสำหรับการอัปเดตข้อมูลลงไปในระบบ หลังจากที่ทำการกดปุ่ม Update
        JButton submitButton = new JButton("Update");
        submitButton.addActionListener(e -> {
            String carPlate = carPlateField.getText();
            for (int i = 0; i < data.name.size(); i++) {
                if (data.car_plate.get(i).equalsIgnoreCase(carPlate)) {
                    data.setName(i, nameField.getText());
                    data.setBooking_date(i, bookingDateField.getText());
                    data.setCheck_in_time(i, checkInTimeField.getText());
                    data.setCheck_out_time(i, checkOutTimeField.getText());
                    data.setParking_floor(i, parkingFloorField.getText());
                    data.setParking_slot(i, Integer.parseInt(parkingSlotField.getText()));
                    data.setStatus(i, statusField.getText());
                    data.setFee(i, Integer.parseInt(feeField.getText()));

                    JOptionPane.showMessageDialog(dialog, "Data updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    dialog.dispose();
                    break;
                }
            }
        });

        dialog.add(submitButton);
        dialog.setSize(300, 500);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
    }

    // methode สำหรับการสร้าง JDialog สำหรับการแสดงข้อมูลลงไปใน GUI
    public void showPrintDataDialog(JFrame parentFrame, update_data data) {
        JDialog dialog = new JDialog(parentFrame, "Print Data", true);
        dialog.setLayout(new GridLayout(3, 2, 5, 5));

        JTextField carPlateField = new JTextField(15);

        // ทำการเพิ่ม Label และ TextField ลงไปใน dialog สำหรับทำการค้นหาข้อมูลที่ต้องการแสดงข้อมูลออกมา โดยทำการใช้ตัวทะเบียนรถเป็นตัวในการค้นหา
        dialog.add(new JLabel("Enter Car Plate to Print Data:"));
        dialog.add(carPlateField);

        JButton printButton = new JButton("Print");
        printButton.addActionListener(e -> {
            String carPlate = carPlateField.getText();
            String carData = data.toString(carPlate); // ทำการส่งข้อมูลใน carPlate เข้าไปใน object data แล้วส่งค่าที่ได้กลับมาเก็บไว้ในตัวแปร carData
            JOptionPane.showMessageDialog(dialog, carData, "Car Data", JOptionPane.INFORMATION_MESSAGE);
        });

        dialog.add(printButton);
        dialog.setSize(300, 200);
        dialog.setLocationRelativeTo(parentFrame);
        dialog.setVisible(true);
    }
}
