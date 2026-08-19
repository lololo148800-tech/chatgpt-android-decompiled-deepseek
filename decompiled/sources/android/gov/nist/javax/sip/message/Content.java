package android.gov.nist.javax.sip.message;

import java.util.Iterator;
import p713e.InterfaceC13239m;
import p713e.InterfaceC13243q;
import p713e.InterfaceC13250x;

/* JADX INFO: loaded from: classes.dex */
public interface Content {
    Object getContent();

    InterfaceC13239m getContentDispositionHeader();

    InterfaceC13243q getContentTypeHeader();

    Iterator<InterfaceC13250x> getExtensionHeaders();

    void setContent(Object obj);

    String toString();
}
