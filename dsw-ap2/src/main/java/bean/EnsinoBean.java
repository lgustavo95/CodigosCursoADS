package bean;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import dao.EnsinoDao;
import entidade.Ensino;

@ManagedBean(name = "bean")
public class EnsinoBean {

	private Ensino ensino = new Ensino();
	private List<Ensino> ensinos;

	public String salvar() {
		EnsinoDao.salvar(ensino);
		ensino = new Ensino();
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, null, "Ensino salvo com sucesso"));
		return null;
	}

	public String excluir() {
		EnsinoDao.excluir(ensino);
		ensinos.remove(ensino);
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, null, "Contato excluido com sucesso"));
		return null;
	}

	public String MessageItem() {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
		String dataCriacao = formato.format(ensino.getDataCriacao());
		FacesMessage mensagem1 = new FacesMessage(FacesMessage.SEVERITY_INFO, "Curso", ensino.getCurso());
		FacesMessage mensagem2 = new FacesMessage(FacesMessage.SEVERITY_INFO, "Professor", ensino.getProfessor());
		FacesMessage mensagem3 = new FacesMessage(FacesMessage.SEVERITY_INFO, "Data de criação", dataCriacao);
		FacesContext.getCurrentInstance().addMessage(null, mensagem1);
		FacesContext.getCurrentInstance().addMessage(null, mensagem2);
		FacesContext.getCurrentInstance().addMessage(null, mensagem3);
		return null;
	}

	public String MaiorId() {
		int ultimoIndice = ensinos.size() - 1;
		Ensino ultimoItem = ensinos.get(ultimoIndice);

		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
		String dataCriacao = formato.format(ultimoItem.getDataCriacao());
		FacesMessage mensagem1 = new FacesMessage(FacesMessage.SEVERITY_INFO, "Curso", ultimoItem.getCurso());
		FacesMessage mensagem2 = new FacesMessage(FacesMessage.SEVERITY_INFO, "Professor", ultimoItem.getProfessor());
		FacesMessage mensagem3 = new FacesMessage(FacesMessage.SEVERITY_INFO, "Data de criação", dataCriacao);
		FacesContext.getCurrentInstance().addMessage(null, mensagem1);
		FacesContext.getCurrentInstance().addMessage(null, mensagem2);
		FacesContext.getCurrentInstance().addMessage(null, mensagem3);
		return null;
	}

	public Ensino getEnsino() {
		return ensino;
	}

	public void setEnsino(Ensino ensino) {
		this.ensino = ensino;
	}

	public List<Ensino> getEnsinos() {
		if (ensinos == null) {
			ensinos = EnsinoDao.listar();
		}
		return ensinos;
	}

	public void setEnsinos(List<Ensino> ensinos) {
		this.ensinos = ensinos;
	}

}
