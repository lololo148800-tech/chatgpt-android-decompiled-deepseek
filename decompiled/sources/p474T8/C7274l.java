package p474T8;

import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.InterfaceC11110s;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p349O0.C5950F;

/* JADX INFO: renamed from: T8.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7274l implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23058Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC11105n f23059Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC11110s f23060o0;

    public /* synthetic */ C7274l(AbstractC11105n abstractC11105n, InterfaceC11110s interfaceC11110s, int i10) {
        this.f23058Y = i10;
        this.f23059Z = abstractC11105n;
        this.f23060o0 = interfaceC11110s;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C5950F DisposableEffect = (C5950F) obj;
        switch (this.f23058Y) {
            case 0:
                AbstractC16544l.m18094g(DisposableEffect, "$this$DisposableEffect");
                AbstractC11105n abstractC11105n = this.f23059Z;
                InterfaceC11110s interfaceC11110s = this.f23060o0;
                abstractC11105n.mo7806a(interfaceC11110s);
                return new C7276n(abstractC11105n, interfaceC11110s, 0);
            default:
                AbstractC16544l.m18094g(DisposableEffect, "$this$DisposableEffect");
                AbstractC11105n abstractC11105n2 = this.f23059Z;
                InterfaceC11110s interfaceC11110s2 = this.f23060o0;
                abstractC11105n2.mo7806a(interfaceC11110s2);
                return new C7276n(abstractC11105n2, interfaceC11110s2, 1);
        }
    }
}
