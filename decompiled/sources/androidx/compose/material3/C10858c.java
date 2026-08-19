package androidx.compose.material3;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17321x;
import p1140z1.InterfaceC21704m;
import p229J0.C4010Y2;
import p349O0.C6021p;
import p492U1.C7540e;
import p773h0.C14294l0;
import p773h0.InterfaceC14268X;
import p773h0.InterfaceC14274b0;
import p774h1.C14365u;
import p894n0.InterfaceC17406l;

/* JADX INFO: renamed from: androidx.compose.material3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10858c implements InterfaceC14274b0 {

    /* JADX INFO: renamed from: a */
    public final boolean f32657a;

    /* JADX INFO: renamed from: b */
    public final float f32658b;

    /* JADX INFO: renamed from: c */
    public final long f32659c;

    public C10858c(boolean z6, float f10, long j10) {
        this.f32657a = z6;
        this.f32658b = f10;
        this.f32659c = j10;
    }

    @Override // p773h0.InterfaceC14274b0
    /* JADX INFO: renamed from: a */
    public final InterfaceC21704m mo11283a(InterfaceC17406l interfaceC17406l) {
        C4010Y2 c4010y2 = new C4010Y2(this);
        return new DelegatingThemeAwareRippleNode(interfaceC17406l, this.f32657a, this.f32658b, c4010y2);
    }

    @Override // p773h0.InterfaceC14267W
    /* JADX INFO: renamed from: b */
    public final InterfaceC14268X mo4232b(InterfaceC17406l interfaceC17406l, C6021p c6021p) {
        c6021p.m6524S(1257603829);
        c6021p.m6553p(false);
        return C14294l0.f44877Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10858c)) {
            return false;
        }
        C10858c c10858c = (C10858c) obj;
        if (this.f32657a == c10858c.f32657a && C7540e.m7873a(this.f32658b, c10858c.f32658b) && AbstractC16544l.m18089b(null, null)) {
            return C14365u.m15775c(this.f32659c, c10858c.f32659c);
        }
        return false;
    }

    public final int hashCode() {
        int iM13819j = AbstractC12107L1.m13819j(this.f32658b, (this.f32657a ? 1231 : 1237) * 31, 961);
        int i10 = C14365u.f45061k;
        return C17321x.m18981a(this.f32659c) + iM13819j;
    }
}
