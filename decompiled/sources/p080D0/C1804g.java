package p080D0;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.jvm.internal.AbstractC16546n;
import p046Bk.C1325F0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p715e1.C13257c;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p774h1.C14351g;
import p774h1.C14356l;
import p774h1.C14358n;

/* JADX INFO: renamed from: D0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1804g extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ long f5197Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f5198Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f5199o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804g(long j10, InterfaceC1426a interfaceC1426a, boolean z6) {
        super(1);
        this.f5197Y = j10;
        this.f5198Z = interfaceC1426a;
        this.f5199o0 = z6;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13257c c13257c = (C13257c) obj;
        C14351g c14351gM2632u = AbstractC1807h0.m2632u(c13257c, C13803e.m15333e(c13257c.f41873Y.mo14854i()) / 2.0f);
        int i10 = Build.VERSION.SDK_INT;
        long j10 = this.f5197Y;
        return c13257c.m14856a(new C1325F0(this.f5198Z, this.f5199o0, c14351gM2632u, new C14356l(j10, 5, i10 >= 29 ? C14358n.f45047a.m15769a(j10, 5) : new PorterDuffColorFilter(AbstractC14334L.m15617F(j10), AbstractC14334L.m15621J(5))), 1));
    }
}
