package p623Zf;

import af.C10546B;
import ge.C14019C;
import ge.C14029H;
import ge.C14035K;
import ge.C14041N;
import ge.C14043O;
import ge.C14088m;
import ge.C14102t;
import ge.C14106v;
import ge.C14110x;
import ge.EnumC14097q0;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1025te.C19851B;
import p1081wc.EnumC20898q;
import p1149zc.C21839a;
import p1149zc.C21840b;
import p318Mh.EnumC5424s0;
import p706df.C13095o;
import p926of.C18140C;
import p926of.C18153P;
import p926of.C18155S;
import p926of.C18157U;
import p926of.C18189z;

/* JADX INFO: renamed from: Zf.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C10312h extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30618Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f30619Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10312h(int i10, InterfaceC1436k interfaceC1436k) {
        super(0);
        this.f30618Y = i10;
        this.f30619Z = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f30618Y) {
            case 0:
                this.f30619Z.invoke(new C10320p(C21839a.f69305c, null));
                break;
            case 1:
                this.f30619Z.invoke(new C10320p(C21840b.f69306c, null));
                break;
            case 2:
                this.f30619Z.invoke(new C10546B(null));
                break;
            case 3:
                this.f30619Z.invoke(C10319o.f30632a);
                break;
            case 4:
                this.f30619Z.invoke(C10318n.f30631a);
                break;
            case 5:
                this.f30619Z.invoke(C10322r.f30636a);
                break;
            case 6:
                this.f30619Z.invoke("login");
                break;
            case 7:
                this.f30619Z.invoke("sign_up");
                break;
            case 8:
                this.f30619Z.invoke(C13095o.f41590a);
                break;
            case 9:
                this.f30619Z.invoke(new C14041N(EnumC14097q0.f44335Y));
                break;
            case 10:
                this.f30619Z.invoke(new C14043O(EnumC5424s0.ConversationTopBar));
                break;
            case 11:
                this.f30619Z.invoke(new C14043O(EnumC5424s0.GizmoText));
                break;
            case 12:
                this.f30619Z.invoke(C18189z.f58005a);
                break;
            case 13:
                this.f30619Z.invoke(new C14019C(false));
                break;
            case 14:
                this.f30619Z.invoke(new C14102t(null));
                break;
            case 15:
                this.f30619Z.invoke(C14088m.f44321a);
                break;
            case 16:
                C14029H c14029h = new C14029H(EnumC20898q.f66613Z);
                InterfaceC1436k interfaceC1436k = this.f30619Z;
                interfaceC1436k.invoke(c14029h);
                interfaceC1436k.invoke(C14088m.f44321a);
                break;
            case 17:
                this.f30619Z.invoke(new C18157U(false));
                break;
            case 18:
                this.f30619Z.invoke(C18140C.f57877a);
                break;
            case 19:
                this.f30619Z.invoke(new C18155S(null));
                break;
            case 20:
                this.f30619Z.invoke(new C18153P(null));
                break;
            case 21:
                this.f30619Z.invoke(new C14035K(false));
                break;
            case 22:
                this.f30619Z.invoke(Boolean.FALSE);
                break;
            case 23:
                this.f30619Z.invoke(Boolean.FALSE);
                break;
            case 24:
                this.f30619Z.invoke(new C14110x());
                break;
            case 25:
                this.f30619Z.invoke(C14106v.f44361a);
                break;
            case 26:
                this.f30619Z.invoke(new C14043O(EnumC5424s0.RateLimitBanner));
                break;
            case 27:
                this.f30619Z.invoke(new C19851B(null));
                break;
            case 28:
                this.f30619Z.invoke(Boolean.TRUE);
                break;
            default:
                this.f30619Z.invoke(new C19851B(null));
                break;
        }
        return C17296C.f55119a;
    }
}
