package com.oocl;

import java.util.ArrayList;

public class Excercise1 {

	// public static void main(String[] args) {
	// // TODO Auto-generated method stub
	//
	// }

	public String trnc(String str) {
		if (str.length() <= 2)
			return str.replace("A", "");

		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Chars = str.substring(2);

		return first2Chars.replaceAll("A", "") + stringMinusFirst2Chars;
	}

	public boolean areFirstAndLastTwiCharactersTheSame(String str) {
		if (str.length() <= 1) {
			return false;
		}
		if (str.length() == 2) {
			return true;
		}

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);
		return first2Chars.equals(last2Chars);
	}

	public ArrayList<Excercise6> Excercise6(int n) {

		ArrayList<Excercise6> result = new ArrayList<Excercise6>();
		Excercise6 x = new Excercise6();

		for (float i = 1; i <= n; i++) {
			x = new Excercise6();
			for (float j = 1; j <= n; j++) {
				float temp = (float) ((float) (i / n) + (float) (j / n));
				x.setX(temp);
				System.out.print(temp + "\t");

			}
			System.out.println();
			result.add(x);
			x = null;
		}
		return result;
	}
}

class Excercise6 {
	private ArrayList<Float> x = new ArrayList<Float>();

	public ArrayList<Float> GetList() {
		return x;
	}

	public void SetList(ArrayList<Float> z) {
		x = z;
	}

	public void setX(float num) {
		x.add(num);
	}

	public float getSpecific(int pos) {
		return x.get(pos);
	}
}
