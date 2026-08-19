package android.gov.nist.javax.sip.header.ims;

import java.util.Iterator;
import p713e.InterfaceC13200H;
import p713e.InterfaceC13250x;

/* JADX INFO: loaded from: classes.dex */
public interface PChargingVectorHeader extends InterfaceC13250x, InterfaceC13200H {
    public static final String NAME = "P-Charging-Vector";

    @Override // p713e.InterfaceC13250x
    /* synthetic */ Object clone();

    String getICID();

    String getICIDGeneratedAt();

    /* synthetic */ String getName();

    String getOriginatingIOI();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ String getParameter(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ Iterator getParameterNames();

    String getTerminatingIOI();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void removeParameter(String str);

    void setICID(String str);

    void setICIDGeneratedAt(String str);

    void setOriginatingIOI(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void setParameter(String str, String str2);

    void setTerminatingIOI(String str);
}
