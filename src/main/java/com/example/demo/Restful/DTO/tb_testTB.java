package com.example.demo.Restful.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tb_testRB")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, 
        allowGetters = true)
public class tb_testTB implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serv_seq_id;

    @NotBlank
    private String serv_type;

    @NotBlank
    private String serv_ip;
    @NotBlank
    private String serv_host;    
/*
    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;
*/
    // Getters and Setters ... (Omitted for brevity)
	public int getServ_seq_id() {
		return serv_seq_id;
	}
	public void setServ_seq_id(int serv_seq_id) {
		this.serv_seq_id = serv_seq_id;
	}
	public String getServ_type() {
		return serv_type;
	}
	public void setServ_type(String serv_type) {
		this.serv_type = serv_type;
	}
	public String getServ_ip() {
		return serv_ip;
	}
	public void setServ_ip(String serv_ip) {
		this.serv_ip = serv_ip;
	}
	public String getServ_host() {
		return serv_host;
	}
	public void setServ_host(String serv_host) {
		this.serv_host = serv_host;
	}

}
