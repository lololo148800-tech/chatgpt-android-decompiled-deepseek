package p544W9;

import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.io.StringReader;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p1113xn.AbstractC21311e;
import p214Ib.AbstractC3673p;
import p214Ib.C3674q;
import p214Ib.C3675r;
import p214Ib.C3677t;
import p214Ib.C3679v;
import p265Kb.AbstractC4611d;
import p379Pb.C6381b;
import p379Pb.C6383d;
import p758g0.C13775m0;
import p769gj.C14156J;
import p769gj.C14172n;
import p769gj.C14173o;
import p769gj.C14181w;
import p769gj.C14183y;
import p769gj.InterfaceC14147A;
import p769gj.InterfaceC14149C;
import p769gj.InterfaceC14150D;
import p769gj.InterfaceC14161c;

/* JADX INFO: renamed from: W9.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8712t {
    /* JADX INFO: renamed from: a */
    public static final void m9419a(int i10, String str) {
        if (str.charAt(i10) == '-') {
            return;
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Expected '-' (hyphen) at index ", ", but was '");
        sbM11057o.append(str.charAt(i10));
        sbM11057o.append('\'');
        throw new IllegalArgumentException(sbM11057o.toString().toString());
    }

    /* JADX INFO: renamed from: b */
    public static final void m9420b(long j10, byte[] bArr, int i10, int i11) {
        int i12 = (i11 * 2) + i10;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = AbstractC21311e.f67734a[(int) (255 & j10)];
            bArr[i12 - 1] = (byte) i14;
            i12 -= 2;
            bArr[i12] = (byte) (i14 >> 8);
            j10 >>= 8;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final View m9421c(InterfaceC14149C interfaceC14149C, Object initialRendering, C14183y initialViewEnvironment, Context context, ViewGroup viewGroup, InterfaceC14150D interfaceC14150D) {
        AbstractC16544l.m18094g(interfaceC14149C, "<this>");
        AbstractC16544l.m18094g(initialRendering, "initialRendering");
        AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
        Class<?> cls = initialRendering.getClass();
        C16527D c16527d = AbstractC16526C.f51263a;
        Object obj = ((C14181w) interfaceC14149C).f44574b.get(c16527d.mo5693b(cls));
        InterfaceC14147A interfaceC14147AMo1134a = obj instanceof InterfaceC14147A ? (InterfaceC14147A) obj : null;
        if (interfaceC14147AMo1134a == null) {
            InterfaceC14161c interfaceC14161c = initialRendering instanceof InterfaceC14161c ? (InterfaceC14161c) initialRendering : null;
            interfaceC14147AMo1134a = interfaceC14161c == null ? null : interfaceC14161c.mo1134a();
            if (!(interfaceC14147AMo1134a instanceof InterfaceC14147A)) {
                interfaceC14147AMo1134a = null;
            }
            if (interfaceC14147AMo1134a == null) {
                C14173o c14173o = (initialRendering instanceof C14172n ? (C14172n) initialRendering : null) != null ? C14173o.f44559b : null;
                if (c14173o == null) {
                    throw new IllegalArgumentException("A " + ((Object) c16527d.mo5693b(InterfaceC14147A.class).mo4447a()) + " should have been registered to display " + ((Object) c16527d.mo5693b(initialRendering.getClass()).mo4447a()) + " instances, or that class should implement " + ((Object) c16527d.mo5693b(InterfaceC14161c.class).mo4448c()) + '<' + ((Object) c16527d.mo5693b(initialRendering.getClass()).mo4448c()) + ">.");
                }
                interfaceC14147AMo1134a = c14173o;
            }
        }
        View viewMo1135a = interfaceC14147AMo1134a.mo1135a(initialRendering, initialViewEnvironment, context, viewGroup);
        if (AbstractC8724v.m9449g(viewMo1135a) == null) {
            throw new IllegalStateException(("View.bindShowRendering should have been called for " + viewMo1135a + ", typically by the " + ((Object) InterfaceC14147A.class.getName()) + " that created it.").toString());
        }
        if (interfaceC14150D != null) {
            C13775m0 c13775m0 = new C13775m0(interfaceC14150D, 5, AbstractC8724v.m9448f(viewMo1135a).f44525d);
            C14156J c14156jM9448f = AbstractC8724v.m9448f(viewMo1135a);
            Object showing = c14156jM9448f.f44522a;
            AbstractC16544l.m18094g(showing, "showing");
            C14183y environment = c14156jM9448f.f44523b;
            AbstractC16544l.m18094g(environment, "environment");
            AbstractC8724v.m9450h(viewMo1135a, new C14156J(showing, environment, c14156jM9448f.f44524c, c13775m0));
        }
        return viewMo1135a;
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC3673p m9422d(C6381b c6381b) {
        boolean z6 = c6381b.f20777Z;
        c6381b.f20777Z = true;
        try {
            try {
                try {
                    AbstractC3673p abstractC3673pM5350i = AbstractC4611d.m5350i(c6381b);
                    c6381b.f20777Z = z6;
                    return abstractC3673pM5350i;
                } catch (StackOverflowError e10) {
                    throw new C3677t("Failed parsing JSON source: " + c6381b + " to Json", e10);
                }
            } catch (OutOfMemoryError e11) {
                throw new C3677t("Failed parsing JSON source: " + c6381b + " to Json", e11);
            }
        } catch (Throwable th2) {
            c6381b.f20777Z = z6;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC3673p m9423e(String str) {
        try {
            C6381b c6381b = new C6381b(new StringReader(str));
            AbstractC3673p abstractC3673pM9422d = m9422d(c6381b);
            abstractC3673pM9422d.getClass();
            if (!(abstractC3673pM9422d instanceof C3675r) && c6381b.mo5616N0() != 10) {
                throw new C3679v("Did not consume the entire document.");
            }
            return abstractC3673pM9422d;
        } catch (C6383d e10) {
            throw new C3679v(e10);
        } catch (IOException e11) {
            throw new C3674q(e11);
        } catch (NumberFormatException e12) {
            throw new C3679v(e12);
        }
    }
}
