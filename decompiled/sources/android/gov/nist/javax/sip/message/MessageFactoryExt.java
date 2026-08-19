package android.gov.nist.javax.sip.message;

import java.util.List;
import p691d.InterfaceC12947f;
import p713e.InterfaceC13194B;
import p713e.InterfaceC13216Y;
import p713e.InterfaceC13225d0;
import p713e.InterfaceC13229f0;
import p713e.InterfaceC13234i;
import p713e.InterfaceC13236j;
import p713e.InterfaceC13243q;
import p713e.InterfaceC13249w;
import p735f.InterfaceC13461b;
import p735f.InterfaceC13462c;

/* JADX INFO: loaded from: classes.dex */
public interface MessageFactoryExt {
    MultipartMimeContent createMultipartMimeContent(InterfaceC13243q interfaceC13243q, String[] strArr, String[] strArr2, String[] strArr3);

    /* synthetic */ InterfaceC13461b createRequest(InterfaceC12947f interfaceC12947f, String str, InterfaceC13236j interfaceC13236j, InterfaceC13234i interfaceC13234i, InterfaceC13249w interfaceC13249w, InterfaceC13225d0 interfaceC13225d0, List list, InterfaceC13194B interfaceC13194B);

    /* synthetic */ InterfaceC13461b createRequest(InterfaceC12947f interfaceC12947f, String str, InterfaceC13236j interfaceC13236j, InterfaceC13234i interfaceC13234i, InterfaceC13249w interfaceC13249w, InterfaceC13225d0 interfaceC13225d0, List list, InterfaceC13194B interfaceC13194B, InterfaceC13243q interfaceC13243q, Object obj);

    /* synthetic */ InterfaceC13461b createRequest(InterfaceC12947f interfaceC12947f, String str, InterfaceC13236j interfaceC13236j, InterfaceC13234i interfaceC13234i, InterfaceC13249w interfaceC13249w, InterfaceC13225d0 interfaceC13225d0, List list, InterfaceC13194B interfaceC13194B, InterfaceC13243q interfaceC13243q, byte[] bArr);

    /* synthetic */ InterfaceC13461b createRequest(String str);

    /* synthetic */ InterfaceC13462c createResponse(int i10, InterfaceC13236j interfaceC13236j, InterfaceC13234i interfaceC13234i, InterfaceC13249w interfaceC13249w, InterfaceC13225d0 interfaceC13225d0, List list, InterfaceC13194B interfaceC13194B);

    /* synthetic */ InterfaceC13462c createResponse(int i10, InterfaceC13236j interfaceC13236j, InterfaceC13234i interfaceC13234i, InterfaceC13249w interfaceC13249w, InterfaceC13225d0 interfaceC13225d0, List list, InterfaceC13194B interfaceC13194B, InterfaceC13243q interfaceC13243q, Object obj);

    /* synthetic */ InterfaceC13462c createResponse(int i10, InterfaceC13236j interfaceC13236j, InterfaceC13234i interfaceC13234i, InterfaceC13249w interfaceC13249w, InterfaceC13225d0 interfaceC13225d0, List list, InterfaceC13194B interfaceC13194B, InterfaceC13243q interfaceC13243q, byte[] bArr);

    /* synthetic */ InterfaceC13462c createResponse(int i10, InterfaceC13461b interfaceC13461b);

    /* synthetic */ InterfaceC13462c createResponse(int i10, InterfaceC13461b interfaceC13461b, InterfaceC13243q interfaceC13243q, Object obj);

    /* synthetic */ InterfaceC13462c createResponse(int i10, InterfaceC13461b interfaceC13461b, InterfaceC13243q interfaceC13243q, byte[] bArr);

    /* synthetic */ InterfaceC13462c createResponse(String str);

    void setDefaultContentEncodingCharset(String str);

    void setDefaultServerHeader(InterfaceC13216Y interfaceC13216Y);

    void setDefaultUserAgentHeader(InterfaceC13229f0 interfaceC13229f0);
}
