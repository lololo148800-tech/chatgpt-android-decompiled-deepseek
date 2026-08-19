package bg;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import eg.C13386i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p195Hh.C3430e;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p523V9.AbstractC8160o6;
import p872lg.EnumC16949i;

/* JADX INFO: renamed from: bg.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C11425y extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f34509Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11399A f34510Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11425y(C11399A c11399a, int i10) {
        super(1);
        this.f34509Y = i10;
        this.f34510Z = c11399a;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        EnumC16949i enumC16949i;
        C13386i c13386i;
        switch (this.f34509Y) {
            case 0:
                AbstractC6224C result = (AbstractC6224C) obj;
                AbstractC16544l.m18094g(result, "result");
                if (!(result instanceof C6223B)) {
                    if (result instanceof AbstractC6249w) {
                        return Boolean.TRUE;
                    }
                    if (result instanceof C6248v) {
                        return Boolean.FALSE;
                    }
                    throw new C0644w();
                }
                C13386i c13386i2 = (C13386i) ((C6223B) result).f20258a;
                boolean z6 = false;
                if (c13386i2 != null && (enumC16949i = c13386i2.f42432f) != null) {
                    this.f34510Z.getClass();
                    int iOrdinal = enumC16949i.ordinal();
                    if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 6) {
                        z6 = true;
                    }
                }
                return Boolean.valueOf(z6);
            default:
                AbstractC6224C result2 = (AbstractC6224C) obj;
                AbstractC16544l.m18094g(result2, "result");
                C3430e c3430e = this.f34510Z.f34430b;
                C6223B c6223b = result2 instanceof C6223B ? (C6223B) result2 : null;
                AbstractC8160o6.m8727b(c3430e, AbstractC10763a.m11054l("Sanction retry over limit: [inquiryId=", (c6223b == null || (c13386i = (C13386i) c6223b.f20258a) == null) ? null : c13386i.f42431e, "]"), null, 6);
                return C17296C.f55119a;
        }
    }
}
