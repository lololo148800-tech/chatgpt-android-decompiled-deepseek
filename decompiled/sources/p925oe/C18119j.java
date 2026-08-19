package p925oe;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p381Pe.C6397h;
import p479Td.AbstractC7343b0;
import p479Td.C7320F;
import p479Td.C7323I;
import p479Td.C7326L;
import p479Td.C7351f0;
import p479Td.EnumC7359j0;
import p509Uk.lpqL.SfpOlmlMATQ;

/* JADX INFO: renamed from: oe.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C18119j extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C18119j f57794Z = new C18119j(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18119j f57795o0 = new C18119j(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C18119j f57796p0 = new C18119j(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C18119j f57797q0 = new C18119j(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C18119j f57798r0 = new C18119j(1, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f57799Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18119j(int i10, int i11) {
        super(i10);
        this.f57799Y = i11;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        boolean z6;
        switch (this.f57799Y) {
            case 0:
                C6397h c6397h = (C6397h) obj;
                AbstractC16544l.m18094g(c6397h, SfpOlmlMATQ.jNQgmJnJsB);
                C7351f0 c7351f0 = (C7351f0) c6397h.f20822d;
                if (c7351f0.f23290e == EnumC7359j0.f23344o0) {
                    AbstractC7343b0 abstractC7343b0 = c7351f0.f23291f;
                    AbstractC16544l.m18094g(abstractC7343b0, "<this>");
                    z6 = abstractC7343b0 instanceof C7326L ? true : abstractC7343b0 instanceof C7320F ? true : abstractC7343b0 instanceof C7323I;
                }
                return Boolean.valueOf(z6);
            case 1:
                C7351f0 it = (C7351f0) obj;
                AbstractC16544l.m18094g(it, "it");
                return Boolean.valueOf(!it.f23280P);
            case 2:
                Intent intent = (Intent) obj;
                AbstractC16544l.m18094g(intent, "intent");
                return Boolean.valueOf(AbstractC16544l.m18089b(intent.getType(), "text/plain"));
            case 3:
                Intent intent2 = (Intent) obj;
                AbstractC16544l.m18094g(intent2, "intent");
                return Boolean.valueOf(intent2.getType() != null && intent2.hasExtra("android.intent.extra.STREAM"));
            default:
                Intent intent3 = (Intent) obj;
                AbstractC16544l.m18094g(intent3, "intent");
                return Boolean.valueOf(intent3.getType() != null && intent3.hasExtra("android.intent.extra.STREAM"));
        }
    }
}
