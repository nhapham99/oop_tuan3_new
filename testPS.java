package bai2;

public class testPS {
	public static void main(String[] args) {
		PS ps1 = new PS(2, 3);
		ps1.print();
		PS ps2 = new PS(2, 5);
		ps2.print();
		PS psTong = ps1.congPS(ps2);
		psTong.print();
		PS psHieu = ps1.truPS(ps2);
		psHieu.print();
		PS psTich = ps1.nhanPS(ps2);
		psTich.print();
		PS psThuong = ps1.chiaPS(ps2);
		psThuong.print();
		PS ps3 = new PS(10, 15);
		System.out.println(ps1.equals(ps2));
	}
}
