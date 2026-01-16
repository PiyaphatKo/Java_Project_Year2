package Project;

import javax.swing.*;
import java.awt.*;

public class web_page {
    public static void main(String[] args) {
        // ประกาศสร้าง object ของ class update_data และ object สำหรับคำสั่ง Scanner
        gui_data gui = new gui_data() ; // สร้าง object data ที่ทำการไปดึงข้อมูลต่าง ๆ มาจาก class gui_data
        Show_data show = new Show_data() ; // สร้าง object data ที่ทำการไปดึงข้อมูลต่าง ๆ มาจาก class Show_data
        update_data data = new update_data(); // สร้าง object data ที่ทำการไปดึงข้อมูลต่าง ๆ มาจาก class update_data

        // ประกาศสร้าง object ของ JFrame สำหรับสร้างหน้า Interface (GUI)
        JFrame frame = new JFrame("Vehicle Management"); // สร้าง object frame โดยมีการกำหนดชื่อ Title ไว้ว่า "Vehicle Management"
        frame.setSize(500, 500);  // กำหนดขนาดของ frame ให้มีขนาดเท่ากับที่เราต้องการ (หน่วยเป็น px)
        frame.setLocationRelativeTo(null);  // กำหนดให้ frame ปรากฏชึ้นมากลางหน้าจอ (ถ้าไม่มี frame จะปรากฏอยู่ตรงมุมอื่นของหน้าจอ)
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));  // กำหนดให้ layout ของ frame มีการจัดเรียงข้อมูลแบบ BoxLayout โดยใช้การจัดเรียงข้อมูลแบบ Y_AXIS (แสดงข้อมูลแบบ 'บนลงล่าง')
        frame.getContentPane().setBackground(new Color(0x052B72)); // สีพื้นหลัง
        //frame.getContentPane() = ทำการเข้าถึง Content Pane ของ frame เพื่อสำหรับการกำหนด layout

        // ประกาศสร้าง ตัวแปร ของ ImageIcon สำหรับเก็บและแสดงผลภาพต่าง ๆ ออกมาเป็น Icon
        ImageIcon icon01 = gui.resizeIcon("src/Project/Icon01.png", 60, 60);  // สร้าง object icon01 สำหรับรูปไอคอนของปุ่ม 'Enter Data'
        ImageIcon icon02 = gui.resizeIcon("src/Project/Icon02.png", 60, 60);  // สร้าง object icon02 สำหรับรูปไอคอนของปุ่ม 'Update Data'
        ImageIcon icon03 = gui.resizeIcon("src/Project/Icon03.png", 60, 60);  // สร้าง object icon03 สำหรับรูปไอคอนของปุ่ม 'Print Data'
        ImageIcon icon04 = gui.resizeIcon("src/Project/Icon04.png", 60, 60);  // สร้าง object icon04 สำหรับรูปไอคอนของปุ่ม 'Exit'

        // ประกาศสร้าง object ของ JButton สำหรับสร้างปุ่มตัวเลือกเมนูต่าง ๆ ให้กับ JFrame
        JButton button1 = gui.createButton("Enter Data", icon01);  // สร้าง object button1 สำหรับปุ่มตัวเลือกเมนู "Enter Data"
        JButton button2 = gui.createButton("Update Data", icon02);  // สร้าง object button2 สำหรับปุ่มตัวเลือกเมนู ปุ่ม "Update Data"
        JButton button3 = gui.createButton("Print Data", icon03);  // สร้าง object button3 สำหรับปุ่มตัวเลือกเมนู ปุ่ม "Print Data"
        JButton button4 = gui.createButton("Exit", icon04);  // สร้าง object button4 สำหรับปุ่มตัวเลือกเมนู ปุ่ม "Exit"

        button1.addActionListener(e -> { // ทำการกำหนดเหตุการณ์เมื่อผู้ใช้ทำการกดปุ่ม "Enter data" ผ่านคำสั่ง addActionListener
            show.showEnterDataDialog(frame, data);  // เรียกใช้ method showEnterDataDialog โดยทำการส่ง object frame และ data เข้าไปเป็น parameter สำหรับการกรอกข้อมูลต่าง ๆ ของผู้ใช้งานระบบ
        });

        button2.addActionListener(e -> { // ทำการกำหนดเหตุการณ์เมื่อผู้ใช้ทำการกดปุ่ม "Update Data" ผ่านคำสั่ง addActionListener
            show.showUpdateDataDialog(frame, data);  // เรียกใช้ method showUpdateDataDialog โดยทำการส่ง object frame และ data เข้าไปเป็น parameter สำหรับการอัปเดต้อมูลต่าง ๆ ของผู้ใช้งานระบบ
        });

        button3.addActionListener(e -> { // ทำการกำหนดเหตุการณ์เมื่อผู้ใช้ทำการกดปุ่ม "Print data" ผ่านคำสั่ง addActionListener
            show.showPrintDataDialog(frame, data);  // เรียกใช้ method showPrintDataDialog โดยทำการส่ง object frame และ data เข้าไปเป็น parameter สำหรับการแสดงข้อมูลต่าง ๆ ของผู้ใช้งานระบบ
        });

        button4.addActionListener(e -> { // ทำการกำหนดเหตุการณ์เมื่อผู้ใช้ทำการกดปุ่ม "Exit" ผ่านคำสั่ง addActionListener
            // JOptionPane เป็นคลาสที่มีไว้สำหรับแสดง 'หน้าต่างป๊อปอัป (Dialog)' สำหรับการ แสดงข้อความต่าง ๆ และ รับค่าต่าง ๆ มาจากผู้ใช้งาน โดยไม่ต้องพึ่งการสร้าง JDialog (ช่วยลดบรรทัดในการเเขียนลงอย่างมาก)
            JOptionPane.showMessageDialog(frame, "Bye", "Exit", JOptionPane.INFORMATION_MESSAGE);  // JOptionPane ทำการแสดงข้อความ "Bye" ให้ปรากฏบนหนัาจอของผู้ใช้งาน โดยมี Title ว่า "Exit"
                                                                                                                //และมีการแจ้งให้ผู้ใช้งานระบบได้มีการรับทราบผ่านคำสั่ง .INFORMATION_MESSAGE
            frame.dispose(); // dispose = ทำการปิดหน้าต่างในส่วนนั้น ๆ โดยในที่นี้ก็คือการปิด frame (ทำการปิดโปรแกมหลักใน GUI)
        });

        // ทำการเพิ่มปุ่มเมนู ในแต่ละหัวข้อลงไปใน frame
        frame.add(gui.createPanel(button1)); // เรียกใช้ method createPanel โดยทำการเพิ่ม button1 ลงไปใน panel (ส่งข้อมูลของ button1 เข้าไปใน panel)
        frame.add(Box.createVerticalStrut(20));  // เพิ่มช่องว่างระหว่างปุ่มเมนูต่าง ๆ ในแนวตั้ง ด้วยคำสั่ง Box.createVerticalStrut(height)
        frame.add(gui.createPanel(button2)); // เรียกใช้ method createPanel โดยทำการเพิ่ม button2 ลงไปใน panel (ส่งข้อมูลของ button2 เข้าไปใน panel)
        frame.add(Box.createVerticalStrut(20)); // เพิ่มช่องว่างระหว่างปุ่มเมนูต่าง ๆ ในแนวตั้ง ด้วยคำสั่ง Box.createVerticalStrut(height)
        frame.add(gui.createPanel(button3)); // เรียกใช้ method createPanel โดยทำการเพิ่ม button3 ลงไปใน panel (ส่งข้อมูลของ button3 เข้าไปใน panel)
        frame.add(Box.createVerticalStrut(20)); // เพิ่มช่องว่างระหว่างปุ่มเมนูต่าง ๆ ในแนวตั้ง ด้วยคำสั่ง Box.createVerticalStrut(height)
        frame.add(gui.createPanel(button4)); // เรียกใช้ method createPanel โดยทำการเพิ่ม button4 ลงไปใน panel (ส่งข้อมูลของ button4 เข้าไปใน panel)

        frame.setVisible(true); // setVisible = กำหนดการแสดงผลของ frame (หากไม่ทำการกำหนดบรรทัดนี้ไว้ ตัวโปรแกรมจะไม่มีการแสดงหน้าต่างของ UI ขึ้นมาให้ใช้งาน)
    }

}
