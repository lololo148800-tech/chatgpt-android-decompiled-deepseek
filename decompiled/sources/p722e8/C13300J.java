package p722e8;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p677c8.C11689a;
import p804i8.C14946e;
import p804i8.C14949h;
import p804i8.InterfaceC14942a;

/* JADX INFO: renamed from: e8.J */
/* JADX INFO: loaded from: classes.dex */
public final class C13300J extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42046Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11689a f42047Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13300J(C11689a c11689a, int i10) {
        super(1);
        this.f42046Y = i10;
        this.f42047Z = c11689a;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f42046Y) {
            case 0:
                InterfaceC14942a it = (InterfaceC14942a) obj;
                AbstractC16544l.m18094g(it, "it");
                String str = this.f42047Z.f35460d;
                if (str == null) {
                    str = "";
                }
                it.mo16105g(str, C14946e.f46565a);
                break;
            case 1:
                InterfaceC14942a it2 = (InterfaceC14942a) obj;
                AbstractC16544l.m18094g(it2, "it");
                String str2 = this.f42047Z.f35460d;
                if (str2 == null) {
                    str2 = "";
                }
                it2.mo16102d(str2, C14946e.f46565a);
                break;
            case 2:
                InterfaceC14942a it3 = (InterfaceC14942a) obj;
                AbstractC16544l.m18094g(it3, "it");
                String str3 = this.f42047Z.f35460d;
                if (str3 == null) {
                    str3 = "";
                }
                it3.mo16105g(str3, C14949h.f46568a);
                break;
            case 3:
                InterfaceC14942a it4 = (InterfaceC14942a) obj;
                AbstractC16544l.m18094g(it4, "it");
                String str4 = this.f42047Z.f35460d;
                if (str4 == null) {
                    str4 = "";
                }
                it4.mo16102d(str4, C14949h.f46568a);
                break;
            case 4:
                InterfaceC14942a it5 = (InterfaceC14942a) obj;
                AbstractC16544l.m18094g(it5, "it");
                String str5 = this.f42047Z.f35460d;
                if (str5 == null) {
                    str5 = "";
                }
                it5.mo16105g(str5, C14946e.f46565a);
                break;
            default:
                InterfaceC14942a it6 = (InterfaceC14942a) obj;
                AbstractC16544l.m18094g(it6, "it");
                String str6 = this.f42047Z.f35460d;
                if (str6 == null) {
                    str6 = "";
                }
                it6.mo16102d(str6, C14946e.f46565a);
                break;
        }
        return C17296C.f55119a;
    }
}
