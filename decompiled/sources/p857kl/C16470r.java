package p857kl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1439n;
import p129En.C2585E;
import p523V9.AbstractC8134l4;
import p909nm.C17691y;

/* JADX INFO: renamed from: kl.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C16470r implements InterfaceC16476x {

    /* JADX INFO: renamed from: c */
    public static final C16470r f51107c = new C16470r();

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
        AbstractC8134l4.m8651a(this, (C2585E) interfaceC1439n);
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: f */
    public final boolean mo7981f() {
        return true;
    }

    @Override // sl.InterfaceC19682q
    /* JADX INFO: renamed from: g */
    public final String mo7982g(String str) {
        mo7979d(str);
        return null;
    }

    public final String toString() {
        return "Headers " + C17691y.f56482Y;
    }
}
