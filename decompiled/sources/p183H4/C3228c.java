package p183H4;

import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.InterfaceC11110s;
import androidx.lifecycle.InterfaceC11112u;
import androidx.navigation.AbstractC11122c;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p1143z4.C21778h;
import p153Fn.C2925c;
import p294Li.AbstractC5081c;
import p341Ni.C5775d;
import p341Ni.C5777e;
import p341Ni.C5785i;

/* JADX INFO: renamed from: H4.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3228c implements InterfaceC11110s {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9795Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f9796Z;

    public /* synthetic */ C3228c(Object obj, int i10) {
        this.f9795Y = i10;
        this.f9796Z = obj;
    }

    @Override // androidx.lifecycle.InterfaceC11110s
    /* JADX INFO: renamed from: E */
    public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
        switch (this.f9795Y) {
            case 0:
                C3231f this$0 = (C3231f) this.f9796Z;
                AbstractC16544l.m18094g(this$0, "this$0");
                if (enumC11103l == EnumC11103l.ON_START) {
                    this$0.f9799c = true;
                } else if (enumC11103l == EnumC11103l.ON_STOP) {
                    this$0.f9799c = false;
                }
                break;
            case 1:
                int i10 = AbstractC5081c.f16638a[enumC11103l.ordinal()];
                C5785i c5785i = (C5785i) this.f9796Z;
                C2925c c2925c = c5785i.f18875a;
                if (i10 == 1) {
                    AbstractC0575H.m1156D(c2925c, null, null, new C5775d(c5785i, null), 3);
                    break;
                } else if (i10 == 2) {
                    AbstractC0575H.m1156D(c2925c, null, null, new C5777e(c5785i, null), 3);
                    break;
                } else if (i10 == 3) {
                    c5785i.f18876b.m2247h0();
                    break;
                }
                break;
            default:
                AbstractC11122c this$1 = (AbstractC11122c) this.f9796Z;
                AbstractC16544l.m18094g(this$1, "this$0");
                this$1.f33547s = enumC11103l.m12162a();
                if (this$1.f33531c != null) {
                    for (C21778h c21778h : this$1.f33535g) {
                        c21778h.getClass();
                        c21778h.f69076p0 = enumC11103l.m12162a();
                        c21778h.m22265g();
                    }
                }
                break;
        }
    }
}
