package p857kl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;
import p523V9.AbstractC8134l4;
import p909nm.C17691y;

/* JADX INFO: renamed from: kl.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C16471s implements InterfaceC16443J {

    /* JADX INFO: renamed from: c */
    public static final C16471s f51108c = new C16471s();

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: a */
    public final Set mo7977a() {
        return C17691y.f56482Y;
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: b */
    public final Set mo7978b() {
        return C17691y.f56482Y;
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: d */
    public final List mo7979d(String name) {
        AbstractC16544l.m18094g(name, "name");
        return null;
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: e */
    public final void mo7980e(InterfaceC1439n interfaceC1439n) {
        AbstractC8134l4.m8651a(this, interfaceC1439n);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC16443J) && ((InterfaceC16443J) obj).isEmpty();
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: f */
    public final boolean mo7981f() {
        return true;
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: g */
    public final String mo7982g(String str) {
        mo7979d("operationName");
        return null;
    }

    @Override // sl.InterfaceC19682q
    public final boolean isEmpty() {
        return true;
    }

    public final String toString() {
        return "Parameters " + C17691y.f56482Y;
    }
}
