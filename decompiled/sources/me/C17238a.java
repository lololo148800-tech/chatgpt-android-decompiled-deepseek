package me;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.C2217y0;
import p1040ue.C20206d;
import p248Jk.C4479j;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: me.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C17238a {

    /* JADX INFO: renamed from: a */
    public final C4479j f54994a;

    /* JADX INFO: renamed from: b */
    public final C2153Q0 f54995b;

    /* JADX INFO: renamed from: c */
    public final C2217y0 f54996c;

    public C17238a(C4479j c4479j) {
        this.f54994a = c4479j;
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(C17689w.f56480Y);
        this.f54995b = c2153q0M3204c;
        this.f54996c = new C2217y0(c2153q0M3204c);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m18966a(C20206d c20206d) {
        Object value;
        ArrayList arrayList;
        C2153Q0 c2153q0 = this.f54995b;
        do {
            value = c2153q0.getValue();
            List list = (List) value;
            arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            boolean z6 = false;
            for (Object obj : list) {
                C20206d a10 = (C20206d) obj;
                AbstractC16544l.m18094g(a10, "a");
                if (AbstractC16544l.m18089b(a10.f63973a, c20206d.f63973a)) {
                    z6 = true;
                    obj = c20206d;
                }
                arrayList.add(obj);
            }
            if (!z6) {
                arrayList = AbstractC17680n.m19362l0(arrayList, c20206d);
            }
        } while (!c2153q0.m3250k(value, arrayList));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m18967b(String decorationId) {
        Object value;
        ArrayList arrayList;
        try {
            AbstractC16544l.m18094g(decorationId, "decorationId");
            C2153Q0 c2153q0 = this.f54995b;
            do {
                value = c2153q0.getValue();
                arrayList = new ArrayList();
                for (Object obj : (List) value) {
                    if (!AbstractC16544l.m18089b(((C20206d) obj).f63973a, decorationId)) {
                        arrayList.add(obj);
                    }
                }
            } while (!c2153q0.m3250k(value, arrayList));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
