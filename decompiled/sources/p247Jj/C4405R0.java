package p247Jj;

import kotlin.jvm.internal.AbstractC16544l;
import lk.C17062e;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p342Nj.InterfaceC5816j;
import p729ej.InterfaceC13427r;

/* JADX INFO: renamed from: Jj.R0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4405R0 implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final String f14295b;

    /* JADX INFO: renamed from: c */
    public final String f14296c;

    /* JADX INFO: renamed from: d */
    public final String f14297d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5816j f14298e;

    /* JADX INFO: renamed from: f */
    public final C17062e f14299f;

    public C4405R0(String str, String str2, String str3, InterfaceC5816j service, C17062e c17062e) {
        AbstractC16544l.m18094g(service, "service");
        this.f14295b = str;
        this.f14296c = str2;
        this.f14297d = str3;
        this.f14298e = service;
        this.f14299f = c17062e;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        if (otherWorker instanceof C4405R0) {
            C4405R0 c4405r0 = (C4405R0) otherWorker;
            if (AbstractC16544l.m18089b(this.f14295b, c4405r0.f14295b) && AbstractC16544l.m18089b(this.f14296c, c4405r0.f14296c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C4404Q0(this, null));
    }
}
