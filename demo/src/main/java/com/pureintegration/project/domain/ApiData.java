package com.pureintegration.project.domain;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
public class ApiData {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	private List<String> affenpinscher = new ArrayList<String>();
	private List<String> african;
	private List<String> airedale;
	private List<String> akita;
	private List<String> appenzeller;
	private List<String> australian;
	private List<String> basenji;
	private List<String> beagle;
	private List<String> bluetick;
	private List<String> borzoi;
	private List<String> bouvier;
	private List<String> boxer;
	private List<String> brabancon;
	
	private List<String> briard;
	private List<String> buhund;
	private List<String> bulldog;
	private List<String> bullterrier;
	private List<String> cattledog;
	private List<String> chihuahua;
	private List<String> chow;
	private List<String> clumber;
	
	private List<String> cockapoo;
	private List<String> collie;
	private List<String> coonhound;
	private List<String> corgi;
	private List<String> cotondetulear;
	private List<String> dachshund;
	private List<String> dalmatian;
	private List<String> dane;
	
	private List<String> deerhound;
	private List<String> dhole;
	private List<String> dingo;
	private List<String> doberman;
	private List<String> elkhound;
	private List<String> entlebucher;
	private List<String> eskimo;
	private List<String> finnish;
	
	private List<String> frise;
	private List<String> germanshepherd;
	private List<String> greyhound;
	private List<String> groenendael;
	private List<String> havanese;
	private List<String> hound;
	private List<String> husky;
	private List<String> keeshond;
	
	private List<String> kelpie;
	private List<String> komondor;
	private List<String> kuvasz;
	private List<String> labradoodle;
	private List<String> labrador;
	private List<String> leonberg;
	private List<String> lhasa;
	private List<String> malamute;
	
	private List<String> malinois;
	private List<String> maltese;
	private List<String> mastiff;
	private List<String> mexicanhairless;
	private List<String> mix;
	private List<String> mountain;
	private List<String> newfoundland;
	private List<String> otterhound;
	
	private List<String> ovcharka;
	private List<String> papillon;
	private List<String> pekinese;
	private List<String> pembroke;
	private List<String> pinscher;
	private List<String> pitbull;
	private List<String> pointer;
	private List<String> pomeranian;
	
	private List<String> poodle;
	private List<String> pug;
	private List<String> puggle;
	private List<String> pyrenees;
	private List<String> redbone;
	private List<String> retriever;
	private List<String> ridgeback;
	private List<String> rottweiler;
	
	private List<String> saluki;
	private List<String> samoyed;
	private List<String> schipperke;
	private List<String> schnauzer;
	private List<String> setter;
	private List<String> sheepdog;
	private List<String> shiba;
	private List<String> shihtzu;

	private List<String> spaniel;
	private List<String> springer;
	private List<String> stbernard;
	private List<String> terrier;
	private List<String> vizsla;
	private List<String> waterdog;
	private List<String> weimaraner;
	private List<String> whippet;
	
	private List<String> wolfhound;

	

}
