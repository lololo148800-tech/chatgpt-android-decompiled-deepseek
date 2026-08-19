package android.gov.nist.javax.sip.header.ims;

import java.text.ParseException;
import p713e.InterfaceC13248v;

/* JADX INFO: loaded from: classes.dex */
public class SecurityServer extends SecurityAgree implements SecurityServerHeader, InterfaceC13248v {
    public SecurityServer() {
        super("Security-Server");
    }

    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }
}
