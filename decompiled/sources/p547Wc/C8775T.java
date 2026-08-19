package p547Wc;

import androidx.compose.foundation.gestures.AbstractC10840a;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p1139z0.C21585H;
import p402Qc.C6593i;
import p562X0.AbstractC9020o;
import p758g0.AbstractC13758e;
import p860l0.C16782u;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Wc.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C8775T {

    /* JADX INFO: renamed from: c */
    public static final C21585H f26766c;

    /* JADX INFO: renamed from: a */
    public boolean f26767a;

    /* JADX INFO: renamed from: b */
    public final C16782u f26768b;

    static {
        C8796h c8796h = C8796h.f26915s0;
        C8786c c8786c = C8786c.f26853q0;
        C21585H c21585h = AbstractC9020o.f27518a;
        f26766c = new C21585H(c8796h, 10, c8786c);
    }

    public C8775T(EnumC8776U initialValue) {
        AbstractC16544l.m18094g(initialValue, "initialValue");
        this.f26768b = new C16782u(initialValue, C8786c.f26854r0, C8774S.f26762Z, AbstractC13758e.m15255t(0, 0, null, 7), AbstractC13758e.m15250o(), new C6593i(this, 19));
    }

    /* JADX INFO: renamed from: a */
    public final EnumC8776U m9529a() {
        return (EnumC8776U) this.f26768b.f53865g.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final Object m9530b(EnumC8776U enumC8776U, AbstractC19694j abstractC19694j) {
        this.f26767a = enumC8776U == EnumC8776U.f26771o0;
        Object objM11219e = AbstractC10840a.m11219e(this.f26768b, enumC8776U, abstractC19694j);
        return objM11219e == EnumC19250a.f61036Y ? objM11219e : C17296C.f55119a;
    }
}
