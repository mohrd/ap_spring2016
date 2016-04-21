package hw2;

/**
 * Created by Nima Vahidi Ferdowsi, Saeed Rastgar, Masih Abolfazli.
 */
public class P4_3 {
	public static void main(String[] args) {
		final double AtlantaX = 33.7489954, AtlantaY = -84.3879824;
		final double OrlandoX = 28.5383355, OrlandoY = -81.37923649999999;
		final double SavannahX = 32.0835407, SavannahY = -81.09983419999998;
		final double CharlotteX = 35.2270869, CharlotteY = -80.84312669999997;
		final double EarthR = 6371.010;

		final double AC = EarthR * Math.acos(Math.sin(Math.toRadians(AtlantaX)) * Math.sin(Math.toRadians(CharlotteX)) + Math.cos(Math.toRadians(AtlantaX)) * Math.cos(Math.toRadians(CharlotteX)) * Math.cos(Math.toRadians(AtlantaY - CharlotteY)));
		final double AS = EarthR * Math.acos(Math.sin(Math.toRadians(AtlantaX)) * Math.sin(Math.toRadians(SavannahX)) + Math.cos(Math.toRadians(AtlantaX)) * Math.cos(Math.toRadians(SavannahX)) * Math.cos(Math.toRadians(AtlantaY - SavannahY)));
		final double SC = EarthR * Math.acos(Math.sin(Math.toRadians(SavannahX)) * Math.sin(Math.toRadians(CharlotteX)) + Math.cos(Math.toRadians(SavannahX)) * Math.cos(Math.toRadians(CharlotteX)) * Math.cos(Math.toRadians(SavannahY - CharlotteY)));
		final double AO = EarthR * Math.acos(Math.sin(Math.toRadians(AtlantaX)) * Math.sin(Math.toRadians(OrlandoX)) + Math.cos(Math.toRadians(AtlantaX)) * Math.cos(Math.toRadians(OrlandoX)) * Math.cos(Math.toRadians(AtlantaY - OrlandoY)));
		final double SO = EarthR * Math.acos(Math.sin(Math.toRadians(SavannahX)) * Math.sin(Math.toRadians(OrlandoX)) + Math.cos(Math.toRadians(SavannahX)) * Math.cos(Math.toRadians(OrlandoX)) * Math.cos(Math.toRadians(SavannahY - OrlandoY)));

		double area = 0.0;
		double s = (AC + AS + SC) / 2.0;
		double s1 = (AS + AO + SO) / 2.0;
		area += Math.sqrt(s * (s - AC) * (s - AS) * (s - SC));
		area += Math.sqrt(s1 * (s1 - AS) * (s1 - AO) * (s1 - SO));
		System.out.println(area);
	}
}