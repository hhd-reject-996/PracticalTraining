package com.elucidator.jihe;

import java.util.*;
/**
 * ��Ψһ��List
 * 	Ҫ��ȫ��?
 * 		�ǣ�Vector
 * 		��ArrayList����LinkedList
 * 			��ѯ�ࣺArrayList
 * 			��ɾ�ࣺLinkedList
 * �����֪����List�����ǲ�֪�����ĸ�List������ArrayList��
 * @author Administrator
 */

public class ListTest {
	
	public static void main(String[] args) {
//		List ����,���ظ�,�����ǽӿ�,ͬʱ�̳�Connection�ӿ�
//		ArrayList��Vector��LinkedList����List��ʵ����
		List<String> list=new ArrayList<>();
		/*�ŵ�: �ײ����ݽṹ�����飬��ѯ�죬��ɾ����
		ȱ��: �̲߳���ȫ��Ч�ʸ�*/
		List<String> vector = new Vector<>();
		/*�ŵ�: �ײ����ݽṹ�����飬��ѯ�죬��ɾ����
		ȱ��: �̰߳�ȫ��Ч�ʵ�*/
		List<String> linkedList = new LinkedList<>();
		/*�ŵ�: �ײ����ݽṹ����������ѯ������ɾ�졣
		ȱ��: �̲߳���ȫ��Ч�ʸ�*/
		String strs="asdfggjf123852";
		String str;
		char[] chars=strs.toCharArray();
		for(char ch:chars){
			str=String.valueOf(ch);
			System.out.print(ch);
			list.add(str);
			vector.add(str);
			linkedList.add(str);
		}
		System.out.println();
		System.out.println(list);
		System.out.println(vector);
		System.out.println(linkedList);
	}	
}