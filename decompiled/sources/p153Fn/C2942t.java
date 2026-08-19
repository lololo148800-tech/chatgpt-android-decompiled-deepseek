package p153Fn;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p437Rn.InterfaceC6948f;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Fn.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C2942t implements InterfaceC6948f {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8806Y;

    /* JADX INFO: renamed from: Z */
    public String f8807Z;

    @Override // p437Rn.InterfaceC6948f
    /* JADX INFO: renamed from: b */
    public String mo2693b() {
        return AbstractC9306j0.m9892k(new StringBuilder("expected '"), this.f8807Z, '\'');
    }

    public String toString() {
        switch (this.f8806Y) {
            case 0:
                return AbstractC9306j0.m9892k(new StringBuilder(Separators.LESS_THAN), this.f8807Z, '>');
            default:
                return super.toString();
        }
    }

    public C2942t(String expected, int i10) {
        this.f8806Y = i10;
        switch (i10) {
            case 1:
                AbstractC16544l.m18094g(expected, "expected");
                this.f8807Z = expected;
                break;
            default:
                this.f8807Z = expected;
                break;
        }
    }
}
