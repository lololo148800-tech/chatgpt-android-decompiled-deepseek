package p928oh;

import android.content.Context;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.p650ui.focus.C10863b;
import androidx.constraintlayout.widget.ConstraintLayout;
import cd.C11709i;
import com.openai.auth.SwitchAccountViewModel;
import com.openai.feature.conversationhistory.dialogs.move.ConversationMoveViewModel;
import com.withpersona.sdk2.inquiry.network.dto.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import gl.C14189a;
import gl.C14192d;
import hk.C14524b;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16556x;
import mh.EnumC17264l;
import mm.C17296C;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p003A1.C0190N0;
import p003A1.C0260j0;
import p003A1.InterfaceC0300w1;
import p006A4.C0364y;
import p013Ab.C0420b;
import p025An.AbstractC0575H;
import p025An.C0624m;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p030B2.C0794y0;
import p042Bf.C1266h;
import p042Bf.C1278t;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p080D0.C1837w0;
import p1000s0.C19414j;
import p1014t1.C19742s;
import p1025te.C19866Q;
import p1039ud.C20194k;
import p1039ud.C20198o;
import p1044uj.AbstractC20330d;
import p1044uj.AbstractC20337g0;
import p1044uj.AbstractC20340i;
import p1044uj.AbstractC20361s0;
import p1044uj.C20316S;
import p1044uj.C20319V;
import p1044uj.C20326b;
import p1044uj.C20328c;
import p1044uj.C20329c0;
import p1044uj.C20336g;
import p1044uj.C20338h;
import p1044uj.C20341i0;
import p1044uj.C20346l;
import p1044uj.C20348m;
import p1044uj.C20359r0;
import p1044uj.EnumC20324a;
import p1044uj.EnumC20335f0;
import p1062vd.C20541V;
import p1062vd.C20544Y;
import p1062vd.EnumC20540U;
import p1071w0.AbstractC20740b0;
import p1071w0.C20750g0;
import p1071w0.C20754i0;
import p1071w0.EnumC20730T;
import p1081wc.C20886e;
import p1081wc.InterfaceC20904w;
import p1087wj.AbstractC20986g;
import p1087wj.AbstractC20994o;
import p1087wj.AbstractC21004y;
import p1087wj.C20984e;
import p1087wj.C20985f;
import p1087wj.C20992m;
import p1087wj.C21003x;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21098s;
import p1112xm.AbstractC21304h;
import p1155zi.C21891A;
import p1155zi.C21936L0;
import p1155zi.C22038o;
import p310M9.C5311e;
import p349O0.C5994b0;
import p349O0.InterfaceC5985X;
import p350O1.C6045C;
import p385Pj.AbstractC6442q;
import p385Pj.C6441p;
import p477Tb.AbstractC7294a;
import p492U1.C7543h;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8215v5;
import p537W0.C8410b;
import p544W9.AbstractC8681n4;
import p547Wc.C8775T;
import p571X9.AbstractC9101A4;
import p729ej.C13430u;
import p737f1.EnumC13525q;
import p737f1.InterfaceC13515g;
import p843k1.C16308b;
import p857kl.AbstractC16435B;
import p857kl.C16447N;
import p857kl.C16470r;
import p857kl.C16475w;
import p857kl.C16477y;
import p857kl.InterfaceC16476x;
import p893n.AbstractActivityC17375g;
import p894n0.InterfaceC17406l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p911o0.AbstractC17792x;
import p931ok.AbstractC18223d;
import p936p0.C18265e;
import p953q0.C18546D;
import p953q0.C18583h0;
import p953q0.C18605z;
import p977r0.C18839k;
import p977r0.C18845q;
import p978r1.AbstractC18857c;
import p978r1.C18856b;
import p979r2.C18862c;
import pk.C18500e;
import pk.C18505j;
import sg.C19557V;
import sg.C19569k;
import sg.C19575q;
import td.C19847j;
import tg.C19945d;

/* JADX INFO: renamed from: oh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18194a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58018Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f58019Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f58020o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18194a(Object obj, int i10, Object obj2) {
        super(1);
        this.f58018Y = i10;
        this.f58019Z = obj;
        this.f58020o0 = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0039  */
    /* JADX WARN: Type inference failed for: r1v2, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.List] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int i10;
        C16308b c16308b;
        int i11;
        String str;
        AttributeStyles.HeaderButtonColorStyle headerButtonColor;
        StyleElements.SimpleElementColor headerButton;
        StyleElements.SimpleElementColorValue base;
        EnumC20335f0 enumC20335f0;
        boolean z6;
        boolean zM11304d;
        String str2 = "position() should be called first";
        int i12 = 13;
        int i13 = 3;
        int i14 = 2;
        Integer value = null;
        value = null;
        value = null;
        value = null;
        boolean z10 = true;
        C17296C c17296c = C17296C.f55119a;
        Object obj2 = this.f58020o0;
        Object obj3 = this.f58019Z;
        switch (this.f58018Y) {
            case 0:
                C14189a formData = (C14189a) obj;
                AbstractC16544l.m18094g(formData, "$this$formData");
                EnumC17264l enumC17264l = (EnumC17264l) obj3;
                EnumC17264l.f55058o0.getClass();
                String str3 = enumC17264l == EnumC17264l.Auto ? null : enumC17264l.f55064Y;
                ArrayList arrayList = formData.f44583a;
                if (str3 != null) {
                    InterfaceC16476x.f51117a.getClass();
                    arrayList.add(new C14192d("language", str3, C16470r.f51107c));
                }
                ?? M21644g = AbstractC21304h.m21644g((File) obj2);
                C16475w c16475w = InterfaceC16476x.f51117a;
                C16477y c16477y = new C16477y();
                List list = AbstractC16435B.f50983a;
                c16477y.m4529e(SIPHeaderNames.CONTENT_TYPE, "audio/m4a");
                c16477y.m4529e(SIPHeaderNames.CONTENT_DISPOSITION, "filename=\"audio.m4a\"");
                arrayList.add(new C14192d("file", M21644g, c16477y.m18047Q()));
                return c17296c;
            case 1:
                C18583h0 c18583h0 = (C18583h0) obj3;
                c18583h0.f59190c.remove(obj2);
                return new C0260j0(c18583h0, 12, obj2);
            case 2:
                C17296C c17296c2 = c17296c;
                AbstractC21068W abstractC21068W = (AbstractC21068W) obj;
                ArrayList arrayList2 = (ArrayList) obj3;
                int size = arrayList2.size();
                int i15 = 0;
                while (true) {
                    C18839k c18839k = (C18839k) obj2;
                    if (i15 >= size) {
                        C17296C c17296c3 = c17296c2;
                        c18839k.f59960a.f60060s.getValue();
                        return c17296c3;
                    }
                    C18845q c18845q = (C18845q) arrayList2.get(i15);
                    if (c18845q.f60019n == -1) {
                        throw new IllegalArgumentException(str2);
                    }
                    List list2 = c18845q.f60008c;
                    int size2 = list2.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        AbstractC21069X abstractC21069X = (AbstractC21069X) list2.get(i16);
                        int i17 = c18845q.f60020o;
                        boolean z11 = c18845q.f60009d;
                        int i18 = i17 - (z11 ? abstractC21069X.f66982Z : abstractC21069X.f66981Y);
                        int i19 = c18845q.f60021p;
                        ArrayList arrayList3 = arrayList2;
                        long jM9631a = c18845q.f60023r;
                        int i20 = size;
                        List list3 = list2;
                        C18546D c18546dM11264a = c18845q.f60015j.m11264a(i16, c18845q.f60007b);
                        if (c18546dM11264a != null) {
                            long jM7882d = C7543h.m7882d(jM9631a, ((C7543h) c18546dM11264a.f59097q.getValue()).f23897a);
                            if (((c18845q.m20147k(jM9631a) > i18 || c18845q.m20147k(jM7882d) > i18) && (c18845q.m20147k(jM9631a) < i19 || c18845q.m20147k(jM7882d) < i19)) || !((Boolean) c18546dM11264a.f59088h.getValue()).booleanValue()) {
                                i11 = 3;
                            } else {
                                i11 = 3;
                                AbstractC0575H.m1156D(c18546dM11264a.f59081a, null, null, new C18605z(c18546dM11264a, null), 3);
                            }
                            c16308b = c18546dM11264a.f59094n;
                            i10 = i11;
                            jM9631a = jM7882d;
                        } else {
                            i10 = 3;
                            c16308b = null;
                        }
                        if (c18839k.f59971l) {
                            jM9631a = AbstractC9101A4.m9631a(z11 ? (int) (jM9631a >> 32) : (c18845q.f60019n - ((int) (jM9631a >> 32))) - (z11 ? abstractC21069X.f66982Z : abstractC21069X.f66981Y), z11 ? (c18845q.f60019n - ((int) (jM9631a & 4294967295L))) - (z11 ? abstractC21069X.f66982Z : abstractC21069X.f66981Y) : (int) (jM9631a & 4294967295L));
                        } else {
                            i15 = i15;
                        }
                        long jM7882d2 = C7543h.m7882d(jM9631a, c18839k.f59968i);
                        if (c18546dM11264a != null) {
                            c18546dM11264a.f59093m = jM7882d2;
                        }
                        if (c16308b != null) {
                            AbstractC21068W.m21542l(abstractC21068W, abstractC21069X, jM7882d2, c16308b);
                        } else {
                            AbstractC21068W.m21541k(abstractC21068W, abstractC21069X, jM7882d2);
                        }
                        i16++;
                        arrayList2 = arrayList3;
                        z10 = true;
                        i15 = i15;
                        size = i20;
                        list2 = list3;
                        str2 = str2;
                        i13 = i10;
                        c17296c2 = c17296c2;
                    }
                    i15++;
                    i13 = i13;
                    z10 = z10;
                    size = size;
                    c17296c2 = c17296c2;
                    str2 = str2;
                }
                break;
            case 3:
                int i21 = 0;
                AbstractC21068W abstractC21068W2 = (AbstractC21068W) obj;
                ArrayList arrayList4 = (ArrayList) obj3;
                int size3 = arrayList4.size();
                int i22 = 0;
                while (i22 < size3) {
                    C19414j c19414j = (C19414j) arrayList4.get(i22);
                    if (c19414j.f61534n == Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("position() should be called first");
                    }
                    List list4 = c19414j.f61523c;
                    int size4 = list4.size();
                    while (i21 < size4) {
                        AbstractC21069X abstractC21069X2 = (AbstractC21069X) list4.get(i21);
                        int i23 = i21 * 2;
                        int[] iArr = c19414j.f61532l;
                        long jM9631a2 = AbstractC9101A4.m9631a(iArr[i23], iArr[i23 + 1]);
                        boolean z12 = c19414j.f61529i;
                        boolean z13 = c19414j.f61530j;
                        if (z12) {
                            jM9631a2 = AbstractC9101A4.m9631a(z13 ? (int) (jM9631a2 >> 32) : (c19414j.f61534n - ((int) (jM9631a2 >> 32))) - (z13 ? abstractC21069X2.f66982Z : abstractC21069X2.f66981Y), z13 ? (c19414j.f61534n - ((int) (jM9631a2 & 4294967295L))) - (z13 ? abstractC21069X2.f66982Z : abstractC21069X2.f66981Y) : (int) (jM9631a2 & 4294967295L));
                        } else {
                            c17296c = c17296c;
                            obj2 = obj2;
                            list4 = list4;
                            size4 = size4;
                        }
                        long jM7882d3 = C7543h.m7882d(jM9631a2, c19414j.f61524d);
                        if (z13) {
                            AbstractC21068W.m21544n(abstractC21068W2, abstractC21069X2, jM7882d3);
                        } else {
                            AbstractC21068W.m21541k(abstractC21068W2, abstractC21069X2, jM7882d3);
                        }
                        i21++;
                        size4 = size4;
                        c17296c = c17296c;
                        list4 = list4;
                        obj2 = obj2;
                    }
                    i22++;
                    i21 = 0;
                }
                C17296C c17296c4 = c17296c;
                ((InterfaceC5985X) obj2).getValue();
                return c17296c4;
            case 4:
                String it = (String) obj;
                AbstractC16544l.m18094g(it, "it");
                ((InterfaceC1436k) obj3).invoke(new C19557V((C19569k) obj2, it));
                return c17296c;
            case 5:
                MotionEvent motionEvent = (MotionEvent) obj;
                C19742s c19742s = (C19742s) obj2;
                if (motionEvent.getActionMasked() == 0) {
                    InterfaceC1436k interfaceC1436k = c19742s.f62507Y;
                    if (interfaceC1436k == null) {
                        AbstractC16544l.m18103p("onTouchEvent");
                        throw null;
                    }
                    ((C0420b) obj3).f1381Z = ((Boolean) interfaceC1436k.invoke(motionEvent)).booleanValue() ? 2 : 3;
                } else {
                    InterfaceC1436k interfaceC1436k2 = c19742s.f62507Y;
                    if (interfaceC1436k2 == null) {
                        AbstractC16544l.m18103p("onTouchEvent");
                        throw null;
                    }
                    interfaceC1436k2.invoke(motionEvent);
                }
                return c17296c;
            case 6:
                File safeCall = (File) obj;
                AbstractC16544l.m18094g(safeCall, "$this$safeCall");
                AbstractC21304h.m21646i(safeCall, (String) obj3, (Charset) obj2);
                return c17296c;
            case 7:
                String gizmoId = ((C21936L0) obj).f69488a;
                AbstractC16544l.m18094g(gizmoId, "gizmoId");
                ((ConversationMoveViewModel) obj3).m14395k(new C19847j((String) obj2, gizmoId));
                return c17296c;
            case 8:
                C18265e LazyRow = (C18265e) obj;
                AbstractC16544l.m18094g(LazyRow, "$this$LazyRow");
                List listM19322C0 = AbstractC17680n.m19322C0(((C19866Q) obj3).f62975f.entrySet());
                LazyRow.m19803p(listM19322C0.size(), new C1278t(24, listM19322C0), new C1278t(25, listM19322C0), new C8410b(new C1266h(listM19322C0, (InterfaceC1436k) obj2, i14), true, -632812321));
                return c17296c;
            case 9:
                Boolean bool = (Boolean) obj;
                ((InterfaceC20904w) obj3).mo21447a(C20886e.f66519g, AbstractC0168G.m535x("to", String.valueOf(bool.booleanValue())));
                ((InterfaceC5985X) obj2).setValue(bool);
                return c17296c;
            case 10:
                C16447N url = (C16447N) obj;
                AbstractC16544l.m18094g(url, "$this$url");
                AbstractC8681n4.m9374c(url, new String[]{"reasons"});
                C19575q c19575q = (C19575q) obj2;
                ((C19945d) obj3).getClass();
                if (c19575q.f62162a != null) {
                    str = "gizmo";
                } else if (c19575q.f62164c != null) {
                    str = "share_link";
                } else {
                    if (c19575q.f62163b == null) {
                        throw new IllegalArgumentException("Invalid report content id");
                    }
                    str = "conversation";
                }
                AbstractC8681n4.m9374c(url, new String[]{str});
                return c17296c;
            case 11:
                C18265e LazyColumn = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
                C20194k c20194k = (C20194k) obj3;
                AbstractC17792x.m19529l(LazyColumn, c20194k.f63951f.size(), new C20198o(c20194k, 0), new C8410b(new C0364y(c20194k, 14, (InterfaceC1436k) obj2), true, -1400299762), 4);
                return c17296c;
            case 12:
                C14524b binding = (C14524b) obj;
                AbstractC16544l.m18094g(binding, "binding");
                C18500e uiScreen = (C18500e) obj3;
                AbstractC16544l.m18094g(uiScreen, "uiScreen");
                ConstraintLayout constraintLayout = binding.f45771a;
                Context context = constraintLayout.getContext();
                AbstractC16544l.m18091d(context);
                C5311e c5311eM19885a = C18505j.m19885a(context, uiScreen, false, true);
                StepStyles.UiStepStyle uiStepStyle = uiScreen.f58961Z;
                StyleElements.PositionType pageLevelVerticalAlignment = uiStepStyle != null ? uiStepStyle.getPageLevelVerticalAlignment() : null;
                StyleElements.PositionType positionType = StyleElements.PositionType.CENTER;
                View view = (ConstraintLayout) c5311eM19885a.f17485o0;
                if (pageLevelVerticalAlignment == positionType) {
                    binding.f45773c.setFillViewport(true);
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.gravity = 16;
                    view.setLayoutParams(layoutParams2);
                }
                binding.f45772b.addView(view);
                AbstractC18223d.m19731a(constraintLayout, 13);
                View view2 = (View) c5311eM19885a.f17486p0;
                if (view2 != null) {
                    binding.f45774d.addView(view2);
                    AbstractC18223d.m19731a(view2, 2);
                }
                AbstractC18223d.m19731a(constraintLayout, 15);
                if (uiStepStyle != null && (headerButtonColor = uiStepStyle.getHeaderButtonColor()) != null && (headerButton = headerButtonColor.getHeaderButton()) != null && (base = headerButton.getBase()) != null) {
                    value = base.getValue();
                }
                if (value != null) {
                    binding.f45775e.setControlsColor(value.intValue());
                }
                return new C20346l(uiScreen, binding, (C20348m) obj2, c5311eM19885a);
            case 13:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                action.f42521b = C20329c0.m21032i((C20329c0) ((AbstractC20337g0) obj3), ((C21003x) ((AbstractC21004y) obj2)).f66851a, null, EnumC20335f0.f64299p0, null, false, 214);
                return c17296c;
            case 14:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                action2.f42521b = new C20329c0(AbstractC17680n.m19373w0(AbstractC17680n.m19362l0(((AbstractC20337g0) action2.f42521b).mo21035g(), new C20336g(((C20328c) ((AbstractC20330d) obj3)).f64273a, EnumC20324a.MANUAL, 0)), ((C20316S) obj2).f64218p), ((AbstractC20337g0) action2.f42521b).mo21034f(), null, EnumC20335f0.f64297Z, false, null, 244);
                return c17296c;
            case 15:
                AbstractC20330d it2 = (AbstractC20330d) obj;
                AbstractC16544l.m18094g(it2, "it");
                C20359r0 c20359r0 = (C20359r0) obj3;
                if (it2 instanceof C20328c) {
                    return AbstractC8215v5.m8839a(c20359r0, new C18194a(it2, 14, (C20316S) obj2));
                }
                if (it2.equals(C20326b.f64266a)) {
                    return AbstractC8215v5.m8839a(c20359r0, C20341i0.f64323x0);
                }
                throw new C0644w();
            case 16:
                C13430u action3 = (C13430u) obj;
                AbstractC16544l.m18094g(action3, "$this$action");
                action3.f42521b = new C20329c0(AbstractC17680n.m19373w0(AbstractC17680n.m19361k0(AbstractC20361s0.m21044a(((C6441p) ((AbstractC6442q) obj3)).f20906a), ((AbstractC20337g0) action3.f42521b).mo21035g()), ((C20316S) obj2).f64218p), ((AbstractC20337g0) action3.f42521b).mo21034f(), null, EnumC20335f0.f64297Z, false, null, 244);
                return c17296c;
            case 17:
                C13430u action4 = (C13430u) obj;
                AbstractC16544l.m18094g(action4, "$this$action");
                List<AbstractC20340i> listMo21035g = ((AbstractC20337g0) action4.f42521b).mo21035g();
                ArrayList arrayList5 = new ArrayList(AbstractC17682p.m19389r(listMo21035g, 10));
                for (AbstractC20340i c20336g : listMo21035g) {
                    if ((c20336g instanceof C20336g) && AbstractC16544l.m18089b(c20336g, (C20336g) obj3)) {
                        C20336g c20336g2 = (C20336g) c20336g;
                        int i24 = ((C20992m) ((AbstractC20994o) obj2)).f66824a;
                        String absoluteFilePath = c20336g2.f64301Y;
                        AbstractC16544l.m18094g(absoluteFilePath, "absoluteFilePath");
                        EnumC20324a captureMethod = c20336g2.f64302Z;
                        AbstractC16544l.m18094g(captureMethod, "captureMethod");
                        c20336g = new C20336g(absoluteFilePath, captureMethod, i24);
                    }
                    arrayList5.add(c20336g);
                }
                AbstractC20337g0 abstractC20337g0 = (AbstractC20337g0) action4.f42521b;
                action4.f42521b = AbstractC20337g0.m21039c(abstractC20337g0, abstractC20337g0.mo21036h(), null, arrayList5, null, 10);
                return c17296c;
            case 18:
                C13430u action5 = (C13430u) obj;
                AbstractC16544l.m18094g(action5, "$this$action");
                Object obj4 = action5.f42521b;
                C20329c0 c20329c0 = obj4 instanceof C20329c0 ? (C20329c0) obj4 : null;
                if (c20329c0 != null) {
                    ArrayList arrayListM19357g0 = AbstractC17680n.m19357g0(c20329c0.f64274o0, (C20338h) obj3);
                    if (arrayListM19357g0.isEmpty()) {
                        enumC20335f0 = EnumC20335f0.f64299p0;
                    } else {
                        Iterator it3 = arrayListM19357g0.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                enumC20335f0 = EnumC20335f0.f64299p0;
                            } else if (((AbstractC20340i) it3.next()) instanceof C20336g) {
                                enumC20335f0 = EnumC20335f0.f64297Z;
                            }
                        }
                    }
                    EnumC20335f0 enumC20335f1 = enumC20335f0;
                    AbstractC20986g abstractC20986g = (AbstractC20986g) obj2;
                    if (abstractC20986g instanceof C20985f) {
                        action5.f42521b = C20329c0.m21032i(c20329c0, arrayListM19357g0, null, enumC20335f1, null, false, 230);
                    } else if (abstractC20986g instanceof C20984e) {
                        action5.m14964a(new C20319V(((C20984e) abstractC20986g).f66811a));
                    }
                }
                return c17296c;
            case 19:
                AbstractC20986g response = (AbstractC20986g) obj;
                AbstractC16544l.m18094g(response, "response");
                return AbstractC8215v5.m8839a((C20359r0) obj3, new C18194a((C20338h) obj2, 18, response));
            case 20:
                long j10 = ((C7543h) obj).f23897a;
                if (((C20541V) obj3).f65173e != EnumC20540U.f65167o0) {
                    ((C11709i) obj2).m13032b(j10);
                }
                return c17296c;
            case 21:
                EnumC13525q focusState = (EnumC13525q) obj;
                AbstractC16544l.m18094g(focusState, "focusState");
                if (focusState.m15074a()) {
                    AbstractC0575H.m1156D((InterfaceC0571F) obj3, null, null, new C20544Y((C8775T) obj2, null), 3);
                }
                return c17296c;
            case 22:
                C21891A accountUser = (C21891A) obj;
                AbstractC16544l.m18094g(accountUser, "accountUser");
                String strM22322a = accountUser.m22322a();
                C22038o c22038o = accountUser.f69415a;
                ((SwitchAccountViewModel) obj3).mo14219o((AbstractActivityC17375g) obj2, strM22322a, c22038o != null ? c22038o.f69721k : null);
                return c17296c;
            case 23:
                InterfaceC21098s it4 = (InterfaceC21098s) obj;
                AbstractC16544l.m18094g(it4, "it");
                ((C5994b0) obj3).m6410h(((int) (it4.mo21524k() & 4294967295L)) / ((InterfaceC7537b) obj2).getDensity());
                return c17296c;
            case 24:
                C0794y0 insets = (C0794y0) obj;
                AbstractC16544l.m18094g(insets, "insets");
                C16556x c16556x = (C16556x) obj3;
                if (!c16556x.f51285Y) {
                    C18862c c18862cMo1754f = insets.f2209a.mo1754f(8);
                    AbstractC16544l.m18093f(c18862cMo1754f, "getInsets(...)");
                    if (c18862cMo1754f.f60089d > 0) {
                        c16556x.f51285Y = true;
                        ((C0624m) obj2).resumeWith(c17296c);
                    }
                }
                return c17296c;
            case 25:
                C6045C c6045c = (C6045C) obj;
                if (!AbstractC16544l.m18089b((C6045C) obj3, c6045c)) {
                    ((InterfaceC1436k) obj2).invoke(c6045c);
                }
                return c17296c;
            case 26:
                KeyEvent keyEvent = ((C18856b) obj).f60081a;
                if (((C20750g0) obj3).m21291a() == EnumC20730T.f65729Z && keyEvent.getKeyCode() == 4 && AbstractC7294a.m7746c(AbstractC18857c.m20158e(keyEvent), 1)) {
                    ((C1837w0) obj2).m2681e(null);
                    z6 = true;
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 27:
                AbstractC21068W abstractC21068W3 = (AbstractC21068W) obj;
                ArrayList arrayListM21273n = AbstractC20740b0.m21273n((List) obj3, ((C20754i0) obj2).f65867a);
                if (arrayListM21273n != null) {
                    int size5 = arrayListM21273n.size();
                    for (int i25 = 0; i25 < size5; i25++) {
                        C17309l c17309l = (C17309l) arrayListM21273n.get(i25);
                        AbstractC21069X abstractC21069X3 = (AbstractC21069X) c17309l.f55136Y;
                        InterfaceC1426a interfaceC1426a = (InterfaceC1426a) c17309l.f55137Z;
                        AbstractC21068W.m21537f(abstractC21068W3, abstractC21069X3, interfaceC1426a != null ? ((C7543h) interfaceC1426a.invoke()).f23897a : 0L);
                    }
                }
                return c17296c;
            case 28:
                KeyEvent keyEvent2 = ((C18856b) obj).f60081a;
                InputDevice device = keyEvent2.getDevice();
                if (device == null || !device.supportsSource(513) || device.isVirtual() || !AbstractC7294a.m7746c(AbstractC18857c.m20158e(keyEvent2), 2) || keyEvent2.getSource() == 257) {
                    zM11304d = false;
                } else {
                    InterfaceC13515g interfaceC13515g = (InterfaceC13515g) obj3;
                    if (AbstractC20740b0.m21272m(19, keyEvent2)) {
                        zM11304d = ((C10863b) interfaceC13515g).m11304d(5);
                    } else if (AbstractC20740b0.m21272m(20, keyEvent2)) {
                        zM11304d = ((C10863b) interfaceC13515g).m11304d(6);
                    } else if (AbstractC20740b0.m21272m(21, keyEvent2)) {
                        zM11304d = ((C10863b) interfaceC13515g).m11304d(3);
                    } else if (AbstractC20740b0.m21272m(22, keyEvent2)) {
                        zM11304d = ((C10863b) interfaceC13515g).m11304d(4);
                    } else if (AbstractC20740b0.m21272m(23, keyEvent2)) {
                        InterfaceC0300w1 interfaceC0300w1 = ((C20750g0) obj2).f65812c;
                        if (interfaceC0300w1 != null) {
                            ((C0190N0) interfaceC0300w1).m572b();
                        }
                        zM11304d = true;
                    } else {
                        zM11304d = false;
                    }
                }
                return Boolean.valueOf(zM11304d);
            default:
                return new C0260j0((InterfaceC5985X) obj3, i12, (InterfaceC17406l) obj2);
        }
    }
}
