package android.gov.nist.javax.sdp;

import android.gov.nist.javax.sdp.fields.AttributeField;
import android.gov.nist.javax.sdp.fields.BandwidthField;
import android.gov.nist.javax.sdp.fields.ConnectionField;
import android.gov.nist.javax.sdp.fields.EmailField;
import android.gov.nist.javax.sdp.fields.InformationField;
import android.gov.nist.javax.sdp.fields.KeyField;
import android.gov.nist.javax.sdp.fields.MediaField;
import android.gov.nist.javax.sdp.fields.OriginField;
import android.gov.nist.javax.sdp.fields.PhoneField;
import android.gov.nist.javax.sdp.fields.ProtoVersionField;
import android.gov.nist.javax.sdp.fields.RepeatField;
import android.gov.nist.javax.sdp.fields.SDPField;
import android.gov.nist.javax.sdp.fields.SessionNameField;
import android.gov.nist.javax.sdp.fields.TimeField;
import android.gov.nist.javax.sdp.fields.URIField;
import android.gov.nist.javax.sdp.fields.ZoneField;
import java.text.ParseException;
import java.util.Vector;
import p668c.C11547g;
import p668c.C11549i;
import p668c.InterfaceC11541a;
import p668c.InterfaceC11543c;
import p668c.InterfaceC11544d;
import p668c.InterfaceC11546f;
import p668c.InterfaceC11550j;
import p668c.InterfaceC11551k;
import p668c.InterfaceC11553m;
import p668c.InterfaceC11554n;

/* JADX INFO: loaded from: classes.dex */
public class SessionDescriptionImpl implements InterfaceC11550j {
    protected Vector attributesList;
    protected Vector bandwidthList;
    protected ConnectionField connectionImpl;
    private MediaDescriptionImpl currentMediaDescription;
    private TimeDescriptionImpl currentTimeDescription;
    protected Vector emailList;
    protected InformationField infoImpl;
    protected KeyField keyImpl;
    protected Vector mediaDescriptions;
    protected OriginField originImpl;
    protected Vector phoneList;
    protected SessionNameField sessionNameImpl;
    protected Vector timeDescriptions;
    protected URIField uriImpl;
    protected ProtoVersionField versionImpl;
    protected Vector zoneAdjustments;

    public SessionDescriptionImpl() {
    }

    private String encodeVector(Vector vector) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < vector.size(); i10++) {
            sb2.append(vector.elementAt(i10));
        }
        return sb2.toString();
    }

    public void addField(SDPField sDPField) throws ParseException {
        try {
            if (sDPField instanceof ProtoVersionField) {
                this.versionImpl = (ProtoVersionField) sDPField;
                return;
            }
            if (sDPField instanceof OriginField) {
                this.originImpl = (OriginField) sDPField;
                return;
            }
            if (sDPField instanceof SessionNameField) {
                this.sessionNameImpl = (SessionNameField) sDPField;
                return;
            }
            if (sDPField instanceof InformationField) {
                MediaDescriptionImpl mediaDescriptionImpl = this.currentMediaDescription;
                if (mediaDescriptionImpl != null) {
                    mediaDescriptionImpl.setInformationField((InformationField) sDPField);
                    return;
                } else {
                    this.infoImpl = (InformationField) sDPField;
                    return;
                }
            }
            if (sDPField instanceof URIField) {
                this.uriImpl = (URIField) sDPField;
                return;
            }
            if (sDPField instanceof ConnectionField) {
                MediaDescriptionImpl mediaDescriptionImpl2 = this.currentMediaDescription;
                if (mediaDescriptionImpl2 != null) {
                    mediaDescriptionImpl2.setConnectionField((ConnectionField) sDPField);
                    return;
                } else {
                    this.connectionImpl = (ConnectionField) sDPField;
                    return;
                }
            }
            if (sDPField instanceof KeyField) {
                MediaDescriptionImpl mediaDescriptionImpl3 = this.currentMediaDescription;
                if (mediaDescriptionImpl3 != null) {
                    mediaDescriptionImpl3.setKey((KeyField) sDPField);
                    return;
                } else {
                    this.keyImpl = (KeyField) sDPField;
                    return;
                }
            }
            if (sDPField instanceof EmailField) {
                getEmails(true).add(sDPField);
                return;
            }
            if (sDPField instanceof PhoneField) {
                getPhones(true).add(sDPField);
                return;
            }
            if (sDPField instanceof TimeField) {
                this.currentTimeDescription = new TimeDescriptionImpl((TimeField) sDPField);
                getTimeDescriptions(true).add(this.currentTimeDescription);
                return;
            }
            if (sDPField instanceof RepeatField) {
                TimeDescriptionImpl timeDescriptionImpl = this.currentTimeDescription;
                if (timeDescriptionImpl == null) {
                    throw new ParseException("no time specified", 0);
                }
                timeDescriptionImpl.addRepeatField((RepeatField) sDPField);
                return;
            }
            if (sDPField instanceof ZoneField) {
                getZoneAdjustments(true).add(sDPField);
                return;
            }
            if (sDPField instanceof BandwidthField) {
                MediaDescriptionImpl mediaDescriptionImpl4 = this.currentMediaDescription;
                if (mediaDescriptionImpl4 != null) {
                    mediaDescriptionImpl4.addBandwidthField((BandwidthField) sDPField);
                    return;
                } else {
                    getBandwidths(true).add(sDPField);
                    return;
                }
            }
            if (sDPField instanceof AttributeField) {
                if (this.currentMediaDescription == null) {
                    getAttributes(true).add(sDPField);
                    return;
                } else {
                    ((AttributeField) sDPField).getName();
                    this.currentMediaDescription.addAttribute((AttributeField) sDPField);
                    return;
                }
            }
            if (sDPField instanceof MediaField) {
                this.currentMediaDescription = new MediaDescriptionImpl();
                getMediaDescriptions(true).add(this.currentMediaDescription);
                this.currentMediaDescription.setMediaField((MediaField) sDPField);
            }
        } catch (C11547g unused) {
            throw new ParseException(sDPField.encode(), 0);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return new SessionDescriptionImpl(this);
        } catch (C11547g unused) {
            throw new CloneNotSupportedException();
        }
    }

    public String getAttribute(String str) {
        AttributeField attributeField;
        String name;
        if (str == null || this.attributesList == null) {
            return null;
        }
        for (int i10 = 0; i10 < this.attributesList.size(); i10++) {
            Object objElementAt = this.attributesList.elementAt(i10);
            if ((objElementAt instanceof AttributeField) && (name = (attributeField = (AttributeField) objElementAt).getName()) != null && str.equals(name)) {
                return attributeField.getValue();
            }
        }
        return null;
    }

    @Override // p668c.InterfaceC11550j
    public Vector getAttributes(boolean z6) {
        if (this.attributesList == null && z6) {
            this.attributesList = new Vector();
        }
        return this.attributesList;
    }

    public int getBandwidth(String str) {
        BandwidthField bandwidthField;
        String type;
        if (str == null || this.bandwidthList == null) {
            return -1;
        }
        for (int i10 = 0; i10 < this.bandwidthList.size(); i10++) {
            Object objElementAt = this.bandwidthList.elementAt(i10);
            if ((objElementAt instanceof BandwidthField) && (type = (bandwidthField = (BandwidthField) objElementAt).getType()) != null && str.equals(type)) {
                return bandwidthField.getValue();
            }
        }
        return -1;
    }

    @Override // p668c.InterfaceC11550j
    public Vector getBandwidths(boolean z6) {
        if (this.bandwidthList == null && z6) {
            this.bandwidthList = new Vector();
        }
        return this.bandwidthList;
    }

    @Override // p668c.InterfaceC11550j
    public InterfaceC11541a getConnection() {
        return this.connectionImpl;
    }

    @Override // p668c.InterfaceC11550j
    public Vector getEmails(boolean z6) {
        if (this.emailList == null && z6) {
            this.emailList = new Vector();
        }
        return this.emailList;
    }

    @Override // p668c.InterfaceC11550j
    public InterfaceC11543c getInfo() {
        return this.infoImpl;
    }

    @Override // p668c.InterfaceC11550j
    public InterfaceC11544d getKey() {
        return this.keyImpl;
    }

    @Override // p668c.InterfaceC11550j
    public Vector getMediaDescriptions(boolean z6) {
        if (this.mediaDescriptions == null && z6) {
            this.mediaDescriptions = new Vector();
        }
        return this.mediaDescriptions;
    }

    @Override // p668c.InterfaceC11550j
    public InterfaceC11546f getOrigin() {
        return this.originImpl;
    }

    @Override // p668c.InterfaceC11550j
    public Vector getPhones(boolean z6) {
        if (this.phoneList == null && z6) {
            this.phoneList = new Vector();
        }
        return this.phoneList;
    }

    @Override // p668c.InterfaceC11550j
    public InterfaceC11551k getSessionName() {
        return this.sessionNameImpl;
    }

    @Override // p668c.InterfaceC11550j
    public Vector getTimeDescriptions(boolean z6) {
        if (this.timeDescriptions == null && z6) {
            this.timeDescriptions = new Vector();
        }
        return this.timeDescriptions;
    }

    @Override // p668c.InterfaceC11550j
    public InterfaceC11553m getURI() {
        return this.uriImpl;
    }

    @Override // p668c.InterfaceC11550j
    public InterfaceC11554n getVersion() {
        return this.versionImpl;
    }

    @Override // p668c.InterfaceC11550j
    public Vector getZoneAdjustments(boolean z6) {
        if (this.zoneAdjustments == null && z6) {
            this.zoneAdjustments = new Vector();
        }
        return this.zoneAdjustments;
    }

    public void removeAttribute(String str) {
        if (str == null || this.attributesList == null) {
            return;
        }
        for (int i10 = 0; i10 < this.attributesList.size(); i10++) {
            Object objElementAt = this.attributesList.elementAt(i10);
            if (objElementAt instanceof AttributeField) {
                AttributeField attributeField = (AttributeField) objElementAt;
                try {
                    String name = attributeField.getName();
                    if (name != null && str.equals(name)) {
                        this.attributesList.remove(attributeField);
                    }
                } catch (C11549i unused) {
                }
            }
        }
    }

    public void removeBandwidth(String str) {
        if (str == null || this.bandwidthList == null) {
            return;
        }
        for (int i10 = 0; i10 < this.bandwidthList.size(); i10++) {
            Object objElementAt = this.bandwidthList.elementAt(i10);
            if (objElementAt instanceof BandwidthField) {
                BandwidthField bandwidthField = (BandwidthField) objElementAt;
                try {
                    String type = bandwidthField.getType();
                    if (type != null && str.equals(type)) {
                        this.bandwidthList.remove(bandwidthField);
                    }
                } catch (C11549i unused) {
                }
            }
        }
    }

    public void setAttribute(String str, String str2) throws C11547g {
        AttributeField attributeField;
        String name;
        if (str == null || str2 == null) {
            throw new C11547g("The parameter is null");
        }
        if (this.attributesList != null) {
            for (int i10 = 0; i10 < this.attributesList.size(); i10++) {
                Object objElementAt = this.attributesList.elementAt(i10);
                if ((objElementAt instanceof AttributeField) && (name = (attributeField = (AttributeField) objElementAt).getName()) != null && str.equals(name)) {
                    attributeField.setValue(str2);
                }
            }
        }
    }

    public void setAttributes(Vector vector) throws C11547g {
        if (vector == null) {
            throw new C11547g("The parameter is null");
        }
        this.attributesList = vector;
    }

    public void setBandwidth(String str, int i10) throws C11547g {
        BandwidthField bandwidthField;
        String type;
        if (str == null) {
            throw new C11547g("The parameter is null");
        }
        if (this.bandwidthList != null) {
            for (int i11 = 0; i11 < this.bandwidthList.size(); i11++) {
                Object objElementAt = this.bandwidthList.elementAt(i11);
                if ((objElementAt instanceof BandwidthField) && (type = (bandwidthField = (BandwidthField) objElementAt).getType()) != null && str.equals(type)) {
                    bandwidthField.setValue(i10);
                }
            }
        }
    }

    public void setBandwidths(Vector vector) throws C11547g {
        if (vector == null) {
            throw new C11547g("The parameter is null");
        }
        this.bandwidthList = vector;
    }

    public void setConnection(InterfaceC11541a interfaceC11541a) throws C11547g {
        if (interfaceC11541a == null) {
            throw new C11547g("The parameter is null");
        }
        if (!(interfaceC11541a instanceof ConnectionField)) {
            throw new C11547g("Bad implementation class ConnectionField");
        }
        this.connectionImpl = (ConnectionField) interfaceC11541a;
    }

    public void setEmails(Vector vector) throws C11547g {
        if (vector == null) {
            throw new C11547g("The parameter is null");
        }
        this.emailList = vector;
    }

    public void setInfo(InterfaceC11543c interfaceC11543c) throws C11547g {
        if (interfaceC11543c == null) {
            throw new C11547g("The parameter is null");
        }
        if (!(interfaceC11543c instanceof InformationField)) {
            throw new C11547g("The parameter must be an instance of InformationField");
        }
        this.infoImpl = (InformationField) interfaceC11543c;
    }

    public void setKey(InterfaceC11544d interfaceC11544d) throws C11547g {
        if (interfaceC11544d == null) {
            throw new C11547g("The parameter is null");
        }
        if (!(interfaceC11544d instanceof KeyField)) {
            throw new C11547g("The parameter must be an instance of KeyField");
        }
        this.keyImpl = (KeyField) interfaceC11544d;
    }

    public void setMediaDescriptions(Vector vector) throws C11547g {
        if (vector == null) {
            throw new C11547g("The parameter is null");
        }
        this.mediaDescriptions = vector;
    }

    public void setOrigin(InterfaceC11546f interfaceC11546f) throws C11547g {
        if (interfaceC11546f == null) {
            throw new C11547g("The parameter is null");
        }
        if (!(interfaceC11546f instanceof OriginField)) {
            throw new C11547g("The parameter must be an instance of OriginField");
        }
        this.originImpl = (OriginField) interfaceC11546f;
    }

    public void setPhones(Vector vector) throws C11547g {
        if (vector == null) {
            throw new C11547g("The parameter is null");
        }
        this.phoneList = vector;
    }

    public void setSessionName(InterfaceC11551k interfaceC11551k) throws C11547g {
        if (interfaceC11551k == null) {
            throw new C11547g("The parameter is null");
        }
        if (!(interfaceC11551k instanceof SessionNameField)) {
            throw new C11547g("The parameter must be an instance of SessionNameField");
        }
        this.sessionNameImpl = (SessionNameField) interfaceC11551k;
    }

    public void setTimeDescriptions(Vector vector) throws C11547g {
        if (vector == null) {
            throw new C11547g("The parameter is null");
        }
        this.timeDescriptions = vector;
    }

    public void setURI(InterfaceC11553m interfaceC11553m) throws C11547g {
        if (interfaceC11553m == null) {
            throw new C11547g("The parameter is null");
        }
        if (!(interfaceC11553m instanceof URIField)) {
            throw new C11547g("The parameter must be an instance of URIField");
        }
        this.uriImpl = (URIField) interfaceC11553m;
    }

    public void setVersion(InterfaceC11554n interfaceC11554n) throws C11547g {
        if (interfaceC11554n == null) {
            throw new C11547g("The parameter is null");
        }
        if (!(interfaceC11554n instanceof ProtoVersionField)) {
            throw new C11547g("The parameter must be an instance of VersionField");
        }
        this.versionImpl = (ProtoVersionField) interfaceC11554n;
    }

    public void setZoneAdjustments(Vector vector) throws C11547g {
        if (vector == null) {
            throw new C11547g("The parameter is null");
        }
        this.zoneAdjustments = vector;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String strEncodeVector = "";
        sb2.append(getVersion() == null ? "" : getVersion().toString());
        sb2.append(getOrigin() == null ? "" : getOrigin().toString());
        sb2.append(getSessionName() == null ? "" : getSessionName().toString());
        sb2.append(getInfo() == null ? "" : getInfo().toString());
        try {
            sb2.append(getURI() == null ? "" : getURI().toString());
            sb2.append(getEmails(false) == null ? "" : encodeVector(getEmails(false)));
            sb2.append(getPhones(false) == null ? "" : encodeVector(getPhones(false)));
            sb2.append(getConnection() == null ? "" : getConnection().toString());
            sb2.append(getBandwidths(false) == null ? "" : encodeVector(getBandwidths(false)));
            sb2.append(getTimeDescriptions(false) == null ? "" : encodeVector(getTimeDescriptions(false)));
            sb2.append(getZoneAdjustments(false) == null ? "" : encodeVector(getZoneAdjustments(false)));
            sb2.append(getKey() == null ? "" : getKey().toString());
            sb2.append(getAttributes(false) == null ? "" : encodeVector(getAttributes(false)));
            if (getMediaDescriptions(false) != null) {
                strEncodeVector = encodeVector(getMediaDescriptions(false));
            }
            sb2.append(strEncodeVector);
        } catch (C11547g unused) {
        }
        return sb2.toString();
    }

    public SessionDescriptionImpl(InterfaceC11550j interfaceC11550j) throws C11547g {
        if (interfaceC11550j == null) {
            return;
        }
        InterfaceC11554n version = interfaceC11550j.getVersion();
        if (version != null) {
            setVersion((InterfaceC11554n) version.clone());
        }
        InterfaceC11546f origin = interfaceC11550j.getOrigin();
        if (origin != null) {
            setOrigin((InterfaceC11546f) origin.clone());
        }
        InterfaceC11551k sessionName = interfaceC11550j.getSessionName();
        if (sessionName != null) {
            setSessionName((InterfaceC11551k) sessionName.clone());
        }
        InterfaceC11543c info = interfaceC11550j.getInfo();
        if (info != null) {
            setInfo((InterfaceC11543c) info.clone());
        }
        URIField uRIField = (URIField) interfaceC11550j.getURI();
        if (uRIField != null) {
            URIField uRIField2 = new URIField();
            uRIField2.set(uRIField.get());
            setURI(uRIField2);
        }
        InterfaceC11541a connection = interfaceC11550j.getConnection();
        if (connection != null) {
            setConnection((InterfaceC11541a) connection.clone());
        }
        InterfaceC11544d key = interfaceC11550j.getKey();
        if (key != null) {
            setKey((InterfaceC11544d) key.clone());
        }
        Vector<TimeDescriptionImpl> timeDescriptions = interfaceC11550j.getTimeDescriptions(false);
        if (timeDescriptions != null) {
            Vector vector = new Vector();
            for (TimeDescriptionImpl timeDescriptionImpl : timeDescriptions) {
                if (timeDescriptionImpl != null) {
                    TimeDescriptionImpl timeDescriptionImpl2 = new TimeDescriptionImpl((TimeField) timeDescriptionImpl.getTime().clone());
                    Vector<RepeatField> repeatTimes = timeDescriptionImpl.getRepeatTimes(false);
                    if (repeatTimes != null) {
                        for (RepeatField repeatField : repeatTimes) {
                            if (repeatField != null) {
                                timeDescriptionImpl2.addRepeatField((RepeatField) repeatField.clone());
                            }
                        }
                    }
                    vector.add(timeDescriptionImpl2);
                }
            }
            setTimeDescriptions(vector);
        }
        Vector<EmailField> emails = interfaceC11550j.getEmails(false);
        if (emails != null) {
            Vector vector2 = new Vector();
            for (EmailField emailField : emails) {
                if (emailField != null) {
                    vector2.add((EmailField) emailField.clone());
                }
            }
            setEmails(vector2);
        }
        Vector<PhoneField> phones = interfaceC11550j.getPhones(false);
        if (phones != null) {
            Vector vector3 = new Vector();
            for (PhoneField phoneField : phones) {
                if (phoneField != null) {
                    vector3.add((PhoneField) phoneField.clone());
                }
            }
            setPhones(vector3);
        }
        Vector<ZoneField> zoneAdjustments = interfaceC11550j.getZoneAdjustments(false);
        if (zoneAdjustments != null) {
            Vector vector4 = new Vector();
            for (ZoneField zoneField : zoneAdjustments) {
                if (zoneField != null) {
                    vector4.add((ZoneField) zoneField.clone());
                }
            }
            setZoneAdjustments(vector4);
        }
        Vector<BandwidthField> bandwidths = interfaceC11550j.getBandwidths(false);
        if (bandwidths != null) {
            Vector vector5 = new Vector();
            for (BandwidthField bandwidthField : bandwidths) {
                if (bandwidthField != null) {
                    vector5.add((BandwidthField) bandwidthField.clone());
                }
            }
            setBandwidths(vector5);
        }
        Vector<AttributeField> attributes = interfaceC11550j.getAttributes(false);
        if (attributes != null) {
            Vector vector6 = new Vector();
            for (AttributeField attributeField : attributes) {
                if (attributeField != null) {
                    vector6.add((AttributeField) attributeField.clone());
                }
            }
            setAttributes(vector6);
        }
        Vector<MediaDescriptionImpl> mediaDescriptions = interfaceC11550j.getMediaDescriptions(false);
        if (mediaDescriptions != null) {
            Vector vector7 = new Vector();
            for (MediaDescriptionImpl mediaDescriptionImpl : mediaDescriptions) {
                if (mediaDescriptionImpl != null) {
                    MediaDescriptionImpl mediaDescriptionImpl2 = new MediaDescriptionImpl();
                    MediaField mediaField = mediaDescriptionImpl.getMediaField();
                    if (mediaField != null) {
                        MediaField mediaField2 = new MediaField();
                        mediaField2.setMedia(mediaField.getMedia());
                        mediaField2.setPort(mediaField.getPort());
                        mediaField2.setNports(mediaField.getNports());
                        mediaField2.setProto(mediaField.getProto());
                        Vector formats = mediaField.getFormats();
                        if (formats != null) {
                            Vector vector8 = new Vector();
                            for (Object obj : formats) {
                                if (obj != null) {
                                    vector8.add(String.valueOf(obj));
                                }
                            }
                            mediaField2.setFormats(vector8);
                        }
                        mediaDescriptionImpl2.setMedia(mediaField2);
                    }
                    InformationField informationField = mediaDescriptionImpl.getInformationField();
                    if (informationField != null) {
                        mediaDescriptionImpl2.setInformationField((InformationField) informationField.clone());
                    }
                    ConnectionField connectionField = mediaDescriptionImpl.getConnectionField();
                    if (connectionField != null) {
                        mediaDescriptionImpl2.setConnectionField((ConnectionField) connectionField.clone());
                    }
                    Vector<BandwidthField> bandwidths2 = mediaDescriptionImpl.getBandwidths(false);
                    if (bandwidths2 != null) {
                        Vector vector9 = new Vector();
                        for (BandwidthField bandwidthField2 : bandwidths2) {
                            if (bandwidthField2 != null) {
                                vector9.add((BandwidthField) bandwidthField2.clone());
                            }
                        }
                        mediaDescriptionImpl2.setBandwidths(vector9);
                    }
                    KeyField keyField = mediaDescriptionImpl.getKeyField();
                    if (keyField != null) {
                        mediaDescriptionImpl2.setKeyField((KeyField) keyField.clone());
                    }
                    Vector<AttributeField> attributeFields = mediaDescriptionImpl.getAttributeFields();
                    if (attributeFields != null) {
                        Vector vector10 = new Vector();
                        for (AttributeField attributeField2 : attributeFields) {
                            if (attributeField2 != null) {
                                vector10.add((AttributeField) attributeField2.clone());
                            }
                        }
                        mediaDescriptionImpl2.setAttributeFields(vector10);
                    }
                    vector7.add(mediaDescriptionImpl2);
                }
            }
            setMediaDescriptions(vector7);
        }
    }
}
