package p273Kl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.helper.widget.Flow;
import com.openai.feature.conversationspreadsheet.impl.ConversationSpreadsheetViewModel;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16558z;
import livekit.LivekitRtc$SessionDescription;
import livekit.LivekitRtc$SignalRequest;
import livekit.org.webrtc.DataChannel;
import livekit.org.webrtc.IceCandidate;
import livekit.org.webrtc.SessionDescription;
import mm.C17296C;
import om.C18235b;
import p040Bd.C0954L0;
import p040Bd.C0989R0;
import p040Bd.C1054b4;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1110xk.AbstractC21280c;
import p1110xk.AbstractC21282e;
import p1110xk.AbstractC21295r;
import p1143z4.C21795y;
import p1155zi.C21965U0;
import p1155zi.C22072w1;
import p1155zi.EnumC22040o1;
import p1160zp.AbstractC22225a;
import p225Im.InterfaceC3759g;
import p229J0.C4171z3;
import p249Jl.SurfaceHolderCallbackC4482b;
import p278L0.C4892s;
import p291Lf.C5020q;
import p318Mh.AbstractC5364G0;
import p318Mh.C5367I;
import p318Mh.C5391c;
import p318Mh.C5406j0;
import p349O0.C5994b0;
import p349O0.C5996c0;
import p349O0.C6029t;
import p349O0.InterfaceC5985X;
import p360Od.C6172d;
import p387Pl.AbstractC6482b0;
import p394Q2.C6562b;
import p404Qe.C6670f;
import p406Qg.C6693D;
import p408Qj.C6739e;
import p408Qj.C6747m;
import p408Qj.C6749o;
import p433Rj.C6908a;
import p437Rn.C6951i;
import p478Tc.C7299c;
import p479Td.C7315A;
import p479Td.C7373x;
import p492U1.C7543h;
import p506Ug.C7671f;
import p507Uh.C7677c;
import p507Uh.InterfaceC7678d;
import p523V9.AbstractC8215v5;
import p531Vj.C8361c0;
import p531Vj.C8364e;
import p531Vj.C8385x;
import p531Vj.C8387z;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p553Wh.C8870f;
import p555Wj.C8886b;
import p557Wl.AbstractC8959o;
import p571X9.AbstractC9300i0;
import p658b5.C11246q;
import p692d0.C12954G;
import p729ej.C13421l;
import p793ho.C14720c4;
import p793ho.EnumC14748g4;
import p817j$.util.Objects;
import p867l8.C16831c;
import p909nm.AbstractC17680n;
import p926of.C18174k;
import p926of.C18187x;
import p936p0.C18273m;
import p936p0.C18280t;
import p968qi.C18739v;
import ro.C19261e;

/* JADX INFO: renamed from: Kl.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C4714D extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15333Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f15334Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f15335o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4714D(Object obj, int i10, Object obj2) {
        super(0);
        this.f15333Y = i10;
        this.f15335o0 = obj;
        this.f15334Z = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x02d3 A[LOOP:0: B:110:0x029c->B:120:0x02d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:181:0x02d5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, java.util.List] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C5020q c5020q;
        InterfaceC1436k interfaceC1436k;
        ButtonCancelComponentStyle cancelDialogResumeStyleValue;
        ButtonSubmitComponentStyle cancelDialogCloseStyleValue;
        TextBasedComponentStyle textStyleValue;
        TextBasedComponentStyle titleStyleValue;
        ButtonCancelComponentStyle buttonSecondaryStyleValue;
        ButtonSubmitComponentStyle buttonPrimaryStyleValue;
        TextBasedComponentStyle textStyleValue2;
        TextBasedComponentStyle titleStyleValue2;
        boolean z6 = false;
        C17296C c17296c = C17296C.f55119a;
        Object obj = this.f15335o0;
        Object obj2 = this.f15334Z;
        switch (this.f15333Y) {
            case 0:
                IceCandidate iceCandidate = (IceCandidate) obj;
                if (iceCandidate != null) {
                    C8395g c8395g = AbstractC8396h.Companion;
                    EnumC8397i enumC8397i = EnumC8397i.f26116Y;
                    AbstractC8396h.Companion.getClass();
                    if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                        iceCandidate.toString();
                        AbstractC22225a.f70470a.getClass();
                        C16831c.m18570i(new Object[0]);
                    }
                    ((C4716E) obj2).f15340b.m5429s(iceCandidate, EnumC14748g4.PUBLISHER);
                }
                return c17296c;
            case 1:
                C4750V0 c4750v0 = ((C4716E) obj2).f15340b;
                c4750v0.getClass();
                SessionDescription offer = (SessionDescription) obj;
                AbstractC16544l.m18094g(offer, "offer");
                LivekitRtc$SessionDescription livekitRtc$SessionDescriptionM9572a = AbstractC8959o.m9572a(offer);
                C14720c4 c14720c4NewBuilder = LivekitRtc$SignalRequest.newBuilder();
                c14720c4NewBuilder.m13863d();
                ((LivekitRtc$SignalRequest) c14720c4NewBuilder.f36981Z).setOffer(livekitRtc$SessionDescriptionM9572a);
                c4750v0.m5430t((LivekitRtc$SignalRequest) c14720c4NewBuilder.m13861b());
                return c17296c;
            case 2:
                C4726J c4726j = ((C4756Y0) obj).f15516c;
                if (c4726j == null) {
                    return null;
                }
                c4726j.invoke((DataChannel) obj2);
                return c17296c;
            case 3:
                C8395g c8395g2 = AbstractC8396h.Companion;
                EnumC8397i enumC8397i2 = EnumC8397i.f26116Y;
                AbstractC8396h.Companion.getClass();
                IceCandidate iceCandidate2 = (IceCandidate) obj;
                if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                    Objects.toString(iceCandidate2);
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18570i(new Object[0]);
                }
                ((C4756Y0) obj2).f15515b.m5429s(iceCandidate2, EnumC14748g4.SUBSCRIBER);
                return c17296c;
            case 4:
                C11246q c11246q = (C11246q) obj;
                C4892s c4892s = (C4892s) c11246q.f34077n;
                float fM5502d = c11246q.m12638h().m5502d(obj2);
                if (!Float.isNaN(fM5502d)) {
                    C11246q c11246q2 = c4892s.f15947a;
                    ((C5994b0) c11246q2.f34073j).m6410h(fM5502d);
                    ((C5994b0) c11246q2.f34074k).m6410h(0.0f);
                    c11246q.m12625A(null);
                }
                c11246q.m12656z(obj2);
                return c17296c;
            case 5:
                C7543h c7543h = (C7543h) ((C7299c) obj).f23109b.getValue();
                if (c7543h != null && (c5020q = (C5020q) obj2) != null && (interfaceC1436k = c5020q.f16384b) != null) {
                    interfaceC1436k.invoke(new C7543h(c7543h.f23897a));
                }
                return c17296c;
            case 6:
                if (((String) obj) != null) {
                    ((InterfaceC1426a) obj2).invoke();
                }
                return c17296c;
            case 7:
                ((InterfaceC1436k) obj).invoke((C18174k) obj2);
                return c17296c;
            case 8:
                ((InterfaceC1436k) obj).invoke(((C0954L0) obj2).f2715c);
                return c17296c;
            case 9:
                ((InterfaceC1436k) obj).invoke(((C0989R0) obj2).f2772b);
                return c17296c;
            case 10:
                ((InterfaceC1436k) obj).invoke(((C1054b4) obj2).f2883a);
                return c17296c;
            case 11:
                C18280t c18280t = (C18280t) obj;
                C18273m c18273m = (C18273m) AbstractC17680n.m19343S(c18280t.m19824g().f58296j);
                if (AbstractC16544l.m18089b(c18273m != null ? c18273m.f58315l : null, (String) obj2) && c18280t.mo5257c()) {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            case 12:
                C12954G c12954g = (C12954G) obj;
                Object[] objArr = c12954g.f41144b;
                long[] jArr = c12954g.f41143a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j10) < 128) {
                                    ((C6029t) obj2).m6587x(objArr[(i10 << 3) + i12]);
                                }
                                j10 >>= 8;
                            }
                            if (i11 == 8) {
                                if (i10 != length) {
                                    i10++;
                                }
                            }
                        } else if (i10 != length) {
                            i10++;
                        }
                    }
                }
                return c17296c;
            case 13:
                ((InterfaceC1436k) obj).invoke(new C18187x((C6172d) obj2));
                return c17296c;
            case 14:
                AbstractC6482b0 abstractC6482b0 = (AbstractC6482b0) obj;
                SurfaceHolderCallbackC4482b surfaceHolderCallbackC4482b = (SurfaceHolderCallbackC4482b) obj2;
                if (!abstractC6482b0.m7052d()) {
                    abstractC6482b0.mo7051c().removeSink(surfaceHolderCallbackC4482b);
                }
                return Boolean.valueOf(abstractC6482b0.f21038j.remove(surfaceHolderCallbackC4482b));
            case 15:
                ((C6562b) obj2).getClass();
                return AbstractC9300i0.m9879b((Context) obj, "GlanceAppWidgetManager");
            case 16:
                ((ConversationSpreadsheetViewModel) obj).m14395k(new C6670f((C18739v) ((InterfaceC5985X) obj2).getValue()));
                return c17296c;
            case 17:
                ((InterfaceC1436k) ((InterfaceC3759g) obj)).invoke(new C6693D((C7671f) obj2));
                return c17296c;
            case 18:
                C6908a c6908a = (C6908a) obj;
                int lineCount = c6908a.f22149d.getLineCount();
                Button button = c6908a.f22149d;
                Button button2 = c6908a.f22153h;
                if (lineCount > 1 || button2.getLineCount() > 1) {
                    ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    Flow flow = c6908a.f22150e;
                    layoutParams.width = flow.getWidth();
                    button.setLayoutParams(layoutParams);
                    ViewGroup.LayoutParams layoutParams2 = button2.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams2.width = flow.getWidth();
                    button2.setLayoutParams(layoutParams2);
                    flow.setReferencedIds(new int[]{button.getId(), button2.getId()});
                    z6 = true;
                }
                StepStyle stepStyle = ((C6739e) obj2).f21633Y;
                AbstractC21280c.m21621a(c6908a.f22147b, stepStyle, c6908a.f22148c);
                if (stepStyle != null && (titleStyleValue = stepStyle.getTitleStyleValue()) != null) {
                    AbstractC21295r.m21637c(c6908a.f22152g, titleStyleValue);
                }
                if (stepStyle != null && (textStyleValue = stepStyle.getTextStyleValue()) != null) {
                    AbstractC21295r.m21637c(c6908a.f22151f, textStyleValue);
                }
                if (stepStyle != null && (cancelDialogCloseStyleValue = stepStyle.getCancelDialogCloseStyleValue()) != null) {
                    AbstractC21282e.m21624c(button, cancelDialogCloseStyleValue, !z6, 2);
                }
                if (stepStyle != null && (cancelDialogResumeStyleValue = stepStyle.getCancelDialogResumeStyleValue()) != null) {
                    AbstractC21282e.m21624c(button2, cancelDialogResumeStyleValue, !z6, 2);
                }
                return c17296c;
            case 19:
                ((C13421l) obj).f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a((C6749o) obj2, C6747m.f21656Y));
                return c17296c;
            case 20:
                return "Only found " + ((C16558z) obj).f51287Y + " digits in a row, but need to parse " + ((C6951i) obj2).m7331b();
            case 21:
                C21795y c21795y = ((C8870f) obj).f27149b;
                C5406j0 c5406j0 = C5406j0.f17676g;
                EnumC22040o1 category = ((C22072w1) obj2).f69785b;
                c5406j0.getClass();
                AbstractC16544l.m18094g(category, "category");
                AbstractC5364G0.m5889d(c21795y, c5406j0.m5885a(new C4171z3(category, 15)), true);
                return c17296c;
            case 22:
                ArrayList arrayList = (ArrayList) obj;
                if (!arrayList.isEmpty()) {
                    C18235b c18235b = (C18235b) obj2;
                    if (arrayList.size() > 1) {
                        c18235b.add(new C7315A(AbstractC17680n.m19322C0(arrayList)));
                    } else {
                        c18235b.add(new C7373x((C21965U0) AbstractC17680n.m19341Q(arrayList)));
                    }
                    arrayList.clear();
                }
                return c17296c;
            case 23:
                C5996c0 c5996c0 = (C5996c0) obj2;
                c5996c0.m6413h(c5996c0.m6412g() + 1);
                if (c5996c0.m6412g() == 10) {
                    C21795y c21795y2 = ((C8870f) obj).f27149b;
                    C5367I c5367i = C5367I.f17607h;
                    c5367i.getClass();
                    AbstractC5364G0.m5889d(c21795y2, c5367i.m5885a(C5391c.f17646Z), true);
                }
                return c17296c;
            case 24:
                ((C7677c) obj).m7971a();
                ((InterfaceC1426a) obj2).invoke();
                return c17296c;
            case 25:
                ((InterfaceC7678d) obj).mo3587b();
                ((InterfaceC1426a) obj2).invoke();
                return c17296c;
            case 26:
                C8886b c8886b = (C8886b) obj;
                int lineCount2 = c8886b.f27200f.getLineCount();
                Button button3 = c8886b.f27200f;
                Button button4 = c8886b.f27201g;
                if (lineCount2 > 1 || button4.getLineCount() > 1) {
                    ViewGroup.LayoutParams layoutParams3 = button3.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    Flow flow2 = c8886b.f27198d;
                    layoutParams3.width = flow2.getWidth();
                    button3.setLayoutParams(layoutParams3);
                    ViewGroup.LayoutParams layoutParams4 = button4.getLayoutParams();
                    if (layoutParams4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams4.width = flow2.getWidth();
                    button4.setLayoutParams(layoutParams4);
                    flow2.setReferencedIds(new int[]{button4.getId(), button3.getId()});
                    z6 = true;
                }
                StepStyle stepStyle2 = ((C8364e) obj2).f26053p0;
                AbstractC21280c.m21621a(c8886b.f27196b, stepStyle2, c8886b.f27197c);
                if (stepStyle2 != null && (titleStyleValue2 = stepStyle2.getTitleStyleValue()) != null) {
                    AbstractC21295r.m21637c(c8886b.f27203i, titleStyleValue2);
                }
                if (stepStyle2 != null && (textStyleValue2 = stepStyle2.getTextStyleValue()) != null) {
                    AbstractC21295r.m21637c(c8886b.f27199e, textStyleValue2);
                }
                if (stepStyle2 != null && (buttonPrimaryStyleValue = stepStyle2.getButtonPrimaryStyleValue()) != null) {
                    AbstractC21282e.m21624c(button4, buttonPrimaryStyleValue, !z6, 2);
                }
                if (stepStyle2 != null && (buttonSecondaryStyleValue = stepStyle2.getButtonSecondaryStyleValue()) != null) {
                    AbstractC21282e.m21624c(button3, buttonSecondaryStyleValue, !z6, 2);
                }
                return c17296c;
            case 27:
                ((C13421l) obj).f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a((C8387z) obj2, C8385x.f26093o0));
                return c17296c;
            case 28:
                ((C13421l) obj).f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a((C8361c0) obj2, C8385x.f26096r0));
                return c17296c;
            default:
                return ((String) obj) + " for OkHttp instrumentation is not found, skipping tracking of request with url=" + ((C19261e) obj2).f61057e.f55379a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4714D(Object obj, Object obj2, boolean z6, int i10) {
        super(0);
        this.f15333Y = i10;
        this.f15334Z = obj;
        this.f15335o0 = obj2;
    }
}
