package p754fl;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p008A6.C0383c;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p544W9.AbstractC8681n4;
import p857kl.AbstractC16449P;
import p857kl.C16447N;
import p857kl.InterfaceC16437D;

/* JADX INFO: renamed from: fl.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13695e {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f43208a = 0;

    static {
        AbstractC16526C.f51263a.mo5693b(InterfaceC13699i.class);
        try {
            AbstractC16526C.m18075c(InterfaceC13699i.class);
        } catch (Throwable unused) {
        }
        if (AbstractC21322p.m21681O("ResponseAdapterAttributeKey")) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m15171a(InterfaceC16437D interfaceC16437D, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(interfaceC16437D, "<this>");
        interfaceC1436k.invoke(interfaceC16437D.mo9567a());
    }

    /* JADX INFO: renamed from: b */
    public static final void m15172b(C13693c c13693c, String urlString) {
        AbstractC16544l.m18094g(urlString, "urlString");
        AbstractC16449P.m18026b(c13693c.f43195a, urlString);
    }

    /* JADX INFO: renamed from: c */
    public static void m15173c(C13693c c13693c, String str, InterfaceC1436k block, int i10) {
        if ((i10 & 16) != 0) {
            block = new C0383c(29);
        }
        AbstractC16544l.m18094g(block, "block");
        C16447N c16447n = c13693c.f43195a;
        AbstractC16544l.m18094g(c16447n, "<this>");
        AbstractC8681n4.m9377f(c16447n, str);
        block.invoke(c16447n);
    }
}
