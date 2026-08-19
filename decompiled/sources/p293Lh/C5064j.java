package p293Lh;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p098Di.InterfaceC2062k;
import p349O0.C6021p;

/* JADX INFO: renamed from: Lh.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C5064j extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Z */
    public static final C5064j f16562Z = new C5064j(4, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C5064j f16563o0 = new C5064j(4, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16564Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5064j(int i10, int i11) {
        super(i10);
        this.f16564Y = i11;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f16564Y) {
            case 0:
                InterfaceC2062k anonymous$parameter$0$ = (InterfaceC2062k) obj;
                InterfaceC1436k anonymous$parameter$1$ = (InterfaceC1436k) obj2;
                C6021p c6021p = (C6021p) obj3;
                int iIntValue = ((Number) obj4).intValue();
                AbstractC16544l.m18094g(anonymous$parameter$0$, "$anonymous$parameter$0$");
                AbstractC16544l.m18094g(anonymous$parameter$1$, "$anonymous$parameter$1$");
                if ((iIntValue & 129) == 128 && c6021p.m6562y()) {
                    c6021p.m6517L();
                }
                break;
            default:
                InterfaceC2062k anonymous$parameter$0$2 = (InterfaceC2062k) obj;
                InterfaceC1436k anonymous$parameter$1$2 = (InterfaceC1436k) obj2;
                C6021p c6021p2 = (C6021p) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                AbstractC16544l.m18094g(anonymous$parameter$0$2, "$anonymous$parameter$0$");
                AbstractC16544l.m18094g(anonymous$parameter$1$2, "$anonymous$parameter$1$");
                if ((iIntValue2 & 129) == 128 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                }
                break;
        }
        return C17296C.f55119a;
    }
}
