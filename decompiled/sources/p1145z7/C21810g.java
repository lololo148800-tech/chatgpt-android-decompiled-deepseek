package p1145z7;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p1113xn.AbstractC21322p;
import p342Nj.C5808b;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: z7.g */
/* JADX INFO: loaded from: classes.dex */
public final class C21810g extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69172Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5808b f69173Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21810g(C5808b c5808b, int i10) {
        super(0);
        this.f69172Y = i10;
        this.f69173Z = c5808b;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C5808b c5808b = this.f69173Z;
        switch (this.f69172Y) {
            case 0:
                boolean zM21681O = AbstractC21322p.m21681O(c5808b.mo6199c());
                String str = (String) c5808b.f18957Y;
                return (zM21681O || AbstractC21322p.m21667A(str, c5808b.mo6199c(), false)) ? str : AbstractC9306j0.m9890i(c5808b.mo6199c(), Separators.f31991SP, str);
            default:
                return (String) AbstractC17680n.m19341Q(AbstractC21322p.m21696d0((String) c5808b.f18960p0, new char[]{'.'}, 6));
        }
    }
}
