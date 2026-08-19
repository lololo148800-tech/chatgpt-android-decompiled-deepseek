package android.gov.nist.javax.sdp;

import android.gov.nist.core.NameValue;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AttributeField;
import android.gov.nist.javax.sdp.fields.BandwidthField;
import android.gov.nist.javax.sdp.fields.ConnectionField;
import android.gov.nist.javax.sdp.fields.InformationField;
import android.gov.nist.javax.sdp.fields.KeyField;
import android.gov.nist.javax.sdp.fields.MediaField;
import android.gov.nist.javax.sdp.fields.PreconditionFields;
import android.gov.nist.javax.sdp.fields.SDPField;
import java.io.Serializable;
import java.util.Vector;
import p571X9.AbstractC9306j0;
import p668c.C11547g;
import p668c.InterfaceC11541a;
import p668c.InterfaceC11543c;
import p668c.InterfaceC11544d;
import p668c.InterfaceC11545e;

/* JADX INFO: loaded from: classes.dex */
public class MediaDescriptionImpl implements Serializable, Cloneable {
    protected ConnectionField connectionField;
    protected InformationField informationField;
    protected KeyField keyField;
    protected MediaField mediaField;
    protected Vector bandwidthFields = new Vector();
    protected Vector attributeFields = new Vector();
    protected PreconditionFields preconditionFields = new PreconditionFields();

    public void addAttribute(AttributeField attributeField) {
        this.attributeFields.add(attributeField);
    }

    public void addBandwidthField(BandwidthField bandwidthField) {
        this.bandwidthFields.add(bandwidthField);
    }

    public void addDynamicPayloads(Vector vector, Vector vector2) throws C11547g {
        if (vector == null || vector2 == null) {
            throw new C11547g(" The vectors are null");
        }
        if (vector.isEmpty() || vector2.isEmpty()) {
            throw new C11547g(" The vectors are empty");
        }
        if (vector.size() != vector2.size()) {
            throw new C11547g(" The vector sizes are unequal");
        }
        for (int i10 = 0; i10 < vector.size(); i10++) {
            setAttribute((String) vector.elementAt(i10), (String) vector2.elementAt(i10));
        }
    }

    public String encode() {
        StringBuilder sb2 = new StringBuilder();
        MediaField mediaField = this.mediaField;
        if (mediaField != null) {
            sb2.append(mediaField.encode());
        }
        InformationField informationField = this.informationField;
        if (informationField != null) {
            sb2.append(informationField.encode());
        }
        ConnectionField connectionField = this.connectionField;
        if (connectionField != null) {
            sb2.append(connectionField.encode());
        }
        if (this.bandwidthFields != null) {
            for (int i10 = 0; i10 < this.bandwidthFields.size(); i10++) {
                sb2.append(((SDPField) this.bandwidthFields.elementAt(i10)).encode());
            }
            PreconditionFields preconditionFields = this.preconditionFields;
            if (preconditionFields != null) {
                int preconditionSize = preconditionFields.getPreconditionSize();
                for (int i11 = 0; i11 < preconditionSize; i11++) {
                    sb2.append(((SDPField) this.preconditionFields.getPreconditions().elementAt(i11)).encode());
                }
            }
        }
        KeyField keyField = this.keyField;
        if (keyField != null) {
            sb2.append(keyField.encode());
        }
        if (this.attributeFields != null) {
            for (int i12 = 0; i12 < this.attributeFields.size(); i12++) {
                sb2.append(((SDPField) this.attributeFields.elementAt(i12)).encode());
            }
        }
        return sb2.toString();
    }

    public String getAttribute(String str) {
        if (str == null) {
            throw new NullPointerException("null arg!");
        }
        for (int i10 = 0; i10 < this.attributeFields.size(); i10++) {
            AttributeField attributeField = (AttributeField) this.attributeFields.elementAt(i10);
            if (str.equals(attributeField.getAttribute().getName())) {
                return (String) attributeField.getAttribute().getValueAsObject();
            }
        }
        return null;
    }

    public Vector getAttributeFields() {
        return this.attributeFields;
    }

    public Vector getAttributes(boolean z6) {
        return this.attributeFields;
    }

    public int getBandwidth(String str) {
        if (str == null) {
            throw new NullPointerException("null parameter");
        }
        if (this.bandwidthFields == null) {
            return -1;
        }
        for (int i10 = 0; i10 < this.bandwidthFields.size(); i10++) {
            BandwidthField bandwidthField = (BandwidthField) this.bandwidthFields.elementAt(i10);
            String bwtype = bandwidthField.getBwtype();
            if (bwtype != null && bwtype.equals(str)) {
                return bandwidthField.getBandwidth();
            }
        }
        return -1;
    }

    public Vector getBandwidths(boolean z6) {
        return this.bandwidthFields;
    }

    public InterfaceC11541a getConnection() {
        return this.connectionField;
    }

    public ConnectionField getConnectionField() {
        return this.connectionField;
    }

    public String getDuplexity() {
        for (int i10 = 0; i10 < this.attributeFields.size(); i10++) {
            AttributeField attributeField = (AttributeField) this.attributeFields.elementAt(i10);
            if (attributeField.getAttribute().getName().equalsIgnoreCase("sendrecv") || attributeField.getAttribute().getName().equalsIgnoreCase("recvonly") || attributeField.getAttribute().getName().equalsIgnoreCase("sendonly") || attributeField.getAttribute().getName().equalsIgnoreCase("inactive")) {
                return attributeField.getAttribute().getName();
            }
        }
        return null;
    }

    public InterfaceC11543c getInfo() {
        InformationField informationField = getInformationField();
        if (informationField == null) {
            return null;
        }
        return informationField;
    }

    public InformationField getInformationField() {
        return this.informationField;
    }

    public InterfaceC11544d getKey() {
        KeyField keyField = this.keyField;
        if (keyField == null) {
            return null;
        }
        return keyField;
    }

    public KeyField getKeyField() {
        return this.keyField;
    }

    public InterfaceC11545e getMedia() {
        return this.mediaField;
    }

    public MediaField getMediaField() {
        return this.mediaField;
    }

    public Vector getMimeParameters() {
        String attribute = getAttribute("rate");
        String attribute2 = getAttribute("ptime");
        String attribute3 = getAttribute("maxptime");
        String attribute4 = getAttribute("ftmp");
        Vector vector = new Vector();
        vector.addElement(attribute);
        vector.addElement(attribute2);
        vector.addElement(attribute3);
        vector.addElement(attribute4);
        return vector;
    }

    public Vector getMimeTypes() {
        MediaField mediaField = (MediaField) getMedia();
        String mediaType = mediaField.getMediaType();
        String protocol = mediaField.getProtocol();
        Vector mediaFormats = mediaField.getMediaFormats(false);
        Vector vector = new Vector();
        for (int i10 = 0; i10 < mediaFormats.size(); i10++) {
            vector.addElement(protocol.equals("RTP/AVP") ? getAttribute("rtpmap") != null ? AbstractC9306j0.m9890i(mediaType, Separators.SLASH, protocol) : null : AbstractC9306j0.m9890i(mediaType, Separators.SLASH, protocol));
        }
        return vector;
    }

    public Vector getPreconditionFields() {
        return this.preconditionFields.getPreconditions();
    }

    public boolean hasAttribute(String str) {
        for (int i10 = 0; i10 < this.attributeFields.size(); i10++) {
            if (((AttributeField) this.attributeFields.elementAt(i10)).getAttribute().getName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void removeAttribute(String str) {
        if (str == null) {
            throw new NullPointerException("null arg!");
        }
        int i10 = 0;
        while (i10 < this.attributeFields.size() && !((AttributeField) this.attributeFields.elementAt(i10)).getAttribute().getName().equals(str)) {
            i10++;
        }
        if (i10 < this.attributeFields.size()) {
            this.attributeFields.removeElementAt(i10);
        }
    }

    public void removeBandwidth(String str) {
        String bwtype;
        if (str == null) {
            throw new NullPointerException("null bandwidth type");
        }
        int i10 = 0;
        while (i10 < this.bandwidthFields.size() && ((bwtype = ((BandwidthField) this.bandwidthFields.elementAt(i10)).getBwtype()) == null || !bwtype.equals(str))) {
            i10++;
        }
        if (i10 < this.bandwidthFields.size()) {
            this.bandwidthFields.removeElementAt(i10);
        }
    }

    public void setAttribute(String str, String str2) throws C11547g {
        if (str == null) {
            throw new C11547g("The parameters are null");
        }
        int i10 = 0;
        while (i10 < this.attributeFields.size()) {
            AttributeField attributeField = (AttributeField) this.attributeFields.elementAt(i10);
            if (attributeField.getAttribute().getName().equals(str)) {
                attributeField.getAttribute().setValueAsObject(str2);
                break;
            }
            i10++;
        }
        if (i10 == this.attributeFields.size()) {
            AttributeField attributeField2 = new AttributeField();
            attributeField2.setAttribute(new NameValue(str, str2));
            this.attributeFields.add(attributeField2);
        }
    }

    public void setAttributeFields(Vector vector) {
        this.attributeFields = vector;
    }

    public void setAttributes(Vector vector) {
        this.attributeFields = vector;
    }

    public void setBandwidth(String str, int i10) throws C11547g {
        if (str == null) {
            throw new C11547g("The name is null");
        }
        int i11 = 0;
        while (i11 < this.bandwidthFields.size()) {
            BandwidthField bandwidthField = (BandwidthField) this.bandwidthFields.elementAt(i11);
            String bwtype = bandwidthField.getBwtype();
            if (bwtype != null && bwtype.equals(str)) {
                bandwidthField.setBandwidth(i10);
                break;
            }
            i11++;
        }
        if (i11 == this.bandwidthFields.size()) {
            BandwidthField bandwidthField2 = new BandwidthField();
            bandwidthField2.setType(str);
            bandwidthField2.setValue(i10);
            this.bandwidthFields.add(bandwidthField2);
        }
    }

    public void setBandwidths(Vector vector) throws C11547g {
        if (vector == null) {
            throw new C11547g("The vector bandwidths is null");
        }
        this.bandwidthFields = vector;
    }

    public void setConnection(InterfaceC11541a interfaceC11541a) throws C11547g {
        if (interfaceC11541a == null) {
            throw new C11547g("The conn is null");
        }
        if (!(interfaceC11541a instanceof ConnectionField)) {
            throw new C11547g("bad implementation");
        }
        this.connectionField = (ConnectionField) interfaceC11541a;
    }

    public void setConnectionField(ConnectionField connectionField) {
        this.connectionField = connectionField;
    }

    public void setDuplexity(String str) {
        if (str == null) {
            throw new NullPointerException("Null arg");
        }
        int i10 = 0;
        while (i10 < this.attributeFields.size()) {
            AttributeField attributeField = (AttributeField) this.attributeFields.elementAt(i10);
            if (attributeField.getAttribute().getName().equalsIgnoreCase("sendrecv") || attributeField.getAttribute().getName().equalsIgnoreCase("recvonly") || attributeField.getAttribute().getName().equalsIgnoreCase("sendonly") || attributeField.getAttribute().getName().equalsIgnoreCase("inactive")) {
                attributeField.setAttribute(new NameValue(str, null));
                return;
            }
            i10++;
        }
        if (i10 == this.attributeFields.size()) {
            AttributeField attributeField2 = new AttributeField();
            attributeField2.setAttribute(new NameValue(str, null));
            this.attributeFields.add(attributeField2);
        }
    }

    public void setInfo(InterfaceC11543c interfaceC11543c) throws C11547g {
        if (interfaceC11543c == null) {
            throw new C11547g("The info is null");
        }
        if (!(interfaceC11543c instanceof InformationField)) {
            throw new C11547g("A informationField parameter is required");
        }
        this.informationField = (InformationField) interfaceC11543c;
    }

    public void setInformationField(InformationField informationField) {
        this.informationField = informationField;
    }

    public void setKey(InterfaceC11544d interfaceC11544d) throws C11547g {
        if (interfaceC11544d == null) {
            throw new C11547g("The key is null");
        }
        if (!(interfaceC11544d instanceof KeyField)) {
            throw new C11547g("A keyField parameter is required");
        }
        setKeyField((KeyField) interfaceC11544d);
    }

    public void setKeyField(KeyField keyField) {
        this.keyField = keyField;
    }

    public void setMedia(InterfaceC11545e interfaceC11545e) throws C11547g {
        if (interfaceC11545e == null) {
            throw new C11547g("The media is null");
        }
        if (!(interfaceC11545e instanceof MediaField)) {
            throw new C11547g("A mediaField parameter is required");
        }
        this.mediaField = (MediaField) interfaceC11545e;
    }

    public void setMediaField(MediaField mediaField) {
        this.mediaField = mediaField;
    }

    public void setPreconditionFields(Vector vector) {
        this.preconditionFields.setPreconditions(vector);
    }

    public void setPreconditions(PreconditionFields preconditionFields) {
        this.preconditionFields = preconditionFields;
    }

    public String toString() {
        return encode();
    }
}
