package p953q0;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16546n;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: q0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18573c0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59165Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18577e0 f59166Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18573c0(C18577e0 c18577e0, int i10) {
        super(1);
        this.f59165Y = i10;
        this.f59166Z = c18577e0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f59165Y) {
            case 0:
                InterfaceC18554L interfaceC18554L = (InterfaceC18554L) this.f59166Z.f59178z0.invoke();
                int iMo5911b = interfaceC18554L.mo5911b();
                int i10 = 0;
                while (i10 < iMo5911b) {
                    if (interfaceC18554L.mo5912c(i10).equals(obj)) {
                        return Integer.valueOf(i10);
                    }
                    i10++;
                }
                i10 = -1;
                return Integer.valueOf(i10);
            default:
                int iIntValue = ((Number) obj).intValue();
                C18577e0 c18577e0 = this.f59166Z;
                InterfaceC18554L interfaceC18554L2 = (InterfaceC18554L) c18577e0.f59178z0.invoke();
                if (iIntValue >= 0 && iIntValue < interfaceC18554L2.mo5911b()) {
                    AbstractC0575H.m1156D(c18577e0.m10935y0(), null, null, new C18575d0(c18577e0, iIntValue, null), 3);
                    return Boolean.TRUE;
                }
                StringBuilder sbM11057o = AbstractC10763a.m11057o(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                sbM11057o.append(interfaceC18554L2.mo5911b());
                sbM11057o.append(')');
                throw new IllegalArgumentException(sbM11057o.toString().toString());
        }
    }
}
