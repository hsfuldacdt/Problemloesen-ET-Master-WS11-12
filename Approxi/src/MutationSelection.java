
public class MutationSelection {
	
	public void mutselect(double dx, double x0){
		double xneu;
		double imax = 100;
		double y,y0;
			
		y0 = fcn(x0);
		for(int i=0; i<imax; i++){
			xneu = x0 + 0.5-Math.random()*dx;
			y = fnc(xneu);
			if (y < y0){
				y0 = y; x0 = xneu;
			}
		}
	}
}
