package p000;

import androidx.compose.material3.MinimumInteractiveModifier;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;
import p229J0.AbstractC3884B1;
import p229J0.AbstractC3984T1;
import p229J0.C4151w1;
import p349O0.C5984W0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p736f0.InterfaceC13499q;
import p882m1.AbstractC17140a;

/* JADX INFO: renamed from: b */
/* JADX INFO: loaded from: classes.dex */
public final class C11205b extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ long f33874Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f33875Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC17140a f33876o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f33877p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f33878q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11205b(long j10, InterfaceC1426a interfaceC1426a, AbstractC17140a abstractC17140a, String str, long j11) {
        super(3);
        this.f33874Y = j10;
        this.f33875Z = interfaceC1426a;
        this.f33876o0 = abstractC17140a;
        this.f33877p0 = str;
        this.f33878q0 = j11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC13499q AnimatedVisibility = (InterfaceC13499q) obj;
        C6021p c6021p = (C6021p) obj2;
        ((Number) obj3).intValue();
        AbstractC16544l.m18094g(AnimatedVisibility, "$this$AnimatedVisibility");
        C4151w1 c4151w1M4676D = AbstractC3984T1.m4676D(this.f33874Y, c6021p, 0);
        C5984W0 c5984w0 = AbstractC3884B1.f11770a;
        AbstractC3984T1.m4693l(this.f33875Z, MinimumInteractiveModifier.f32651Y, false, c4151w1M4676D, null, AbstractC8411c.m8969c(1997142706, c6021p, new C10440a(this.f33876o0, this.f33877p0, this.f33878q0)), c6021p, 196656, 20);
        return C17296C.f55119a;
    }
}
