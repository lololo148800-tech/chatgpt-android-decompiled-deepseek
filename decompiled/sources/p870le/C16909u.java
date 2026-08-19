package p870le;

import com.openai.feature.conversations.impl.input.AbstractC12341a;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1439n;
import p1025te.C19866Q;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.C3949M0;
import p349O0.C6021p;
import p523V9.AbstractC8142m4;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: le.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C16909u extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54312Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19866Q f54313Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1439n f54314o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16909u(C19866Q c19866q, InterfaceC1439n interfaceC1439n, int i10) {
        super(2);
        this.f54312Y = i10;
        this.f54313Z = c19866q;
        this.f54314o0 = interfaceC1439n;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue;
        String str;
        String strM8677e;
        C17296C c17296c = C17296C.f55119a;
        InterfaceC1439n interfaceC1439n = this.f54314o0;
        C19866Q c19866q = this.f54313Z;
        switch (this.f54312Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    String str2 = c19866q.f62970a.f19682a.f10934Y;
                    c6021p.m6524S(-217501256);
                    if (str2.length() == 0) {
                        AbstractC12341a.m14270g(c19866q, null, c6021p, 0, 2);
                    } else {
                        for (int i10 = 0; i10 < str2.length(); i10++) {
                            if (str2.charAt(i10) == 8203) {
                            }
                        }
                        AbstractC12341a.m14270g(c19866q, null, c6021p, 0, 2);
                    }
                    c6021p.m6553p(false);
                    interfaceC1439n.invoke(c6021p, 0);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    String str3 = c19866q.f62970a.f19682a.f10934Y;
                    c6021p2.m6524S(-217653038);
                    if (str3.length() == 0) {
                        C17309l c17309l = c19866q.f62969A;
                        iIntValue = ((Number) c17309l.f55136Y).intValue();
                        str = (String) c17309l.f55137Z;
                        if (str == null) {
                            strM8677e = AbstractC17792x.m19533p(c6021p2, -217644503, iIntValue, c6021p2, false);
                        } else {
                            c6021p2.m6524S(-217642307);
                            strM8677e = AbstractC8142m4.m8677e(iIntValue, new Object[]{str}, c6021p2);
                            c6021p2.m6553p(false);
                        }
                        AbstractC4124r4.m4768b(strM8677e, null, ((C3949M0) c6021p2.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, c6021p2, 0, 3072, 122874);
                    } else {
                        for (int i11 = 0; i11 < str3.length(); i11++) {
                            if (str3.charAt(i11) == 8203) {
                            }
                        }
                        C17309l c17309l2 = c19866q.f62969A;
                        iIntValue = ((Number) c17309l2.f55136Y).intValue();
                        str = (String) c17309l2.f55137Z;
                        if (str == null) {
                            strM8677e = AbstractC17792x.m19533p(c6021p2, -217644503, iIntValue, c6021p2, false);
                        } else {
                            c6021p2.m6524S(-217642307);
                            strM8677e = AbstractC8142m4.m8677e(iIntValue, new Object[]{str}, c6021p2);
                            c6021p2.m6553p(false);
                        }
                        AbstractC4124r4.m4768b(strM8677e, null, ((C3949M0) c6021p2.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, c6021p2, 0, 3072, 122874);
                    }
                    c6021p2.m6553p(false);
                    interfaceC1439n.invoke(c6021p2, 0);
                }
                break;
        }
        return c17296c;
    }
}
