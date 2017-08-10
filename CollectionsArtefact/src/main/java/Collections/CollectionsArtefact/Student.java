package Collections.CollectionsArtefact;

public class Student {
	
	int dbid;
	
	private String name;
	private int varsta;
	private int nota;
	
	
	
	public Student(String name, int varsta, int nota) {
		
		this.name = name;
		this.varsta = varsta;
		this.nota = nota;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + nota;
		result = prime * result + varsta;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nota != other.nota)
			return false;
		if (varsta != other.varsta)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", varsta=" + varsta + ", nota=" + nota + "]"+"\n";
	}
	
	

}
