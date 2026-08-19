package p482Tg;

import af.AbstractC10574c;
import af.C10586n;
import af.C10587o;
import af.C10589q;
import af.C10590r;
import af.C10591s;
import af.InterfaceC10592t;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.DragEvent;
import androidx.compose.p650ui.focus.C10863b;
import androidx.compose.p650ui.platform.AndroidComposeView;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.C11092a0;
import androidx.lifecycle.InterfaceC11112u;
import androidx.lifecycle.RunnableC11090Z;
import bf.C11349D;
import bf.C11352G;
import ck.AbstractC11768e;
import ck.C11766c;
import com.google.protobuf.AbstractC12107L1;
import com.openai.chatgpt.R;
import com.openai.feature.onboarding.LoginViewModel;
import com.openai.feature.subscriptions.SubscriptionsViewModel;
import com.segment.analytics.kotlin.core.Settings;
import io.sentry.android.replay.ViewTreeObserverOnDrawListenerC15303q;
import io.sentry.android.replay.util.InterfaceC15308a;
import io.sentry.android.replay.viewhierarchy.AbstractC15316d;
import io.sentry.android.replay.viewhierarchy.C15314b;
import io.sentry.android.replay.viewhierarchy.C15315c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16556x;
import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p003A1.C0251g0;
import p003A1.ViewOnDragListenerC0204S0;
import p006A4.C0348i;
import p017Af.C0468O;
import p017Af.C0478i;
import p020Ai.C0515d;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0581K;
import p042Bf.C1278t;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p050Bn.C1451e;
import p1081wc.C20868N;
import p1081wc.C20896o;
import p1081wc.C20902u;
import p1081wc.InterfaceC20904w;
import p1095x1.AbstractC21075b0;
import p1095x1.InterfaceC21098s;
import p1135yn.C21555b;
import p1140z1.AbstractC21690f;
import p1140z1.C21658D;
import p1140z1.C21660F;
import p1140z1.EnumC21705m0;
import p1140z1.InterfaceC21707n0;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21891A;
import p1155zi.C21952P1;
import p1155zi.C22013h2;
import p1155zi.C22020j1;
import p1155zi.C22062u;
import p1155zi.EnumC21974X0;
import p124Ei.C2456I;
import p124Ei.C2474R0;
import p153Fn.C2925c;
import p225Im.InterfaceC3759g;
import p269Kh.C4679f;
import p269Kh.C4688o;
import p349O0.C5994b0;
import p349O0.C6002f0;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC7878E5;
import p523V9.AbstractC7885F4;
import p523V9.AbstractC7894G5;
import p523V9.AbstractC8056b6;
import p523V9.AbstractC8063c5;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8111i5;
import p530Vi.C8297E;
import p530Vi.C8312h;
import p533Vl.C8390b;
import p537W0.C8410b;
import p544W9.AbstractC8681n4;
import p553Wh.C8870f;
import p554Wi.C8884k;
import p554Wi.EnumC8881h;
import p554Wi.InterfaceC8882i;
import p562X0.C9012g;
import p562X0.C9013h;
import p563X1.C9037q;
import p571X9.AbstractC9393x3;
import p580Xi.C9519e;
import p586Y0.C9566r;
import p586Y0.C9572x;
import p594Y9.AbstractC9803S2;
import p621Zd.C10282c;
import p623Zf.AbstractC10323s;
import p623Zf.C10320p;
import p624Zg.AbstractC10381m0;
import p624Zg.C10379l0;
import p635a1.InterfaceC10459q;
import p647ak.C10696e1;
import p647ak.C10736w0;
import p693d1.C12989b;
import p693d1.C12992e;
import p693d1.InterfaceC12993f;
import p729ej.C13421l;
import p729ej.C13430u;
import p736f0.C13467E;
import p736f0.C13468F;
import p736f0.C13473K;
import p736f0.C13493k;
import p736f0.EnumC13504v;
import p737f1.C13526r;
import p749fd.C13621f;
import p749fd.C13622g;
import p749fd.C13625j;
import p749fd.EnumC13617b;
import p754fl.C13693c;
import p758g0.C13759e0;
import p758g0.C13770k;
import p759g1.C13803e;
import p772h.C14215F;
import p774h1.AbstractC14348d;
import p774h1.C14336N;
import p774h1.C14343V;
import p774h1.C14353i;
import p774h1.C14365u;
import p774h1.InterfaceC14362r;
import p775h2.AbstractC14376f;
import p795i.C14889c;
import p821j1.C16042g;
import p821j1.C16043h;
import p821j1.InterfaceC16039d;
import p823j3.C16068G;
import p823j3.C16073L;
import p823j3.C16075N;
import p823j3.C16089k;
import p853kd.C16367b;
import p853kd.C16368c;
import p857kl.C16447N;
import p858ko.C16501d;
import p878lo.C17097f;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17792x;
import p936p0.C18265e;
import p972qm.C18777j;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Tg.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C7448e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23571Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f23572Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f23573o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f23574p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7448e(C7439X c7439x, InterfaceC3759g interfaceC3759g, Context context) {
        super(1);
        this.f23571Y = 1;
        this.f23572Z = c7439x;
        this.f23573o0 = interfaceC3759g;
        this.f23574p0 = context;
    }

    /* JADX WARN: Code duplicated, block: B:276:0x081a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v21, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r15v4, types: [Bm.n, sm.j] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v160, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r1v81, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r2v100, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r2v103, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r2v95, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object, mm.i] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        ?? r10;
        boolean z6;
        int i10;
        C16368c c16368c;
        boolean zBooleanValue;
        String str;
        C4688o c4688o;
        C17309l c17309l;
        Integer numMo388z;
        List listM9974d;
        EnumC21705m0 enumC21705m0 = EnumC21705m0.f68877Y;
        int i11 = 4;
        int i12 = 3;
        int i13 = 0;
        c14343v = null;
        C14343V c14343v = null;
        int i14 = 1;
        C17296C c17296c = C17296C.f55119a;
        Object obj2 = this.f23573o0;
        ?? r6 = this.f23574p0;
        Object obj3 = this.f23572Z;
        switch (this.f23571Y) {
            case 0:
                C18265e LazyColumn = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
                C7439X c7439x = (C7439X) obj3;
                C21891A c21891a = c7439x.f23540a;
                if (c21891a != null) {
                    C22013h2 c22013h2 = c21891a.f69416b;
                    String str2 = c22013h2.f69656b;
                    InterfaceC10459q interfaceC10459q = (InterfaceC10459q) r6;
                    if (str2 != null) {
                        r10 = 1;
                        AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C7446c(interfaceC10459q, str2, 0), true, 404633355), 3);
                    } else {
                        r10 = 1;
                    }
                    String str3 = c22013h2.f69657c;
                    if (str3 != null) {
                        AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C7446c(interfaceC10459q, str3, r10), r10, 960884852), 3);
                    }
                    InterfaceC3759g interfaceC3759g = (InterfaceC3759g) obj2;
                    AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C7447d(c7439x, interfaceC3759g, 0), r10, 178218475), 3);
                    AbstractC17792x.m19528k(LazyColumn, null, new C8410b(new C7447d(c7439x, interfaceC3759g, r10), r10, -1875450028), 3);
                }
                return c17296c;
            case 1:
                C18265e LazyColumn2 = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn2, "$this$LazyColumn");
                C7439X c7439x2 = (C7439X) obj3;
                InterfaceC3759g interfaceC3759g2 = (InterfaceC3759g) obj2;
                if (c7439x2.f23546g) {
                    AbstractC17792x.m19528k(LazyColumn2, null, new C8410b(new C7442a(interfaceC3759g2, i11), true, 902912259), 3);
                }
                if (c7439x2.f23543d) {
                    z6 = true;
                    AbstractC17792x.m19528k(LazyColumn2, null, new C8410b(new C7442a(interfaceC3759g2, 5), true, -433445396), 3);
                } else {
                    z6 = true;
                }
                AbstractC17792x.m19528k(LazyColumn2, null, new C8410b(new C7447d(c7439x2, interfaceC3759g2, 2), z6, 1645452926), 3);
                if (c7439x2.f23542c) {
                    AbstractC17792x.m19528k(LazyColumn2, null, new C8410b(new C7447d(c7439x2, interfaceC3759g2, i12), z6, -1813230709), 3);
                }
                AbstractC17792x.m19528k(LazyColumn2, null, new C8410b(new C0468O((Context) r6, 17), true, 183564455), 3);
                return c17296c;
            case 2:
                InterfaceC8882i plugin = (InterfaceC8882i) obj;
                AbstractC16544l.m18094g(plugin, "plugin");
                if (((C8297E) obj3).f25856d.contains(Integer.valueOf(plugin.hashCode()))) {
                    i10 = 2;
                } else {
                    ((LinkedHashSet) r6).add(Integer.valueOf(plugin.hashCode()));
                    i10 = 1;
                }
                plugin.mo7803b((Settings) obj2, i10);
                return c17296c;
            case 3:
                C16525B c16525b = (C16525B) obj3;
                InterfaceC0581K interfaceC0581K = (InterfaceC0581K) c16525b.f51262Y;
                if (interfaceC0581K != null) {
                    interfaceC0581K.mo1275e(null);
                }
                c16525b.f51262Y = AbstractC0575H.m1177f((C2925c) r6, null, new C8390b((AbstractC19694j) obj2, obj, null), 3);
                return c17296c;
            case 4:
                C18265e LazyColumn3 = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn3, "$this$LazyColumn");
                List list = (List) obj3;
                LazyColumn3.m19803p(list.size(), new C1278t(6, list), new C1278t(7, list), new C8410b(new C2474R0(list, (C10282c) r6, (C10282c) obj2, i12), true, -632812321));
                return c17296c;
            case 5:
                Map it = (Map) obj;
                AbstractC16544l.m18094g(it, "it");
                it.put("error", ((Throwable) obj3).toString());
                InterfaceC8882i interfaceC8882i = (InterfaceC8882i) r6;
                if (interfaceC8882i instanceof C9519e) {
                    C9519e c9519e = (C9519e) interfaceC8882i;
                    if (AbstractC16544l.m18089b(c9519e.f28651r0, "")) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(interfaceC8882i.getType());
                        sb2.append('-');
                        sb2.append(interfaceC8882i.getClass());
                        it.put("plugin", sb2.toString());
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        ((C9519e) interfaceC8882i).getClass();
                        sb3.append(EnumC8881h.f27185o0);
                        sb3.append('-');
                        sb3.append(c9519e.f28651r0);
                        it.put("plugin", sb3.toString());
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(interfaceC8882i.getType());
                    sb4.append('-');
                    sb4.append(interfaceC8882i.getClass());
                    it.put("plugin", sb4.toString());
                }
                C8312h c8312h = ((C8884k) obj2).f27193b;
                if (c8312h == null) {
                    AbstractC16544l.m18103p("analytics");
                    throw null;
                }
                it.put("writekey", c8312h.f25902Y.f25915a);
                it.put("message", "Exception executing plugin");
                return c17296c;
            case 6:
                C9013h c9013h = (C9013h) obj3;
                if (c9013h.f27509b.containsKey(r6)) {
                    throw new IllegalArgumentException(AbstractC12107L1.m13824o(r6, "Key ", " was used multiple times ").toString());
                }
                c9013h.f27508a.remove(r6);
                C9012g c9012g = (C9012g) obj2;
                c9013h.f27509b.put(r6, c9012g);
                return new C0348i(c9012g, c9013h, r6, i12);
            case 7:
                InterfaceC14362r interfaceC14362rM15196m = ((InterfaceC16039d) obj).mo17601f0().m15196m();
                C9037q c9037q = (C9037q) obj3;
                if (c9037q.getView().getVisibility() != 8) {
                    c9037q.f27553I0 = true;
                    AndroidComposeView androidComposeView = ((C21658D) r6).f68658u0;
                    AndroidComposeView androidComposeView2 = androidComposeView instanceof AndroidComposeView ? androidComposeView : null;
                    if (androidComposeView2 != null) {
                        Canvas canvasM15725a = AbstractC14348d.m15725a(interfaceC14362rM15196m);
                        androidComposeView2.getAndroidViewsHandler$ui_release().getClass();
                        ((C9037q) obj2).draw(canvasM15725a);
                    }
                    c9037q.f27553I0 = false;
                }
                return c17296c;
            case 8:
                C16447N url = (C16447N) obj;
                AbstractC16544l.m18094g(url, "$this$url");
                AbstractC8681n4.m9374c(url, new String[]{(String) obj3, "user-settings", "oauth/callback"});
                for (Map.Entry entry : r6.entrySet()) {
                    AbstractC8056b6.m8452c((C13693c) obj2, (String) entry.getKey(), (String) entry.getValue());
                }
                return c17296c;
            case 9:
                C18265e LazyColumn4 = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn4, "$this$LazyColumn");
                AbstractC10381m0 abstractC10381m0 = (AbstractC10381m0) obj3;
                List list2 = ((C10379l0) abstractC10381m0).f30752a;
                LazyColumn4.m19803p(list2.size(), new C1278t(11, list2), new C1278t(12, list2), new C8410b(new C2456I(4, abstractC10381m0, (SubscriptionsViewModel) r6, (AbstractActivityC17375g) obj2, list2), true, -632812321));
                return c17296c;
            case 10:
                C18265e LazyColumn5 = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn5, "$this$LazyColumn");
                C11349D c11349d = (C11349D) obj3;
                InterfaceC3759g interfaceC3759g3 = (InterfaceC3759g) obj2;
                AbstractC17792x.m19528k(LazyColumn5, null, new C8410b(new C10586n(c11349d, interfaceC3759g3, 0), true, -289513825), 3);
                if (c11349d.f34320c != null) {
                    AbstractC17792x.m19528k(LazyColumn5, null, new C8410b(new C0468O(c11349d, 21), true, -471394502), 3);
                }
                C10589q c10589q = (C10589q) r6;
                List list3 = c10589q.f31440b.f34348c;
                List list4 = list3;
                if (list4 != null && !list4.isEmpty()) {
                    AbstractC17792x.m19528k(LazyColumn5, null, new C8410b(new C10587o(0, list3), true, -70927375), 3);
                }
                if (!c11349d.f34341x.isEmpty()) {
                    AbstractC17792x.m19528k(LazyColumn5, null, AbstractC10574c.f31403b, 3);
                    AbstractC17792x.m19528k(LazyColumn5, null, new C8410b(new C10586n(c11349d, interfaceC3759g3, 1), true, 923967145), 3);
                }
                C11352G c11352g = c10589q.f31440b;
                List list5 = c11352g.f34349d;
                List list6 = list5;
                if (list6 != null && !list6.isEmpty()) {
                    AbstractC17792x.m19528k(LazyColumn5, null, AbstractC10574c.f31404c, 3);
                    AbstractC17792x.m19528k(LazyColumn5, null, new C8410b(new C10587o(1, list5), true, -1545364374), 3);
                }
                List listM10426b = AbstractC9803S2.m10426b(c11352g.f34347b, c10589q.f31441c);
                if (!listM10426b.isEmpty()) {
                    AbstractC17792x.m19528k(LazyColumn5, null, AbstractC10574c.f31405d, 3);
                    AbstractC17792x.m19528k(LazyColumn5, null, new C8410b(new C10587o(2, listM10426b), true, 280271403), 3);
                }
                AbstractC17792x.m19528k(LazyColumn5, null, AbstractC10574c.f31406e, 3);
                return c17296c;
            case 11:
                InterfaceC10592t effect = (InterfaceC10592t) obj;
                AbstractC16544l.m18094g(effect, "effect");
                if (effect.equals(C10591s.f31443a)) {
                    C8870f c8870f = (C8870f) obj3;
                    C8870f.m9547b(c8870f, R.string.gizmo_rating_submitted);
                    c8870f.f27149b.m12195o();
                } else if ((effect instanceof C10590r) && (c16368c = (C16368c) r6) != null) {
                    C10590r c10590r = (C10590r) effect;
                    AbstractActivityC17375g activity = (AbstractActivityC17375g) obj2;
                    AbstractC16544l.m18094g(activity, "activity");
                    if (c16368c.f50843d && c10590r.f31442a >= 4) {
                        AbstractC0575H.m1156D(c16368c.f50840a, null, null, new C16367b(activity, c16368c, null), 3);
                    }
                }
                return c17296c;
            case 12:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                ((C10696e1) obj3).m11024h((C13421l) r6, new C10736w0(((C11766c) ((AbstractC11768e) obj2)).f35687a));
                return c17296c;
            case 13:
                C18777j c18777j = C18777j.f59682Y;
                C1451e c1451e = (C1451e) obj3;
                C11092a0 c11092a0 = (C11092a0) obj2;
                AbstractC11105n abstractC11105n = (AbstractC11105n) r6;
                if (c1451e.mo1143X0(c18777j)) {
                    c1451e.mo872V0(c18777j, new RunnableC11090Z(abstractC11105n, c11092a0, 0));
                } else {
                    abstractC11105n.mo7808c(c11092a0);
                }
                return c17296c;
            case 14:
                C12992e c12992e = (C12992e) obj;
                if (!c12992e.f30972y0) {
                    return EnumC21705m0.f68878Z;
                }
                if (c12992e.f41244B0 != null) {
                    AbstractC8111i5.m8592c("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                    throw null;
                }
                InterfaceC12993f interfaceC12993f = (InterfaceC12993f) c12992e.f41245z0.invoke((C12989b) obj3);
                c12992e.f41244B0 = interfaceC12993f;
                boolean z10 = interfaceC12993f != null;
                if (z10) {
                    ((ViewOnDragListenerC0204S0) AbstractC21690f.m22218w((C12992e) r6).getDragAndDropManager()).f789b.add(c12992e);
                }
                C16556x c16556x = (C16556x) obj2;
                c16556x.f51285Y = c16556x.f51285Y || z10;
                return enumC21705m0;
            case 15:
                InterfaceC21707n0 interfaceC21707n0 = (InterfaceC21707n0) obj;
                C12992e c12992e2 = (C12992e) interfaceC21707n0;
                if (!((ViewOnDragListenerC0204S0) AbstractC21690f.m22218w((C12992e) r6).getDragAndDropManager()).f789b.contains(c12992e2)) {
                    return enumC21705m0;
                }
                DragEvent dragEvent = ((C12989b) obj2).f41241a;
                if (!AbstractC7885F4.m8174b(c12992e2, AbstractC8088f6.m8536b(dragEvent.getX(), dragEvent.getY()))) {
                    return enumC21705m0;
                }
                ((C16525B) obj3).f51262Y = interfaceC21707n0;
                return EnumC21705m0.f68879o0;
            case 16:
                String authenticateType = (String) obj;
                AbstractC16544l.m18094g(authenticateType, "authenticateType");
                ((InterfaceC20904w) obj3).mo21447a(C20902u.f66623d, AbstractC17659D.m19248j(r6, AbstractC0168G.m535x("authenticate", authenticateType)));
                ((InterfaceC1426a) obj2).invoke();
                return c17296c;
            case 17:
                C0515d c0515d = (C0515d) obj;
                String str4 = (String) obj2;
                AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) r6;
                AbstractC21955Q1 abstractC21955Q2 = (AbstractC21955Q1) obj3;
                return (c0515d != null ? C0515d.m1125a(c0515d, null, AbstractC8063c5.m8468k((C22013h2) ((C21952P1) abstractC21955Q2).f69511a, (C22062u) ((C21952P1) abstractC21955Q1).f69511a), 1) : new C0515d(str4, AbstractC8063c5.m8468k((C22013h2) ((C21952P1) abstractC21955Q2).f69511a, (C22062u) ((C21952P1) abstractC21955Q1).f69511a))).m1127c(str4, "combinedFlow");
            case 18:
                return new C0348i((C9566r) obj3, r6, (C13493k) obj2);
            case 19:
                C14336N c14336n = (C14336N) obj;
                C13759e0 c13759e0 = (C13759e0) obj3;
                c14336n.m15649a(c13759e0 != null ? ((Number) c13759e0.getValue()).floatValue() : 1.0f);
                C13759e0 c13759e1 = (C13759e0) r6;
                c14336n.m15655g(c13759e1 != null ? ((Number) c13759e1.getValue()).floatValue() : 1.0f);
                c14336n.m15656h(c13759e1 != null ? ((Number) c13759e1.getValue()).floatValue() : 1.0f);
                C13759e0 c13759e2 = (C13759e0) obj2;
                c14336n.m15660n(c13759e2 != null ? ((C14343V) c13759e2.getValue()).f45025a : C14343V.f45023b);
                return c17296c;
            case 20:
                int iOrdinal = ((EnumC13504v) obj).ordinal();
                C13467E c13467e = (C13467E) r6;
                C13468F c13468f = (C13468F) obj2;
                if (iOrdinal == 0) {
                    C13473K c13473k = c13467e.f42622a.f42663d;
                    if (c13473k != null) {
                        c14343v = new C14343V(c13473k.f42634b);
                    } else {
                        C13473K c13473k2 = c13468f.f42625a.f42663d;
                        if (c13473k2 != null) {
                            c14343v = new C14343V(c13473k2.f42634b);
                        }
                    }
                } else if (iOrdinal == 1) {
                    c14343v = (C14343V) obj3;
                } else {
                    if (iOrdinal != 2) {
                        throw new C0644w();
                    }
                    C13473K c13473k3 = c13468f.f42625a.f42663d;
                    if (c13473k3 != null) {
                        c14343v = new C14343V(c13473k3.f42634b);
                    } else {
                        C13473K c13473k4 = c13467e.f42622a.f42663d;
                        if (c13473k4 != null) {
                            c14343v = new C14343V(c13473k4.f42634b);
                        }
                    }
                }
                return new C14343V(c14343v != null ? c14343v.f45025a : C14343V.f45023b);
            case 21:
                C13526r c13526r = (C13526r) obj;
                if (AbstractC16544l.m18089b(c13526r, (C13526r) obj3)) {
                    zBooleanValue = false;
                } else {
                    if (AbstractC16544l.m18089b(c13526r, ((C10863b) r6).f32698f)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((AbstractC16546n) obj2).invoke(c13526r)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 22:
                InterfaceC21098s coordinates = (InterfaceC21098s) obj;
                AbstractC16544l.m18094g(coordinates, "coordinates");
                ((InterfaceC5985X) r6).setValue(AbstractC21075b0.m21564e(coordinates));
                ((C5994b0) obj2).m6410h(((int) (coordinates.mo21524k() >> 32)) / ((int) (coordinates.mo21524k() & 4294967295L)));
                ((C13625j) obj3).m15147b(coordinates.mo21524k());
                return c17296c;
            case 23:
                C21660F drawWithContent = (C21660F) obj;
                AbstractC16544l.m18094g(drawWithContent, "$this$drawWithContent");
                drawWithContent.m22080a();
                boolean zBooleanValue2 = ((Boolean) ((InterfaceC5985X) obj2).getValue()).booleanValue();
                EnumC13617b enumC13617b = (EnumC13617b) obj3;
                int iOrdinal2 = enumC13617b.ordinal();
                C13622g c13622g = C13622g.f43035Z;
                C9566r paths = ((C13625j) r6).f43049b;
                if (iOrdinal2 == 0) {
                    ListIterator listIterator = paths.listIterator();
                    while (true) {
                        C9572x c9572x = (C9572x) listIterator;
                        if (c9572x.hasNext()) {
                            C13621f c13621f = (C13621f) c9572x.next();
                            AbstractC14376f.m15848n(drawWithContent, new C14353i(AbstractC7878E5.m8161b(c13621f, c13622g)), enumC13617b.f43013Y, 0.0f, new C16043h(c13621f.f43032b, 0.0f, 1, 1, 18), 52);
                        }
                    }
                } else if (iOrdinal2 == 1) {
                    AbstractC16544l.m18094g(paths, "paths");
                    Path path = new Path();
                    ListIterator listIterator2 = paths.listIterator();
                    int i15 = 0;
                    while (true) {
                        C9572x c9572x2 = (C9572x) listIterator2;
                        if (c9572x2.hasNext()) {
                            Object next = c9572x2.next();
                            int i16 = i15 + 1;
                            if (i15 < 0) {
                                AbstractC17681o.m19388q();
                                throw null;
                            }
                            C13621f c13621f2 = (C13621f) next;
                            Path pathM8191b = AbstractC7894G5.m8191b(AbstractC7878E5.m8161b(c13621f2, c13622g), c13621f2.f43032b);
                            if (i15 == 0) {
                                path.set(pathM8191b);
                            } else {
                                path.op(pathM8191b, Path.Op.UNION);
                            }
                            i15 = i16;
                        } else {
                            AbstractC14376f.m15848n(drawWithContent, new C14353i(path), enumC13617b.f43013Y, 0.0f, null, 60);
                            if (!zBooleanValue2) {
                                Path pathM8191b2 = AbstractC7894G5.m8191b(path, 0.0f);
                                RectF rectF = new RectF();
                                pathM8191b2.computeBounds(rectF, true);
                                Region region = new Region();
                                Rect rect = new Rect();
                                rectF.roundOut(rect);
                                region.setPath(pathM8191b2, new Region(rect));
                                Path boundaryPath = region.getBoundaryPath();
                                AbstractC16544l.m18093f(boundaryPath, "getBoundaryPath(...)");
                                PathMeasure pathMeasure = new PathMeasure(boundaryPath, false);
                                float[] fArr = new float[2];
                                for (boolean zNextContour = true; zNextContour; zNextContour = pathMeasure.nextContour()) {
                                    for (float f10 = 0.0f; f10 < pathMeasure.getLength(); f10 += 8.0f) {
                                        pathMeasure.getPosTan(f10, fArr, null);
                                        drawWithContent.mo17591U(C14365u.f45055e, (112 & 2) != 0 ? C13803e.m15332d(drawWithContent.mo17602i()) / 2.0f : 1.5f, (112 & 4) != 0 ? drawWithContent.mo17604o0() : AbstractC8088f6.m8536b(fArr[0], fArr[1]), (112 & 8) != 0 ? 1.0f : 0.8f, (112 & 16) != 0 ? C16042g.f49483a : null, null, 3);
                                    }
                                }
                            }
                        }
                    }
                }
                return c17296c;
            case 24:
                C4679f categoryAndModels = (C4679f) obj;
                AbstractC16544l.m18094g(categoryAndModels, "categoryAndModels");
                C4679f c4679f = (C4679f) obj3;
                if (c4679f == null || (c4688o = c4679f.f15230c) == null || (str = c4688o.f15253b) == null) {
                    str = "unknown";
                }
                C4688o c4688o2 = categoryAndModels.f15230c;
                ((InterfaceC20904w) r6).mo21447a(C20896o.f66601e, AbstractC17659D.m19244f(new C17309l("from_model_slug", str), new C17309l("to_model_slug", c4688o2.f15253b)));
                ((InterfaceC1436k) obj2).invoke(new C22020j1(c4688o2.f15253b));
                return c17296c;
            case 25:
                C14889c c14889c = (C14889c) obj2;
                ((C14215F) obj3).m15516a((InterfaceC11112u) r6, c14889c);
                return new C0251g0(c14889c, 9);
            case 26:
                AbstractC10323s intent = (AbstractC10323s) obj;
                AbstractC16544l.m18094g(intent, "intent");
                if (intent instanceof C10320p) {
                    ((InterfaceC20904w) obj3).mo21447a(C20868N.f66432d, AbstractC17659D.m19244f(new C17309l("feature", ((EnumC21974X0) ((InterfaceC5985X) obj2).getValue()).f69565Y), new C17309l("connection", ((C10320p) intent).f30633a.mo14946a())));
                }
                ((LoginViewModel) r6).m14395k(intent);
                return c17296c;
            case 27:
                AbstractC15316d node = (AbstractC15316d) obj;
                AbstractC16544l.m18094g(node, "node");
                if (node.f47846d && node.f47843a > 0 && node.f47844b > 0) {
                    Rect rect2 = node.f47847e;
                    if (rect2 == null) {
                        return Boolean.FALSE;
                    }
                    ViewTreeObserverOnDrawListenerC15303q viewTreeObserverOnDrawListenerC15303q = (ViewTreeObserverOnDrawListenerC15303q) obj3;
                    if (node instanceof C15314b) {
                        List listM9974d2 = AbstractC9393x3.m9974d(rect2);
                        viewTreeObserverOnDrawListenerC15303q.getClass();
                        Rect rect3 = new Rect(rect2);
                        RectF rectF2 = new RectF(rect3);
                        ((Matrix) viewTreeObserverOnDrawListenerC15303q.f47809v0.getValue()).mapRect(rectF2);
                        rectF2.round(rect3);
                        ((Canvas) viewTreeObserverOnDrawListenerC15303q.f47808u0.getValue()).drawBitmap((Bitmap) r6, rect3, new Rect(0, 0, 1, 1), (Paint) null);
                        c17309l = new C17309l(listM9974d2, Integer.valueOf(((Bitmap) viewTreeObserverOnDrawListenerC15303q.f47807t0.getValue()).getPixel(0, 0)));
                    } else if (node instanceof C15315c) {
                        C15315c c15315c = (C15315c) node;
                        InterfaceC15308a interfaceC15308a = c15315c.f47839g;
                        int iIntValue = ((interfaceC15308a == null || (numMo388z = interfaceC15308a.mo388z()) == null) && (numMo388z = c15315c.f47840h) == null) ? -16777216 : numMo388z.intValue();
                        if (interfaceC15308a == null) {
                            listM9974d = AbstractC9393x3.m9974d(rect2);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            int lineCount = interfaceC15308a.getLineCount();
                            int i17 = 0;
                            while (i17 < lineCount) {
                                int iMo375l = (int) interfaceC15308a.mo375l(i17, interfaceC15308a.mo384v(i17));
                                int iMo363J = interfaceC15308a.mo363J(i17);
                                int iMo357A = interfaceC15308a.mo357A(i17);
                                int iMo375l2 = (int) interfaceC15308a.mo375l(i17, (iMo357A - iMo363J) + (iMo363J > 0 ? i14 : i13));
                                if (iMo375l2 == 0 && iMo357A > 0) {
                                    iMo375l2 = ((int) interfaceC15308a.mo375l(i17, iMo357A - i14)) + i14;
                                }
                                int iMo374k = interfaceC15308a.mo374k(i17);
                                int iMo381r = interfaceC15308a.mo381r(i17);
                                Rect rect4 = new Rect();
                                int i18 = rect2.left + c15315c.f47841i + iMo375l;
                                rect4.left = i18;
                                rect4.right = (iMo375l2 - iMo375l) + i18;
                                int i19 = rect2.top + c15315c.f47842j + iMo374k;
                                rect4.top = i19;
                                rect4.bottom = (iMo381r - iMo374k) + i19;
                                arrayList.add(rect4);
                                i17++;
                                i14 = 1;
                                i13 = 0;
                            }
                            listM9974d = arrayList;
                        }
                        c17309l = new C17309l(listM9974d, Integer.valueOf(iIntValue));
                    } else {
                        c17309l = new C17309l(AbstractC9393x3.m9974d(rect2), -16777216);
                    }
                    List list7 = (List) c17309l.f55136Y;
                    ((Paint) viewTreeObserverOnDrawListenerC15303q.f47806s0.getValue()).setColor(((Number) c17309l.f55137Z).intValue());
                    Iterator it2 = list7.iterator();
                    while (it2.hasNext()) {
                        ((Canvas) obj2).drawRoundRect(new RectF((Rect) it2.next()), 10.0f, 10.0f, (Paint) viewTreeObserverOnDrawListenerC15303q.f47806s0.getValue());
                    }
                }
                return Boolean.TRUE;
            case 28:
                C16075N c16075n = (C16075N) obj3;
                C16073L c16073l = (C16073L) r6;
                if (C21555b.m21833c(c16075n.m17643a(), c16073l.f49769b) < 0) {
                    AtomicReference atomicReference = c16075n.f49778Z;
                    C0478i c0478i = new C0478i(c16073l.f49769b, i11);
                    while (true) {
                        Object obj4 = atomicReference.get();
                        Object objInvoke = c0478i.invoke(obj4);
                        do {
                            if (atomicReference.compareAndSet(obj4, objInvoke)) {
                            }
                        } while (atomicReference.get() == obj4);
                    }
                }
                AbstractC0575H.m1156D(c16075n, null, null, new C16068G((C16089k) obj2, null), 3);
                return c17296c;
            default:
                C13770k animateTo = (C13770k) obj;
                AbstractC16544l.m18094g(animateTo, "$this$animateTo");
                C16501d c16501d = (C16501d) obj3;
                C16557y c16557y = (C16557y) r6;
                float f11 = c16557y.f51286Y;
                C6002f0 c6002f0 = animateTo.f43484e;
                AbstractC14376f.m15833L((C17097f) obj2, f11 == 0.0f ? 1.0f : ((Number) c6002f0.getValue()).floatValue() / c16557y.f51286Y, 0L, c16501d.f51186c, 6);
                c16557y.f51286Y = ((Number) c6002f0.getValue()).floatValue();
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7448e(C13526r c13526r, C10863b c10863b, InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f23571Y = 21;
        this.f23572Z = c13526r;
        this.f23574p0 = c10863b;
        this.f23573o0 = (AbstractC16546n) interfaceC1436k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7448e(Object obj, Object obj2, Object obj3, int i10) {
        super(1);
        this.f23571Y = i10;
        this.f23572Z = obj;
        this.f23574p0 = obj2;
        this.f23573o0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7448e(C16525B c16525b, C2925c c2925c, InterfaceC1439n interfaceC1439n) {
        super(1);
        this.f23571Y = 3;
        this.f23572Z = c16525b;
        this.f23574p0 = c2925c;
        this.f23573o0 = (AbstractC19694j) interfaceC1439n;
    }
}
