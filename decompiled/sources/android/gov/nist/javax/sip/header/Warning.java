package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.javax.sip.C10800g;
import java.text.ParseException;
import p548Wd.p549VF.zakks;
import p713e.InterfaceC13235i0;

/* JADX INFO: loaded from: classes.dex */
public class Warning extends SIPHeader implements InterfaceC13235i0 {
    private static final long serialVersionUID = -3433328864230783899L;
    protected String agent;
    protected int code;
    protected String text;

    public Warning() {
        super(SIPHeaderNames.WARNING);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        String str;
        if (this.text != null) {
            sb2.append(Integer.toString(this.code));
            sb2.append(Separators.f31991SP);
            sb2.append(this.agent);
            sb2.append(Separators.f31991SP);
            str = Separators.DOUBLE_QUOTE;
            sb2.append(Separators.DOUBLE_QUOTE);
            sb2.append(this.text);
        } else {
            sb2.append(Integer.toString(this.code));
            sb2.append(Separators.f31991SP);
            str = this.agent;
        }
        sb2.append(str);
        return sb2;
    }

    public String getAgent() {
        return this.agent;
    }

    public int getCode() {
        return this.code;
    }

    public String getText() {
        return this.text;
    }

    public void setCode(int i10) throws C10800g {
        if (i10 <= 99 || i10 >= 1000) {
            throw new C10800g(AbstractC10763a.m11048f(i10, "Code parameter in the Warning header is invalid: code="));
        }
        this.code = i10;
    }

    public void setText(String str) throws ParseException {
        if (str == null) {
            throw new ParseException("The text parameter in the Warning header is null", 0);
        }
        this.text = str;
    }

    public void setAgent(String str) {
        if (str == null) {
            throw new NullPointerException(zakks.jeQjv);
        }
        this.agent = str;
    }
}
