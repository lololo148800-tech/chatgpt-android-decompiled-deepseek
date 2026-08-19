package com.google.android.gms.internal.play_billing;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.C1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11862C1 implements InterfaceC11880I1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC11908S0 f36115a;

    /* JADX INFO: renamed from: b */
    public final C11961h1 f36116b;

    public C11862C1(C11961h1 c11961h1, AbstractC11908S0 abstractC11908S0) {
        C11961h1 c11961h2 = AbstractC11945d1.f36251a;
        this.f36116b = c11961h1;
        this.f36115a = abstractC11908S0;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: a */
    public final void mo13237a(Object obj) {
        this.f36116b.getClass();
        C11961h1.m13467d(obj);
        C11961h1 c11961h1 = AbstractC11945d1.f36251a;
        throw AbstractC12107L1.m13822m(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: b */
    public final void mo13238b(Object obj, byte[] bArr, int i10, int i11, C11917V0 c11917v0) {
        AbstractC11969j1 abstractC11969j1 = (AbstractC11969j1) obj;
        if (abstractC11969j1.zzc == C11892M1.f36161f) {
            abstractC11969j1.zzc = C11892M1.m13307b();
        }
        throw AbstractC12107L1.m13822m(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: c */
    public final boolean mo13239c(Object obj) {
        throw AbstractC12107L1.m13822m(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: d */
    public final int mo13240d(AbstractC11969j1 abstractC11969j1) {
        C11892M1 c11892m1 = abstractC11969j1.zzc;
        int i10 = c11892m1.f36165d;
        if (i10 != -1) {
            return i10;
        }
        int iM11045c = 0;
        for (int i11 = 0; i11 < c11892m1.f36162a; i11++) {
            int i12 = c11892m1.f36163b[i11] >>> 3;
            C11929Z0 c11929z0 = (C11929Z0) c11892m1.f36164c[i11];
            int iM13386n0 = C11933a1.m13386n0(8);
            int iM13386n1 = C11933a1.m13386n0(i12) + C11933a1.m13386n0(16);
            int iM13386n2 = C11933a1.m13386n0(24);
            int iMo13368j = c11929z0.mo13368j();
            iM11045c += iM13386n0 + iM13386n0 + iM13386n1 + AbstractC10763a.m11045c(iMo13368j, iMo13368j, iM13386n2);
        }
        c11892m1.f36165d = iM11045c;
        return iM11045c;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: e */
    public final void mo13241e(Object obj, Object obj2) {
        AbstractC11883J1.m13295s(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: f */
    public final int mo13242f(AbstractC11969j1 abstractC11969j1) {
        return abstractC11969j1.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: g */
    public final AbstractC11969j1 mo13243g() {
        AbstractC11908S0 abstractC11908S0 = this.f36115a;
        return abstractC11908S0 instanceof AbstractC11969j1 ? (AbstractC11969j1) ((AbstractC11969j1) abstractC11908S0).mo13306d(4) : ((AbstractC11965i1) ((AbstractC11969j1) abstractC11908S0).mo13306d(5)).m13472c();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: h */
    public final boolean mo13244h(AbstractC11969j1 abstractC11969j1, Object obj) {
        return abstractC11969j1.zzc.equals(((AbstractC11969j1) obj).zzc);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC11880I1
    /* JADX INFO: renamed from: i */
    public final void mo13245i(Object obj, C12021w1 c12021w1) {
        throw AbstractC12107L1.m13822m(obj);
    }
}
