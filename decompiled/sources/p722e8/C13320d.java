package p722e8;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p677c8.C11689a;
import p804i8.C14945d;
import p804i8.InterfaceC14942a;

/* JADX INFO: renamed from: e8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C13320d extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42225Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11689a f42226Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C14945d f42227o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13320d(C11689a c11689a, C14945d c14945d, int i10) {
        super(1);
        this.f42225Y = i10;
        this.f42226Z = c11689a;
        this.f42227o0 = c14945d;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f42225Y) {
            case 0:
                InterfaceC14942a it = (InterfaceC14942a) obj;
                AbstractC16544l.m18094g(it, "it");
                String str = this.f42226Z.f35460d;
                if (str == null) {
                    str = "";
                }
                it.mo16105g(str, this.f42227o0);
                break;
            case 1:
                InterfaceC14942a it2 = (InterfaceC14942a) obj;
                AbstractC16544l.m18094g(it2, "it");
                String str2 = this.f42226Z.f35460d;
                if (str2 == null) {
                    str2 = "";
                }
                it2.mo16102d(str2, this.f42227o0);
                break;
            case 2:
                InterfaceC14942a it3 = (InterfaceC14942a) obj;
                AbstractC16544l.m18094g(it3, "it");
                String str3 = this.f42226Z.f35460d;
                if (str3 == null) {
                    str3 = "";
                }
                it3.mo16105g(str3, this.f42227o0);
                break;
            default:
                InterfaceC14942a it4 = (InterfaceC14942a) obj;
                AbstractC16544l.m18094g(it4, "it");
                String str4 = this.f42226Z.f35460d;
                if (str4 == null) {
                    str4 = "";
                }
                it4.mo16102d(str4, this.f42227o0);
                break;
        }
        return C17296C.f55119a;
    }
}
