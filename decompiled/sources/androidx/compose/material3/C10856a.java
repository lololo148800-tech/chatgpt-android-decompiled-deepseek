package androidx.compose.material3;

import p1140z1.AbstractC21690f;
import p229J0.AbstractC4005X2;
import p229J0.AbstractC4025b1;
import p229J0.C4000W2;
import p774h1.C14365u;
import p774h1.InterfaceC14366v;

/* JADX INFO: renamed from: androidx.compose.material3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10856a implements InterfaceC14366v {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ DelegatingThemeAwareRippleNode f32654Y;

    public C10856a(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        this.f32654Y = delegatingThemeAwareRippleNode;
    }

    @Override // p774h1.InterfaceC14366v
    /* JADX INFO: renamed from: a */
    public final long mo4719a() {
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.f32654Y;
        long jMo4719a = delegatingThemeAwareRippleNode.color.mo4719a();
        if (jMo4719a != 16) {
            return jMo4719a;
        }
        C4000W2 c4000w2 = (C4000W2) AbstractC21690f.m22204i(delegatingThemeAwareRippleNode, AbstractC4005X2.f12566b);
        if (c4000w2 != null) {
            long j10 = c4000w2.f12550a;
            if (j10 != 16) {
                return j10;
            }
        }
        return ((C14365u) AbstractC21690f.m22204i(delegatingThemeAwareRippleNode, AbstractC4025b1.f12649a)).f45062a;
    }
}
