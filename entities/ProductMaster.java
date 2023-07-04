/**
 * 
 */
package com.bookworm.entities;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author group11
 *
 */
@Entity
@Table(name="ProductMaster")
public class ProductMaster {
	private int productMasterId;
	private String name;
	private String englishName;
	private ProductTypeMaster productTypeMaster;
	private float basePrice;
	private float sellingPrice;
	private float offerPrice;
	private Date offerPriceExpiryDate;
	private String descriptionShort;
	private String descriptionLong;
	private long ISBN;
	private String author;
	private List<LanguageMaster> languages;
	private List<GenereMaster> generes;
	private List<InvoiceDetails> invoiceDetails;
	private List<MyShelf> myShelfs;
	private boolean isRentable;
	private boolean isLibrary;
	private float rentPerDay;
	private int minRentDays;
	private String imagePath;

	/**
	 * 
	 */
	public ProductMaster() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the productMasterId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getProductMasterId() {
		return productMasterId;
	}

	/**
	 * @param productMasterId the productMasterId to set
	 */
	public void setProductMasterId(int productMasterId) {
		this.productMasterId = productMasterId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the englishName
	 */
	public String getEnglishName() {
		return englishName;
	}

	/**
	 * @param englishName the englishName to set
	 */
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	/**
	 * @return the typeId
	 */
	@OneToOne(cascade = CascadeType.ALL)
	public ProductTypeMaster getProductTypeMaster() {
		return productTypeMaster;
	}

	/**
	 * @param typeId the typeId to set
	 */
	public void setProductTypeMaster(ProductTypeMaster productTypeMaster) {
		this.productTypeMaster = productTypeMaster;
	}

	/**
	 * @return the basePrice
	 */
	public float getBasePrice() {
		return basePrice;
	}

	/**
	 * @param basePrice the basePrice to set
	 */
	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}

	/**
	 * @return the sellingPrice
	 */
	public float getSellingPrice() {
		return sellingPrice;
	}

	/**
	 * @param sellingPrice the sellingPrice to set
	 */
	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	/**
	 * @return the offerPrice
	 */
	public float getOfferPrice() {
		return offerPrice;
	}

	/**
	 * @param offerPrice the offerPrice to set
	 */
	public void setOfferPrice(float offerPrice) {
		this.offerPrice = offerPrice;
	}

	/**
	 * @return the offerPriceExpiryDate
	 */
	public Date getOfferPriceExpiryDate() {
		return offerPriceExpiryDate;
	}

	/**
	 * @param offerPriceExpiryDate the offerPriceExpiryDate to set
	 */
	public void setOfferPriceExpiryDate(Date offerPriceExpiryDate) {
		this.offerPriceExpiryDate = offerPriceExpiryDate;
	}

	/**
	 * @return the descriptionShort
	 */
	public String getDescriptionShort() {
		return descriptionShort;
	}

	/**
	 * @param descriptionShort the descriptionShort to set
	 */
	public void setDescriptionShort(String descriptionShort) {
		this.descriptionShort = descriptionShort;
	}

	/**
	 * @return the descriptionLong
	 */
	public String getDescriptionLong() {
		return descriptionLong;
	}

	/**
	 * @param descriptionLong the descriptionLong to set
	 */
	public void setDescriptionLong(String descriptionLong) {
		this.descriptionLong = descriptionLong;
	}

	/**
	 * @return the ISBN
	 */
	public long getISBN() {
		return ISBN;
	}

	/**
	 * @param ISBN the ISBN to set
	 */
	public void setISBN(long ISBN) {
		this.ISBN = ISBN;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the set of languageIds
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Product_Language",
	joinColumns = {		
			@JoinColumn(name = "prodId", referencedColumnName="productMasterId")
	},
	inverseJoinColumns = {
			@JoinColumn(name="langId", referencedColumnName="languageId")
	})
	public List<LanguageMaster> getLanguages() {
		return languages;
	}

	/**
	 * @param languageId the languageId to set
	 */
	public void setLanguages(List<LanguageMaster> languages) {
		this.languages = languages;
	}

	/**
	 * @return the set of genereIds
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Product_Genere",
	joinColumns = {		
			@JoinColumn(name = "prodId", referencedColumnName="productMasterId")
	},
	inverseJoinColumns = {
			@JoinColumn(name="genId", referencedColumnName="genereId")
	})
	public List<GenereMaster> getGeneres() {
		return generes;
	}

	/**
	 * @param genereId the genereId to set
	 */
	public void setGeneres(List<GenereMaster> generes) {
		this.generes = generes;
	}

	/**
	 * @return the isRentable
	 */
	public boolean isRentable() {
		return isRentable;
	}

	/**
	 * @param isRentable the isRentable to set
	 */
	public void setRentable(boolean isRentable) {
		this.isRentable = isRentable;
	}

	/**
	 * @return the isLibrary
	 */
	public boolean isLibrary() {
		return isLibrary;
	}

	/**
	 * @param isLibrary the isLibrary to set
	 */
	public void setLibrary(boolean isLibrary) {
		this.isLibrary = isLibrary;
	}

	/**
	 * @return the rentPerDay
	 */
	public float getRentPerDay() {
		return rentPerDay;
	}

	/**
	 * @param rentPerDay the rentPerDay to set
	 */
	public void setRentPerDay(float rentPerDay) {
		this.rentPerDay = rentPerDay;
	}

	/**
	 * @return the minRentDays
	 */
	public int getMinRentDays() {
		return minRentDays;
	}

	/**
	 * @param minRentDays the minRentDays to set
	 */
	public void setMinRentDays(int minRentDays) {
		this.minRentDays = minRentDays;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@ManyToMany(mappedBy="productMaster")
	public List<InvoiceDetails> getInvoiceDetails() {
		return invoiceDetails;
	}

	public void setInvoiceDetails(List<InvoiceDetails> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

	
	@ManyToMany(mappedBy="productMaster")
	public List<MyShelf> getMyShelfs() {
		return myShelfs;
	}
	
	public void setMyShelfs(List<MyShelf> myShelfs) {
		this.myShelfs = myShelfs;
	}
	
	




	

}
