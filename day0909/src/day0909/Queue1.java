package day0909;

import java.util.LinkedList;
import java.util.Stack;

class Message{
	String command;
	String to;
	
	public void Command() {
		this.command=command;
	}
	public void to() {
		this.to=to;
	}
	public Message(String command, String to) {
		this.command=command;
		this.to=to;
	}
	
}

public class Queue1 {

	public static void main(String[] args) {
		Stack<Message> msgQueue = new Stack<Message>();
		
		msgQueue.push(new Message("mail","김그린"));
		msgQueue.push(new Message("sms","이자바"));
		msgQueue.push(new Message("kakaotalk","정디비"));
		
		while(!msgQueue.isEmpty()) {
			Message msg = msgQueue.pop();
			
			switch(msg.command) {
			case "mail":
				System.out.println(msg.to+"님께 메일을 보냅니다.");
				break;
			case "sms":
			System.out.println(msg.to+"님께 문자을 보냅니다.");
			break;
			case "kakaotalk":
			System.out.println(msg.to+"님께 카카오톡을 보냅니다.");
			break;
			}
		}
	}
}
