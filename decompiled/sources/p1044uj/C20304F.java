package p1044uj;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p084D4.AbstractC1906c;

/* JADX INFO: renamed from: uj.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C20304F extends AbstractC1906c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f64185d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ArrayList f64186e;

    public C20304F(List list, ArrayList arrayList) {
        this.f64185d = list;
        this.f64186e = arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p084D4.AbstractC1906c
    /* JADX INFO: renamed from: a */
    public final boolean mo3020a(int i10, int i11) {
        boolean zM18089b;
        AbstractC20303E abstractC20303E = (AbstractC20303E) this.f64185d.get(i10);
        AbstractC20303E abstractC20303E2 = (AbstractC20303E) this.f64186e.get(i11);
        if (mo3021b(i10, i11)) {
            if (abstractC20303E instanceof C20299A) {
                zM18089b = AbstractC16544l.m18089b(abstractC20303E, abstractC20303E2);
            } else {
                if (!(abstractC20303E instanceof AbstractC20302D)) {
                    throw new C0644w();
                }
                zM18089b = true;
            }
            if (zM18089b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p084D4.AbstractC1906c
    /* JADX INFO: renamed from: b */
    public final boolean mo3021b(int i10, int i11) {
        AbstractC20303E abstractC20303E = (AbstractC20303E) this.f64185d.get(i10);
        AbstractC20303E abstractC20303E2 = (AbstractC20303E) this.f64186e.get(i11);
        if (abstractC20303E.getClass() != abstractC20303E2.getClass()) {
            return false;
        }
        if (abstractC20303E instanceof C20299A) {
            return true;
        }
        if (abstractC20303E instanceof C20300B) {
            return AbstractC16544l.m18089b(((C20300B) abstractC20303E).f64178a.getAbsolutePath(), ((C20300B) abstractC20303E2).f64178a.getAbsolutePath());
        }
        if (abstractC20303E instanceof C20301C) {
            return AbstractC16544l.m18089b(((C20301C) abstractC20303E).f64181a, ((C20301C) abstractC20303E2).f64181a);
        }
        throw new C0644w();
    }

    @Override // p084D4.AbstractC1906c
    /* JADX INFO: renamed from: h */
    public final int mo3023h() {
        return this.f64186e.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p084D4.AbstractC1906c
    /* JADX INFO: renamed from: i */
    public final int mo3024i() {
        return this.f64185d.size();
    }
}
