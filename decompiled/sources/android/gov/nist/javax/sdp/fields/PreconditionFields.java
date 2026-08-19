package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.NameValue;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import cn.UfGr.EhBykzn;
import java.io.Serializable;
import java.util.Vector;
import p174Gk.uSfJ.HpucjswO;
import p548Wd.p549VF.zakks;
import p571X9.AbstractC9306j0;
import p668c.C11547g;
import p861l1.xapn.suYVq;

/* JADX INFO: loaded from: classes.dex */
public class PreconditionFields implements Serializable {
    public static final int DIRECTION_NONE = 0;
    public static final int DIRECTION_RECV = 2;
    public static final int DIRECTION_SEND = 1;
    public static final int DIRECTION_SENDRECV = 3;
    public static final int PRECONDITION_QOS = 0;
    public static final int STATUS_E2E = 0;
    public static final int STATUS_LOCAL = 1;
    public static final int STATUS_REMOTE = 2;
    public static final int STRENGTH_FAILURE = 1;
    public static final int STRENGTH_MANDATORY = 4;
    public static final int STRENGTH_NONE = 2;
    public static final int STRENGTH_OPTIONAL = 3;
    public static final int STRENGTH_UNKNOWN = 0;
    protected Vector preconditionAttributes = new Vector();
    public static final String[] STRENGTH = {HpucjswO.KmQUcLfW, "failure", "none", ParameterNames.OPTIONAL, "mandatory"};
    public static final String[] DIRECTION = {"none", "send", "recv", zakks.BNgGzErAzOmHH};
    public static final String[] STATUS = {"e2e", "local", "remote"};
    public static final String[] PRECONDITION = {"qos"};

    public Vector getPreconditionConfirmStatus() {
        if (this.preconditionAttributes == null) {
            return null;
        }
        Vector vector = new Vector();
        for (int i10 = 0; i10 < this.preconditionAttributes.size(); i10++) {
            AttributeField attributeField = (AttributeField) this.preconditionAttributes.elementAt(i10);
            if (attributeField.getAttribute().getName().equals("conf")) {
                vector.addElement(attributeField);
            }
        }
        if (vector.size() == 0) {
            return null;
        }
        return vector;
    }

    public Vector getPreconditionCurr(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The status-type is null");
        }
        if (this.preconditionAttributes == null) {
            return null;
        }
        Vector vector = new Vector();
        for (int i10 = 0; i10 < this.preconditionAttributes.size(); i10++) {
            AttributeField attributeField = (AttributeField) this.preconditionAttributes.elementAt(i10);
            if (attributeField.getAttribute().getName().equals("curr") && attributeField.getValue().indexOf(str) != -1) {
                vector.addElement(attributeField);
            }
        }
        if (vector.size() == 0) {
            return null;
        }
        return vector;
    }

    public Vector getPreconditionDes(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The status-type is null");
        }
        if (this.preconditionAttributes == null) {
            return null;
        }
        Vector vector = new Vector();
        for (int i10 = 0; i10 < this.preconditionAttributes.size(); i10++) {
            AttributeField attributeField = (AttributeField) this.preconditionAttributes.elementAt(i10);
            if (attributeField.getAttribute().getName().equals("des") && attributeField.getValue().indexOf(str) != -1) {
                vector.addElement(attributeField);
            }
        }
        if (vector.size() == 0) {
            return null;
        }
        return vector;
    }

    public int getPreconditionSize() {
        Vector vector = this.preconditionAttributes;
        if (vector != null) {
            return vector.size();
        }
        return -1;
    }

    public Vector getPreconditions() {
        return this.preconditionAttributes;
    }

    public void setPreconditionConfirmStatus(String str) throws C11547g {
        if (str == null || str.length() == 0) {
            throw new C11547g("The Precondition \"conf\" attribute value is null");
        }
        if (this.preconditionAttributes == null) {
            throw new C11547g("The Precondition Attributes is null");
        }
        try {
            String[] strArrSplit = str.split(Separators.f31991SP);
            setPreconditionConfirmStatus(strArrSplit[1], strArrSplit[2]);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new C11547g("Error spliting the \"conf\" attribute into words", e10);
        }
    }

    public void setPreconditionCurr(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The Precondition \"curr\" attribute value is null");
        }
        if (this.preconditionAttributes == null) {
            throw new C11547g("The Precondition Attributes is null");
        }
        try {
            String[] strArrSplit = str.split(Separators.f31991SP);
            setPreconditionCurr(strArrSplit[1], strArrSplit[2]);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new C11547g("Error spliting the \"curr\" attribute into words", e10);
        }
    }

    public void setPreconditionDes(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The Precondition \"des\" attribute value is null");
        }
        if (this.preconditionAttributes == null) {
            throw new C11547g("The Precondition Attributes is null");
        }
        try {
            String[] strArrSplit = str.split(Separators.f31991SP);
            setPreconditionDes(strArrSplit[1], strArrSplit[2], strArrSplit[3]);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new C11547g("Error spliting the \"des\" attribute into words", e10);
        }
    }

    public void setPreconditions(Vector vector) {
        if (vector == null) {
            throw new C11547g("Precondition attributes are null");
        }
        this.preconditionAttributes = vector;
    }

    public void setPreconditionCurr(String str, String str2) throws C11547g {
        if (str == null) {
            throw new C11547g("The status-type is null");
        }
        if (str2 != null) {
            if (this.preconditionAttributes != null) {
                int i10 = 0;
                while (i10 < this.preconditionAttributes.size()) {
                    AttributeField attributeField = (AttributeField) this.preconditionAttributes.elementAt(i10);
                    if (attributeField.getAttribute().getName().equals("curr") && attributeField.getValue().indexOf(str) != -1) {
                        if (attributeField.getValue().indexOf(str2) != -1) {
                            break;
                        }
                        attributeField.setValue("qos " + str + Separators.f31991SP + str2);
                        this.preconditionAttributes.setElementAt(attributeField, i10);
                    }
                    i10++;
                }
                if (i10 == this.preconditionAttributes.size()) {
                    NameValue nameValue = new NameValue("curr", AbstractC10763a.m11055m("qos ", str, Separators.f31991SP, str2));
                    AttributeField attributeField2 = new AttributeField();
                    attributeField2.setAttribute(nameValue);
                    this.preconditionAttributes.add(attributeField2);
                    return;
                }
                return;
            }
            throw new C11547g("Precondition Attributes is null");
        }
        throw new C11547g("The direction-tag is null");
    }

    public void setPreconditionDes(String str, String str2, String str3) throws C11547g {
        String str4;
        if (str == null) {
            throw new C11547g("The strength-tag is null");
        }
        if (str2 == null) {
            throw new C11547g("The status-type is null");
        }
        if (str3 != null) {
            if (this.preconditionAttributes != null) {
                int i10 = 0;
                while (true) {
                    int size = this.preconditionAttributes.size();
                    str4 = EhBykzn.RtVcBkvJssIsq;
                    if (i10 >= size) {
                        break;
                    }
                    AttributeField attributeField = (AttributeField) this.preconditionAttributes.elementAt(i10);
                    if (attributeField.getAttribute().getName().equals("des") && attributeField.getValue().indexOf(str2) != -1) {
                        StringBuilder sbM9896o = AbstractC9306j0.m9896o(str4, str, Separators.f31991SP, str2, Separators.f31991SP);
                        sbM9896o.append(str3);
                        attributeField.setValue(sbM9896o.toString());
                        this.preconditionAttributes.setElementAt(attributeField, i10);
                    }
                    i10++;
                }
                if (i10 == this.preconditionAttributes.size()) {
                    StringBuilder sbM9896o2 = AbstractC9306j0.m9896o(str4, str, Separators.f31991SP, str2, Separators.f31991SP);
                    sbM9896o2.append(str3);
                    NameValue nameValue = new NameValue("des", sbM9896o2.toString());
                    AttributeField attributeField2 = new AttributeField();
                    attributeField2.setAttribute(nameValue);
                    this.preconditionAttributes.add(attributeField2);
                    return;
                }
                return;
            }
            throw new C11547g("Precondition Attributes is null");
        }
        throw new C11547g("The direction-tag is null");
    }

    public void setPreconditionConfirmStatus(String str, String str2) throws C11547g {
        if (str != null && str2.length() != 0) {
            if (str2.length() != 0) {
                if (this.preconditionAttributes != null) {
                    int i10 = 0;
                    while (i10 < this.preconditionAttributes.size()) {
                        AttributeField attributeField = (AttributeField) this.preconditionAttributes.elementAt(i10);
                        if (attributeField.getAttribute().getName().equals("conf") && attributeField.getValue().indexOf(str) != -1) {
                            if (attributeField.getValue().indexOf(str2) != -1) {
                                break;
                            }
                            attributeField.setValue("qos " + str + Separators.f31991SP + str2);
                            this.preconditionAttributes.setElementAt(attributeField, i10);
                            break;
                        }
                        i10++;
                    }
                    if (i10 == this.preconditionAttributes.size()) {
                        NameValue nameValue = new NameValue("conf", AbstractC10763a.m11055m("qos ", str, Separators.f31991SP, str2));
                        AttributeField attributeField2 = new AttributeField();
                        attributeField2.setAttribute(nameValue);
                        this.preconditionAttributes.add(attributeField2);
                        return;
                    }
                    return;
                }
                throw new C11547g("Precondition Attributes is null");
            }
            throw new C11547g("The direction-tag is null");
        }
        throw new C11547g(suYVq.HypQ);
    }
}
