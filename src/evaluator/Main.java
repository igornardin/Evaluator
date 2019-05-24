package evaluator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.RList;
import org.rosuda.JRI.Rengine;

public class Main {
	static Rengine re;
    static REXP resp;
    static int forecast = 8;
    static double[][] values;
    static FileWriter arq;
    static PrintWriter gravarArq;
	
	public static void main(String[] args) throws IOException {
		arq = new FileWriter("/home/igornardin/Documentos/Dissertação/saida.txt");
		gravarArq = new PrintWriter(arq);
	
	    String[] arg = {"--no-save"};
		re = new Rengine(arg, true, null);
		re.eval("require(forecast)");
		values = new double[27][150];
		long start = System.currentTimeMillis();
		System.out.println("Crescente");
		gravarArq.println("Crescente");
		process(new double[]{5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160, 165, 170, 175, 180, 185, 190, 195, 200, 205, 210, 215, 220, 225, 230, 235, 240, 245, 250, 255, 260, 265, 270, 275, 280, 285, 290, 295, 300, 305, 310, 315, 320, 325, 330, 335, 340, 345, 350, 355, 360, 365, 370, 375, 380, 385, 390, 395, 400, 405, 410, 415, 420, 425, 430, 435, 440, 445, 450, 455, 460, 465, 470, 475, 480, 485, 490, 495, 500, 505, 510, 515, 520, 525, 530, 535, 540, 545, 550, 555, 560, 565, 570, 575, 580, 585, 590, 595, 600});
		System.out.println("Decrescente");
		gravarArq.println("Decrescente");
		process(new double[]{600, 595, 590, 585, 580, 575, 570, 565, 560, 555, 550, 545, 540, 535, 530, 525, 520, 515, 510, 505, 500, 495, 490, 485, 480, 475, 470, 465, 460, 455, 450, 445, 440, 435, 430, 425, 420, 415, 410, 405, 400, 395, 390, 385, 380, 375, 370, 365, 360, 355, 350, 345, 340, 335, 330, 325, 320, 315, 310, 305, 300, 295, 290, 285, 280, 275, 270, 265, 260, 255, 250, 245, 240, 235, 230, 225, 220, 215, 210, 205, 200, 195, 190, 185, 180, 175, 170, 165, 160, 155, 150, 145, 140, 135, 130, 125, 120, 115, 110, 105, 100, 95, 90, 85, 80, 75, 70, 65, 60, 55, 50, 45, 40, 35, 30, 25, 20, 15, 10, 5});
		System.out.println("Constante");
		gravarArq.println("Constante");
		process(new double[]{300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300, 300});
		System.out.println("Onda");
		gravarArq.println("Onda");
		process(new double[]{300, 331.358539, 362.3735072, 392.7050983, 422.0209929, 450, 476.3355757, 500.7391819, 522.9434476, 542.7050983, 559.8076211, 574.0636373, 585.3169549, 593.4442802, 598.3565686, 600, 598.3565686, 593.4442802, 585.3169549, 574.0636373, 559.8076211, 542.7050983, 522.9434476, 500.7391819, 476.3355757, 450, 422.0209929, 392.7050983, 362.3735072, 331.358539, 300, 268.641461, 237.6264928, 207.2949017, 177.9790071, 150, 123.6644243, 99.26081809, 77.05655236, 57.29490169, 40.19237886, 25.93636271, 14.68304511, 6.55571978, 1.64343139, 0, 1.64343139, 6.55571978, 14.68304511, 25.93636271, 40.19237886, 57.29490169, 77.05655236, 99.26081809, 123.6644243, 150, 177.9790071, 207.2949017, 237.6264928, 268.641461, 300, 331.358539, 362.3735072, 392.7050983, 422.0209929, 450, 476.3355757, 500.7391819, 522.9434476, 542.7050983, 559.8076211, 574.0636373, 585.3169549, 593.4442802, 598.3565686, 600, 598.3565686, 593.4442802, 585.3169549, 574.0636373, 559.8076211, 542.7050983, 522.9434476, 500.7391819, 476.3355757, 450, 422.0209929, 392.7050983, 362.3735072, 331.358539, 300, 268.641461, 237.6264928, 207.2949017, 177.9790071, 150, 123.6644243, 99.26081809, 77.05655236, 57.29490169, 40.19237886, 25.93636271, 14.68304511, 6.55571978, 1.64343139, 0, 1.64343139, 6.55571978, 14.68304511, 25.93636271, 40.19237886, 57.29490169, 77.05655236, 99.26081809, 123.6644243, 150, 177.9790071, 207.2949017, 237.6264928, 268.641461});
		arq.close();
		long elapsed = System.currentTimeMillis() - start;
		System.out.println("Tempo total: " + elapsed);
	}
	
	public static void process(double[] aux) {
		for (int g = 0; g < 3; g++) {
			for (int b = 0; b < 3; b++) {
				for (int a = 0; a < 3; a++) {
					System.out.println("Arima("+a+","+b+","+g+")");				
					for (int i = 0; i < aux.length; i++) {
						double[] aux2 = new double[i+1];
						for (int j = 0; j <= i; j++) {
							aux2[j] = aux[j];
						}
						re.assign("y", aux2);
						if (i > 5){
							values[(a*9)+(b*3)+g][i+forecast] = arima(i, aux[i], a, b, g);
						}				
					}
				}
			}
		}
		gravarArq.println("Sequência;Real;Arima(0,0,0);Arima(0,0,1);Arima(0,0,2);Arima(0,1,0);Arima(0,1,1);Arima(0,1,2);Arima(0,2,0);Arima(0,2,1);Arima(0,2,2);Arima(1,0,0);Arima(1,0,1);Arima(1,0,2);Arima(1,1,0);Arima(1,1,1);Arima(1,1,2);Arima(1,2,0);Arima(1,2,1);Arima(1,2,2);Arima(2,0,0);Arima(2,0,1);Arima(2,0,2);Arima(2,1,0);Arima(2,1,1);Arima(2,1,2);Arima(2,2,0);Arima(2,2,1);Arima(2,2,2);");
		for (int i = 0; i < aux.length; i++) {
			String valores = "";
			for (int j = 0; j < 27; j++) {
				valores += ";" + values[j][i];
			}
			gravarArq.println(i + ";" + aux[i] + valores);
		}
	}
	
	public static double arima(int posatu, double valor, int a, int b, int g) {
        re.eval("fit=arima(y, c(" + a +","+ b + "," + g + "))");
        resp = re.eval("f <- forecast(fit, h=" + forecast + ")");
        RList r = resp.asList();
        return r.at(3).asDoubleArray()[forecast - 1];
	}

	public static double holt(int posatu, double valor, int a, int b, int g) {
        re.eval("fit=arima(y, c(" + a +","+ b + "," + g + "))");
        resp = re.eval("f <- forecast(fit, h=" + forecast + ")");
        RList r = resp.asList();
        return r.at(3).asDoubleArray()[forecast - 1];
	}

	
}
