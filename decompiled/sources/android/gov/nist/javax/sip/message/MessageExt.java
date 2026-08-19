package android.gov.nist.javax.sip.message;

import java.util.ListIterator;
import p713e.InterfaceC13225d0;
import p713e.InterfaceC13231g0;
import p713e.InterfaceC13234i;
import p713e.InterfaceC13236j;
import p713e.InterfaceC13239m;
import p713e.InterfaceC13240n;
import p713e.InterfaceC13241o;
import p713e.InterfaceC13242p;
import p713e.InterfaceC13243q;
import p713e.InterfaceC13247u;
import p713e.InterfaceC13249w;
import p713e.InterfaceC13250x;
import p735f.InterfaceC13460a;

/* JADX INFO: loaded from: classes.dex */
public interface MessageExt extends InterfaceC13460a {
    /* synthetic */ void addFirst(InterfaceC13250x interfaceC13250x);

    @Override // p735f.InterfaceC13460a
    /* synthetic */ void addHeader(InterfaceC13250x interfaceC13250x);

    /* synthetic */ void addLast(InterfaceC13250x interfaceC13250x);

    /* synthetic */ Object clone();

    Object getApplicationData();

    InterfaceC13234i getCSeqHeader();

    InterfaceC13236j getCallIdHeader();

    @Override // p735f.InterfaceC13460a
    /* synthetic */ Object getContent();

    /* synthetic */ InterfaceC13239m getContentDisposition();

    /* synthetic */ InterfaceC13240n getContentEncoding();

    /* synthetic */ InterfaceC13241o getContentLanguage();

    /* synthetic */ InterfaceC13242p getContentLength();

    InterfaceC13242p getContentLengthHeader();

    InterfaceC13243q getContentTypeHeader();

    @Override // p735f.InterfaceC13460a
    /* synthetic */ InterfaceC13247u getExpires();

    String getFirstLine();

    InterfaceC13249w getFromHeader();

    @Override // p735f.InterfaceC13460a
    /* synthetic */ InterfaceC13250x getHeader(String str);

    /* synthetic */ ListIterator getHeaderNames();

    @Override // p735f.InterfaceC13460a
    /* synthetic */ ListIterator getHeaders(String str);

    MultipartMimeContent getMultipartMimeContent();

    @Override // p735f.InterfaceC13460a
    /* synthetic */ byte[] getRawContent();

    /* synthetic */ String getSIPVersion();

    InterfaceC13225d0 getToHeader();

    InterfaceC13231g0 getTopmostViaHeader();

    /* synthetic */ ListIterator getUnrecognizedHeaders();

    /* synthetic */ void removeContent();

    /* synthetic */ void removeFirst(String str);

    @Override // p735f.InterfaceC13460a
    /* synthetic */ void removeHeader(String str);

    /* synthetic */ void removeLast(String str);

    void setApplicationData(Object obj);

    /* synthetic */ void setContent(Object obj, InterfaceC13243q interfaceC13243q);

    /* synthetic */ void setContentDisposition(InterfaceC13239m interfaceC13239m);

    /* synthetic */ void setContentEncoding(InterfaceC13240n interfaceC13240n);

    /* synthetic */ void setContentLanguage(InterfaceC13241o interfaceC13241o);

    /* synthetic */ void setContentLength(InterfaceC13242p interfaceC13242p);

    /* synthetic */ void setExpires(InterfaceC13247u interfaceC13247u);

    @Override // p735f.InterfaceC13460a
    /* synthetic */ void setHeader(InterfaceC13250x interfaceC13250x);

    /* synthetic */ void setSIPVersion(String str);
}
