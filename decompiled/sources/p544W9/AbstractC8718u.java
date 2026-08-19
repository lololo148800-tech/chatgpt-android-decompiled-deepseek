package p544W9;

import android.view.View;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0674h;
import p026Ao.C0675i;
import p049Bm.InterfaceC1439n;
import p769gj.AbstractC14158L;
import p769gj.C14156J;
import p769gj.C14157K;
import p769gj.C14163e;
import p769gj.C14183y;
import p787he.C14459O;
import p787he.C14495x;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: W9.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8718u {
    /* JADX INFO: renamed from: a */
    public static final void m9432a(View view, Object initialRendering, C14183y initialViewEnvironment, InterfaceC1439n interfaceC1439n) {
        AbstractC16544l.m18094g(initialRendering, "initialRendering");
        AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
        AbstractC8724v.m9450h(view, AbstractC8724v.m9449g(view) instanceof C14156J ? new C14156J(initialRendering, initialViewEnvironment, interfaceC1439n, AbstractC8724v.m9448f(view).f44525d) : new C14156J(initialRendering, initialViewEnvironment, interfaceC1439n, C14163e.f44538p0));
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m9433b(View view, Object rendering) {
        AbstractC16544l.m18094g(view, "<this>");
        AbstractC16544l.m18094g(rendering, "rendering");
        AbstractC14158L abstractC14158LM9449g = AbstractC8724v.m9449g(view);
        Object objMo15504c = abstractC14158LM9449g == null ? null : abstractC14158LM9449g.mo15504c();
        Object obj = objMo15504c != null ? objMo15504c : null;
        return obj != null && AbstractC8688p.m9386b(obj, rendering);
    }

    /* JADX INFO: renamed from: c */
    public static Object m9434c(C14459O c14459o, AbstractC19687c abstractC19687c) {
        c14459o.getClass();
        return c14459o.m15992u(new C14495x(false, c14459o, null), abstractC19687c);
    }

    /* JADX INFO: renamed from: d */
    public static final void m9435d(View view, Object rendering, C14183y viewEnvironment) {
        AbstractC16544l.m18094g(view, "<this>");
        AbstractC16544l.m18094g(rendering, "rendering");
        AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
        AbstractC14158L abstractC14158LM9447e = AbstractC8724v.m9447e(view);
        C14157K c14157k = abstractC14158LM9447e instanceof C14157K ? (C14157K) abstractC14158LM9447e : null;
        if (c14157k == null) {
            throw new IllegalStateException(("Expected " + view + " to have been started, but View.start() has not been called").toString());
        }
        Object obj = c14157k.f44526a;
        if (AbstractC8688p.m9386b(obj, rendering)) {
            InterfaceC1439n interfaceC1439n = c14157k.f44528c;
            AbstractC8724v.m9450h(view, new C14157K(rendering, viewEnvironment, interfaceC1439n));
            interfaceC1439n.invoke(rendering, viewEnvironment);
            return;
        }
        throw new IllegalStateException(("Expected " + view + " to be able to show rendering " + rendering + ", but that did not match previous rendering " + obj + ". Consider using WorkflowViewStub to display arbitrary types.").toString());
    }

    /* JADX INFO: renamed from: e */
    public static final void m9436e(View view) {
        AbstractC16544l.m18094g(view, "<this>");
        C14156J c14156jM9448f = AbstractC8724v.m9448f(view);
        AbstractC8724v.m9450h(view, new C14157K(c14156jM9448f.f44522a, c14156jM9448f.f44523b, c14156jM9448f.f44524c));
        c14156jM9448f.f44525d.invoke(view);
    }

    /* JADX INFO: renamed from: f */
    public static void m9437f(C0674h cursor, byte[] key) {
        long j10;
        AbstractC16544l.m18094g(cursor, "cursor");
        AbstractC16544l.m18094g(key, "key");
        int length = key.length;
        int i10 = 0;
        do {
            byte[] bArr = cursor.f1966q0;
            int i11 = cursor.f1967r0;
            int i12 = cursor.f1968s0;
            if (bArr != null) {
                while (i11 < i12) {
                    int i13 = i10 % length;
                    bArr[i11] = (byte) (bArr[i11] ^ key[i13]);
                    i11++;
                    i10 = i13 + 1;
                }
            }
            long j11 = cursor.f1965p0;
            C0675i c0675i = cursor.f1962Y;
            AbstractC16544l.m18091d(c0675i);
            if (j11 == c0675i.f1970Z) {
                throw new IllegalStateException("no more bytes");
            }
            j10 = cursor.f1965p0;
        } while (cursor.m1416e(j10 == -1 ? 0L : j10 + ((long) (cursor.f1968s0 - cursor.f1967r0))) != -1);
    }
}
