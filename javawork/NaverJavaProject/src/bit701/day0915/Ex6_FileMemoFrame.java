package bit701.day0915;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ex6_FileMemoFrame  extends JFrame{
	JTextArea memoArea;
	JButton btnSave,btnOpen,btnClear;

	public Ex6_FileMemoFrame(String title) {
		// TODO Auto-generated constructor stub
		super(title);//JFrame 의 문자열을 받는 생성자 호출
		this.setLocation(300, 100);//프레임의 시작위치
		this.setSize(500, 600);//프레임의 너비,높이
		//this.getContentPane().setBackground(Color.green);//Color 상수를 이용해서 변경
		this.getContentPane().setBackground(new Color(200, 255, 180));//0~255 의 rgb

		//디자인이나 이벤트를 구현할 메서드 호출
		this.setDesign();

		this.setVisible(true);//true:프레임을 보이게하기, false:프레임숨기기

		//윈도우 이벤트 발생-익명내부클래스 형태로 이벤트 구현
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) { //x버튼 클릭시 호출되는 메서드
				// TODO Auto-generated method stub
				//JOptionPane.showMessageDialog(SwingGibon.this,"프레임을 종료합니다");
				//실제종료
				System.exit(0);//정상종료
				super.windowClosing(e);
			}
		});
	}

	private void setDesign() {
		// TODO Auto-generated method stub
		btnSave=new JButton("파일저장");
		btnOpen=new JButton("파일열기");
		btnClear=new JButton("내용지우기");

		JPanel p=new JPanel();
		p.add(btnSave);
		p.add(btnOpen);
		p.add(btnClear);

		//Panel 을 North 에 추가
		this.add(p,"North");

		memoArea=new JTextArea("내용을 입력해보세요");
		//this.add(memoArea,"Center");//데이타가 길경우 스크롤바가 안생김

		this.add(new JScrollPane(memoArea),"Center");//스크롤바가 생김

		//버튼:내용지우기
		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				memoArea.setText("");
			}
		});

		//버튼:파일저장
		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FileDialog dlg=new FileDialog(Ex6_FileMemoFrame.this,"메모장저장",FileDialog.SAVE);
				dlg.setVisible(true);
				//System.out.println("디렉토리:"+dlg.getDirectory());
				//System.out.println("파일명:"+dlg.getFile());

				//취소시 메서드 종료
				if(dlg.getDirectory()==null) 
					return;

				String fileName=dlg.getDirectory()+dlg.getFile()+".txt";
				String memoText=memoArea.getText();//저장할 내용

				FileWriter fw=null;
				try {
					fw=new FileWriter(fileName);
					//내용 저장
					fw.write(memoText);
					//메모장에 메세지 넣기
					memoArea.setText("저장되었습니다");
				} catch (IOException e1) {
					System.out.println("메모장 저장하다가 오류가 났네요!"+e1.getMessage());
				}finally {
					try {
						fw.close();
					}catch (NullPointerException|IOException e1) {
						//close 시 나올만한 Ecxception 두개 나열
					}
				}			

			}
		});

		//버튼:파일열기
		btnOpen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				FileDialog dlg=new FileDialog(Ex6_FileMemoFrame.this,"파일열기",FileDialog.LOAD);
				dlg.setVisible(true);
				//System.out.println("디렉토리:"+dlg.getDirectory());
				//System.out.println("파일명:"+dlg.getFile());

				//취소시 메서드 종료
				if(dlg.getDirectory()==null) 
					return;

				String fileName=dlg.getDirectory()+dlg.getFile();
				
				FileReader fr=null;
				BufferedReader br=null;
				try {
					fr=new FileReader(fileName);
					br=new BufferedReader(fr);
					
					//메모장의 기본 내용 지우기
					memoArea.setText("");
					
					while(true)
					{
						String line=br.readLine();
						if(line==null)
							break;
						
						memoArea.append(line+"\n");
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}finally {
					try {
						br.close();
						fr.close();
					} catch (IOException|NullPointerException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}			

			}
		});


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex6_FileMemoFrame s=new Ex6_FileMemoFrame("간단한 메모장");
	}

}














