package p017Af;

import com.openai.feature.messages.impl.listitem.content.chart.MessageChartViewModel;
import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p040Bd.C0918F0;
import p040Bd.C0924G0;
import p040Bd.C0937I1;
import p040Bd.C0965N;
import p040Bd.C0971O;
import p040Bd.C1113k0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1152zf.C21882d;

/* JADX INFO: renamed from: Af.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C0477h extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1547Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f1548Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f1549o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f1550p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f1551q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f1552r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0477h(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4) {
        super(0);
        this.f1547Y = i11;
        this.f1548Z = obj;
        this.f1551q0 = obj2;
        this.f1549o0 = obj3;
        this.f1552r0 = obj4;
        this.f1550p0 = i10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f1547Y) {
            case 0:
                ((InterfaceC1436k) this.f1548Z).invoke(((C0965N) this.f1551q0).f2740c);
                ((InterfaceC1439n) this.f1549o0).invoke((C0971O) this.f1552r0, Integer.valueOf(this.f1550p0));
                break;
            case 1:
                ((InterfaceC1436k) this.f1548Z).invoke(((C0918F0) this.f1551q0).f2650b);
                ((InterfaceC1439n) this.f1549o0).invoke((C0924G0) this.f1552r0, Integer.valueOf(this.f1550p0));
                break;
            case 2:
                ((InterfaceC1436k) this.f1548Z).invoke(((C0937I1) this.f1551q0).f2687c);
                ((C0471b) this.f1549o0).invoke((C1113k0) this.f1552r0, Integer.valueOf(this.f1550p0));
                break;
            default:
                ((MessageChartViewModel) this.f1548Z).m14395k(new C21882d(this.f1550p0, (String) this.f1551q0, (String) this.f1549o0, (List) this.f1552r0));
                break;
        }
        return C17296C.f55119a;
    }
}
