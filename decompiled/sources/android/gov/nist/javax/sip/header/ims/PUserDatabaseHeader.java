package android.gov.nist.javax.sip.header.ims;

import java.util.Iterator;
import p713e.InterfaceC13200H;
import p713e.InterfaceC13250x;

/* JADX INFO: loaded from: classes.dex */
public interface PUserDatabaseHeader extends InterfaceC13200H, InterfaceC13250x {
    public static final String NAME = "P-User-Database";

    @Override // p713e.InterfaceC13250x
    /* synthetic */ Object clone();

    String getDatabaseName();

    /* synthetic */ String getName();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ String getParameter(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ Iterator getParameterNames();

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void removeParameter(String str);

    void setDatabaseName(String str);

    @Override // p713e.InterfaceC13200H
    /* synthetic */ void setParameter(String str, String str2);
}
