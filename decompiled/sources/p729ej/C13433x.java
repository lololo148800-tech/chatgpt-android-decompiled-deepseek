package p729ej;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import mm.EnumC17307j;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p049Bm.InterfaceC1426a;
import p1091wn.AbstractC21031l;
import p1091wn.InterfaceC21029j;
import p225Im.InterfaceC3754b;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p523V9.AbstractC8183r5;
import p571X9.AbstractC9227W;
import p722e8.C13298H;
import p959q8.C18639a;

/* JADX INFO: renamed from: ej.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C13433x {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3754b f42526a;

    /* JADX INFO: renamed from: b */
    public final C13433x f42527b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1426a f42528c;

    /* JADX INFO: renamed from: d */
    public final Object f42529d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC21029j f42530e;

    public /* synthetic */ C13433x(InterfaceC3754b interfaceC3754b, C13433x c13433x, int i10) {
        this(interfaceC3754b, (i10 & 2) != 0 ? null : c13433x, (InterfaceC1426a) null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, mm.i] */
    /* JADX INFO: renamed from: a */
    public final C0678l m14965a() {
        C0678l c0678l = null;
        if (!(this.f42526a instanceof InterfaceC3756d)) {
            return null;
        }
        C13433x c13433x = this.f42527b;
        if (c13433x != null) {
            C0678l c0678lM14965a = c13433x.m14965a();
            if (c0678lM14965a == null) {
                return null;
            }
            c0678l = c0678lM14965a;
        }
        C0675i c0675i = new C0675i();
        Object value = this.f42529d.getValue();
        AbstractC16544l.m18093f(value, "<get-typeName>(...)");
        C0678l c0678l2 = C0678l.f1971p0;
        AbstractC8183r5.m8766d(c0675i, C18639a.m19996n((String) value));
        if (c0678l != null) {
            c0675i.m1436f1(1);
            c0675i.m1432c1(c0678l);
        } else {
            c0675i.m1436f1(0);
        }
        return c0675i.m1417C0(c0675i.f1970Z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13433x) {
            C13433x c13433x = (C13433x) obj;
            if (AbstractC16544l.m18089b(this.f42526a, c13433x.f42526a) && AbstractC16544l.m18089b(this.f42527b, c13433x.f42527b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f42526a.hashCode() * 31;
        C13433x c13433x = this.f42527b;
        return iHashCode + (c13433x == null ? 0 : c13433x.hashCode());
    }

    public final String toString() {
        InterfaceC1426a interfaceC1426a = this.f42528c;
        String str = interfaceC1426a == null ? null : (String) interfaceC1426a.invoke();
        if (str == null) {
            return AbstractC10763a.m11047e(')', "WorkflowIdentifier(", AbstractC21031l.m21493q(this.f42530e, null, C13432w.f42524o0, 31));
        }
        return str;
    }

    public C13433x(InterfaceC3754b type, C13433x c13433x, InterfaceC1426a interfaceC1426a) {
        AbstractC16544l.m18094g(type, "type");
        this.f42526a = type;
        this.f42527b = c13433x;
        this.f42528c = interfaceC1426a;
        if (!(type instanceof InterfaceC3756d) && (!(type instanceof InterfaceC3777y) || !(((InterfaceC3777y) type).getClassifier() instanceof InterfaceC3756d))) {
            throw new IllegalArgumentException(AbstractC16544l.m18100m(type, "Expected type to be either a KClass or a KType with a KClass classifier, but was ").toString());
        }
        this.f42529d = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C13298H(this, 6));
        this.f42530e = AbstractC21031l.m21492p(C13432w.f42523Z, this);
    }
}
