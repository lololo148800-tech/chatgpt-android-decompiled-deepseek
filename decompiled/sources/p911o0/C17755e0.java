package p911o0;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;

/* JADX INFO: renamed from: o0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17755e0 implements InterfaceC17716A0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17716A0 f56692a;

    /* JADX INFO: renamed from: b */
    public final int f56693b;

    public C17755e0(InterfaceC17716A0 interfaceC17716A0, int i10) {
        this.f56692a = interfaceC17716A0;
        this.f56693b = i10;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: a */
    public final int mo5505a(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k) {
        if (((enumC7546k == EnumC7546k.f23904Y ? 8 : 2) & this.f56693b) != 0) {
            return this.f56692a.mo5505a(interfaceC7537b, enumC7546k);
        }
        return 0;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: b */
    public final int mo5506b(InterfaceC7537b interfaceC7537b, EnumC7546k enumC7546k) {
        if (((enumC7546k == EnumC7546k.f23904Y ? 4 : 1) & this.f56693b) != 0) {
            return this.f56692a.mo5506b(interfaceC7537b, enumC7546k);
        }
        return 0;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: c */
    public final int mo5507c(InterfaceC7537b interfaceC7537b) {
        if ((this.f56693b & 32) != 0) {
            return this.f56692a.mo5507c(interfaceC7537b);
        }
        return 0;
    }

    @Override // p911o0.InterfaceC17716A0
    /* JADX INFO: renamed from: d */
    public final int mo5508d(InterfaceC7537b interfaceC7537b) {
        if ((this.f56693b & 16) != 0) {
            return this.f56692a.mo5508d(interfaceC7537b);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17755e0)) {
            return false;
        }
        C17755e0 c17755e0 = (C17755e0) obj;
        if (AbstractC16544l.m18089b(this.f56692a, c17755e0.f56692a)) {
            if (this.f56693b == c17755e0.f56693b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f56692a.hashCode() * 31) + this.f56693b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Separators.LPAREN);
        sb2.append(this.f56692a);
        sb2.append(" only ");
        StringBuilder sb3 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb4 = new StringBuilder();
        int i10 = this.f56693b;
        int i11 = AbstractC17758g.f56700c;
        if ((i10 & i11) == i11) {
            AbstractC17758g.m19493o("Start", sb4);
        }
        int i12 = AbstractC17758g.f56702e;
        if ((i10 & i12) == i12) {
            AbstractC17758g.m19493o("Left", sb4);
        }
        if ((i10 & 16) == 16) {
            AbstractC17758g.m19493o("Top", sb4);
        }
        int i13 = AbstractC17758g.f56701d;
        if ((i10 & i13) == i13) {
            AbstractC17758g.m19493o("End", sb4);
        }
        int i14 = AbstractC17758g.f56703f;
        if ((i10 & i14) == i14) {
            AbstractC17758g.m19493o("Right", sb4);
        }
        if ((i10 & 32) == 32) {
            AbstractC17758g.m19493o("Bottom", sb4);
        }
        String string = sb4.toString();
        AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
        sb3.append(string);
        sb3.append(')');
        sb2.append((Object) sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }
}
