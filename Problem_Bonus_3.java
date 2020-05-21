import java.util.*;

public class Problem_Bonus_3 {

	public static void main(String[] args) {
		/*
		 * . . # . . . # # . . # # # . # # # # # # . # # # .
		 */
		Scanner input = new Scanner(System.in);
		int lines = Integer.parseInt(input.nextLine());
		char[][] chars = new char[lines][lines];
		for (int i = 0; i < lines; i++) {
			chars[i] = input.nextLine().toCharArray();
		}
		int highestArea = 0;
		int lowestPerimeter = 0;
		/*
		 * char[][] chars = {{'#', '#', '.', '.', '.', '.'}, {'.', '.', '.', '.', '#',
		 * '.'}, {'.', '#', '.', '.', '#', '.'}, {'.', '#', '#', '#', '#', '#'}, {'.',
		 * '.', '.', '#', '#', '#'}, {'.', '.', '.', '.', '#', '#'}}; // perim 24?
		 */ ArrayList<Point> points = new ArrayList<Point>();
		for (int row = 0; row < chars.length; row++) {
			for (int col = 0; col < chars[row].length; col++) {

				if (chars[row][col] == '#') {// enter in making new blob
					points = new ArrayList<Point>();
					points.add(new Point(col, row, false));
					while (!allChecked(points)) {// if not all points are checked
						/*
						 * for (Point point: points) { System.out.println("times: " times + " checked: "
						 * + point.checked);
						 * 
						 * } System.out.println(points.size());
						 */

						Point firstPoint = new Point(0, 0, false);
						int index = 0;
						boolean firstFound = false;
						while (!firstFound) { // get the first point that isn't checked
							if (!points.get(index).checked) {
								firstPoint = points.get(index);
								points.get(index).checked = true;
								firstFound = true;

							}
							index++;

						}
						index--;
						// first point has been gotten

						int foundX = firstPoint.x;
						int foundY = firstPoint.y;
						/*
						 * System.out.println("foundX: " + foundX); System.out.println("foundY: " +
						 * foundY);
						 */
						/*
						 * int foundX = points.get(index).x; int foundY = points.get(index).y;
						 */
						if (valid(chars, points, foundX - 1, foundY)) {
							points.add(new Point(foundX - 1, foundY, false));
						}
						if (valid(chars, points, foundX + 1, foundY)) {
							points.add(new Point(foundX + 1, foundY, false));
						}
						if (valid(chars, points, foundX, foundY - 1)) {
							points.add(new Point(foundX, foundY - 1, false));
						}
						if (valid(chars, points, foundX, foundY + 1)) {
							points.add(new Point(foundX, foundY + 1, false));
						}
						// points.get(index).checked = true;
						// firstPoint.checked = true;
						/*
						 * if (inBounds(chars, foundX + 1, foundY) && !inArray(points, new Point(foundX
						 * + 1, foundY, false)) && chars[foundY][foundX + 1] == '#') {
						 * 
						 * } if (inBounds(chars, foundX, foundY - 1) && !inArray(points, new
						 * Point(foundX, foundY - 1, false)) && chars[foundY - 1][foundX] == '#') {
						 * 
						 * } if (inBounds(chars, foundX, foundY + 1) && !inArray(points, new
						 * Point(foundX, foundY + 1, false)) && chars[foundY + 1][foundX] == '#') {
						 * 
						 * }
						 */
					}
					// all points have been checked
					if (highestArea < points.size()) {
						highestArea = points.size();
						int perimeter = 0;
						for (Point point : points) {
							int x = point.x;
							int y = point.y;
							if (canBePerimeter(chars, x - 1, y)) {
								perimeter++;
							}
							if (canBePerimeter(chars, x + 1, y)) {
								perimeter++;
							}

							if (canBePerimeter(chars, x, y - 1)) {
								perimeter++;
							}
							if (canBePerimeter(chars, x, y + 1)) {
								perimeter++;
							}
						}
						lowestPerimeter = perimeter;
						/*
						 * if (lowestPerimeter == 0) { lowestPerimeter = perimeter; } else { if
						 * (perimeter < lowestPerimeter) { lowestPerimeter = perimeter; } }
						 */
					}
					if (highestArea == points.size()) {
						int perimeter = 0;
						for (Point point : points) {
							int x = point.x;
							int y = point.y;
							if (canBePerimeter(chars, x - 1, y)) {
								perimeter++;
							}
							if (canBePerimeter(chars, x + 1, y)) {
								perimeter++;
							}

							if (canBePerimeter(chars, x, y - 1)) {
								perimeter++;
							}
							if (canBePerimeter(chars, x, y + 1)) {
								perimeter++;
							}
						}
						if (lowestPerimeter == 0) {
							lowestPerimeter = perimeter;
						} else {
							if (perimeter < lowestPerimeter) {
								lowestPerimeter = perimeter;
							}
						}
					}
					/*
					 * int perimeter = 0; for (Point point: points) { int x = point.x; int y =
					 * point.y; if (canBePerimeter(chars, x - 1, y)) { perimeter++; } if
					 * (canBePerimeter(chars, x + 1, y)) { perimeter++; }
					 * 
					 * if (canBePerimeter(chars, x - 1, y - 1)) { perimeter++; } if
					 * (canBePerimeter(chars, x - 1, y + 1)) { perimeter++; } } if (lowestPerimeter
					 * == 0) { lowestPerimeter = perimeter; } else { if (perimeter <
					 * lowestPerimeter) { lowestPerimeter = perimeter; } }
					 */
				}
			}
		}
		System.out.println("highestArea: " + highestArea);
		System.out.println("lowestPerimeter: " + lowestPerimeter);
	}

	public static boolean canBePerimeter(char[][] chars, int x, int y) {
		if (!inBounds(chars, x, y)) {
			return true;
		}
		return chars[y][x] == '.';
	}

	public static boolean valid(char[][] chars, ArrayList<Point> points, int x, int y) {
		return inBounds(chars, x, y) && !inArray(points, new Point(x, y, false)) && chars[y][x] == '#';
	}

	public static boolean inBounds(char[][] chars, int x, int y) {
		return 0 <= x && x < chars[0].length && 0 <= y && y < chars.length;
	}

	public static boolean allChecked(ArrayList<Point> points) {
		boolean returnBoolean = true;
		for (Point point : points) {
			if (!point.checked) {
				returnBoolean = false;
			}
		}
		return returnBoolean;
	}

	public static boolean inArray(ArrayList<Point> points, Point point) {
		boolean returnBoolean = false;
		for (Point thisPoint : points) {
			if (thisPoint.equals(point)) {
				returnBoolean = true;
			}
		}
		return returnBoolean;
	}

	static class Point {
		int x;
		int y;
		boolean checked;

		public Point(int x, int y, boolean checked) {
			this.x = x;
			this.y = y;
			this.checked = checked;
		}

		public boolean equals(Point point) {
			return x == point.x && y == point.y;
		}
	}
}
