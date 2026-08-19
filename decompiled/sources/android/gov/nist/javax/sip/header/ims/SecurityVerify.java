package android.gov.nist.javax.sip.header.ims;

import java.text.ParseException;
import p713e.InterfaceC13248v;

/* JADX INFO: loaded from: classes.dex */
public class SecurityVerify extends SecurityAgree implements SecurityVerifyHeader, InterfaceC13248v {
    public SecurityVerify() {
        super("Security-Verify");
    }

    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }
}
