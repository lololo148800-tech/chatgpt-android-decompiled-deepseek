package p363Og;

import android.gov.nist.core.Separators;
import bo.C11527o;
import com.auth0.android.jwt.C11840d;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17311n;
import p049Bm.InterfaceC1426a;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1149zc.C21836E;
import p1149zc.C21837F;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p929oi.AbstractC18201b;
import sl.AbstractC19667b;

/* JADX INFO: renamed from: Og.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C6207k extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20210Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f20211Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6207k(InterfaceC5985X interfaceC5985X, int i10) {
        super(0);
        this.f20210Y = i10;
        this.f20211Z = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Object objM9806b;
        Object objM9806b2;
        switch (this.f20210Y) {
            case 0:
                this.f20211Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 1:
                this.f20211Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 2:
                this.f20211Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 3:
                this.f20211Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 4:
                this.f20211Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 5:
                this.f20211Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 6:
                this.f20211Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 7:
                this.f20211Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 8:
                this.f20211Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 9:
                this.f20211Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 10:
                this.f20211Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 11:
                this.f20211Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 12:
                this.f20211Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 13:
                this.f20211Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 14:
                InterfaceC5985X interfaceC5985X = this.f20211Z;
                interfaceC5985X.setValue(Boolean.valueOf(!((Boolean) interfaceC5985X.getValue()).booleanValue()));
                return C17296C.f55119a;
            case 15:
                this.f20211Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 16:
                InterfaceC5985X interfaceC5985X2 = this.f20211Z;
                interfaceC5985X2.setValue(Boolean.valueOf(!((Boolean) interfaceC5985X2.getValue()).booleanValue()));
                return C17296C.f55119a;
            case 17:
                this.f20211Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 18:
                this.f20211Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 19:
                this.f20211Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 20:
                this.f20211Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 21:
                this.f20211Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 22:
                this.f20211Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 23:
                this.f20211Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 24:
                this.f20211Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            case 25:
                this.f20211Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 26:
                C21836E c21836e = C21837F.Companion;
                String string = (String) this.f20211Z.getValue();
                c21836e.getClass();
                AbstractC16544l.m18094g(string, "string");
                try {
                    C11527o c11527o = AbstractC18201b.f58034a;
                    String strM20645a = AbstractC19667b.m20645a(string);
                    c11527o.getClass();
                    objM9806b = (C21837F) c11527o.m12903b(strM20645a, c21836e.serializer());
                    break;
                } catch (Throwable th2) {
                    objM9806b = AbstractC9233X.m9806b(th2);
                }
                if (objM9806b instanceof C17311n) {
                    objM9806b = null;
                }
                C21837F c21837f = (C21837F) objM9806b;
                if (c21837f != null) {
                    return c21837f;
                }
                try {
                    objM9806b2 = new C11840d(AbstractC21329w.m21731r(string, "Bearer ", ""));
                    break;
                } catch (Throwable th3) {
                    objM9806b2 = AbstractC9233X.m9806b(th3);
                }
                if (objM9806b2 instanceof C17311n) {
                    objM9806b2 = null;
                }
                C11840d c11840d = (C11840d) objM9806b2;
                if (c11840d == null || AbstractC21322p.m21697e0(string, new String[]{Separators.DOT}, 0, 6).size() != 3) {
                    return null;
                }
                String str = c11840d.f35958Y;
                AbstractC16544l.m18093f(str, "toString(...)");
                return new C21837F(str, "", "", null, Long.MAX_VALUE, null);
            case 27:
                this.f20211Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
            case 28:
                this.f20211Z.setValue(Boolean.TRUE);
                return C17296C.f55119a;
            default:
                this.f20211Z.setValue(Boolean.FALSE);
                return C17296C.f55119a;
        }
    }
}
