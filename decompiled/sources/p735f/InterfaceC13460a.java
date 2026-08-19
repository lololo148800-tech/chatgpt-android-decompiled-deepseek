package p735f;

import java.io.Serializable;
import java.util.ListIterator;
import p713e.InterfaceC13247u;
import p713e.InterfaceC13250x;

/* JADX INFO: renamed from: f.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC13460a extends Cloneable, Serializable {
    void addHeader(InterfaceC13250x interfaceC13250x);

    Object getContent();

    InterfaceC13247u getExpires();

    InterfaceC13250x getHeader(String str);

    ListIterator getHeaders(String str);

    byte[] getRawContent();

    void removeHeader(String str);

    void setHeader(InterfaceC13250x interfaceC13250x);
}
