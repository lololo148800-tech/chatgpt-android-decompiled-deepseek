package p1156zj;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16543k;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16533a;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13421l;
import p949pj.C18428A;

/* JADX INFO: renamed from: zj.J0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22105J0 extends C16533a implements InterfaceC1436k {

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C22107K0 f69869t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ AbstractC22180o0 f69870u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ C13421l f69871v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ C22195t0 f69872w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22105J0(C13421l c13421l, AbstractC22180o0 abstractC22180o0, C22195t0 c22195t0, C22107K0 c22107k0) {
        super(1, AbstractC16543k.class, "selectIdClass", "renderScreen$selectIdClass(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V", 0);
        this.f69869t0 = c22107k0;
        this.f69870u0 = abstractC22180o0;
        this.f69871v0 = c13421l;
        this.f69872w0 = c22195t0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C22130W0 p10 = (C22130W0) obj;
        AbstractC16544l.m18094g(p10, "p0");
        C13421l c13421l = this.f69871v0;
        ArrayList arrayList = p10.f69960p0;
        AbstractC22120R0.m22361h(this.f69870u0, c13421l, this.f69872w0, null, p10, this.f69869t0.f69887m, new C18428A(), true, arrayList, 0, 1536);
        return C17296C.f55119a;
    }
}
