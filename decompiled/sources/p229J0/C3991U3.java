package p229J0;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.lazy.C10845a;
import com.openai.chatgpt.R;
import ee.C13373h;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import nc.AbstractC17563j;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.InterfaceC0309z1;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1095x1.AbstractC21076c;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p269Kh.C4679f;
import p269Kh.C4684k;
import p328N1.C5609y;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p477Tb.AbstractC7294a;
import p478Tc.AbstractC7313q;
import p492U1.C7548m;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8479G;
import p544W9.AbstractC8497J;
import p544W9.AbstractC8735w4;
import p571X9.AbstractC9306j0;
import p594Y9.AbstractC9703B3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p637a3.C10484a;
import p637a3.C10495l;
import p736f0.InterfaceC13499q;
import p776h3.C14398l;
import p776h3.C14402p;
import p776h3.C14404r;
import p863l3.C16813d;
import p884m3.C17144c;
import p884m3.C17145d;
import p884m3.C17149h;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p911o0.InterfaceC17783s0;
import p946pc.AbstractC18319D;
import p946pc.C18320E;
import ph.C18417e;

/* JADX INFO: renamed from: J0.U3 */
/* JADX INFO: loaded from: classes.dex */
public final class C3991U3 extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12527Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f12528Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3991U3(String str, int i10) {
        super(3);
        this.f12527Y = i10;
        this.f12528Z = str;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f12527Y) {
            case 0:
                C6021p c6021p = (C6021p) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f12528Z, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                return C17296C.f55119a;
            case 1:
                C18320E RichText = (C18320E) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(RichText, "$this$RichText");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6021p2.m6542f(RichText) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC17563j.m19214b(RichText, AbstractC9306j0.m9891j(this.f12528Z, "\n```", new StringBuilder("```")), null, null, null, null, null, c6021p2, iIntValue & 14, 62);
                }
                return C17296C.f55119a;
            case 2:
                InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button, "$this$Button");
                if ((iIntValue2 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f12528Z, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p3, 0, 0, 131070);
                }
                return C17296C.f55119a;
            case 3:
                InterfaceC17783s0 TextButton = (InterfaceC17783s0) obj;
                C6021p c6021p4 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TextButton, "$this$TextButton");
                if ((iIntValue3 & 17) == 16 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f12528Z, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p4, 0, 0, 131070);
                }
                return C17296C.f55119a;
            case 4:
                InterfaceC17783s0 OutlinedButton = (InterfaceC17783s0) obj;
                C6021p c6021p5 = (C6021p) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(OutlinedButton, "$this$OutlinedButton");
                if ((iIntValue4 & 17) == 16 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    c6021p5.m6524S(1103097444);
                    String strM8676d = this.f12528Z;
                    if (strM8676d == null) {
                        strM8676d = AbstractC8142m4.m8676d(R.string.design_error_retry_button_text, c6021p5);
                    }
                    c6021p5.m6553p(false);
                    AbstractC9703B3.m10296a(strM8676d, null, 0L, c6021p5, 0);
                }
                return C17296C.f55119a;
            case 5:
                InterfaceC17783s0 Button2 = (InterfaceC17783s0) obj;
                C6021p c6021p6 = (C6021p) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button2, "$this$Button");
                if ((iIntValue5 & 17) == 16 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f12528Z, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p6.m6548k(AbstractC3947L4.f12183a)).f12159o, c6021p6, 0, 0, 65534);
                }
                return C17296C.f55119a;
            case 6:
                InterfaceC17783s0 Button3 = (InterfaceC17783s0) obj;
                C6021p c6021p7 = (C6021p) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button3, "$this$Button");
                if ((iIntValue6 & 17) == 16 && c6021p7.m6562y()) {
                    c6021p7.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f12528Z, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p7, 0, 0, 131070);
                }
                return C17296C.f55119a;
            case 7:
                InterfaceC17783s0 OutlinedButton2 = (InterfaceC17783s0) obj;
                C6021p c6021p8 = (C6021p) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(OutlinedButton2, "$this$OutlinedButton");
                if ((iIntValue7 & 17) == 16 && c6021p8.m6562y()) {
                    c6021p8.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f12528Z, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p8, 0, 0, 131070);
                }
                return C17296C.f55119a;
            case 8:
                InterfaceC17783s0 Button4 = (InterfaceC17783s0) obj;
                C6021p c6021p9 = (C6021p) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button4, "$this$Button");
                if ((iIntValue8 & 17) == 16 && c6021p9.m6562y()) {
                    c6021p9.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f12528Z, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p9, 0, 0, 131070);
                }
                return C17296C.f55119a;
            case 9:
                InterfaceC13499q AnimatedVisibility = (InterfaceC13499q) obj;
                C6021p c6021p10 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility, "$this$AnimatedVisibility");
                String str = this.f12528Z;
                if (str == null) {
                    str = "";
                }
                C17785t0.f56761a.getClass();
                AbstractC4124r4.m4768b(str, new WithAlignmentLineElement(AbstractC21076c.f66994a), ((C3949M0) c6021p10.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, C5609y.f18151Z, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p10, 196608, 0, 131032);
                return C17296C.f55119a;
            case 10:
                C4679f it = (C4679f) obj;
                C6021p c6021p11 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(it, "it");
                c6021p11.m6524S(482043067);
                C4684k c4684k = it.f15228a;
                boolean z6 = c4684k.f15248m;
                String str2 = c4684k.f15237b;
                if (z6) {
                    String str3 = this.f12528Z;
                    if (str3 == null) {
                        str3 = null;
                    }
                    str2 = str2 + " [" + str3 + "]";
                }
                c6021p11.m6553p(false);
                return str2;
            case 11:
                InterfaceC17783s0 Button5 = (InterfaceC17783s0) obj;
                C6021p c6021p12 = (C6021p) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button5, "$this$Button");
                if ((iIntValue9 & 17) == 16 && c6021p12.m6562y()) {
                    c6021p12.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f12528Z, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p12, 0, 0, 131070);
                }
                return C17296C.f55119a;
            case 12:
                C18320E RichText2 = (C18320E) obj;
                C6021p c6021p13 = (C6021p) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(RichText2, "$this$RichText");
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= c6021p13.m6542f(RichText2) ? 4 : 2;
                }
                if ((iIntValue10 & 19) == 18 && c6021p13.m6562y()) {
                    c6021p13.m6517L();
                } else {
                    InterfaceC0309z1 interfaceC0309z1 = (InterfaceC0309z1) c6021p13.m6548k(AbstractC0187M0.f714p);
                    c6021p13.m6524S(1016162084);
                    boolean zM6545h = c6021p13.m6545h(interfaceC0309z1);
                    Object objM6514H = c6021p13.m6514H();
                    if (zM6545h || objM6514H == C6013l.f19514a) {
                        objM6514H = new C13373h(interfaceC0309z1, 3);
                        c6021p13.m6537c0(objM6514H);
                    }
                    c6021p13.m6553p(false);
                    AbstractC17563j.m19214b(RichText2, this.f12528Z, null, null, (InterfaceC1436k) objM6514H, null, null, c6021p13, iIntValue10 & 14, 54);
                }
                return C17296C.f55119a;
            case 13:
                C18320E CodeBlock = (C18320E) obj;
                C6021p c6021p14 = (C6021p) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(CodeBlock, "$this$CodeBlock");
                if ((iIntValue11 & 14) == 0) {
                    iIntValue11 |= c6021p14.m6542f(CodeBlock) ? 4 : 2;
                }
                if ((iIntValue11 & 91) == 18 && c6021p14.m6562y()) {
                    c6021p14.m6517L();
                } else {
                    AbstractC18319D.m19844c(CodeBlock, this.f12528Z, null, null, 0, false, 0, c6021p14, iIntValue11 & 14);
                }
                return C17296C.f55119a;
            case 14:
                C14402p Row = (C14402p) obj;
                C6021p c6021p15 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Row, "$this$Row");
                C10484a c10484a = new C10484a(R.drawable.ic_chatgpt);
                C10495l c10495l = C10495l.f31097a;
                float f10 = C18417e.f58763f;
                AbstractC7294a.m7744a(c10484a, new C14404r(new C17144c(f10)).mo10952b(new C14398l(new C17144c(f10))), 0, null, c6021p15, 48, 24);
                AbstractC8735w4.m9467a(this.f12528Z, AbstractC8497J.m9161c(c10495l, AbstractC7313q.f23199d).mo10952b(new C14404r(C17145d.f54815a)), new C16813d(new C17149h(C18417e.f58768k), new C7548m(((C3941K4) c6021p15.m6548k(AbstractC3947L4.f12183a)).f12155k.f10910a.f10860b), 124), 0, c6021p15, 0);
                return C17296C.f55119a;
            default:
                C10845a item = (C10845a) obj;
                C6021p c6021p16 = (C6021p) obj2;
                int iIntValue12 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue12 & 17) == 16 && c6021p16.m6562y()) {
                    c6021p16.m6517L();
                } else {
                    C10456n c10456n = C10456n.f30959Y;
                    InterfaceC10459q interfaceC10459qM9122c = AbstractC8479G.m9122c(c10456n, AbstractC8479G.m9124e(c6021p16));
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30943v0, c6021p16, 0);
                    int i10 = c6021p16.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p16.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p16, interfaceC10459qM9122c);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p16.m6528W();
                    if (c6021p16.f19563O) {
                        c6021p16.m6549l(c21696i);
                    } else {
                        c6021p16.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p16, c17781r0M19506b);
                    C5997d.m6439Z(C21698j.f68872e, c6021p16, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p16.f19563O || !AbstractC16544l.m18089b(c6021p16.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p16, i10, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p16, interfaceC10459qM10923d);
                    AbstractC4124r4.m4768b(this.f12528Z, AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, 0.0f, AbstractC7313q.f23199d, 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p16, 0, 0, 131068);
                    c6021p16.m6553p(true);
                }
                return C17296C.f55119a;
        }
    }
}
