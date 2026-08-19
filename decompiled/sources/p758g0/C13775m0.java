package p758g0;

import android.content.ClipData;
import android.content.ClipDescription;
import android.view.View;
import android.widget.TextView;
import bf.C11349D;
import bf.C11386n;
import com.openai.feature.licenses.impl.LicensesViewModel;
import ge.C14031I;
import ge.C14089m0;
import io.C15105o;
import io.sentry.C15109B;
import io.sentry.android.replay.capture.AbstractC15283n;
import io.sentry.android.replay.capture.C15278i;
import io.sentry.android.replay.capture.C15281l;
import io.sentry.android.replay.capture.C15287r;
import io.sentry.rrweb.AbstractC15461b;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16524A;
import mm.C17296C;
import mm.C17309l;
import nf.C17609h;
import ni.AbstractC17640n;
import ni.C17639m;
import p003A1.AbstractC0187M0;
import p003A1.C0166F0;
import p003A1.C0169G0;
import p003A1.C0260j0;
import p003A1.InterfaceC0161D1;
import p006A4.C0364y;
import p025An.AbstractC0575H;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p042Bf.C1266h;
import p042Bf.C1278t;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p077Cn.C1743k;
import p080D0.C1825q0;
import p1014t1.AbstractC19736m;
import p1014t1.C19738o;
import p1030u1.C20094a;
import p1030u1.C20096c;
import p1030u1.C20097d;
import p1071w0.AbstractC20734X;
import p1081wc.C20857C;
import p1081wc.InterfaceC20904w;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p1140z1.AbstractC21690f;
import p1140z1.C21660F;
import p1155zi.C22020j1;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3759g;
import p225Im.InterfaceC3777y;
import p239Ja.C4322y;
import p278L0.C4893t;
import p349O0.C6002f0;
import p392Q0.C6546d;
import p479Td.C7351f0;
import p492U1.C7550o;
import p523V9.AbstractC7885F4;
import p530Vi.AbstractC8301I;
import p537W0.C8410b;
import p544W9.AbstractC8459C3;
import p544W9.AbstractC8651i4;
import p544W9.AbstractC8681n4;
import p547Wc.C8816z;
import p571X9.AbstractC9125E4;
import p676c7.C11682a;
import p743f7.InterfaceC13576b;
import p749fd.C13628m;
import p754fl.C13693c;
import p759g1.C13800b;
import p769gj.InterfaceC14150D;
import p773h0.InterfaceC14300o0;
import p774h1.C14329G;
import p774h1.C14340S;
import p774h1.C14341T;
import p774h1.C14353i;
import p774h1.C14359o;
import p775h2.AbstractC14376f;
import p784hb.C14437f;
import p796i0.C14898e;
import p857kl.AbstractC16457e;
import p857kl.C16447N;
import p860l0.AbstractC16777s0;
import p860l0.AbstractC16786v0;
import p860l0.C16660B;
import p860l0.C16698N1;
import p860l0.C16701P;
import p860l0.C16706S;
import p860l0.C16748i1;
import p860l0.C16757l1;
import p860l0.C16783u0;
import p860l0.C16798z0;
import p860l0.EnumC16673F0;
import p871lf.C16937u;
import p878lo.C17097f;
import p878lo.C17103l;
import p878lo.C17113v;
import p894n0.InterfaceC17405k;
import p894n0.InterfaceC17406l;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;
import p911o0.C17718B0;
import p911o0.RunnableC17743X;
import p926of.C18149L;
import p936p0.C18265e;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: g0.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13775m0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f43507Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f43508Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f43509o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13775m0(InterfaceC1439n interfaceC1439n, C11682a c11682a) {
        super(1);
        this.f43507Y = 16;
        this.f43508Z = (AbstractC16546n) interfaceC1439n;
        this.f43509o0 = c11682a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0175  */
    /* JADX WARN: Type inference failed for: r13v30, types: [Bm.k, sm.j] */
    /* JADX WARN: Type inference failed for: r14v16, types: [Bm.n, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) throws InterruptedException {
        int i10 = 11;
        C14898e c14898e = null;
        InterfaceC3777y interfaceC3777yM18075c = null;
        c14898e = null;
        c14898e = null;
        int i11 = 1;
        C17296C c17296c = C17296C.f55119a;
        Object obj2 = this.f43509o0;
        Object obj3 = this.f43508Z;
        switch (this.f43507Y) {
            case 0:
                return new C0260j0((C13771k0) obj3, 7, (C13761f0) obj2);
            case 1:
                C13771k0 c13771k0 = (C13771k0) obj3;
                C13767i0 c13767i0 = (C13767i0) obj2;
                c13771k0.f43497i.add(c13767i0);
                return new C0260j0(c13771k0, 8, c13767i0);
            case 2:
                C11386n social = (C11386n) obj;
                AbstractC16544l.m18094g(social, "social");
                C11349D c11349d = (C11349D) obj3;
                if (c11349d != null) {
                    ((InterfaceC1436k) ((InterfaceC3759g) obj2)).invoke(new C14031I(c11349d, social));
                }
                return c17296c;
            case 3:
                String it = ((C22020j1) obj).f69665a;
                AbstractC16544l.m18094g(it, "it");
                ((InterfaceC1436k) obj3).invoke(new C18149L((C7351f0) obj2, it, null, 4));
                return c17296c;
            case 4:
                ((TextView) obj3).removeTextChangedListener((C4322y) obj2);
                return c17296c;
            case 5:
                View newView = (View) obj;
                AbstractC16544l.m18094g(newView, "newView");
                ((InterfaceC14150D) obj3).mo3483c(newView, new C8816z((InterfaceC1436k) obj2, 26, newView));
                return c17296c;
            case 6:
                C21660F c21660f = (C21660F) obj;
                c21660f.m22080a();
                AbstractC14376f.m15847m(c21660f, ((C14329G) obj3).f44969a, (C14341T) obj2, 0.0f, null, 60);
                return c17296c;
            case 7:
                C21660F c21660f2 = (C21660F) obj;
                c21660f2.m22080a();
                AbstractC14376f.m15847m(c21660f2, (C14353i) obj3, (C14341T) obj2, 0.0f, null, 60);
                return c17296c;
            case 8:
                ((InterfaceC17406l) obj3).mo7767a((InterfaceC17405k) obj2);
                return c17296c;
            case 9:
                AbstractC21068W.m21543m((AbstractC21068W) obj, (AbstractC21069X) obj3, 0, 0, ((C14359o) obj2).f45048z0, 4);
                return c17296c;
            case 10:
                AbstractC21068W.m21543m((AbstractC21068W) obj, (AbstractC21069X) obj3, 0, 0, ((C14340S) obj2).f45019P0, 4);
                return c17296c;
            case 11:
                C13756d animateTo = (C13756d) obj;
                AbstractC16544l.m18094g(animateTo, "$this$animateTo");
                ((C4893t) obj3).m5516a(((Number) animateTo.m15224e()).floatValue() - ((C15105o) obj2).m16230c());
                return c17296c;
            case 12:
                AbstractC15283n segment = (AbstractC15283n) obj;
                AbstractC16544l.m18094g(segment, "segment");
                C15278i c15278i = (C15278i) obj3;
                ArrayList arrayList = c15278i.f47738w;
                C15281l c15281l = (C15281l) AbstractC17686t.m19396D(arrayList);
                while (true) {
                    C15109B c15109b = c15278i.f47735t;
                    if (c15281l == null) {
                        if (segment instanceof C15281l) {
                            C15281l c15281l2 = (C15281l) segment;
                            C15281l.m16511a(c15281l2, c15109b);
                            Date date = c15281l2.f47739a.f47011G0;
                            AbstractC16544l.m18093f(date, "segment.replay.timestamp");
                            ((C13628m) obj2).invoke(date);
                        }
                        return c17296c;
                    }
                    C15281l.m16511a(c15281l, c15109b);
                    c15281l = (C15281l) AbstractC17686t.m19396D(arrayList);
                    Thread.sleep(100L);
                }
                break;
            case 13:
                AbstractC15461b event = (AbstractC15461b) obj;
                AbstractC16544l.m18094g(event, "event");
                if (event.f48291Z >= ((Date) obj3).getTime()) {
                    ((ArrayList) obj2).add(event);
                }
                return c17296c;
            case 14:
                AbstractC15283n segment2 = (AbstractC15283n) obj;
                AbstractC16544l.m18094g(segment2, "segment");
                if (segment2 instanceof C15281l) {
                    C15281l.m16511a((C15281l) segment2, ((C15287r) obj3).f47750t);
                }
                AbstractC8459C3.m9077a((File) obj2);
                return c17296c;
            case 15:
                if (((AtomicBoolean) obj3).compareAndSet(false, true)) {
                    ((C1743k) obj2).mo2524p(c17296c);
                }
                return c17296c;
            case 16:
                InterfaceC13576b it2 = (InterfaceC13576b) obj;
                AbstractC16544l.m18094g(it2, "it");
                ((AbstractC16546n) obj3).invoke((C11682a) obj2, it2);
                return c17296c;
            case 17:
                C16447N url = (C16447N) obj;
                AbstractC16544l.m18094g(url, "$this$url");
                AbstractC8681n4.m9374c(url, new String[]{"set_status"});
                C13693c c13693c = (C13693c) obj3;
                AbstractC8651i4.m9327e(c13693c, AbstractC16457e.f51060a);
                c13693c.f43198d = (C16937u) obj2;
                InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C16937u.class);
                try {
                    interfaceC3777yM18075c = AbstractC16526C.m18075c(C16937u.class);
                    break;
                } catch (Throwable unused) {
                }
                AbstractC20734X.m21226C(interfaceC3756dMo5693b, interfaceC3777yM18075c, c13693c);
                return c17296c;
            case 18:
                C13770k animateTo2 = (C13770k) obj;
                AbstractC16544l.m18094g(animateTo2, "$this$animateTo");
                C6002f0 c6002f0 = animateTo2.f43484e;
                C16524A c16524a = (C16524A) obj2;
                AbstractC14376f.m15833L((C17097f) obj3, 0.0f, C13800b.m15310k(((C13800b) c6002f0.getValue()).f43584a, c16524a.f51261Y), 0L, 13);
                c16524a.f51261Y = ((C13800b) c6002f0.getValue()).f43584a;
                return c17296c;
            case 19:
                ((C6546d) ((C14437f) obj3).f45413Y).m7110o((C16660B) obj2);
                return c17296c;
            case 20:
                C20097d c20097d = (C20097d) obj3;
                AbstractC7885F4.m8175c(c20097d, (C19738o) obj);
                AbstractC16777s0 abstractC16777s0 = (AbstractC16777s0) obj2;
                float fMo502e = ((InterfaceC0161D1) AbstractC21690f.m22204i(abstractC16777s0, AbstractC0187M0.f715q)).mo502e();
                long jM20929b = c20097d.m20929b(AbstractC9125E4.m9659a(fMo502e, fMo502e));
                C20096c c20096c = c20097d.f63634a;
                C20094a[] c20094aArr = c20096c.f63629d;
                AbstractC17678l.m19311r(c20094aArr, null, 0, c20094aArr.length);
                c20096c.f63630e = 0;
                C20096c c20096c2 = c20097d.f63635b;
                C20094a[] c20094aArr2 = c20096c2.f63629d;
                AbstractC17678l.m19311r(c20094aArr2, null, 0, c20094aArr2.length);
                c20096c2.f63630e = 0;
                c20097d.f63636c = 0L;
                C1743k c1743k = abstractC16777s0.f53843F0;
                if (c1743k != null) {
                    C16783u0 c16783u0 = AbstractC16786v0.f53881a;
                    c1743k.mo2524p(new C16706S(AbstractC9125E4.m9659a(Float.isNaN(C7550o.m7902c(jM20929b)) ? 0.0f : C7550o.m7902c(jM20929b), Float.isNaN(C7550o.m7903d(jM20929b)) ? 0.0f : C7550o.m7903d(jM20929b))));
                }
                return c17296c;
            case 21:
                long j10 = ((C16701P) obj).f53514a;
                C16798z0 c16798z0 = (C16798z0) obj2;
                long jM15312m = c16798z0.f53914O0 ? C13800b.m15312m(-1.0f, j10) : C13800b.m15312m(1.0f, j10);
                EnumC16673F0 enumC16673F0 = c16798z0.f53910K0;
                C16783u0 c16783u1 = AbstractC16786v0.f53881a;
                ((C4893t) obj3).m5516a(enumC16673F0 == EnumC16673F0.f53401Y ? C13800b.m15307h(jM15312m) : C13800b.m15306g(jM15312m));
                return c17296c;
            case 22:
                long j11 = ((C16701P) obj).f53514a;
                long jM15301b = ((C16757l1) obj2).f53760d == EnumC16673F0.f53402Z ? C13800b.m15301b(0.0f, 1, j11) : C13800b.m15301b(0.0f, 2, j11);
                C16757l1 c16757l1 = ((C16748i1) obj3).f53725a;
                c16757l1.f53763g = 1;
                InterfaceC14300o0 interfaceC14300o0 = c16757l1.f53758b;
                if (interfaceC14300o0 == null || !(c16757l1.f53757a.mo5258d() || c16757l1.f53757a.mo5257c())) {
                    C16757l1.m18531a(c16757l1, c16757l1.f53764h, jM15301b, 1);
                } else {
                    interfaceC14300o0.mo15581d(jM15301b, c16757l1.f53763g, c16757l1.f53766j);
                }
                return c17296c;
            case 23:
                ((Number) obj).longValue();
                C16698N1 c16698n1 = (C16698N1) obj3;
                float f10 = c16698n1.f53512e;
                c16698n1.f53512e = 0.0f;
                ((InterfaceC1436k) obj2).invoke(Float.valueOf(f10));
                return c17296c;
            case 24:
                C14898e transferableContent = (C14898e) obj;
                AbstractC16544l.m18094g(transferableContent, "transferableContent");
                InterfaceC1436k onInputIntent = (InterfaceC1436k) ((InterfaceC3759g) obj3);
                AbstractC16544l.m18094g(onInputIntent, "onInputIntent");
                InterfaceC20904w analytics = (InterfaceC20904w) obj2;
                AbstractC16544l.m18094g(analytics, "analytics");
                C20857C c20857c = C20857C.f66342x;
                C0169G0 c0169g0 = transferableContent.f46392b;
                analytics.mo21447a(c20857c, AbstractC17660E.m19258c(new C17309l("mimeTypes", c0169g0.f649a.filterMimeTypes("*/*"))));
                ClipDescription clipDescription = c0169g0.f649a;
                if (!clipDescription.hasMimeType("image/*")) {
                    return transferableContent;
                }
                C14089m0 c14089m0 = new C14089m0(5, onInputIntent);
                ClipData clipData = transferableContent.f46391a.f648a;
                if (clipData.getItemCount() != 1) {
                    int itemCount = clipData.getItemCount();
                    ArrayList arrayList2 = null;
                    for (int i12 = 0; i12 < itemCount; i12++) {
                        ClipData.Item itemAt = clipData.getItemAt(i12);
                        if (!((Boolean) c14089m0.invoke(itemAt)).booleanValue()) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(itemAt);
                        }
                    }
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        if (arrayList2.size() == clipData.getItemCount()) {
                            c14898e = transferableContent;
                        } else {
                            ClipDescription clipDescription2 = new ClipDescription(clipDescription);
                            ClipData clipData2 = new ClipData(clipDescription2, (ClipData.Item) AbstractC17680n.m19341Q(arrayList2));
                            int size = arrayList2.size();
                            for (int i13 = 1; i13 < size; i13++) {
                                clipData2.addItem((ClipData.Item) arrayList2.get(i13));
                            }
                            c14898e = new C14898e(new C0166F0(clipData2), new C0169G0(clipDescription2), transferableContent.f46393c, transferableContent.f46394d);
                        }
                    }
                } else if (!((Boolean) c14089m0.invoke(clipData.getItemAt(0))).booleanValue()) {
                    c14898e = transferableContent;
                }
                return c14898e;
            case 25:
                C18265e LazyColumn = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
                List list = (List) obj3;
                LazyColumn.m19803p(list.size(), null, new C1278t(18, list), new C8410b(new C1266h(list, (InterfaceC1436k) obj2, i11), true, -632812321));
                return c17296c;
            case 26:
                C19738o drag = (C19738o) obj;
                AbstractC16544l.m18094g(drag, "drag");
                ((C17113v) obj3).invoke(new C17103l(AbstractC8301I.m8920k((C13800b.m15307h(AbstractC19736m.m20687i(drag, false)) * 0.004f) + 1.0f, 0.1f, 2.0f), ((C19738o) obj2).f62480c));
                drag.m20691a();
                return c17296c;
            case 27:
                C18265e LazyColumn2 = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn2, "$this$LazyColumn");
                ArrayList arrayList3 = ((C17609h) obj3).f56366a;
                LazyColumn2.m19803p(arrayList3.size(), new C1825q0(i10, arrayList3), new C1825q0(12, arrayList3), new C8410b(new C0364y(arrayList3, i10, (LicensesViewModel) obj2), true, -632812321));
                return c17296c;
            case 28:
                AbstractC17640n abstractC17640n = (AbstractC17640n) obj3;
                AbstractC0575H.m1156D(abstractC17640n.f56425a, null, null, new C17639m((AbstractC19694j) obj2, abstractC17640n, null), 3);
                return c17296c;
            default:
                C17718B0 c17718b0 = (C17718B0) obj3;
                View view = (View) obj2;
                if (c17718b0.f56575t == 0) {
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    RunnableC17743X runnableC17743X = c17718b0.f56576u;
                    AbstractC0730K.m1555l(view, runnableC17743X);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(runnableC17743X);
                    AbstractC0738T.m1586n(view, runnableC17743X);
                }
                c17718b0.f56575t++;
                return new C0260j0(c17718b0, i10, view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13775m0(Object obj, int i10, Object obj2) {
        super(1);
        this.f43507Y = i10;
        this.f43508Z = obj;
        this.f43509o0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13775m0(AbstractC17640n abstractC17640n, InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f43507Y = 28;
        this.f43508Z = abstractC17640n;
        this.f43509o0 = (AbstractC19694j) interfaceC1436k;
    }
}
