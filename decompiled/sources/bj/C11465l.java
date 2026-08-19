package bj;

import android.gov.nist.core.Separators;
import dj.AbstractC13178c;
import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

/* JADX INFO: renamed from: bj.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C11465l extends AbstractC11471r {

    /* JADX INFO: renamed from: d */
    public static final C11459f f34675d = new C11459f(1);

    /* JADX INFO: renamed from: a */
    public final AbstractC11452Q f34676a;

    /* JADX INFO: renamed from: b */
    public final C11464k[] f34677b;

    /* JADX INFO: renamed from: c */
    public final C11475v f34678c;

    public C11465l(AbstractC11452Q abstractC11452Q, TreeMap treeMap) {
        this.f34676a = abstractC11452Q;
        this.f34677b = (C11464k[]) treeMap.values().toArray(new C11464k[treeMap.size()]);
        this.f34678c = C11475v.m12866a((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x abstractC11477x) {
        try {
            Object objMo12858e = this.f34676a.mo12858e();
            try {
                abstractC11477x.mo12814e();
                while (abstractC11477x.hasNext()) {
                    int iMo12819v0 = abstractC11477x.mo12819v0(this.f34678c);
                    if (iMo12819v0 == -1) {
                        abstractC11477x.mo12802H0();
                        abstractC11477x.mo12800D();
                    } else {
                        C11464k c11464k = this.f34677b[iMo12819v0];
                        c11464k.f34673b.set(objMo12858e, c11464k.f34674c.fromJson(abstractC11477x));
                    }
                }
                abstractC11477x.mo12818m();
                return objMo12858e;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            AbstractC13178c.m14835i(e11);
            throw null;
        }
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E abstractC11440E, Object obj) {
        try {
            abstractC11440E.mo12833e();
            for (C11464k c11464k : this.f34677b) {
                abstractC11440E.mo12827T(c11464k.f34672a);
                c11464k.f34674c.toJson(abstractC11440E, c11464k.f34673b.get(obj));
            }
            abstractC11440E.mo12823E();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.f34676a + Separators.RPAREN;
    }
}
