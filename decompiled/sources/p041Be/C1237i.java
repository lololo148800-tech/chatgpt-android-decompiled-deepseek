package p041Be;

import ao.C11135I;
import ao.C11181o0;
import com.statsig.androidsdk.StatsigLoggerKt;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlinx.serialization.json.C16642a;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p544W9.AbstractC8681n4;
import p556Wk.C8907V;
import p594Y9.AbstractC9961r4;
import p606Yn.C10100a;
import p857kl.C16447N;
import p909nm.C17689w;

/* JADX INFO: renamed from: Be.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C1237i extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C1237i f3255Z = new C1237i(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C1237i f3256o0 = new C1237i(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C1237i f3257p0 = new C1237i(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C1237i f3258q0 = new C1237i(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C1237i f3259r0 = new C1237i(1, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3260Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1237i(int i10, int i11) {
        super(i10);
        this.f3260Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f3260Y) {
            case 0:
                C10100a buildClassSerialDescriptor = (C10100a) obj;
                AbstractC16544l.m18094g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                C17689w c17689w = C17689w.f56480Y;
                buildClassSerialDescriptor.m10678a("items", C16642a.Companion.serializer().getDescriptor(), c17689w, false);
                buildClassSerialDescriptor.m10678a("total", C11135I.f33764b, c17689w, true);
                buildClassSerialDescriptor.m10678a("cursor", AbstractC9961r4.m10615b(C11181o0.f33827a).getDescriptor(), c17689w, true);
                break;
            case 1:
                C8907V timeout = (C8907V) obj;
                AbstractC16544l.m18094g(timeout, "$this$timeout");
                C8907V.m9563a(20000L);
                timeout.f27260c = 20000L;
                break;
            case 2:
                C16447N url = (C16447N) obj;
                AbstractC16544l.m18094g(url, "$this$url");
                AbstractC8681n4.m9374c(url, new String[]{"message_comparison_feedback"});
                break;
            case 3:
                C8907V timeout2 = (C8907V) obj;
                AbstractC16544l.m18094g(timeout2, "$this$timeout");
                Long lValueOf = Long.valueOf(StatsigLoggerKt.FLUSH_TIMER_MS);
                C8907V.m9563a(lValueOf);
                timeout2.f27260c = lValueOf;
                break;
            default:
                C16447N url2 = (C16447N) obj;
                AbstractC16544l.m18094g(url2, "$this$url");
                AbstractC8681n4.m9374c(url2, new String[]{"init"});
                break;
        }
        return C17296C.f55119a;
    }
}
