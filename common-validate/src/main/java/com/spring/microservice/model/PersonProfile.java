package com.spring.microservice.model;

import java.sql.Timestamp;
import javax.persistence.*;
import java.util.Date;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "SSC_PERSONPROFILE")
@Data
public class PersonProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigDecimal personId;
	
	@Column(name = "SESSION_NO")
	private BigDecimal sessionNo;
	
	@Column(name = "PARTYID")
	private BigDecimal partyId;
	
	@Column(name = "PARTYNUMBER")
	private String partyNumber;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "PERSONPROFILEID")
	private String personProfileId;
	
	@Column(name = "CREATEDBY")
	private String createdBy;
	
	@Column(name = "CREATIONDATE")
	private Timestamp creationDate;
	
	@Column(name = "LASTUPDATEDATE")
	private Timestamp lastUpdateDate;
	
	@Column(name = "LASTUPDATEDBY")
	private String lastUpdateBy;
	
	@Column(name = "ATTACHMENT")
	private String attachment;
	
	@Column(name = "PHOTO")
	private String photo;
	
	@Column(name = "PHOTOONIDCARD")
	private String photoOnIdCard;
	
	@Column(name = "FACEPHOTOFLAG")
	private String facePhotoFlag;
	
	@Column(name = "PHOTOONIDCARDFLAG")
	private String photoOnIdCardFlag;
	
	@Column(name = "PHOTOONPASSPORTFLAG")
	private String photoPassportFlag;
	
	@Column(name = "PHOTOFROMSECONDSOURCEFLAG")
	private String photoFromSecondSourceFlag;
	
	@Column(name = "IALCODE")
	private String ialCode;
	
	@Column(name = "AALCODE")
	private String aalCode;
	
	@Column(name = "KYCMETHOD")
	private String kycMethod;
	
	@Column(name = "LASTCOMPAREDATE")
	private Date lastCompareDate;
	
	@Column(name = "FIRSTNAMETH")
	private String FIRSTNAMETH;
	
	@Column(name = "MIDDLENAMETH")
	private String MIDDLENAMETH;
	
	@Column(name = "LASTNAMETH")
	private String LASTNAMETH;
	
	@Column(name = "PERSONFIRSTNAME")
	private String PERSONFIRSTNAME;
	
	@Column(name = "PERSONMIDDLENAME")
	private String PERSONMIDDLENAME;
	
	@Column(name = "PERSONLASTNAME")
	private String PERSONLASTNAME;
	
	@Column(name = "TITLETH")
	private String TITLETH;
	
	@Column(name = "PERSONPRENAMEADJUNCT")
	private String PERSONPRENAMEADJUNCT;
	
	@Column(name = "DATEOFBIRTH")
	private Date DATEOFBIRTH;
	
	@Column(name = "NATIONALITY")
	private String NATIONALITY;
	
	@Column(name = "RESIDENTIALTYPE")
	private String RESIDENTIALTYPE;
	
	@Column(name = "COUNTRYOFMAINRESIDENCE")
	private String COUNTRYOFMAINRESIDENCE;
	
	@Column(name = "GENDER")
	private String GENDER;
	
	@Column(name = "MARITALSTATUS")
	private String MARITALSTATUS;
	
	@Column(name = "HIGHESTEDUCATION")
	private String HIGHESTEDUCATION;
	
	@Column(name = "ROYALFAMILYFLAG")
	private String ROYALFAMILYFLAG;
	
	@Column(name = "BOTIPITYPE")
	private String BOTIPITYPE;
	
	@Column(name = "DEATHDATE")
	private Date DEATHDATE;
	
	@Column(name = "CUSTOMERPREFERREDLANGUAGECD")
	private String CUSTOMERPREFERREDLANGUAGECD;
	
	@Column(name = "NOLASTNAMEFLAG")
	private String NOLASTNAMEFLAG;
	
	@Column(name = "CUSTOMERSTATUS")
	private String CUSTOMERSTATUS;
	
	@Column(name = "OVSCMF")
	private String OVSCMF;
	
	@Column(name = "CUSTOMERCLASSIFICATION")
	private String CUSTOMERCLASSIFICATION;
	
	@Column(name = "GUARANTORFLAG")
	private String GUARANTORFLAG;
	
	@Column(name = "COLLATERALOWNERFLAG")
	private String COLLATERALOWNERFLAG;
	
	@Column(name = "RELATEDPARTYFLAG")
	private String RELATEDPARTYFLAG;
	
	@Column(name = "BAYORSUBSIDIARYCUSTOMER")
	private String BAYORSUBSIDIARYCUSTOMER;
	
	@Column(name = "SUPPRESSFLAG")
	private String SUPPRESSFLAG;
	
	@Column(name = "CUSTOMERSEGMENT")
	private String CUSTOMERSEGMENT;
	
	@Column(name = "SUBSIDIARYCODEOFCUSTOMERINITIATION")
	private String SUBSIDIARYCODEOFCUSTOMERINITIATION;
	
	@Column(name = "KRUNGSRIVIPTYPE")
	private String KRUNGSRIVIPTYPE;
	
	@Column(name = "MASSSUBSEGMENT")
	private String MASSSUBSEGMENT;
	
	@Column(name = "DUALSEGMENT")
	private String DUALSEGMENT;
	
	@Column(name = "PAYROLLFLAG")
	private String PAYROLLFLAG;
	
	@Column(name = "PARTYTYPE")
	private String PARTYTYPE;
	
	@Column(name = "CUSTOMERTYPE")
	private String CUSTOMERTYPE;
	
	@Column(name = "NOOFACTIVEPRODUCTHOLDING")
	private BigDecimal NOOFACTIVEPRODUCTHOLDING;
	
	@Column(name = "NOOFACTIVESERVICEUSAGE")
	private BigDecimal NOOFACTIVESERVICEUSAGE;
	
	@Column(name = "RELATEDPARTYIDENTIFER")
	private String RELATEDPARTYIDENTIFER;
	
	@Column(name = "JGZZFISCALCODE")
	private String JGZZFISCALCODE;
	
	@Column(name = "RESPONSIBLEBRANCHCODE")
	private String RESPONSIBLEBRANCHCODE;
	
	@Column(name = "RESPONSIBLEDEPARTMENTCODE")
	private String RESPONSIBLEDEPARTMENTCODE;
	
	@Column(name = "CIF_NO")
	private String CIF_NO;
	
	@Column(name = "CIS_NO")
	private String CIS_NO;
	
	@Column(name = "CREATEDBYUSERID")
	private String CREATEDBYUSERID;
	
	@Column(name = "CREATEDBYEMPLOYEECUSTOMER")
	private String CREATEDBYEMPLOYEECUSTOMER;
	
	@Column(name = "CREATEDATSYSTEMID")
	private String CREATEDATSYSTEMID;
	
	@Column(name = "CREATEDATBRANCHDEPARTMENTID")
	private String CREATEDATBRANCHDEPARTMENTID;
	
	@Column(name = "LASTUPDATEDBYUSERID")
	private String LASTUPDATEDBYUSERID;
	
	@Column(name = "LASTUPDATEDBYEMPLOYEECUSTOMER")
	private String LASTUPDATEDBYEMPLOYEECUSTOMER;
	
	@Column(name = "LASTUPDATEDATSYSTEMID")
	private String LASTUPDATEDATSYSTEMID;
	
	@Column(name = "LASTUPDATEDATBRANCHDEPARTMENTID")
	private String LASTUPDATEDATBRANCHDEPARTMENTID;
	
	@Column(name = "CREATED_DT")
	private Timestamp CREATED_DT;
	
	@Column(name = "UPDATED_BY")
	private String UPDATED_BY;
	
	@Column(name = "UPDATED_DT")
	private Timestamp UPDATED_DT;
	
	@Column(name = "SERVER_NAME")
	private String SERVER_NAME;
	
	@Column(name = "SYSTEM_NAME")
	private String SYSTEM_NAME;
	
	@Column(name = "SALESPROFILETYPE")
	private String SALESPROFILETYPE;
	
	@Column(name = "RECORDNAME")
	private String RECORDNAME;
	
	@Column(name = "INFORMEDINDIVIDUALMONTHLYINCOMERANGE")
	private String INFORMEDINDIVIDUALMONTHLYINCOMERANGE;
	
	@Column(name = "VERIFIEDINDIVIDUALMONTHLYINCOMERANGE")
	private String VERIFIEDINDIVIDUALMONTHLYINCOMERANGE;
	
	@Column(name = "COUNTRYSOURCEOFINCOME")
	private String COUNTRYSOURCEOFINCOME;
	
	@Column(name = "FULLNAMETH")
	private String FULLNAMETH;
	
	@Column(name = "FULLNAMEEN")
	private String FULLNAMEEN;
	
	@Column(name = "ADDEDDATE")
	private Timestamp ADDEDDATE;
	
	@Column(name = "LEGACYFLAGDELETEDATE")
	private Date LEGACYFLAGDELETEDATE;

	@Column(name = "SOURCE_SYSTEM")
	private String SOURCE_SYSTEM;
	
	@Column(name = "DATA_DOMAIN")
	private String DATA_DOMAIN;
	
	@Column(name = "TBL_STATUS")
	private String TBL_STATUS;
	
	@Column(name = "CREATED_BY")
	private String CREATED_BY;

	@Column(name = "VER_NO")
	private BigDecimal VER_NO;
	
	public PersonProfile() {
		
	}
}