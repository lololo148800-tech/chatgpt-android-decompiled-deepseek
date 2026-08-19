package android.gov.nist.javax.sip.message;

import java.util.Iterator;
import p713e.InterfaceC13243q;

/* JADX INFO: loaded from: classes.dex */
public interface MultipartMimeContent {
    boolean add(Content content);

    void addContent(Content content);

    int getContentCount();

    InterfaceC13243q getContentTypeHeader();

    Iterator<Content> getContents();

    String toString();
}
