package android.gov.nist.javax.sip.message;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p713e.InterfaceC13239m;
import p713e.InterfaceC13243q;
import p713e.InterfaceC13250x;

/* JADX INFO: loaded from: classes.dex */
public class ContentImpl implements Content {
    private Object content;
    private InterfaceC13239m contentDispositionHeader;
    private InterfaceC13243q contentTypeHeader;
    private List<InterfaceC13250x> extensionHeaders = new ArrayList();

    public ContentImpl(String str) {
        this.content = str;
    }

    public void addExtensionHeader(InterfaceC13250x interfaceC13250x) {
        this.extensionHeaders.add(interfaceC13250x);
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public Object getContent() {
        return this.content;
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public InterfaceC13239m getContentDispositionHeader() {
        return this.contentDispositionHeader;
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public InterfaceC13243q getContentTypeHeader() {
        return this.contentTypeHeader;
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public Iterator<InterfaceC13250x> getExtensionHeaders() {
        return this.extensionHeaders.iterator();
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public void setContent(Object obj) {
        this.content = obj;
    }

    public void setContentDispositionHeader(InterfaceC13239m interfaceC13239m) {
        this.contentDispositionHeader = interfaceC13239m;
    }

    public void setContentTypeHeader(InterfaceC13243q interfaceC13243q) {
        this.contentTypeHeader = interfaceC13243q;
    }

    @Override // android.gov.nist.javax.sip.message.Content
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        InterfaceC13243q interfaceC13243q = this.contentTypeHeader;
        if (interfaceC13243q != null) {
            sb2.append(interfaceC13243q.toString());
        }
        InterfaceC13239m interfaceC13239m = this.contentDispositionHeader;
        if (interfaceC13239m != null) {
            sb2.append(interfaceC13239m.toString());
        }
        Iterator<InterfaceC13250x> it = this.extensionHeaders.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
        }
        sb2.append(Separators.NEWLINE);
        sb2.append(this.content.toString());
        return sb2.toString();
    }
}
