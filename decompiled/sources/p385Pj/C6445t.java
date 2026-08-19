package p385Pj;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p025An.AbstractC0593T;
import p049Bm.InterfaceC1426a;
import p103Dn.AbstractC2124C;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2184i;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p729ej.InterfaceC13427r;

/* JADX INFO: renamed from: Pj.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C6445t implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final String f20911b;

    /* JADX INFO: renamed from: c */
    public final Context f20912c;

    /* JADX INFO: renamed from: d */
    public final AbstractC16546n f20913d;

    /* JADX INFO: renamed from: e */
    public int f20914e;

    /* JADX WARN: Multi-variable type inference failed */
    public C6445t(String str, Context context, InterfaceC1426a interfaceC1426a) {
        this.f20911b = str;
        this.f20912c = context;
        this.f20913d = (AbstractC16546n) interfaceC1426a;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        if (otherWorker instanceof C6445t) {
            if (AbstractC16544l.m18089b(this.f20911b, ((C6445t) otherWorker).f20911b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        C2219z0 c2219z0 = new C2219z0(new C6444s(this, null));
        C3516e c3516e = AbstractC0593T.f1824a;
        return AbstractC2124C.m3224w(c2219z0, ExecutorC3515d.f10633Z);
    }
}
