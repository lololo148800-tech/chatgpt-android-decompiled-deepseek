package p810ig;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.p650ui.focus.AbstractC10862a;
import com.openai.chatgpt.R;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0187M0;
import p006A4.C0362w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p349O0.C5975S;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p362Of.C6194i;
import p478Tc.AbstractC7313q;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8142m4;
import p594Y9.AbstractC9746I4;
import p594Y9.AbstractC9775N3;
import p635a1.C10456n;
import p737f1.C13522n;
import p872lg.C16946f;
import p911o0.C17718B0;
import p911o0.C17745Z;
import p911o0.C17755e0;
import p911o0.C17756f;
import p911o0.C17794y;
import p936p0.C18280t;

/* JADX INFO: renamed from: ig.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C14991j extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C13522n f46660Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18280t f46661Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ List f46662o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16946f f46663p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f46664q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1426a f46665r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC5985X f46666s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14991j(C13522n c13522n, C18280t c18280t, List list, C16946f c16946f, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, InterfaceC5985X interfaceC5985X) {
        super(3);
        this.f46660Y = c13522n;
        this.f46661Z = c18280t;
        this.f46662o0 = list;
        this.f46663p0 = c16946f;
        this.f46664q0 = interfaceC1436k;
        this.f46665r0 = interfaceC1426a;
        this.f46666s0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C17794y ModalBottomSheet = (C17794y) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-1910030452);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            InterfaceC5985X interfaceC5985X = this.f46666s0;
            if (objM6514H == c5975s) {
                objM6514H = new C6194i(interfaceC5985X, 13);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC9775N3.m10381a((InterfaceC1436k) objM6514H, AbstractC10842a.m11233k(AbstractC10862a.m11299a(C10456n.f30959Y, this.f46660Y), AbstractC7313q.f23199d), null, AbstractC8142m4.m8676d(R.string.onboarding_select_country_code, c6021p), false, null, null, false, c6021p, 6, 244);
            FillElement fillElement = AbstractC10844c.f32512c;
            WeakHashMap weakHashMap = C17718B0.f56555v;
            C17745Z c17745z = new C17745Z(new C17755e0(C17756f.m19480f(c6021p).f56566k, 32), (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f));
            c6021p.m6524S(-1910016604);
            boolean zM6545h = c6021p.m6545h(this.f46662o0) | c6021p.m6545h(this.f46663p0) | c6021p.m6542f(this.f46664q0) | c6021p.m6542f(this.f46665r0);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == c5975s) {
                C0362w c0362w = new C0362w(this.f46662o0, interfaceC5985X, this.f46663p0, this.f46664q0, this.f46665r0);
                c6021p.m6537c0(c0362w);
                objM6514H2 = c0362w;
            }
            c6021p.m6553p(false);
            AbstractC9746I4.m10337a(fillElement, this.f46661Z, c17745z, false, null, null, null, false, (InterfaceC1436k) objM6514H2, c6021p, 6, 248);
        }
        return C17296C.f55119a;
    }
}
