package p389Pn;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0292u;

/* JADX INFO: renamed from: Pn.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C6521f implements InterfaceC6533r {

    /* JADX INFO: renamed from: a */
    public final Object f21131a;

    /* JADX INFO: renamed from: b */
    public final C0292u f21132b;

    public C6521f(Object obj, C0292u c0292u) {
        this.f21131a = obj;
        this.f21132b = c0292u;
    }

    @Override // p389Pn.InterfaceC6533r
    public final boolean test(Object obj) {
        return AbstractC16544l.m18089b(this.f21132b.invoke(obj), this.f21131a);
    }
}
