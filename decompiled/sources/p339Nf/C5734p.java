package p339Nf;

import android.content.Context;
import android.widget.RemoteViews;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.FillElement;
import com.openai.feature.messages.MessagesViewModel;
import io.sentry.android.core.AbstractC15256t;
import java.io.Serializable;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p003A1.C0248f0;
import p035B7.C0846c;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC7889G0;
import p523V9.AbstractC8223w5;
import p537W0.AbstractC8411c;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p637a3.C10486c;
import p637a3.InterfaceC10496m;
import p642a8.C10519b;
import p656b3.C11223b;
import p661b7.EnumC11255b;
import p672c3.AbstractC11568D;
import p672c3.C11571E0;
import p672c3.C11593a;
import p672c3.C11600d0;
import p672c3.C11643z;
import p676c7.C11682a;
import p743f7.InterfaceC13575a;
import p743f7.InterfaceC13576b;
import p776h3.C14398l;
import p776h3.C14400n;
import p776h3.C14404r;
import p799i3.AbstractC14919a;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;
import p919o8.AbstractC17962d;
import p919o8.C17946W1;

/* JADX INFO: renamed from: Nf.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C5734p extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f18622Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Serializable f18623Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f18624o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f18625p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f18626q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f18627r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f18628s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f18629t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ Object f18630u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ Object f18631v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5734p(InterfaceC5985X interfaceC5985X, String str, String str2, List list, List list2, List list3, MessagesViewModel messagesViewModel, List list4, InterfaceC5985X interfaceC5985X2) {
        super(2);
        this.f18625p0 = interfaceC5985X;
        this.f18623Z = str;
        this.f18624o0 = str2;
        this.f18627r0 = list;
        this.f18628s0 = list2;
        this.f18629t0 = list3;
        this.f18631v0 = messagesViewModel;
        this.f18630u0 = list4;
        this.f18626q0 = interfaceC5985X2;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        C14400n c14400n;
        C17296C c17296c = C17296C.f55119a;
        Object obj3 = this.f18631v0;
        Object obj4 = this.f18630u0;
        Object obj5 = this.f18629t0;
        Object obj6 = this.f18628s0;
        Object obj7 = this.f18624o0;
        Object obj8 = this.f18627r0;
        Serializable serializable = this.f18623Z;
        Object obj9 = this.f18626q0;
        Object obj10 = this.f18625p0;
        switch (this.f18622Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C10456n c10456n = C10456n.f30959Y;
                    FillElement fillElement = AbstractC10844c.f32512c;
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                    int i11 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, fillElement);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                        AbstractC0168G.m537z(i11, c6021p, i11, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    float f10 = AbstractC5741w.f18690a;
                    InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj10;
                    EnumC5742x enumC5742x = (EnumC5742x) interfaceC5985X.getValue();
                    c6021p.m6524S(718323317);
                    Object objM6514H = c6021p.m6514H();
                    if (objM6514H == C6013l.f19514a) {
                        objM6514H = new C0248f0(interfaceC5985X, 28);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC5741w.m6164g(enumC5742x, (InterfaceC1436k) objM6514H, AbstractC10842a.m11237o(AbstractC10842a.m11235m(c10456n, AbstractC5741w.f18690a, 0.0f, 2), 0.0f, 0.0f, 0.0f, AbstractC7313q.f23201f, 7), c6021p, 48, 0);
                    AbstractC8223w5.m8850b((EnumC5742x) interfaceC5985X.getValue(), null, C5723e.f18534Z, null, "Sources content", null, AbstractC8411c.m8969c(-1575114079, c6021p, new C5733o((String) serializable, (String) obj7, (List) obj8, (List) obj6, (List) obj5, (MessagesViewModel) obj3, (List) obj4, (InterfaceC5985X) obj9)), c6021p, 1597824, 42);
                    c6021p.m6553p(true);
                }
                break;
            case 1:
                C11682a datadogContext = (C11682a) obj;
                InterfaceC13576b eventBatchWriter = (InterfaceC13576b) obj2;
                AbstractC16544l.m18094g(datadogContext, "datadogContext");
                AbstractC16544l.m18094g(eventBatchWriter, "eventBatchWriter");
                C10519b c10519b = (C10519b) obj10;
                String str = (String) serializable;
                if (str != null) {
                    try {
                        int[] iArrM27k = AbstractC0010F.m27k(9);
                        int length = iArrM27k.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                            int i13 = iArrM27k[i12];
                            if (AbstractC17962d.m19649j(i13).equals(str)) {
                                i10 = i13;
                            } else {
                                i12++;
                            }
                        }
                    } catch (NoSuchElementException e10) {
                        AbstractC7889G0.m8184b(c10519b.f31182a.mo15463s(), 5, EnumC11255b.f34100o0, new C0846c(str, 10), e10, false, 48);
                        i10 = 7;
                    }
                } else {
                    i10 = 7;
                }
                String str2 = (String) obj7;
                C17946W1 c17946w1 = (C17946W1) obj4;
                InterfaceC13575a interfaceC13575a = (InterfaceC13575a) obj3;
                interfaceC13575a.mo12662a(eventBatchWriter, C10519b.m10973a(c10519b, datadogContext, i10, 3, str2, ((Long) obj9).longValue(), (Long) obj8, (String) obj6, (String) obj5, null, c17946w1), 2);
                if (System.currentTimeMillis() - c17946w1.f57234a < C10519b.f31181d) {
                    interfaceC13575a.mo12662a(eventBatchWriter, C10519b.m10974b(c10519b, c17946w1), 2);
                }
                break;
            default:
                InterfaceC10496m interfaceC10496m = (InterfaceC10496m) obj2;
                if (interfaceC10496m instanceof C11223b) {
                    C16525B c16525b = (C16525B) obj10;
                    if (c16525b.f51262Y != null) {
                        AbstractC15256t.m16482t("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                    }
                    c16525b.f51262Y = interfaceC10496m;
                } else if (interfaceC10496m instanceof C14404r) {
                    ((C16525B) obj9).f51262Y = interfaceC10496m;
                } else if (interfaceC10496m instanceof C14398l) {
                    ((C16525B) serializable).f51262Y = interfaceC10496m;
                } else if (interfaceC10496m instanceof C10486c) {
                    C10486c c10486c = (C10486c) interfaceC10496m;
                    C11600d0 c11600d0 = (C11600d0) obj8;
                    if (c10486c instanceof C10486c) {
                        ((RemoteViews) obj7).setInt(c11600d0.f35091a, "setBackgroundResource", c10486c.f31067a.f31065a);
                    }
                } else if (interfaceC10496m instanceof C14400n) {
                    C16525B c16525b2 = (C16525B) obj6;
                    C14400n c14400n2 = (C14400n) c16525b2.f51262Y;
                    if (c14400n2 != null) {
                        C14400n c14400n3 = (C14400n) interfaceC10496m;
                        c14400n = new C14400n(c14400n2.f45142a.m15897a(c14400n3.f45142a), c14400n2.f45143b.m15897a(c14400n3.f45143b), c14400n2.f45144c.m15897a(c14400n3.f45144c), c14400n2.f45145d.m15897a(c14400n3.f45145d), c14400n2.f45146e.m15897a(c14400n3.f45146e), c14400n2.f45147f.m15897a(c14400n3.f45147f));
                    } else {
                        c14400n = (C14400n) interfaceC10496m;
                    }
                    c16525b2.f51262Y = c14400n;
                } else if (interfaceC10496m instanceof C11643z) {
                    ((C16525B) obj5).f51262Y = ((C11643z) interfaceC10496m).f35272a;
                } else if (!(interfaceC10496m instanceof C11593a)) {
                    if (interfaceC10496m instanceof AbstractC11568D) {
                        ((C16525B) obj4).f51262Y = interfaceC10496m;
                    } else if (!(interfaceC10496m instanceof AbstractC14919a)) {
                        AbstractC15256t.m16482t("GlanceAppWidget", "Unknown modifier '" + interfaceC10496m + "', nothing done.");
                    } else {
                        ((C16525B) obj3).f51262Y = interfaceC10496m;
                    }
                }
                break;
        }
        return c17296c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5734p(C10519b c10519b, String str, String str2, Long l4, Long l10, String str3, String str4, C17946W1 c17946w1, InterfaceC13575a interfaceC13575a) {
        super(2);
        this.f18625p0 = c10519b;
        this.f18623Z = str;
        this.f18624o0 = str2;
        this.f18626q0 = l4;
        this.f18627r0 = l10;
        this.f18628s0 = str3;
        this.f18629t0 = str4;
        this.f18630u0 = c17946w1;
        this.f18631v0 = interfaceC13575a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5734p(C16525B c16525b, C16525B c16525b2, C16525B c16525b3, Context context, RemoteViews remoteViews, C11600d0 c11600d0, C16525B c16525b4, C16525B c16525b5, C16525B c16525b6, C11571E0 c11571e0, C16525B c16525b7, C16525B c16525b8, C16525B c16525b9) {
        super(2);
        this.f18625p0 = c16525b;
        this.f18626q0 = c16525b2;
        this.f18623Z = c16525b3;
        this.f18624o0 = remoteViews;
        this.f18627r0 = c11600d0;
        this.f18628s0 = c16525b4;
        this.f18629t0 = c16525b6;
        this.f18630u0 = c16525b8;
        this.f18631v0 = c16525b9;
    }
}
