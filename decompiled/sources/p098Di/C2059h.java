package p098Di;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.AbstractC21933K1;

/* JADX INFO: renamed from: Di.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C2059h implements InterfaceC2061j {

    /* JADX INFO: renamed from: a */
    public final AbstractC21933K1 f6282a;

    /* JADX INFO: renamed from: b */
    public final String f6283b;

    public C2059h(AbstractC21933K1 abstractC21933K1, String str) {
        this.f6282a = abstractC21933K1;
        this.f6283b = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2059h(AbstractC21933K1 error) {
        this(error, null);
        AbstractC16544l.m18094g(error, "error");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2059h(String message) {
        this(null, message);
        AbstractC16544l.m18094g(message, "message");
    }
}
