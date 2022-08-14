package oop.model;

public class Person {

    private static final int LENGHT_CPF = 11;
    private static final int LENGHT_CNPJ = 14;
    public enum PersonType {NATURAL_PERSON, LEGAL_PERSON}

    public Integer code;
    public String name;
    private String document;
    public PersonType type;

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        if (document == null || document.isEmpty()) {
            throw new RuntimeException("Document can't be null or empty");
        }
        if (document.length() == LENGHT_CPF) {
            setDocument(document, type = PersonType.NATURAL_PERSON);
        }
        else if(document.length() == LENGHT_CNPJ) {
            setDocument(document, type = PersonType.LEGAL_PERSON);
        }
        else {
            throw new RuntimeException("Document invalid to Natural Person or Legal Person");
        }
    }

    private void setDocument(String document, PersonType type) {
        this.document = document;
        this.type = type;
    }
    public PersonType getType(){
        return type;
    }
}
