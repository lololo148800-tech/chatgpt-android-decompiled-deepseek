package p100Dk;

import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p729ej.InterfaceC13427r;

/* JADX INFO: renamed from: Dk.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C2093t implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final String f6439b;

    /* JADX INFO: renamed from: c */
    public final String f6440c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2094u f6441d;

    public C2093t(String str, String str2, InterfaceC2094u interfaceC2094u) {
        this.f6439b = str;
        this.f6440c = str2;
        this.f6441d = interfaceC2094u;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        if (otherWorker instanceof C2093t) {
            if (AbstractC16544l.m18089b(this.f6440c, ((C2093t) otherWorker).f6440c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C2092s(this, null));
    }
}
