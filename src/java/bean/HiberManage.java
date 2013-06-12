package bean;

import helperConverter.ContactHelper;
import entities.Contacts;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.UnselectEvent;

/**
 *
 * @author Walter
 */
@ManagedBean
@RequestScoped
public class HiberManage {

    protected String firstName;
    protected String selectedField;
    private String username;
    SessionHandler sessionhandler;
    private String addedBy;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSelectedField() {
        return selectedField;
    }

    public void setSelectedField(String selectedField) {
        this.selectedField = selectedField;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    protected String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    protected String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private String mobNo;

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
    private String comName;

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }
    private String comLoc;

    public String getComLoc() {
        return comLoc;
    }

    public void setComLoc(String comLoc) {
        this.comLoc = comLoc;
    }
    private String designation;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    private String notes;

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    protected String searchValue;

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }
    protected String searchName;

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }
    protected String searchInterest;

    public String getSearchInterest() {
        return searchInterest;
    }

    public void setSearchInterest(String searchInterest) {
        this.searchInterest = searchInterest;
    }
    protected String searchLocation;

    public String getSearchLocation() {
        return searchLocation;
    }

    public void setSearchLocation(String searchLocation) {
        this.searchLocation = searchLocation;
    }
    List<Contacts> contacts;
    ContactHelper helper;
    private int recordCount = 20;
    private Contacts current;
    private int selectedItemIndex;
    protected List<String> distinctCompanies;

    public List<String> getDistinctCompanies() {
        return distinctCompanies;
    }

    public void setDistinctCompanies(List<String> distinctCompanies) {
        this.distinctCompanies = distinctCompanies;
    }
    private List<String> distinctLocations;

    public List<String> getDistinctLocations() {
        return distinctLocations;
    }

    public void setDistinctLocations(List<String> distinctLocations) {
        this.distinctLocations = distinctLocations;
    }
    private List<String> distinctDesignations;

    public List<String> getDistinctDesignations() {
        return distinctDesignations;
    }

    public void setDistinctDesignations(List<String> distinctDesignations) {
        this.distinctDesignations = distinctDesignations;
    }
    private List<String> distinctInterests;

    public List<String> getDistinctInterests() {
        return distinctInterests;
    }

    public void setDistinctInterests(List<String> distinctInterests) {
        this.distinctInterests = distinctInterests;
    }

    public HiberManage() {
        helper = new ContactHelper();
        conts = helper.getContacts();
        distinctCompanies = helper.getDistinctCompanies();
        distinctDesignations = helper.getDistinctDesignations();
        distinctLocations = helper.getDistinctLocations();
        distinctInterests = helper.getDistinctInterests();

    }

    public Contacts getSelected() {
        if (current == null) {
            current = new Contacts();
            selectedItemIndex = -1;
        }
        return current;
    }

    public List<Contacts> getContacts() {
        System.out.println("I am in hibermanage");

        if (selectedLocations != null || selectedNames != null || selectedCompanies != null || selectedDesignations != null || selectedInterests != null) {
            contacts = helper.getUpdatedContacts(selectedNames, selectedCompanies, selectedLocations, selectedDesignations, selectedInterests);
            System.out.println(contacts);
        } else if (contacts == null) {
            contacts = helper.getContacts();
        }

        this.setFieldsToNull();
        return contacts;
    }

    public void setFieldsToNull() {
        selectedNames = null;
        selectedCompanies = null;
        selectedDesignations = null;
        selectedLocations = null;
    }

    void recreateModel() {
        contacts = null;
    }

    // The following methods are used for display of data and navigation of pages
    public String searchContact() {
        return "";
    }

    public String prepareView() {

        return "browse";
    }
    //code for autocomplete
    public List<Contacts> conts;

    public List<Contacts> getConts() {
        return conts;
    }

    public void setConts(List<Contacts> conts) {
        this.conts = conts;
    }
    protected List<Contacts> selectedNames;

    public List<Contacts> getSelectedNames() {
        return selectedNames;
    }

    public void setSelectedNames(List<Contacts> selectedNames) {
        this.selectedNames = selectedNames;
    }
    protected List<String> selectedCompanies;

    public List<String> getSelectedCompanies() {
        return selectedCompanies;
    }

    public void setSelectedCompanies(List<String> selectedCompanies) {
        this.selectedCompanies = selectedCompanies;
    }
    private List<String> selectedLocations;

    public List<String> getSelectedLocations() {
        return selectedLocations;
    }

    public void setSelectedLocations(List<String> selectedLocations) {
        this.selectedLocations = selectedLocations;
    }
    protected List<String> selectedDesignations;

    public List<String> getSelectedDesignations() {
        return selectedDesignations;
    }

    public void setSelectedDesignations(List<String> selectedDesignations) {
        this.selectedDesignations = selectedDesignations;
    }
    private List<String> selectedInterests;

    public List<String> getSelectedInterests() {
        return selectedInterests;
    }

    public void setSelectedInterests(List<String> selectedInterests) {
        this.selectedInterests = selectedInterests;
    }
    private List<String> selectedCities;

    public List<String> getSelectedCities() {
        return selectedCities;
    }

    public void setSelectedCities(List<String> selectedCities) {
        this.selectedCities = selectedCities;
    }
    protected List<String> selectedTexts;

    public List<String> getSelectedTexts() {
        return selectedTexts;
    }

    public void setSelectedTexts(List<String> selectedTexts) {
        this.selectedTexts = selectedTexts;
    }

    public List<Contacts> completeNames(String query) {
        List<Contacts> suggestions = new ArrayList<Contacts>();

        for (Contacts p : conts) {
            if (p.getFirstName().toLowerCase().startsWith(query.toLowerCase()) || p.getLastName().toLowerCase().startsWith(query.toLowerCase())) {
                suggestions.add(p);
            }
        }

        return suggestions;

    }

    public List<String> completeCompany(String query) {
        List<String> suggestions = new ArrayList<String>();

        for (String p : distinctCompanies) {
            if (p.toLowerCase().startsWith(query.toLowerCase())) {
                suggestions.add(p);
                System.out.println(p);
            }
        }
        return suggestions;
    }

    public List<String> completeLocation(String query) {
        List<String> suggestions = new ArrayList<String>();

        for (String p : distinctLocations) {
            if (p.toLowerCase().startsWith(query.toLowerCase())) {
                suggestions.add(p);
                System.out.println(p);
            }
        }
        return suggestions;
    }

    public List<String> completeDesignation(String query) {
        List<String> suggestions = new ArrayList<String>();

        for (String p : distinctDesignations) {
            if (p.toLowerCase().startsWith(query.toLowerCase())) {
                suggestions.add(p);
                System.out.println(p);
            }
        }
        return suggestions;
    }
    public boolean interestflag = false;

    public boolean isInterestflag() {
        return interestflag;
    }

    public void setInterestflag(boolean interestflag) {
        this.interestflag = interestflag;
    }

    public List<String> completeInterestsForAdd(String query) {
        List<String> suggestions = new ArrayList<String>();

        for (String p : distinctInterests) {
            if (p.toLowerCase().contains(query.toLowerCase())) {
                suggestions.add(p.toLowerCase());
            }
        }
        if (suggestions.isEmpty()) {
            interestflag = true;
            suggestions.add(query.toLowerCase());
        }

        return suggestions;
    }
    
    public List<String> completeInterestsForSearch(String query) {
        List<String> suggestions = new ArrayList<String>();

        for (String p : distinctInterests) {
            if (p.toLowerCase().contains(query.toLowerCase())) {
                suggestions.add(p.toLowerCase());
            }
        }

        return suggestions;
    }

    public List<String> completeCities(String query) {
        List<String> suggestions = new ArrayList<String>();

        for (String p : distinctLocations) {
            if (p.toLowerCase().contains(query.toLowerCase())) {
                suggestions.add(p.toLowerCase());
            }
        }
        if (suggestions.isEmpty()) {
            interestflag = true;
            suggestions.add(query.toLowerCase());
        }

        return suggestions;
    }
    public static String contactsToSend;

    public static String getContactsToSend() {
        return contactsToSend;
    }

    public void setContactsToSend(String contactsToSend) {
        this.contactsToSend = contactsToSend;
    }

    public String getEmailIds() {

        contactsToSend = "";
        for (Contacts c : contacts) {
            if (contacts.indexOf(c) == contacts.size() - 1) {
                contactsToSend = contactsToSend + c.getEmail();
            } else {
                contactsToSend = contactsToSend + c.getEmail() + ",";
            }
        }

        mailBean.setEmails(contactsToSend);
        if (contacts != null) {
            return "Success";
        } else {
            return "fail";
        }
    }
    public boolean flag = false;
    public int aurekflag;

    public String getAddedBy() {
        addedBy = sessionhandler.addedBy;
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String addContact() {

        String temp = helper.addContact(firstName, lastName, email, mobNo, comName, comLoc, designation, url, addedBy, notes, selectedInterests);
        if (temp == "success") {
            flag = true;
        }

        firstName = null;
        lastName = null;
        email = null;
        mobNo = null;
        comName = null;
        comLoc = null;
        designation = null;
        url = null;
        notes = null;
        selectedInterests = null;

        return temp;
    }

    public boolean isContactAdded() {
        return flag;
    }

    public void handleUnselect(UnselectEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Unselected:" + event.getObject().toString(), null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    // code for email validation against db
    public void validateEmail(String email) {
        System.out.println(email);
        if (helper.doesEmailExist(email)) {
            aurekflag = 1;
            FacesContext.getCurrentInstance().addMessage("myform:email", new FacesMessage(FacesMessage.SEVERITY_ERROR, "", "Email Already Exists: Please try again."));
        } else {
            aurekflag = 0;
        }

    }

    public int getAurekflag() {
        return aurekflag;
    }

    public void setAurekflag(int aurekflag) {
        this.aurekflag = aurekflag;
    }

    public String getInterestsForUser(String email) {

        return helper.getInterestsForUser(email);

    }

    public void showAdddedDetails() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("The contact has been Added."));
    }
}
