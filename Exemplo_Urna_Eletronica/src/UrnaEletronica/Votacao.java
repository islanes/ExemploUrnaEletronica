package UrnaEletronica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Islane dos S. Silva
 * @date   13/11/2016
 */
@Entity
@Table(name = "votacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Votacao.findAll", query = "SELECT v FROM Votacao v"),
    @NamedQuery(name = "Votacao.findById", query = "SELECT v FROM Votacao v WHERE v.id = :id"),
    @NamedQuery(name = "Votacao.findByVereador", query = "SELECT v FROM Votacao v WHERE v.vereador = :vereador"),
    @NamedQuery(name = "Votacao.findByPrefeito", query = "SELECT v FROM Votacao v WHERE v.prefeito = :prefeito"),
    @NamedQuery(name = "Votacao.findByDeputado", query = "SELECT v FROM Votacao v WHERE v.deputado = :deputado")})
public class Votacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "vereador")
    private String vereador;
    @Column(name = "prefeito")
    private String prefeito;
    @Column(name = "deputado")
    private String deputado;

    public Votacao() {
    }

    public Votacao(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVereador() {
        return vereador;
    }

    public void setVereador(String vereador) {
        this.vereador = vereador;
    }

    public String getPrefeito() {
        return prefeito;
    }

    public void setPrefeito(String prefeito) {
        this.prefeito = prefeito;
    }

    public String getDeputado() {
        return deputado;
    }

    public void setDeputado(String deputado) {
        this.deputado = deputado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Votacao)) {
            return false;
        }
        Votacao other = (Votacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UrnaEletronica.Votacao[ id=" + id + " ]";
    }

}
