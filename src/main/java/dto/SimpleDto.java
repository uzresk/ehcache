package dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class SimpleDto implements Serializable {

	private static final long serialVersionUID = 5347971302107348535L;

	private String name;

	private String mail;
}
