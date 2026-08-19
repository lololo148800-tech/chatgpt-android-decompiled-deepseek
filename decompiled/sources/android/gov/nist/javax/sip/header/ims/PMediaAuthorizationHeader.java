package android.gov.nist.javax.sip.header.ims;

import p713e.InterfaceC13250x;

/* JADX INFO: loaded from: classes.dex */
public interface PMediaAuthorizationHeader extends InterfaceC13250x {
    public static final String NAME = "P-Media-Authorization";

    @Override // p713e.InterfaceC13250x
    /* synthetic */ Object clone();

    /* synthetic */ String getName();

    String getToken();

    void setMediaAuthorizationToken(String str);
}
