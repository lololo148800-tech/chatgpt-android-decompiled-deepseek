package android.gov.nist.javax.sip.header.extensions;

import java.util.Iterator;
import p713e.InterfaceC13200H;
import p713e.InterfaceC13250x;

/* JADX INFO: loaded from: classes.dex */
public interface ReferencesHeader extends InterfaceC13200H, InterfaceC13250x {
    public static final String CHAIN = "chain";
    public static final String INQUIRY = "inquiry";
    public static final String NAME = "References";
    public static final String REFER = "refer";
    public static final String REL = "rel";
    public static final String SEQUEL = "sequel";
    public static final String SERVICE = "service";
    public static final String XFER = "xfer";

    @Override // p713e.InterfaceC13250x
    /* synthetic */ Object clone();

    String getCallId();

    /* synthetic */ String getName();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ String getParameter(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ Iterator getParameterNames();

    String getRel();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void removeParameter(String str);

    void setCallId(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void setParameter(String str, String str2);

    void setRel(String str);
}
