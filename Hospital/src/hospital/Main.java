package hospital;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medico medico = new Cardiologista();
		medico = new Pediatra();
		medico = new Clinico();
		System.out.print(medico.getEspecialidade());
	}

}
