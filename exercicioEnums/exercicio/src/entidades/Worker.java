package entidades;

import java.util.ArrayList;
import java.util.List;

import enums.WorkerLevel;

public class Worker {
    private String nome;
    private WorkerLevel level;
    private double salarioBase;

    private Department departamento;
    private List<HourContract> contratos = new ArrayList<>();
    
    

    public Worker(String nome, WorkerLevel level, double salarioBase, Department departamento) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    
    public Department getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(Department departamento) {
        this.departamento = departamento;
    }
    
    public List<HourContract> getContrato() {
        return contratos;
    }
    
    public void setContrato(List<HourContract> contrato) {
        this.contratos = contrato;
    }
    public void addContract(HourContract contrato){
        contratos.add(contrato);
    }
    public void removeContract(HourContract contrato){
        contratos.remove(contrato);
    }
}
