package p1087wj;

import com.withpersona.sdk2.inquiry.document.network.C12858a;
import kotlin.jvm.internal.AbstractC16544l;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p729ej.InterfaceC13427r;

/* JADX INFO: renamed from: wj.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C20983d implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final String f66806b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC20971B f66807c;

    /* JADX INFO: renamed from: d */
    public final String f66808d;

    /* JADX INFO: renamed from: e */
    public final int f66809e;

    /* JADX INFO: renamed from: f */
    public final String f66810f;

    public C20983d(String str, InterfaceC20971B interfaceC20971B, String str2, int i10, String str3) {
        this.f66806b = str;
        this.f66807c = interfaceC20971B;
        this.f66808d = str2;
        this.f66809e = i10;
        this.f66810f = str3;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        if (otherWorker instanceof C20983d) {
            C20983d c20983d = (C20983d) otherWorker;
            if (AbstractC16544l.m18089b(this.f66806b, c20983d.f66806b) && AbstractC16544l.m18089b(this.f66810f, c20983d.f66810f)) {
                return true;
            }
        }
        return false;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return new C2219z0(new C12858a(this, null));
    }
}
