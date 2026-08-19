package p318Mh;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1113xn.C21316j;
import p1113xn.C21317k;
import p1143z4.C21778h;
import p736f0.AbstractC13508z;
import p736f0.C13493k;

/* JADX INFO: renamed from: Mh.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5391c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C5391c f17646Z = new C5391c(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5391c f17647o0 = new C5391c(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C5391c f17648p0 = new C5391c(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C5391c f17649q0 = new C5391c(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C5391c f17650r0 = new C5391c(1, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C5391c f17651s0 = new C5391c(1, 5);

    /* JADX INFO: renamed from: t0 */
    public static final C5391c f17652t0 = new C5391c(1, 6);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f17653Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5391c(int i10, int i11) {
        super(i10);
        this.f17653Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f17653Y) {
            case 0:
                AbstractC16544l.m18094g((C5387a) obj, "$this$null");
                return C17296C.f55119a;
            case 1:
                C5370J0 it = (C5370J0) obj;
                AbstractC16544l.m18094g(it, "it");
                StringBuilder sb2 = new StringBuilder();
                String str = it.f17614a;
                sb2.append(str);
                sb2.append("={");
                sb2.append(str);
                sb2.append("}");
                return sb2.toString();
            case 2:
                C21317k matchResult = (C21317k) obj;
                AbstractC16544l.m18094g(matchResult, "matchResult");
                C21316j c21316jM7561j = matchResult.f67755c.m7561j(1);
                String str2 = c21316jM7561j != null ? c21316jM7561j.f67751a : null;
                return str2 == null ? "" : str2;
            case 3:
                C13493k composable = (C13493k) obj;
                AbstractC16544l.m18094g(composable, "$this$composable");
                EnumC5368I0 enumC5368I0M5886a = AbstractC5364G0.m5886a((C21778h) composable.mo15004a());
                EnumC5368I0 enumC5368I0 = EnumC5368I0.f17609Z;
                if (enumC5368I0M5886a == enumC5368I0 && AbstractC5364G0.m5886a((C21778h) composable.mo15006c()) == enumC5368I0) {
                    return AbstractC13508z.m15013e(null, 3);
                }
                if (AbstractC5364G0.m5886a((C21778h) composable.mo15006c()) == enumC5368I0) {
                    return AbstractC12107L1.m13834y(composable, 1);
                }
                return AbstractC5364G0.m5886a((C21778h) composable.mo15006c()) == EnumC5368I0.f17610o0 ? AbstractC12107L1.m13834y(composable, 2) : AbstractC12107L1.m13834y(composable, 0);
            case 4:
                C13493k composable2 = (C13493k) obj;
                AbstractC16544l.m18094g(composable2, "$this$composable");
                EnumC5368I0 enumC5368I0M5886a2 = AbstractC5364G0.m5886a((C21778h) composable2.mo15004a());
                EnumC5368I0 enumC5368I1 = EnumC5368I0.f17609Z;
                if (enumC5368I0M5886a2 == enumC5368I1 && AbstractC5364G0.m5886a((C21778h) composable2.mo15006c()) == enumC5368I1) {
                    return AbstractC13508z.m15014f(null, 3);
                }
                if (AbstractC5364G0.m5886a((C21778h) composable2.mo15006c()) == enumC5368I1) {
                    return AbstractC12107L1.m13835z(composable2, 1);
                }
                return AbstractC5364G0.m5886a((C21778h) composable2.mo15006c()) == EnumC5368I0.f17610o0 ? AbstractC13508z.m15014f(null, 3) : AbstractC12107L1.m13835z(composable2, 0);
            case 5:
                C13493k composable3 = (C13493k) obj;
                AbstractC16544l.m18094g(composable3, "$this$composable");
                EnumC5368I0 enumC5368I0M5886a3 = AbstractC5364G0.m5886a((C21778h) composable3.mo15004a());
                EnumC5368I0 enumC5368I2 = EnumC5368I0.f17609Z;
                if (enumC5368I0M5886a3 == enumC5368I2 && AbstractC5364G0.m5886a((C21778h) composable3.mo15006c()) == enumC5368I2) {
                    return AbstractC13508z.m15013e(null, 3);
                }
                if (AbstractC5364G0.m5886a((C21778h) composable3.mo15004a()) == enumC5368I2) {
                    return AbstractC12107L1.m13834y(composable3, 0);
                }
                return AbstractC5364G0.m5886a((C21778h) composable3.mo15004a()) == EnumC5368I0.f17610o0 ? AbstractC13508z.m15013e(null, 3) : AbstractC12107L1.m13834y(composable3, 1);
            default:
                C13493k composable4 = (C13493k) obj;
                AbstractC16544l.m18094g(composable4, "$this$composable");
                EnumC5368I0 enumC5368I0M5886a4 = AbstractC5364G0.m5886a((C21778h) composable4.mo15004a());
                EnumC5368I0 enumC5368I3 = EnumC5368I0.f17609Z;
                if (enumC5368I0M5886a4 == enumC5368I3 && AbstractC5364G0.m5886a((C21778h) composable4.mo15006c()) == enumC5368I3) {
                    return AbstractC13508z.m15014f(null, 3);
                }
                if (AbstractC5364G0.m5886a((C21778h) composable4.mo15004a()) == enumC5368I3) {
                    return AbstractC12107L1.m13835z(composable4, 0);
                }
                return AbstractC5364G0.m5886a((C21778h) composable4.mo15004a()) == EnumC5368I0.f17610o0 ? AbstractC12107L1.m13835z(composable4, 3) : AbstractC12107L1.m13835z(composable4, 1);
        }
    }
}
