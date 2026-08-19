package p372P3;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p1016t3.C19791r;
import p593Y8.C9683j;
import p778h5.C14410a;
import p778h5.C14411b;
import p801i5.AbstractC14929a;
import p801i5.C14932d;
import p801i5.InterfaceC14933e;
import p801i5.InterfaceC14934f;
import p972qm.C18777j;

/* JADX INFO: renamed from: P3.s */
/* JADX INFO: loaded from: classes.dex */
public final class C6337s implements InterfaceC14934f {

    /* JADX INFO: renamed from: a */
    public long f20561a;

    public C6337s(int i10) {
        switch (i10) {
            case 5:
                this.f20561a = Long.MIN_VALUE;
                break;
            default:
                this.f20561a = 2L;
                break;
        }
    }

    @Override // p801i5.InterfaceC14934f
    /* JADX INFO: renamed from: a */
    public InterfaceC14933e mo1904a(C9683j c9683j, long j10, long j11, AbstractC14929a[] callbacks) {
        AbstractC16544l.m18094g(callbacks, "callbacks");
        return new C14932d(AbstractC0575H.m1161I(C18777j.f59682Y, new C14411b(j10, j11, c9683j, null, callbacks)));
    }

    @Override // p801i5.InterfaceC14934f
    /* JADX INFO: renamed from: b */
    public InterfaceC14933e mo1905b(C9683j c9683j) {
        return new C14932d(AbstractC0575H.m1161I(C18777j.f59682Y, new C14410a(c9683j, null)));
    }

    /* JADX INFO: renamed from: c */
    public long m6950c() {
        return Math.max(0L, this.f20561a - System.nanoTime());
    }

    /* JADX INFO: renamed from: d */
    public C19791r m6951d() {
        return new C19791r(this);
    }

    @Override // p801i5.InterfaceC14934f
    public long getVersion() {
        return this.f20561a;
    }
}
