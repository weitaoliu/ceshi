package cn.string.demo;

public class StringBufferDemo {

	public static void main(String[] args) {
		/**
		 *  StringBuffer�������ַ�����������
		 *	���ڴ洢���ݵ�������
		 *	�ص㣺
		 *	1�������ǿɱ��
		 *	2�����Դ洢��ͬ���͵�����
		 *	3������Ҫת���ַ�������ʹ��
		 *	4�����Զ��ַ��������޸�
		 *
		 *	��Ȼ��һ����������Ӧ�þ߱�ʲô���ܣ�
		 *	1�����
		 *		StringBuffer append(data);
		 *		StringBuffer insert(index, data)
		 *	2��ɾ��
		 *		StringBuffer delete(start, end)������ͷ������β
		 *		StringBuffer deleteCharAt(int index)��ɾ��ָ��λ�õ�Ԫ��
		 *	3������
		 *		char charAt(index)
		 *		int indexOf(string)
		 *		int lastIndexOf(string)
		 *	4���޸�
		 *		StringBuffer replace(start, end, string)
		 *		void setCharAt(index, char)
		 *	��ɾ�Ĳ�
		 */	
		bufferMethodDemo();
	}
	
	public static void bufferMethodDemo() {
		//��������������
		StringBuffer sb = new StringBuffer();
		
//		StringBuffer s1 = sb.append(4).append("������");
//		sb.insert(1, "������");
//		sb.setLength(8);
		for (int i = 0; i < 20; i++) {
			sb.append(i);
		}
		System.out.println(sb);
	}
}
