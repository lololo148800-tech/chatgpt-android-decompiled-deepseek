package p977r0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p165G9.AbstractC3021g;

/* JADX INFO: renamed from: r0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C18838j extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59958Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Integer f59959Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18838j(int i10, Integer num) {
        super(1);
        this.f59958Y = i10;
        this.f59959Z = num;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f59958Y) {
            case 0:
                break;
        }
        return Integer.valueOf(AbstractC3021g.m3873a(Integer.valueOf(((C18837i) obj).f59956a), this.f59959Z));
    }
}
