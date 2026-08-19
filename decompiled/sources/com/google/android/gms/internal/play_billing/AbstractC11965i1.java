package com.google.android.gms.internal.play_billing;

import java.util.List;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11965i1 implements Cloneable {

    /* JADX INFO: renamed from: Y */
    public final AbstractC11969j1 f36277Y;

    /* JADX INFO: renamed from: Z */
    public AbstractC11969j1 f36278Z;

    public AbstractC11965i1(AbstractC11969j1 abstractC11969j1) {
        this.f36277Y = abstractC11969j1;
        if (abstractC11969j1.m13478c()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f36278Z = (AbstractC11969j1) abstractC11969j1.mo13306d(4);
    }

    /* JADX INFO: renamed from: a */
    public static void m13470a(int i10, List list) {
        String strM19c = AbstractC0010F.m19c(list.size() - i10, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i10) {
                throw new NullPointerException(strM19c);
            }
            list.remove(size);
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC11969j1 m13471b() {
        AbstractC11969j1 abstractC11969j1M13472c = m13472c();
        if (AbstractC11969j1.m13477m(abstractC11969j1M13472c, true)) {
            return abstractC11969j1M13472c;
        }
        throw new C11889L1();
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC11969j1 m13472c() {
        if (!this.f36278Z.m13478c()) {
            return this.f36278Z;
        }
        AbstractC11969j1 abstractC11969j1 = this.f36278Z;
        abstractC11969j1.getClass();
        C11871F1.f36125c.m13262a(abstractC11969j1.getClass()).mo13237a(abstractC11969j1);
        abstractC11969j1.m13482j();
        return this.f36278Z;
    }

    public final Object clone() {
        AbstractC11965i1 abstractC11965i1 = (AbstractC11965i1) this.f36277Y.mo13306d(5);
        abstractC11965i1.f36278Z = m13472c();
        return abstractC11965i1;
    }

    /* JADX INFO: renamed from: d */
    public final void m13473d() {
        if (this.f36278Z.m13478c()) {
            return;
        }
        AbstractC11969j1 abstractC11969j1 = (AbstractC11969j1) this.f36277Y.mo13306d(4);
        C11871F1.f36125c.m13262a(abstractC11969j1.getClass()).mo13241e(abstractC11969j1, this.f36278Z);
        this.f36278Z = abstractC11969j1;
    }
}
