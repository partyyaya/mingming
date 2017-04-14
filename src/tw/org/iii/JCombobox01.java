package tw.org.iii;

import java.awt.Color;

import javax.swing.*;

public class JCombobox01 {

	JCombobox01() {
		// 宣告視窗元件
				JFrame frame = new JFrame();
				// 設定視窗標題
				frame.setTitle("Java 基本視窗");
				// 設定視窗布局格式
				frame.setLayout(null);
				
				// 宣告JComboBox
				JComboBox comebox = new JComboBox();
				// 增加內容到comebox
				comebox.addItem("A");
				comebox.addItem("B");
				comebox.addItem("C");
				comebox.addItem("D");
				// 設定物件(X軸,Y軸,寬,高)
				comebox.setBounds(60, 40, 100, 20);
				// 將物件新增到視窗內
				frame.add(comebox);

				// 設定視窗大小(寬,高)
				frame.setSize(250, 200);
				// 顯示視窗
				frame.setVisible(true);
			}

			public static void main(String args[]) {
				new JCombobox01();
			}
}