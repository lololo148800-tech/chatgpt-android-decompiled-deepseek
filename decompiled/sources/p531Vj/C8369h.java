package p531Vj;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p402Qc.C6593i;
import p769gj.C14182x;
import p769gj.InterfaceC14147A;
import p769gj.InterfaceC14161c;

/* JADX INFO: renamed from: Vj.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C8369h implements InterfaceC14161c {

    /* JADX INFO: renamed from: Y */
    public final EnumC8334D f26065Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f26066Z;

    /* JADX INFO: renamed from: o0 */
    public final AbstractC16546n f26067o0;

    /* JADX INFO: renamed from: p0 */
    public final C14182x f26068p0 = new C14182x(AbstractC16526C.f51263a.mo5693b(C8369h.class), C8368g.f26064Y, new C6593i(this, 14));

    /* JADX WARN: Multi-variable type inference failed */
    public C8369h(EnumC8334D enumC8334D, boolean z6, InterfaceC1436k interfaceC1436k) {
        this.f26065Y = enumC8334D;
        this.f26066Z = z6;
        this.f26067o0 = (AbstractC16546n) interfaceC1436k;
    }

    @Override // p769gj.InterfaceC14161c
    /* JADX INFO: renamed from: a */
    public final InterfaceC14147A mo1134a() {
        return this.f26068p0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8369h)) {
            return false;
        }
        C8369h c8369h = (C8369h) obj;
        return this.f26065Y == c8369h.f26065Y && this.f26066Z == c8369h.f26066Z && this.f26067o0.equals(c8369h.f26067o0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        int iHashCode = this.f26065Y.hashCode() * 31;
        boolean z6 = this.f26066Z;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return this.f26067o0.hashCode() + ((iHashCode + r6) * 31);
    }

    public final String toString() {
        return "CheckRequestPermissionRationaleStateView(permission=" + this.f26065Y + ", isPermanentPermissionRejectionCheck=" + this.f26066Z + ", callback=" + this.f26067o0 + Separators.RPAREN;
    }
}
