package android.gov.nist.javax.sip.header.ims;

import p713e.InterfaceC13250x;

/* JADX INFO: loaded from: classes.dex */
public interface PPreferredServiceHeader extends InterfaceC13250x {
    public static final String NAME = "P-Preferred-Service";

    @Override // p713e.InterfaceC13250x
    /* synthetic */ Object clone();

    String getApplicationIdentifiers();

    /* synthetic */ String getName();

    String getSubserviceIdentifiers();

    void setApplicationIdentifiers(String str);

    void setSubserviceIdentifiers(String str);
}
