package android.gov.nist.javax.sip.message;

import java.util.ListIterator;
import p713e.InterfaceC13239m;
import p713e.InterfaceC13240n;
import p713e.InterfaceC13241o;
import p713e.InterfaceC13242p;
import p713e.InterfaceC13243q;
import p713e.InterfaceC13247u;
import p713e.InterfaceC13250x;
import p735f.InterfaceC13462c;

/* JADX INFO: loaded from: classes.dex */
public interface ResponseExt extends InterfaceC13462c, MessageExt {
    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void addFirst(InterfaceC13250x interfaceC13250x);

    @Override // p735f.InterfaceC13460a
    /* synthetic */ void addHeader(InterfaceC13250x interfaceC13250x);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void addLast(InterfaceC13250x interfaceC13250x);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ Object clone();

    @Override // p735f.InterfaceC13460a
    /* synthetic */ Object getContent();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ InterfaceC13239m getContentDisposition();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ InterfaceC13240n getContentEncoding();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ InterfaceC13241o getContentLanguage();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ InterfaceC13242p getContentLength();

    @Override // p735f.InterfaceC13460a
    /* synthetic */ InterfaceC13247u getExpires();

    @Override // p735f.InterfaceC13460a
    /* synthetic */ InterfaceC13250x getHeader(String str);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ ListIterator getHeaderNames();

    @Override // p735f.InterfaceC13460a
    /* synthetic */ ListIterator getHeaders(String str);

    @Override // p735f.InterfaceC13460a
    /* synthetic */ byte[] getRawContent();

    /* synthetic */ String getReasonPhrase();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ String getSIPVersion();

    @Override // p735f.InterfaceC13462c
    /* synthetic */ int getStatusCode();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ ListIterator getUnrecognizedHeaders();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void removeContent();

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void removeFirst(String str);

    @Override // p735f.InterfaceC13460a
    /* synthetic */ void removeHeader(String str);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void removeLast(String str);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void setContent(Object obj, InterfaceC13243q interfaceC13243q);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void setContentDisposition(InterfaceC13239m interfaceC13239m);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void setContentEncoding(InterfaceC13240n interfaceC13240n);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void setContentLanguage(InterfaceC13241o interfaceC13241o);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void setContentLength(InterfaceC13242p interfaceC13242p);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void setExpires(InterfaceC13247u interfaceC13247u);

    @Override // p735f.InterfaceC13460a
    /* synthetic */ void setHeader(InterfaceC13250x interfaceC13250x);

    @Override // p735f.InterfaceC13462c
    /* synthetic */ void setReasonPhrase(String str);

    @Override // android.gov.nist.javax.sip.message.MessageExt
    /* synthetic */ void setSIPVersion(String str);

    /* synthetic */ void setStatusCode(int i10);
}
