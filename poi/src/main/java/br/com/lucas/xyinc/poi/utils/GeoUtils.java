package br.com.lucas.xyinc.poi.utils;

public class GeoUtils {
	public static Double distance(Long x1, Long x2, Long y1, Long y2) {
		return Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));
    }
}
