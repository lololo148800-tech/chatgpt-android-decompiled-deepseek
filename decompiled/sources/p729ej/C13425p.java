package p729ej;

import fj.C13677i;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import mm.EnumC17307j;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p049Bm.InterfaceC1426a;
import p523V9.AbstractC8183r5;
import p571X9.AbstractC9227W;
import p959q8.C18639a;

/* JADX INFO: renamed from: ej.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C13425p {

    /* JADX INFO: renamed from: a */
    public final Object f42509a;

    /* JADX INFO: renamed from: b */
    public final Object f42510b;

    public C13425p(C13420k c13420k, InterfaceC1426a interfaceC1426a) {
        EnumC17307j enumC17307j = EnumC17307j.f55134Z;
        this.f42509a = AbstractC9227W.m9799b(enumC17307j, new C13419j(c13420k, 1));
        this.f42510b = AbstractC9227W.m9799b(enumC17307j, interfaceC1426a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0074  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, mm.i] */
    /* JADX INFO: renamed from: a */
    public final C0678l m14963a() throws EOFException {
        C0678l c0678lM1417C0;
        C17309l c17309l;
        C0675i c0675i = new C0675i();
        C13420k c13420k = (C13420k) this.f42509a.getValue();
        C0678l c0678lM14962a = c13420k == null ? null : c13420k.m14962a();
        if (c0678lM14962a == null) {
            c0678lM14962a = C0678l.f1971p0;
        }
        AbstractC8183r5.m8766d(c0675i, c0678lM14962a);
        Map map = (Map) this.f42510b.getValue();
        ArrayList<C17309l> arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            C13677i c13677i = (C13677i) entry.getKey();
            C13425p c13425p = (C13425p) entry.getValue();
            C0678l c0678lM14965a = c13677i.f43170a.m14965a();
            if (c0678lM14965a == null) {
                c0678lM1417C0 = null;
            } else {
                C0675i c0675i2 = new C0675i();
                AbstractC8183r5.m8766d(c0675i2, c0678lM14965a);
                String str = c13677i.f43171b;
                AbstractC16544l.m18094g(str, "str");
                C0678l c0678l = C0678l.f1971p0;
                AbstractC8183r5.m8766d(c0675i2, C18639a.m19996n(str));
                c0678lM1417C0 = c0675i2.m1417C0(c0675i2.f1970Z);
            }
            if (c0678lM1417C0 == null) {
                c17309l = null;
            } else {
                C0678l c0678lM14963a = c13425p.m14963a();
                if (c0678lM14963a.mo1372d() == 0) {
                    c0678lM14963a = null;
                }
                if (c0678lM14963a == null) {
                    c17309l = null;
                } else {
                    c17309l = new C17309l(c0678lM1417C0, c0678lM14963a);
                }
            }
            if (c17309l != null) {
                arrayList.add(c17309l);
            }
        }
        c0675i.m1439i1(arrayList.size());
        for (C17309l c17309l2 : arrayList) {
            C0678l c0678l2 = (C0678l) c17309l2.f55136Y;
            C0678l c0678l3 = (C0678l) c17309l2.f55137Z;
            AbstractC8183r5.m8766d(c0675i, c0678l2);
            AbstractC8183r5.m8766d(c0675i, c0678l3);
        }
        return c0675i.m1417C0(c0675i.f1970Z);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, mm.i] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13425p) {
            C13425p c13425p = (C13425p) obj;
            if (AbstractC16544l.m18089b((C13420k) c13425p.f42509a.getValue(), (C13420k) this.f42509a.getValue()) && AbstractC16544l.m18089b((Map) c13425p.f42510b.getValue(), (Map) this.f42510b.getValue())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, mm.i] */
    public final int hashCode() {
        C13420k c13420k = (C13420k) this.f42509a.getValue();
        return ((Map) this.f42510b.getValue()).hashCode() + ((c13420k == null ? 0 : c13420k.hashCode()) * 31);
    }
}
