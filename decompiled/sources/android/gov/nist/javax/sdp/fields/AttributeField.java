package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.NameValue;
import android.gov.nist.core.Separators;
import p668c.C11547g;
import p668c.InterfaceC11542b;

/* JADX INFO: loaded from: classes.dex */
public class AttributeField extends SDPField implements InterfaceC11542b {
    protected NameValue attribute;

    public AttributeField() {
        super(SDPFieldNames.ATTRIBUTE_FIELD);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        AttributeField attributeField = (AttributeField) super.clone();
        NameValue nameValue = this.attribute;
        if (nameValue != null) {
            attributeField.attribute = (NameValue) nameValue.clone();
        }
        return attributeField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        NameValue nameValue = this.attribute;
        String str = SDPFieldNames.ATTRIBUTE_FIELD;
        if (nameValue != null) {
            str = SDPFieldNames.ATTRIBUTE_FIELD + this.attribute.encode();
        }
        return AbstractC10763a.m11052j(str, Separators.NEWLINE);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        boolean zEquals;
        if (!(obj instanceof AttributeField)) {
            return false;
        }
        AttributeField attributeField = (AttributeField) obj;
        boolean zEqualsIgnoreCase = attributeField.getAttribute().getName().equalsIgnoreCase(getAttribute().getName());
        if (getAttribute().getValueAsObject() != null) {
            zEquals = getAttribute().getValueAsObject().equals(attributeField.getAttribute().getValueAsObject());
        } else {
            zEquals = attributeField.getAttribute().getValueAsObject() == null;
        }
        return zEqualsIgnoreCase && zEquals;
    }

    public NameValue getAttribute() {
        return this.attribute;
    }

    public String getName() {
        String name;
        NameValue attribute = getAttribute();
        if (attribute == null || (name = attribute.getName()) == null) {
            return null;
        }
        return name;
    }

    public String getValue() {
        Object valueAsObject;
        NameValue attribute = getAttribute();
        if (attribute == null || (valueAsObject = attribute.getValueAsObject()) == null) {
            return null;
        }
        return valueAsObject instanceof String ? (String) valueAsObject : valueAsObject.toString();
    }

    public boolean hasValue() {
        NameValue attribute = getAttribute();
        return (attribute == null || attribute.getValueAsObject() == null) ? false : true;
    }

    public int hashCode() {
        if (getAttribute() != null) {
            return encode().hashCode();
        }
        throw new UnsupportedOperationException("Attribute is null cannot compute hashCode ");
    }

    public void setAttribute(NameValue nameValue) {
        this.attribute = nameValue;
        nameValue.setSeparator(":");
    }

    public void setName(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The name is null");
        }
        NameValue attribute = getAttribute();
        if (attribute == null) {
            attribute = new NameValue();
        }
        attribute.setName(str);
        setAttribute(attribute);
    }

    public void setValue(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The value is null");
        }
        NameValue attribute = getAttribute();
        if (attribute == null) {
            attribute = new NameValue();
        }
        attribute.setValueAsObject(str);
        setAttribute(attribute);
    }

    public void setValueAllowNull(String str) {
        NameValue attribute = getAttribute();
        if (attribute == null) {
            attribute = new NameValue();
        }
        attribute.setValueAsObject(str);
        setAttribute(attribute);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject
    public String toString() {
        return encode();
    }
}
