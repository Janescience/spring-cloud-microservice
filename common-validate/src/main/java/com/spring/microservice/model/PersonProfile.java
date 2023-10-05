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
	private String firstnameTH;
	
	@Column(name = "MIDDLENAMETH")
	private String middlenameTh;
	
	@Column(name = "LASTNAMETH")
	private String lastnameTh;
	
	@Column(name = "PERSONFIRSTNAME")
	private String persomFirstname;
	
	@Column(name = "PERSONMIDDLENAME")
	private String personMiddlename;
	
	@Column(name = "PERSONLASTNAME")
	private String personLastname;
	
	@Column(name = "TITLETH")
	private String titleTh;
	
	@Column(name = "PERSONPRENAMEADJUNCT")
	private String personPrenameAdjunct;
	
	@Column(name = "DATEOFBIRTH")
	private Date dateOfVirth;
	
	@Column(name = "NATIONALITY")
	private String nationlity;
	
	@Column(name = "RESIDENTIALTYPE")
	private String residentialType;
	
	@Column(name = "COUNTRYOFMAINRESIDENCE")
	private String countryOfMainResidence;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "MARITALSTATUS")
	private String maritalStatus;
	
	@Column(name = "HIGHESTEDUCATION")
	private String highestEducation;
	
	@Column(name = "ROYALFAMILYFLAG")
	private String royalFamilyFlag;
	
	@Column(name = "BOTIPITYPE")
	private String botIPIType;
	
	@Column(name = "DEATHDATE")
	private Date deathDate;
	
	@Column(name = "CUSTOMERPREFERREDLANGUAGECD")
	private String customerPreferredLanguageCD;
	
	@Column(name = "NOLASTNAMEFLAG")
	private String noLastnameFlag;
	
	@Column(name = "CUSTOMERSTATUS")
	private String customerStatus;
	
	@Column(name = "OVSCMF")
	private String OVSCMF;
	
	@Column(name = "CUSTOMERCLASSIFICATION")
	private String customerClassification;
	
	@Column(name = "GUARANTORFLAG")
	private String guarantorFlag;
	
	@Column(name = "COLLATERALOWNERFLAG")
	private String collateralOwnerFlag;
	
	@Column(name = "RELATEDPARTYFLAG")
	private String relatedPartyFlag;
	
	@Column(name = "BAYORSUBSIDIARYCUSTOMER")
	private String bayOrSubsidiaryCustomer;
	
	@Column(name = "SUPPRESSFLAG")
	private String suppressFlag;
	
	@Column(name = "CUSTOMERSEGMENT")
	private String customerSegment;
	
	@Column(name = "SUBSIDIARYCODEOFCUSTOMERINITIATION")
	private String subsidiaryCodeOfCustomerInitiation;
	
	@Column(name = "KRUNGSRIVIPTYPE")
	private String krungsriVIPType;
	
	@Column(name = "MASSSUBSEGMENT")
	private String massSubSegment;
	
	@Column(name = "DUALSEGMENT")
	private String dualSegment;
	
	@Column(name = "PAYROLLFLAG")
	private String payrollFlag;
	
	@Column(name = "PARTYTYPE")
	private String partyType;
	
	@Column(name = "CUSTOMERTYPE")
	private String customerType;
	
	@Column(name = "NOOFACTIVEPRODUCTHOLDING")
	private BigDecimal noOfActiveProductHolding;
	
	@Column(name = "NOOFACTIVESERVICEUSAGE")
	private BigDecimal noOfActiveServiceUsage;
	
	@Column(name = "RELATEDPARTYIDENTIFER")
	private String relatedPartyIdentifer;
	
	@Column(name = "JGZZFISCALCODE")
	private String JGZZFISCALCODE;
	
	@Column(name = "RESPONSIBLEBRANCHCODE")
	private String responseibleBranchCode;
	
	@Column(name = "RESPONSIBLEDEPARTMENTCODE")
	private String responseibledPartmentCode;
	
	@Column(name = "CIF_NO")
	private String CIF_NO;
	
	@Column(name = "CIS_NO")
	private String CIS_NO;
	
	@Column(name = "CREATEDBYUSERID")
	private String createdByUserId;
	
	@Column(name = "CREATEDBYEMPLOYEECUSTOMER")
	private String createdByEmployeeCustomer;
	
	@Column(name = "CREATEDATSYSTEMID")
	private String createdAtSystemID;
	
	@Column(name = "CREATEDATBRANCHDEPARTMENTID")
	private String createAtBranchDepartmentId;
	
	@Column(name = "LASTUPDATEDBYUSERID")
	private String lastUpdatedByUserId;
	
	@Column(name = "LASTUPDATEDBYEMPLOYEECUSTOMER")
	private String lastUpdatedByEmployeeCustomer;
	
	@Column(name = "LASTUPDATEDATSYSTEMID")
	private String lastUpdateDataSystemId;
	
	@Column(name = "LASTUPDATEDATBRANCHDEPARTMENTID")
	private String lastUpdatedAtBranchDepartmentId;
	
	@Column(name = "CREATED_DT")
	private Timestamp createdDt;
	
	@Column(name = "UPDATED_BY")
	private String updateBy;
	
	@Column(name = "UPDATED_DT")
	private Timestamp updatedDt;
	
	@Column(name = "SERVER_NAME")
	private String serverName;
	
	@Column(name = "SYSTEM_NAME")
	private String systemName;
	
	@Column(name = "SALESPROFILETYPE")
	private String sakesProfileType;
	
	@Column(name = "RECORDNAME")
	private String recordName;
	
	@Column(name = "INFORMEDINDIVIDUALMONTHLYINCOMERANGE")
	private String informedIndividualMonthlyIncomeRange;
	
	@Column(name = "VERIFIEDINDIVIDUALMONTHLYINCOMERANGE")
	private String verifiedIndividualMonthlyIncomeRange;
	
	@Column(name = "COUNTRYSOURCEOFINCOME")
	private String countrySourceOfIncome;
	
	@Column(name = "FULLNAMETH")
	private String fullnameTh;
	
	@Column(name = "FULLNAMEEN")
	private String fullnameEn;
	
	@Column(name = "ADDEDDATE")
	private Timestamp addedDate;
	
	@Column(name = "LEGACYFLAGDELETEDATE")
	private Date legacyFlagDeleteDate;

	@Column(name = "SOURCE_SYSTEM")
	private String sourceSystem;
	
	@Column(name = "DATA_DOMAIN")
	private String dataDomain;
	
	@Column(name = "TBL_STATUS")
	private String tblStatus;
	
	@Column(name = "CREATED_BY")
	private String created_By;

	@Column(name = "VER_NO")
	private BigDecimal verNo;
	
	public PersonProfile() {
		
	}
}