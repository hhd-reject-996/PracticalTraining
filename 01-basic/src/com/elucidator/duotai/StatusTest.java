package com.elucidator.duotai;

/**
 * 
 * @author Administrator
 *
 *java�ж�̬��Ϊ�����ࣺ1��������̬(��������д������) 2�������̬(����ת�͡�����ת�ͣ�ǿת��)
 *��д:�����ڸ�������࣬������д�����еķ��������ж�����һ�£����������
 *����:�������еķ�������������ͬ���������������͡�����ֵ���Բ�ͬ
 *����ת��:�ؼ�����ʵ��ʹ�õ����ĸ����࣬���ұ����÷����Ƿ�������д�����ǣ������������д����
 *	��Ҫ���ڲ���ͳһ����һ����ɽ�����������ʵ��
 *����ת��:��������������������Ҫǿת��
 *	����:���������������еķ���,<��Ҫ��������ת�ͣ��ڲ�������ת��>
 *
 *ÿ���඼�̳���Object�� ����Ĭ���޲ι��췽��
 *super(); ����ֱ�Ӹ�����޲ι��췽��
 *instanceof�ؼ��� ������������Ҫ�����ж������Ƿ����ڸ���
 */
public class StatusTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ͳһ
		Father father = new Father();
		System.out.println(father instanceof Father);
		System.out.println(father instanceof son);
		father.print();
		father = new son();
		father.print();//��ʾ���Ǹ����еķ�������ʵ�ʴ�ӡ�������еķ���
		father = new daughter();
		father.print();
//		father.fuc();//����ת�ͺ�ֻ�ܵ���������д�ķ����͸����еķ�����ȴ���ܵ���������еķ���
		son boy =new son();
		System.out.println(boy instanceof Father);		
		daughter girl=(daughter) father;
		girl.fuc();//����ת�ͣ�ʹ������չ���õ������еķ���
		girl.print();//ͬʱ����������д�ķ���
		System.out.println(girl instanceof Father);

	}

}
class Father{
	
	public Father() {
		super();//ֱ�Ӹ�����Object
		// TODO Auto-generated constructor stub
	}

	public void print(){
		System.out.println("����father");
	}
}
class son extends Father{
	
	public son() {
		super();//ֱ�Ӹ�����Father
		// TODO Auto-generated constructor stub
	}

	public void print(){
		System.out.println("����son");
	}
}
class daughter extends Father{
	
	public daughter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void print(){
		System.out.println("����daugther");
	}
	public void fuc(){
		System.out.println("daugther���еķ���");
	}
}