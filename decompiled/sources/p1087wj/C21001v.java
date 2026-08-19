package p1087wj;

import fk.C13686g;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p1044uj.C20336g;
import p153Fn.C2925c;
import p729ej.InterfaceC13427r;

/* JADX INFO: renamed from: wj.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C21001v implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final String f66844b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC20971B f66845c;

    /* JADX INFO: renamed from: d */
    public final String f66846d;

    /* JADX INFO: renamed from: e */
    public final C20336g f66847e;

    /* JADX INFO: renamed from: f */
    public final C13686g f66848f;

    /* JADX INFO: renamed from: g */
    public final C2925c f66849g = AbstractC0575H.m1174c(AbstractC0593T.f1824a.plus(AbstractC0575H.m1175d()));

    public C21001v(String str, InterfaceC20971B interfaceC20971B, String str2, C20336g c20336g, C13686g c13686g) {
        this.f66844b = str;
        this.f66845c = interfaceC20971B;
        this.f66846d = str2;
        this.f66847e = c20336g;
        this.f66848f = c13686g;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        if (otherWorker instanceof C21001v) {
            C21001v c21001v = (C21001v) otherWorker;
            if (AbstractC16544l.m18089b(this.f66844b, c21001v.f66844b) && AbstractC16544l.m18089b(this.f66847e, c21001v.f66847e)) {
                return true;
            }
        }
        return false;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C21000u(this, null));
    }
}
