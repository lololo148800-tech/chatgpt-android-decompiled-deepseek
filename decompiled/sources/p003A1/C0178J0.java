package p003A1;

import androidx.navigation.AbstractC11122c;
import bf.C11377e;
import com.openai.chatgpt.AbstractC12214a;
import com.openai.chatgpt.R;
import com.openai.feature.conversationdetails.impl.ConversationDetailsViewModel;
import com.openai.feature.conversationspreadsheet.impl.ConversationSpreadsheetViewModel;
import com.openai.feature.messages.impl.textselection.TextSelectionViewModel;
import com.openai.feature.messages.messagefeedback.MessageFeedbackViewModel;
import com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModel;
import com.openai.feature.onboarding.viewmodel.CollectEmailViewModel;
import com.openai.feature.subscriptions.access.SubscriptionAccessCheckViewModel;
import com.openai.voice.training.VoiceTrainingViewModel;
import ge.EnumC14057V0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p006A4.C0355p;
import p040Bd.C0958L4;
import p040Bd.C1013V0;
import p049Bm.InterfaceC1439n;
import p1000s0.C19420p;
import p1000s0.C19426v;
import p1000s0.C19430z;
import p1135yn.C21555b;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21891A;
import p219Ig.InterfaceC3717f;
import p229J0.AbstractC4124r4;
import p229J0.C4026b2;
import p229J0.C4075j3;
import p253K.AbstractC4502m;
import p295Lj.AbstractC5103c;
import p316Mf.AbstractC5340g;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p507Uh.C7680f;
import p507Uh.InterfaceC7678d;
import p507Uh.InterfaceC7682h;
import p523V9.AbstractC8003U3;
import p523V9.AbstractC8047a5;
import p523V9.AbstractC8122k0;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8452B2;
import p544W9.AbstractC8464D2;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8491I;
import p544W9.AbstractC8724v;
import p544W9.AbstractC8745y2;
import p571X9.AbstractC9147I2;
import p587Y1.C9587m;
import p587Y1.C9592r;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p637a3.InterfaceC10497n;
import p758g0.C13736L;
import p832jb.AbstractC16182b;
import p870le.AbstractC16868Z;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17790w;
import p936p0.C18264d;
import p936p0.C18266f;
import p946pc.C18320E;
import p953q0.C18580g;
import p977r0.C18831c;
import p977r0.C18834f;
import p977r0.C18835g;
import re.AbstractC18947B;

/* JADX INFO: renamed from: A1.J0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0178J0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f674Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f675Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f676o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0178J0(int i10, InterfaceC7678d interfaceC7678d) {
        super(2);
        this.f674Y = 13;
        this.f675Z = i10;
        this.f676o0 = interfaceC7678d;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C17296C c17296c = C17296C.f55119a;
        int i10 = this.f675Z;
        Object obj3 = this.f676o0;
        switch (this.f674Y) {
            case 0:
                ((Number) obj2).intValue();
                C0181K0 c0181k0 = (C0181K0) obj3;
                c0181k0.mo564b(C5997d.m6447d0(i10 | 1), (C6021p) obj);
                return c17296c;
            case 1:
                ((Number) obj2).intValue();
                AbstractC5103c.m5665a((C0355p) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            case 2:
                ((Number) obj2).intValue();
                AbstractC12214a.m14225c((AbstractC11122c) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            case 3:
                ((Number) obj2).intValue();
                AbstractC8003U3.m8306b((C0958L4) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            case 4:
                ((Number) obj2).intValue();
                AbstractC8003U3.m8305a((C1013V0) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            case 5:
                ((Number) obj2).intValue();
                AbstractC8724v.m9444b((C21891A) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            case 6:
                ((Number) obj2).intValue();
                AbstractC8724v.m9445c((InterfaceC3717f) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            case 7:
                ((Number) obj2).intValue();
                C4026b2 c4026b2 = (C4026b2) obj3;
                c4026b2.mo564b(C5997d.m6447d0(i10 | 1), (C6021p) obj);
                return c17296c;
            case 8:
                ((Number) obj2).intValue();
                C4075j3 c4075j3 = (C4075j3) obj3;
                c4075j3.m4745a(C5997d.m6447d0(i10 | 1), (C6021p) obj);
                return c17296c;
            case 9:
                ((Number) obj2).intValue();
                AbstractC8491I.m9151b((TextSelectionViewModel) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            case 10:
                ((Number) obj2).intValue();
                AbstractC5340g.m5882b((MessageFeedbackViewModel) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            case 11:
                ((Number) obj2).intValue();
                AbstractC8483G3.m9131a((VoiceTrainingViewModel) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            case 12:
                ((Number) obj2).intValue();
                AbstractC9147I2.m9692a((ConversationSpreadsheetViewModel) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            case 13:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C17756f c17756f = AbstractC17770m.f56724a;
                    C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23199d);
                    C10456n c10456n = C10456n.f30959Y;
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(c17764jM19500g, C10444b.f30946y0, c6021p, 0);
                    int i11 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
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
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(i10, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                    InterfaceC7682h interfaceC7682hMo3586a = ((InterfaceC7678d) obj3).mo3586a();
                    c6021p.m6524S(1198578952);
                    if ((interfaceC7682hMo3586a instanceof C7680f) && ((C7680f) interfaceC7682hMo3586a).f24219b) {
                        AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.permissions_disloag_settings_redirect, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                    }
                    c6021p.m6553p(false);
                    c6021p.m6553p(true);
                }
                return c17296c;
            case 14:
                ((Number) obj2).intValue();
                C9587m c9587m = (C9587m) obj3;
                c9587m.mo564b(C5997d.m6447d0(i10 | 1), (C6021p) obj);
                return c17296c;
            case 15:
                ((Number) obj2).intValue();
                C9592r c9592r = (C9592r) obj3;
                c9592r.mo564b(C5997d.m6447d0(i10 | 1), (C6021p) obj);
                return c17296c;
            case 16:
                ((Number) obj2).intValue();
                AbstractC8122k0.m8628a((SubscriptionAccessCheckViewModel) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            case 17:
                ((Number) obj2).intValue();
                AbstractC8047a5.m8428a((C11377e) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            case 18:
                ((Number) obj2).intValue();
                C13736L c13736l = (C13736L) obj3;
                c13736l.m15215a(C5997d.m6447d0(i10 | 1), (C6021p) obj);
                return c17296c;
            case 19:
                ((Number) obj2).intValue();
                AbstractC8745y2.m9489d((InterfaceC10497n) obj3, (C6021p) obj, i10 | 1);
                return c17296c;
            case 20:
                ((Number) obj2).intValue();
                AbstractC8452B2.m9062a((CollectEmailViewModel) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            case 21:
                ((Number) obj2).intValue();
                AbstractC8464D2.m9086a((FinishAccountViewModel) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            case 22:
                ((Number) obj2).intValue();
                AbstractC16868Z.m18580c((EnumC14057V0) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            case 23:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C18266f c18266f = (C18266f) obj3;
                    C18580g c18580gM1062r = c18266f.f58232b.f58229b.m1062r(i10);
                    int i12 = i10 - c18580gM1062r.f59182a;
                    ((C18264d) c18580gM1062r.f59184c).f58228c.mo985d(c18266f.f58233c, Integer.valueOf(i12), c6021p2, 0);
                }
                return c17296c;
            case 24:
                ((Number) obj2).intValue();
                AbstractC16182b.m17789a((C18320E) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            case 25:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    for (List list : (List) obj3) {
                        if (list.size() != i10) {
                            throw new IllegalStateException("Check failed.");
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC1439n) it.next()).invoke(c6021p3, 0);
                        }
                    }
                }
                return c17296c;
            case 26:
                ((Number) obj2).intValue();
                AbstractC4502m.m5238a((ConversationDetailsViewModel) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            case 27:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    C18580g c18580gM1062r2 = ((C18834f) obj3).f59941b.f59938b.m1062r(i10);
                    ((C18831c) c18580gM1062r2.f59184c).f59937b.mo985d(C18835g.f59943a, Integer.valueOf(i10 - c18580gM1062r2.f59182a), c6021p4, 6);
                }
                return c17296c;
            case 28:
                ((Number) obj2).intValue();
                AbstractC18947B.m20274b((C21555b) obj3, (C6021p) obj, C5997d.m6447d0(i10 | 1));
                return c17296c;
            default:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    C18580g c18580gM1062r3 = ((C19426v) obj3).f61573b.f61571c.m1062r(i10);
                    int i13 = i10 - c18580gM1062r3.f59182a;
                    C19420p c19420p = (C19420p) c18580gM1062r3.f59184c;
                    c19420p.f61545b.mo985d(C19430z.f61616a, Integer.valueOf(i13), c6021p5, 0);
                }
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0178J0(Object obj, int i10, int i11) {
        super(2);
        this.f674Y = i11;
        this.f676o0 = obj;
        this.f675Z = i10;
    }
}
