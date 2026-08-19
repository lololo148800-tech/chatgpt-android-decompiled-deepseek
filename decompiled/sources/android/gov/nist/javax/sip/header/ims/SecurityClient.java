package android.gov.nist.javax.sip.header.ims;

import java.text.ParseException;
import p713e.InterfaceC13248v;

/* JADX INFO: loaded from: classes.dex */
public class SecurityClient extends SecurityAgree implements SecurityClientHeader, InterfaceC13248v {
    public SecurityClient() {
        super("Security-Client");
    }

    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }
}
