package p021Aj;

import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mk.C17280a;
import p769gj.C14182x;
import p769gj.InterfaceC14147A;
import p769gj.InterfaceC14161c;

/* JADX INFO: renamed from: Aj.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C0532q implements InterfaceC14161c {

    /* JADX INFO: renamed from: Y */
    public final String f1696Y;

    /* JADX INFO: renamed from: Z */
    public final String f1697Z;

    /* JADX INFO: renamed from: o0 */
    public final StepStyles.GovernmentIdStepStyle f1698o0;

    /* JADX INFO: renamed from: p0 */
    public final C17280a f1699p0;

    /* JADX INFO: renamed from: q0 */
    public final C0519d f1700q0;

    /* JADX INFO: renamed from: r0 */
    public final C0520e f1701r0;

    /* JADX INFO: renamed from: s0 */
    public final C0519d f1702s0;

    /* JADX INFO: renamed from: t0 */
    public final C14182x f1703t0;

    public C0532q(String str, String str2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, C17280a navigationState, C0519d c0519d, C0520e c0520e, C0519d c0519d2) {
        AbstractC16544l.m18094g(navigationState, "navigationState");
        this.f1696Y = str;
        this.f1697Z = str2;
        this.f1698o0 = governmentIdStepStyle;
        this.f1699p0 = navigationState;
        this.f1700q0 = c0519d;
        this.f1701r0 = c0520e;
        this.f1702s0 = c0519d2;
        this.f1703t0 = new C14182x(AbstractC16526C.f51263a.mo5693b(C0532q.class), C0527l.f1687Y, new C0531p(this));
    }

    @Override // p769gj.InterfaceC14161c
    /* JADX INFO: renamed from: a */
    public final InterfaceC14147A mo1134a() {
        return this.f1703t0;
    }
}
