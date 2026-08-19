package p039Bc;

import androidx.compose.p650ui.draw.AbstractC10861a;
import com.openai.feature.conversationhistory.impl.history.AbstractC12253a;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p006A4.C0353n;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p080D0.AbstractC1770D0;
import p080D0.C1768C0;
import p080D0.C1804g;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21059M;
import p1139z0.C21585H;
import p349O0.C5996c0;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p492U1.C7536a;
import p523V9.AbstractC8206u4;
import p547Wc.C8775T;
import p594Y9.AbstractC9751J3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.C17690x;
import p911o0.AbstractC17724E0;
import p911o0.C17718B0;
import p911o0.C17756f;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: Bc.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C0882p extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2595Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f2596Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f2597o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0882p(Object obj, boolean z6, int i10) {
        super(3);
        this.f2595Y = i10;
        this.f2597o0 = obj;
        this.f2596Z = z6;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C8775T c8775t;
        C17296C c17296c = C17296C.f55119a;
        Object obj4 = this.f2597o0;
        boolean z6 = this.f2596Z;
        switch (this.f2595Y) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p.m6544g(zBooleanValue) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C10456n c10456n = C10456n.f30959Y;
                    WeakHashMap weakHashMap = C17718B0.f56555v;
                    InterfaceC10459q interfaceC10459qM19459a = AbstractC17724E0.m19459a(c10456n, C17756f.m19480f(c6021p).f56562g);
                    InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj4;
                    if (z6) {
                        c6021p.m6524S(1839980113);
                        C8775T c8775t2 = (C8775T) interfaceC5985X.getValue();
                        C21585H c21585h = C8775T.f26766c;
                        AbstractC8206u4.m8819a(c8775t2, interfaceC10459qM19459a, null, null, c6021p, 8, 12);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(1840184527);
                        if (zBooleanValue) {
                            c8775t = (C8775T) interfaceC5985X.getValue();
                        } else {
                            if (zBooleanValue) {
                                throw new C0644w();
                            }
                            c8775t = null;
                        }
                        C8775T c8775t3 = c8775t;
                        C21585H c21585h2 = C8775T.f26766c;
                        AbstractC12253a.m14244a(c8775t3, interfaceC10459qM19459a, null, null, c6021p, 8);
                        c6021p.m6553p(false);
                    }
                }
                return c17296c;
            case 1:
                InterfaceC10459q interfaceC10459q = (InterfaceC10459q) obj;
                C6021p c6021p2 = (C6021p) obj2;
                ((Number) obj3).intValue();
                c6021p2.m6524S(-196777734);
                long j10 = ((C1768C0) c6021p2.m6548k(AbstractC1770D0.f5051a)).f5045a;
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) obj4;
                boolean zM6540e = c6021p2.m6540e(j10) | c6021p2.m6542f(interfaceC1426a) | c6021p2.m6544g(z6);
                Object objM6514H = c6021p2.m6514H();
                if (zM6540e || objM6514H == C6013l.f19514a) {
                    objM6514H = new C1804g(j10, interfaceC1426a, z6);
                    c6021p2.m6537c0(objM6514H);
                }
                InterfaceC10459q interfaceC10459qM11296b = AbstractC10861a.m11296b(interfaceC10459q, (InterfaceC1436k) objM6514H);
                c6021p2.m6553p(false);
                return interfaceC10459qM11296b;
            case 2:
                AbstractC21069X abstractC21069XMo21533p = ((InterfaceC21056J) obj2).mo21533p(((C7536a) obj3).f23888a);
                return ((InterfaceC21059M) obj).mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z, C17690x.f56481Y, new C0353n((C5996c0) obj4, z6, abstractC21069XMo21533p, 1));
            default:
                InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button, "$this$Button");
                if ((iIntValue2 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC9751J3.m10350c(z6, (InterfaceC1439n) obj4, c6021p3, 0);
                }
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0882p(boolean z6, Object obj, int i10) {
        super(3);
        this.f2595Y = i10;
        this.f2596Z = z6;
        this.f2597o0 = obj;
    }
}
