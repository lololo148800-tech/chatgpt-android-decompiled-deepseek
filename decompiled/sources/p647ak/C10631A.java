package p647ak;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0593T;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p103Dn.C2146N;
import p103Dn.InterfaceC2184i;
import p729ej.InterfaceC13427r;
import p949pj.C18470i0;

/* JADX INFO: renamed from: ak.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C10631A implements InterfaceC13427r {

    /* JADX INFO: renamed from: b */
    public final Context f31543b;

    /* JADX INFO: renamed from: c */
    public final C18470i0 f31544c;

    /* JADX INFO: renamed from: d */
    public final EnumC10723q f31545d;

    /* JADX INFO: renamed from: e */
    public int f31546e;

    public C10631A(Context context, C18470i0 selfieDirectionFeed, EnumC10723q pose) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(selfieDirectionFeed, "selfieDirectionFeed");
        AbstractC16544l.m18094g(pose, "pose");
        this.f31543b = context;
        this.f31544c = selfieDirectionFeed;
        this.f31545d = pose;
    }

    @Override // p729ej.InterfaceC13427r
    /* JADX INFO: renamed from: a */
    public final boolean mo2026a(InterfaceC13427r otherWorker) {
        AbstractC16544l.m18094g(otherWorker, "otherWorker");
        return (otherWorker instanceof C10631A) && ((C10631A) otherWorker).f31545d == this.f31545d;
    }

    @Override // p729ej.InterfaceC13427r
    public final InterfaceC2184i run() {
        return AbstractC2124C.m3224w(new C1970n(new C2146N(this.f31544c, 0), 18, this), AbstractC0593T.f1824a);
    }
}
