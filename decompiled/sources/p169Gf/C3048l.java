package p169Gf;

import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p926of.C18181r;

/* JADX INFO: renamed from: Gf.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C3048l extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9196Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f9197Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f9198o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3048l(int i10, String str, InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f9196Y = i10;
        this.f9197Z = interfaceC1436k;
        this.f9198o0 = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f9196Y) {
            case 0:
                String str = (String) obj;
                AbstractC16544l.m18094g(str, lZYtIbClQJm.QVXqQldOiKnTRB);
                this.f9197Z.invoke(new C18181r(this.f9198o0, str, false));
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                this.f9197Z.invoke(this.f9198o0 == null ? "" : null);
                break;
            case 2:
                String link = (String) obj;
                AbstractC16544l.m18094g(link, "link");
                this.f9197Z.invoke(new C18181r(this.f9198o0, link, false));
                break;
            default:
                String it = (String) obj;
                AbstractC16544l.m18094g(it, "it");
                this.f9197Z.invoke(new C18181r(this.f9198o0, it, false));
                break;
        }
        return C17296C.f55119a;
    }
}
