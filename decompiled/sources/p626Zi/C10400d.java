package p626Zi;

import com.segment.analytics.kotlin.core.AbstractC12774a;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p025An.C0611f0;
import p117Eb.C2392v;
import p153Fn.C2925c;
import p530Vi.C8312h;

/* JADX INFO: renamed from: Zi.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C10400d implements InterfaceC10398b {

    /* JADX INFO: renamed from: a */
    public long f30819a;

    /* JADX INFO: renamed from: b */
    public C0564B0 f30820b;

    /* JADX INFO: renamed from: c */
    public boolean f30821c;

    @Override // p626Zi.InterfaceC10398b
    /* JADX INFO: renamed from: d */
    public final void mo10896d(C8312h c8312h) {
        if (this.f30821c) {
            return;
        }
        this.f30821c = true;
        C2392v c2392v = c8312h.f25903Z;
        this.f30820b = AbstractC0575H.m1156D((C2925c) c2392v.f7437o0, (C0611f0) c2392v.f7440r0, null, new C10399c(this, c8312h, null), 2);
    }

    @Override // p626Zi.InterfaceC10398b
    /* JADX INFO: renamed from: e */
    public final boolean mo10897e() {
        return false;
    }

    @Override // p626Zi.InterfaceC10398b
    /* JADX INFO: renamed from: f */
    public final void mo10898f(AbstractC12774a event) {
        AbstractC16544l.m18094g(event, "event");
    }

    @Override // p626Zi.InterfaceC10398b
    /* JADX INFO: renamed from: g */
    public final void mo10899g() {
        if (this.f30821c) {
            this.f30821c = false;
            C0564B0 c0564b0 = this.f30820b;
            if (c0564b0 != null) {
                c0564b0.mo1275e(null);
            }
        }
    }

    @Override // p626Zi.InterfaceC10398b
    /* JADX INFO: renamed from: c */
    public final void mo10895c() {
    }
}
