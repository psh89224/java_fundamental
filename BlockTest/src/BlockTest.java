
public class BlockTest {
	static {
		System.out.println("static {}");		// Ŭ���� �ʱ���
	}
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ");		// �ν��Ͻ� �ʱ���
	}
	public BlockTest() {
		System.out.println("����Ʈ ������");
	}
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		System.out.println("");
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		BlockTest bt2 = new BlockTest();
	}
}
