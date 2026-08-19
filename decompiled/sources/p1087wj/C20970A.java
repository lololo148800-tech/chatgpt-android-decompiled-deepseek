package p1087wj;

import com.withpersona.sdk2.inquiry.document.network.C12860c;
import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p729ej.InterfaceC13427r;

/* JADX INFO: renamed from: wj.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C20970A implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final String f66780b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC20971B f66781c;

    /* JADX INFO: renamed from: d */
    public final String f66782d;

    public C20970A(String str, InterfaceC20971B interfaceC20971B, String str2) {
        this.f66780b = str;
        this.f66781c = interfaceC20971B;
        this.f66782d = str2;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        if (otherWorker instanceof C20970A) {
            C20970A c20970a = (C20970A) otherWorker;
            if (AbstractC16544l.m18089b(this.f66780b, c20970a.f66780b) && AbstractC16544l.m18089b(this.f66782d, c20970a.f66782d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C12860c(this, null));
    }
}
