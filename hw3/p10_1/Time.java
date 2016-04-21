package hw3.p10_1;

/**
 * Created with ♥ by Mohammad-Reza on 15/Apr/2016.
 */
class Time {
	private int hour;
	private int minute;
	private int second;

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public Time() {
		this(System.currentTimeMillis());
	}

	public Time(long elapseTime) {
		setTime(elapseTime);
	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setTime(long elapseTime) {
		long totalSeconds = elapseTime / 1000;
		this.second = (int) (totalSeconds % 60);

		long totalMinutes = totalSeconds / 60;
		this.minute = (int) (totalMinutes % 60);

		long totalHours = totalMinutes / 60;
		this.hour = (int) (totalHours % 24);
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d GMT", hour, minute, second);
	}
}
