package p1156zj;

import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p021Aj.C0520e;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p140Fa.C2685e;
import p149Fj.C2880n;
import p173Gj.EnumC3098e;
import p729ej.C13421l;
import p729ej.C13430u;
import p909nm.AbstractC17680n;
import p949pj.C18428A;
import tj.EnumC19999a;

/* JADX INFO: renamed from: zj.P0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22117P0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC22180o0 f69909Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC22096F f69910Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f69911o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ List f69912p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C22195t0 f69913q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C2685e f69914r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C22130W0 f69915s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ boolean f69916t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ EnumC19999a f69917u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ C18428A f69918v0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ String f69919w0;

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ C13421l f69920x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22117P0(AbstractC22180o0 abstractC22180o0, InterfaceC22096F interfaceC22096F, int i10, List list, C22195t0 c22195t0, C2685e c2685e, C22130W0 c22130w0, boolean z6, EnumC19999a enumC19999a, C18428A c18428a, String str, C13421l c13421l) {
        super(1);
        this.f69909Y = abstractC22180o0;
        this.f69910Z = interfaceC22096F;
        this.f69911o0 = i10;
        this.f69912p0 = list;
        this.f69913q0 = c22195t0;
        this.f69914r0 = c2685e;
        this.f69915s0 = c22130w0;
        this.f69916t0 = z6;
        this.f69917u0 = enumC19999a;
        this.f69918v0 = c18428a;
        this.f69919w0 = str;
        this.f69920x0 = c13421l;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:39:0x012b  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Object c22174m0;
        Object obj2;
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        if (action.f42521b.getClass() == this.f69909Y.getClass()) {
            InterfaceC22096F interfaceC22096F = this.f69910Z;
            List listM19362l0 = interfaceC22096F != null ? AbstractC17680n.m19362l0(((AbstractC22180o0) action.f42521b).mo22381h(), interfaceC22096F) : ((AbstractC22180o0) action.f42521b).mo22381h();
            List list = this.f69912p0;
            int size = list.size();
            int i10 = this.f69911o0;
            if (i10 != size) {
                i10++;
            }
            int i11 = i10;
            C22139a1 c22139a1 = (C22139a1) AbstractC17680n.m19344T(i11, list);
            boolean z6 = c22139a1 instanceof C22139a1;
            C22195t0 c22195t0 = this.f69913q0;
            boolean z10 = this.f69916t0;
            if (z6) {
                boolean z11 = c22195t0.f70343i.size() > 1;
                C22130W0 c22130w0 = this.f69915s0;
                C2685e c2685e = this.f69914r0;
                if (z11) {
                    c2685e.getClass();
                    c22174m0 = new C22150e0(c22139a1, listM19362l0, list, i11, new C22176n(c22130w0), false, AbstractC22120R0.m22355b(action, z10), null);
                } else {
                    C22176n c22176n = new C22176n(c22130w0);
                    EnumC22169k1 enumC22169k1M22357d = AbstractC22120R0.m22357d((C22195t0) action.f42520a, c22139a1.f69986Y);
                    AbstractC22180o0 abstractC22180o0M22355b = AbstractC22120R0.m22355b(action, z10);
                    VideoCaptureConfig videoCaptureConfig = c22195t0.f70351q;
                    c2685e.getClass();
                    c22174m0 = new C22177n0(c22139a1, listM19362l0, c22176n, enumC22169k1M22357d, list, i11, abstractC22180o0M22355b, EnumC3098e.f9323o0, videoCaptureConfig.f40641d, null, false, false, null, new C0520e(this.f69920x0, c2685e, 7), 7680);
                }
            } else {
                if (c22139a1 != null) {
                    throw new C0644w();
                }
                EnumC19999a enumC19999a = EnumC19999a.f63314Y;
                EnumC19999a enumC19999a2 = this.f69917u0;
                if (enumC19999a2 == enumC19999a) {
                    Object obj3 = action.f42521b;
                    if (!(obj3 instanceof C22159h0) && !(obj3 instanceof C22168k0)) {
                        c22174m0 = new C22159h0((C22139a1) AbstractC17680n.m19351a0(list), listM19362l0, list, i11, AbstractC22120R0.m22355b(action, z10), this.f69915s0, this.f69918v0);
                    } else if (enumC19999a2 == EnumC19999a.f63315Z) {
                        obj2 = action.f42521b;
                        if (!(obj2 instanceof C22156g0) || (obj2 instanceof C22168k0)) {
                            c22174m0 = new C22174m0(this.f69915s0, listM19362l0, new C22139a1(EnumC22128V0.Front), list, i11, AbstractC22120R0.m22355b(action, z10), new C2880n(c22195t0.f70347m, c22195t0.f70348n, listM19362l0), this.f69919w0, this.f69918v0);
                        } else {
                            c22174m0 = new C22156g0(this.f69915s0, listM19362l0, (C22139a1) AbstractC17680n.m19351a0(list), list, i11, AbstractC22120R0.m22355b(action, z10), new C2880n(c22195t0.f70347m, c22195t0.f70348n, listM19362l0), 3000L, false);
                        }
                    } else {
                        c22174m0 = new C22174m0(this.f69915s0, listM19362l0, new C22139a1(EnumC22128V0.Front), list, i11, AbstractC22120R0.m22355b(action, z10), new C2880n(c22195t0.f70347m, c22195t0.f70348n, listM19362l0), this.f69919w0, this.f69918v0);
                    }
                } else if (enumC19999a2 == EnumC19999a.f63315Z) {
                    obj2 = action.f42521b;
                    if (obj2 instanceof C22156g0) {
                        c22174m0 = new C22174m0(this.f69915s0, listM19362l0, new C22139a1(EnumC22128V0.Front), list, i11, AbstractC22120R0.m22355b(action, z10), new C2880n(c22195t0.f70347m, c22195t0.f70348n, listM19362l0), this.f69919w0, this.f69918v0);
                    } else {
                        c22174m0 = new C22174m0(this.f69915s0, listM19362l0, new C22139a1(EnumC22128V0.Front), list, i11, AbstractC22120R0.m22355b(action, z10), new C2880n(c22195t0.f70347m, c22195t0.f70348n, listM19362l0), this.f69919w0, this.f69918v0);
                    }
                } else {
                    c22174m0 = new C22174m0(this.f69915s0, listM19362l0, new C22139a1(EnumC22128V0.Front), list, i11, AbstractC22120R0.m22355b(action, z10), new C2880n(c22195t0.f70347m, c22195t0.f70348n, listM19362l0), this.f69919w0, this.f69918v0);
                }
            }
            action.f42521b = c22174m0;
        }
        return C17296C.f55119a;
    }
}
