package sub1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LayerController implements Initializable{
	
	@FXML private Button btnLogin;
	@FXML private Button btnCancel;
	@FXML private TextField txtUid;
	@FXML private TextField txtPass;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//�����̺�Ʈ �ڵ鷯(ó����, �����)����
		btnLogin.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				String uid= txtUid.getText();
				String pass=txtPass.getText();
				
				if(uid.equals("hong")  && pass.equals("1234")) {
					System.out.println(uid+"�� �ݰ����ϴ�.");
				}else {
					System.out.println("�α��� ����....");
				}
				System.out.println("�α��� ��ư Ŭ��!!!!");
				
				
			}
		});
		//���ٽ��� �̿��� �̺�Ʈ �ڵ鷯 ����
		btnCancel.setOnAction(event->btnCancelClick());
	}
	public void btnCancelClick() {
		System.out.println("��ҹ�ư Ŭ��!!!");
	}
	
}
