package Project;

import javax.swing.*;
import java.awt.*;

public class gui_data {
    // method สำหรับการปรับขนาดของไอคอนให้มีขนาดพอดีกับ button
    public ImageIcon resizeIcon(String path, int width, int height) { // รับค่า parameter ที่ถูกส่งมาเก็บไว้ในตัวแปรต่าง
                                                                      // ๆ ที่ได้มีการประกาศไว้ในวงเล็บ
        ImageIcon icon = new ImageIcon(path); // สร้าง object icon สำหรับการเก็บรูปภาพที่ถูกส่งมาและเก็บไว้ในตัวแปร path
        Image img = icon.getImage(); // ทำการดึงรูปภาพออกมาจาก icon แล้วทำการเก็บรูปภาพนั้นไว้ในตัวแปร img (getImage
                                     // = ดึงรูปภาพออกมาจากตัวแปรนั้น)
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH); // ทำการปรับขนาดของรูปภาพที่เก็บไว้ในตัวแปรให้มีความสมูทขึ้น
                                                                                     // ผ่านคำสั่ง SCALE_SMOOTH
                                                                                     // (getScaledInstance =
                                                                                     // ปรับขนาดรูปภาพที่ถูกเก็บไว้ในตัวแปรตัวนั้น)
        return new ImageIcon(resizedImg); // สร้าง object ที่มีการส่งค่าที่เก็บไว้ในตัวแปร resizedImg
                                          // กลับไปยังบรรทัดที่เรียกใช้งาน (เนื่องจากในบรรทัดที่เรียกใช้งาน method นี่
                                          // เป็นการประกาศ object ทำให้ค่าที่ส่งกลับไปต้องเป็น object เหมือนกัน)
    }

    // methode สำหรับการสร้างและกำหนดขนาดของปุ่ม menu
    public JButton createButton(String text, ImageIcon icon) { // รับค่า parameter ที่ถูกส่งมาเก็บไว้ในตัวแปรต่าง ๆ
                                                               // ที่ได้มีการประกาศไว้ในวงเล็บ
        JButton button = new JButton(text, icon); // สร้าง object button
                                                  // สำหรับการสร้างปุ่มเมนูที่ทำการเก็บข้อมูลจากค่าที่ถูกส่งมาใน
                                                  // parameter โดยทำการดึงออกมาจากตัวแปร text และ icon
        button.setPreferredSize(new Dimension(200, 60)); // ทำการกำหนดขนาดให้กับ button ให้มีขนาดตามค่าที่ต้องการ
                                                         // (หน่วยเป็น px)
        button.setAlignmentX(Component.CENTER_ALIGNMENT); // ทำการจัดตำแหน่งของ button ให้อยู่ในตำแหน่งกึ่งกลาง
        button.setBackground(new Color(0xf6bd33)); // ทำการกำหนดสีพื้นหลังของ button ให้มีสีตามที่ต้องการ
        button.setForeground(Color.BLACK); // ทำการกำหนดสีข้อความของ button ให้มีสีตามที่ต้องการ
        button.setFont(new Font("Arial", Font.BOLD, 16)); // ทำการกำหนด font และขนาดของ font ให้กับข้อความใน button
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2)); // ทำการกำนดกรอบให้กับ button
                                                                          // ให้มีความหนาและสีตามที่เราต้องการ
                                                                          // (หน่วยเป็น px)
        button.setFocusPainted(false); // ทำการปิดการแสดงของขอบและเงาเมื่อเราทำการกดหรือเลือกปุ่มเมนูที่เราต้องการเลือก
        button.setContentAreaFilled(false); // ทำการกำหนดให้ button ไม่มีสีพื้นหลังในเนื้อหาต่าง ๆ ของปุ่ม (โปร่งใส)
        button.setOpaque(true); // ทำการกำหนดให้ button มีลักษณะที่ดูโปร่งใส
        return button; // ทำการส่งค่าของ button ที่มีการกำหนดค่าต่าง ๆ
                       // ไว้กลับไปยังบรรทัดที่เราทำการประกาศเรียกใช้ createButton
    }

    // methode สำหรับการสร้าง JPanel ที่ใช้สำหรับการบรรจุปุ่มเมนูต่าง ๆ ลงไปในนั้น
    public JPanel createPanel(JButton button) { // รับค่า parameter ที่ถูกส่งมาเก็บไว้ในตัวแปรต่าง ๆ
                                                // ที่ได้มีการประกาศไว้ในวงเล็บ
        JPanel panel = new JPanel(); // สร้าง object panel สำหรับการเพิ่มปุ่มเมนูต่าง ๆ ที่สร้างไว้ลงไปในนั้น
        panel.setLayout(new FlowLayout(FlowLayout.CENTER)); // ทำการจัด layout ของ panel แบบ FlowLayout
                                                            // โดยมีการจัดเรียงข้อมูลต่าง ๆ ของปุ่มเมนูไว้ในกึ่งกลาง
        panel.setOpaque(false); // ทำการกำหนดให้ panel มีลักษณะโปร่งใส โดยปิดการเติมสีพื้น
        panel.add(button); // ทำการเพิ่มปุ่มเมนูต่าง ๆ ลงไปใน panel
        return panel; // ทำการส่งค่าของ panel ที่ทำการเพิ่มปุ่มเมนูลงไปใน panel แล้ว
                      // ส่งกลับไปยังบรรทัดที่มีการประกาศเรียกใช้ method createPanel
    }
}
