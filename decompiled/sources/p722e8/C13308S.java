package p722e8;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: e8.S */
/* JADX INFO: loaded from: classes.dex */
public final class C13308S extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42119Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13315Z f42120Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13308S(C13315Z c13315z, int i10) {
        super(1);
        this.f42119Y = i10;
        this.f42120Z = c13315z;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f42119Y) {
            case 0:
                Map it = (Map) obj;
                AbstractC16544l.m18094g(it, "it");
                it.putAll(this.f42120Z.m14932d().m13026b());
                break;
            default:
                Map it2 = (Map) obj;
                AbstractC16544l.m18094g(it2, "it");
                it2.remove(this.f42120Z.f42198q);
                break;
        }
        return C17296C.f55119a;
    }
}
