package android.gov.nist.javax.sip.header;

import java.util.Iterator;
import p713e.InterfaceC13200H;

/* JADX INFO: loaded from: classes.dex */
public interface ParametersExt extends InterfaceC13200H {
    @Override // p713e.InterfaceC13200H
    /* synthetic */ String getParameter(String str);

    String getParameter(String str, boolean z6);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ Iterator getParameterNames();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void removeParameter(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void setParameter(String str, String str2);

    void setQuotedParameter(String str, String str2);
}
