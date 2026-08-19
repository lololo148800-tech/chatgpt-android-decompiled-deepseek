package android.gov.nist.javax.sip.header.ims;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public interface SecurityServerHeader extends SecurityAgreeHeader {
    public static final String NAME = "Security-Server";

    @Override // android.gov.nist.javax.sip.header.ims.SecurityAgreeHeader, p713e.InterfaceC13250x
    /* synthetic */ Object clone();

    @Override // android.gov.nist.javax.sip.header.ims.SecurityAgreeHeader
    /* synthetic */ String getName();

    @Override // android.gov.nist.javax.sip.header.ims.SecurityAgreeHeader, p713e.InterfaceC13200H
    /* synthetic */ String getParameter(String str);

    @Override // android.gov.nist.javax.sip.header.ims.SecurityAgreeHeader, p713e.InterfaceC13200H
    /* synthetic */ Iterator getParameterNames();

    @Override // android.gov.nist.javax.sip.header.ims.SecurityAgreeHeader, p713e.InterfaceC13200H
    /* synthetic */ void removeParameter(String str);

    @Override // android.gov.nist.javax.sip.header.ims.SecurityAgreeHeader, p713e.InterfaceC13200H
    /* synthetic */ void setParameter(String str, String str2);
}
