package p402Qc;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bf.C11370Z;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.protobuf.AbstractC12107L1;
import com.openai.chatgpt.R;
import com.openai.feature.subscriptions.ChoosePlanViewModel;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import io.sentry.clientreport.C15333a;
import io.sentry.internal.debugmeta.C15384c;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mo.C17327D;
import no.AbstractC17708b;
import p003A1.C0251g0;
import p017Af.C0485p;
import p021Aj.C0528m;
import p030B2.C0794y0;
import p046Bk.ViewOnClickListenerC1330I;
import p049Bm.InterfaceC1436k;
import p1071w0.InterfaceC20744d0;
import p1140z1.C21658D;
import p1155zi.C21897B1;
import p144Fe.AbstractC2721a;
import p160G5.p161rK.TVCuK;
import p178H.C3169s;
import p197Hj.C3457c;
import p214Ib.C3676s;
import p214Ib.C3678u;
import p247Jj.C4435i0;
import p273Kl.C4714D;
import p349O0.C5950F;
import p349O0.C5997d;
import p349O0.InterfaceC5959J0;
import p349O0.InterfaceC5985X;
import p364Oh.C6226E;
import p381Pe.C6397h;
import p396Q4.InterfaceC6571a;
import p408Qj.AbstractC6746l;
import p408Qj.C6736b;
import p408Qj.C6739e;
import p408Qj.C6745k;
import p408Qj.C6748n;
import p408Qj.C6749o;
import p408Qj.ViewOnAttachStateChangeListenerC6735a;
import p429Re.C6877k;
import p433Rj.C6908a;
import p444S4.C7005k;
import p492U1.InterfaceC7537b;
import p506Ug.C7671f;
import p523V9.AbstractC8040Z5;
import p523V9.AbstractC8215v5;
import p530Vi.C8312h;
import p530Vi.C8317m;
import p531Vj.C8360c;
import p531Vj.C8364e;
import p531Vj.C8366f;
import p531Vj.C8369h;
import p531Vj.ViewOnClickListenerC8358b;
import p537W0.C8410b;
import p542W7.C8439c;
import p544W9.AbstractC8681n4;
import p544W9.AbstractC8682o;
import p547Wc.C8775T;
import p547Wc.EnumC8776U;
import p554Wi.EnumC8881h;
import p554Wi.InterfaceC8882i;
import p555Wj.C8886b;
import p556Wk.C8922f;
import p562X0.C9013h;
import p562X0.InterfaceC9016k;
import p562X0.InterfaceC9019n;
import p580Xi.C9519e;
import p586Y0.C9570v;
import p586Y0.C9571w;
import p586Y0.InterfaceC9564p;
import p594Y9.AbstractC9710C4;
import p594Y9.AbstractC9722E4;
import p603Yj.C10075h;
import p624Zg.C10358b;
import p628Zk.C10410i;
import p628Zk.InterfaceC10407f;
import p658b5.C11232c;
import p690cp.AbstractC12935u;
import p690cp.C12912C;
import p692d0.C12948A;
import p697d5.C13027j;
import p729ej.C13430u;
import p737f1.InterfaceC13515g;
import p765g7.InterfaceC13823a;
import p825j5.C16124a;
import p857kl.AbstractC16435B;
import p857kl.AbstractC16449P;
import p857kl.C16447N;
import p857kl.C16450Q;
import p857kl.C16477y;
import p862l2.C16806e;
import p893n.AbstractActivityC17375g;
import p911o0.AbstractC17792x;
import p936p0.C18265e;
import p974qo.C18792h;
import p979r2.C18862c;

/* JADX INFO: renamed from: Qc.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C6593i extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21300Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f21301Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6593i(Object obj, int i10) {
        super(1);
        this.f21300Y = i10;
        this.f21301Z = obj;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x014b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int iM8408d;
        Integer backgroundColorValue;
        int iM8408d2;
        Integer backgroundColorValue2;
        int i10 = 5;
        int i11 = 6;
        int i12 = 2;
        Object objMo3665b = null;
        boolean z6 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        char c9 = 1;
        char c10 = 1;
        char c11 = 1;
        switch (this.f21300Y) {
            case 0:
                C16124a cursor = (C16124a) obj;
                AbstractC16544l.m18094g(cursor, "cursor");
                C6589e c6589e = (C6589e) this.f21301Z;
                Object obj2 = ((C15384c) c6589e.f21290o0).f47967Z;
                String strM17679a = cursor.m17679a(0);
                AbstractC16544l.m18091d(strM17679a);
                C15384c c15384c = (C15384c) c6589e.f21290o0;
                c15384c.getClass();
                C11232c c11232c = AbstractC2721a.f8363a;
                String strM17679a2 = cursor.m17679a(1);
                AbstractC16544l.m18091d(strM17679a2);
                C15333a c15333a = (C15333a) c15384c.f47968o0;
                String strM17679a3 = cursor.m17679a(2);
                AbstractC16544l.m18091d(strM17679a3);
                C6397h messageNode = (C6397h) c15333a.m16551b(strM17679a3);
                AbstractC16544l.m18094g(messageNode, "messageNode");
                return new C6591g(strM17679a, strM17679a2, messageNode);
            case 1:
                C6908a it = (C6908a) obj;
                AbstractC16544l.m18094g(it, "it");
                C6739e c6739e = (C6739e) this.f21301Z;
                c6739e.getClass();
                FrameLayout frameLayout = it.f22147b;
                BottomSheetBehavior bottomSheetBehaviorM13584v = BottomSheetBehavior.m13584v(frameLayout);
                AbstractC16544l.m18093f(bottomSheetBehaviorM13584v, "from(...)");
                C3457c c3457c = new C3457c(c6739e, 29);
                View view = it.f22154i;
                AbstractC9710C4.m10303a(bottomSheetBehaviorM13584v, c3457c, frameLayout, null, view);
                ViewOnAttachStateChangeListenerC6735a viewOnAttachStateChangeListenerC6735a = new ViewOnAttachStateChangeListenerC6735a(bottomSheetBehaviorM13584v, objArr2 == true ? 1 : 0);
                CoordinatorLayout coordinatorLayout = it.f22146a;
                coordinatorLayout.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC6735a);
                it.f22153h.setOnClickListener(new ViewOnClickListenerC1330I(bottomSheetBehaviorM13584v, 4));
                view.setOnClickListener(new ViewOnClickListenerC1330I(bottomSheetBehaviorM13584v, i10));
                AbstractC8682o.m9380c(new C6736b(bottomSheetBehaviorM13584v, objArr == true ? 1 : 0), frameLayout);
                StepStyle stepStyle = c6739e.f21633Y;
                if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
                    Context context = coordinatorLayout.getContext();
                    AbstractC16544l.m18093f(context, "getContext(...)");
                    iM8408d = AbstractC8040Z5.m8408d(context, R.attr.colorSurface);
                } else {
                    iM8408d = backgroundColorValue.intValue();
                }
                coordinatorLayout.setTag(R.id.pi2_background_color_hint, Integer.valueOf(iM8408d));
                AbstractC9722E4.m10313a(new C4714D(it, 18, c6739e), it.f22149d);
                return new C0528m(c6739e, c9 == true ? 1 : 0, it);
            case 2:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                Parcelable parcelable = ((C6745k) ((AbstractC6746l) this.f21301Z)).f21650Y;
                AbstractC16544l.m18092e(parcelable, "null cannot be cast to non-null type OutputT of com.withpersona.sdk2.inquiry.modal.ModalWorkflow");
                action.m14964a(parcelable);
                return C17296C.f55119a;
            case 3:
                Parcelable output = (Parcelable) obj;
                AbstractC16544l.m18094g(output, "output");
                boolean z10 = output instanceof C4435i0;
                C6749o c6749o = (C6749o) this.f21301Z;
                if (z10) {
                    return ((C4435i0) output).f14444t0 ? AbstractC8215v5.m8839a(c6749o, new C6748n(output, objArr3 == true ? 1 : 0)) : AbstractC8215v5.m8839a(c6749o, new C6748n(output, c10 == true ? 1 : 0));
                }
                return AbstractC8215v5.m8839a(c6749o, new C6748n(output, i12));
            case 4:
                C18265e LazyColumn = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
                C6877k c6877k = (C6877k) this.f21301Z;
                AbstractC17792x.m19529l(LazyColumn, c6877k.f22056e.size(), null, new C8410b(new C0485p(c6877k, 8), true, -1825347850), 6);
                return C17296C.f55119a;
            case 5:
                C16447N url = (C16447N) obj;
                AbstractC16544l.m18094g(url, "$this$url");
                AbstractC8681n4.m9374c(url, new String[]{((C7671f) this.f21301Z).f24191a});
                return C17296C.f55119a;
            case 6:
                Throwable th2 = (Throwable) obj;
                C7005k c7005k = (C7005k) this.f21301Z;
                if (th2 == null) {
                    if (!c7005k.f22413Y.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th2 instanceof CancellationException) {
                    c7005k.f22413Y.cancel(true);
                } else {
                    C13027j c13027j = c7005k.f22413Y;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    c13027j.m14770l(th2);
                }
                return C17296C.f55119a;
            case 7:
                String property = (String) obj;
                AbstractC16544l.m18094g(property, "property");
                return ((C3678u) ((C3676s) ((C3676s) this.f21301Z).f11174Y.get(property)).f11174Y.get(ParameterNames.f31999ID)).mo4384r();
            case 8:
                C10410i install = (C10410i) obj;
                AbstractC16544l.m18094g(install, "$this$install");
                InterfaceC10407f interfaceC10407f = (InterfaceC10407f) this.f21301Z;
                AbstractC16544l.m18094g(interfaceC10407f, "<set-?>");
                install.f30850b = interfaceC10407f;
                return C17296C.f55119a;
            case 9:
                C8922f defaultRequest = (C8922f) obj;
                AbstractC16544l.m18094g(defaultRequest, "$this$defaultRequest");
                C6226E c6226e = (C6226E) this.f21301Z;
                C16447N c16447n = defaultRequest.f27293b;
                C16450Q c16450q = c6226e.f20270b;
                if (c16450q != null) {
                    c16447n.getClass();
                    c16447n.f51021d = c16450q;
                }
                AbstractC16449P.m18026b(c16447n, "https://android.chat.openai.com/backend-api/");
                String str = c6226e.f20269a;
                AbstractC16544l.m18094g(str, TVCuK.DPbLime);
                List list = AbstractC16435B.f50983a;
                C16477y c16477y = defaultRequest.f27292a;
                c16477y.m4522M(SIPHeaderNames.USER_AGENT, str);
                for (Map.Entry entry : c6226e.f20271c.entrySet()) {
                    c16477y.m4529e((String) entry.getKey(), (String) entry.getValue());
                }
                return C17296C.f55119a;
            case 10:
                C5950F DisposableEffect = (C5950F) obj;
                AbstractC16544l.m18094g(DisposableEffect, "$this$DisposableEffect");
                AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) this.f21301Z;
                abstractActivityC17375g.getWindow().addFlags(128);
                return new C0251g0(abstractActivityC17375g, i10);
            case 11:
                AbstractC12935u it2 = (AbstractC12935u) obj;
                AbstractC16544l.m18094g(it2, "it");
                return Boolean.valueOf(!it2.equals((C12912C) this.f21301Z));
            case 12:
                Map it3 = (Map) obj;
                AbstractC16544l.m18094g(it3, "it");
                it3.put("message", "configured");
                C8312h c8312h = (C8312h) this.f21301Z;
                it3.put("apihost", c8312h.f25902Y.f25927m);
                C8317m c8317m = c8312h.f25902Y;
                it3.put("cdnhost", c8317m.f25928n);
                it3.put("flush", "at:" + c8317m.f25922h + " int:" + c8317m.f25923i + " pol:" + c8317m.f25924j.size());
                StringBuilder sb2 = new StringBuilder("seg:");
                sb2.append(c8317m.f25926l);
                it3.put("config", sb2.toString());
                return C17296C.f55119a;
            case 13:
                C8886b it4 = (C8886b) obj;
                AbstractC16544l.m18094g(it4, "it");
                C8364e c8364e = (C8364e) this.f21301Z;
                c8364e.getClass();
                FrameLayout frameLayout2 = it4.f27196b;
                BottomSheetBehavior bottomSheetBehaviorM13584v2 = BottomSheetBehavior.m13584v(frameLayout2);
                AbstractC16544l.m18093f(bottomSheetBehaviorM13584v2, "from(...)");
                C8360c c8360c = new C8360c(c8364e, objArr4 == true ? 1 : 0);
                View view2 = it4.f27202h;
                AbstractC9710C4.m10303a(bottomSheetBehaviorM13584v2, c8360c, frameLayout2, null, view2);
                ViewOnAttachStateChangeListenerC6735a viewOnAttachStateChangeListenerC6735a2 = new ViewOnAttachStateChangeListenerC6735a(bottomSheetBehaviorM13584v2, c11 == true ? 1 : 0);
                CoordinatorLayout coordinatorLayout2 = it4.f27195a;
                coordinatorLayout2.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC6735a2);
                frameLayout2.setOnClickListener(new ViewOnClickListenerC8358b());
                view2.setOnClickListener(new ViewOnClickListenerC1330I(bottomSheetBehaviorM13584v2, i11));
                StepStyle stepStyle2 = c8364e.f26053p0;
                if (stepStyle2 == null || (backgroundColorValue2 = stepStyle2.getBackgroundColorValue()) == null) {
                    Context context2 = coordinatorLayout2.getContext();
                    AbstractC16544l.m18093f(context2, "getContext(...)");
                    iM8408d2 = AbstractC8040Z5.m8408d(context2, R.attr.colorSurface);
                } else {
                    iM8408d2 = backgroundColorValue2.intValue();
                }
                coordinatorLayout2.setTag(R.id.pi2_background_color_hint, Integer.valueOf(iM8408d2));
                return new C0528m(c8364e, i12, it4);
            case 14:
                InterfaceC6571a binding = (InterfaceC6571a) obj;
                AbstractC16544l.m18094g(binding, "binding");
                return new C8366f(binding, (C8369h) this.f21301Z, objArr5 == true ? 1 : 0);
            case 15:
                ((C18792h) this.f21301Z).cancel();
                return C17296C.f55119a;
            case 16:
                AbstractC16544l.m18094g((Throwable) obj, "it");
                AbstractC17708b.m19412d((C17327D) this.f21301Z);
                return C17296C.f55119a;
            case 17:
                return ((C3169s) this.f21301Z).f9532j;
            case 18:
                InterfaceC13823a it5 = (InterfaceC13823a) obj;
                AbstractC16544l.m18094g(it5, "it");
                ((C8439c) this.f21301Z).mo7711d(it5);
                return C17296C.f55119a;
            case 19:
                EnumC8776U sidebarState = (EnumC8776U) obj;
                AbstractC16544l.m18094g(sidebarState, "sidebarState");
                if (sidebarState != EnumC8776U.f26771o0) {
                    return Boolean.TRUE;
                }
                C8775T c8775t = (C8775T) this.f21301Z;
                if (c8775t.f26767a) {
                    c8775t.f26767a = false;
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            case 20:
                InterfaceC20744d0 $receiver = (InterfaceC20744d0) obj;
                AbstractC16544l.m18094g($receiver, "$this$$receiver");
                AbstractC12107L1.m13813d((InterfaceC13515g) this.f21301Z);
                return C17296C.f55119a;
            case 21:
                Map it6 = (Map) obj;
                AbstractC16544l.m18094g(it6, "it");
                it6.put("message", "added");
                InterfaceC8882i interfaceC8882i = (InterfaceC8882i) this.f21301Z;
                if (interfaceC8882i instanceof C9519e) {
                    C9519e c9519e = (C9519e) interfaceC8882i;
                    if (AbstractC16544l.m18089b(c9519e.f28651r0, "")) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(interfaceC8882i.getType());
                        sb3.append('-');
                        sb3.append(interfaceC8882i.getClass());
                        it6.put("plugin", sb3.toString());
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        ((C9519e) interfaceC8882i).getClass();
                        sb4.append(EnumC8881h.f27185o0);
                        sb4.append('-');
                        sb4.append(c9519e.f28651r0);
                        it6.put("plugin", sb4.toString());
                    }
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(interfaceC8882i.getType());
                    sb5.append('-');
                    sb5.append(interfaceC8882i.getClass());
                    it6.put("plugin", sb5.toString());
                }
                return C17296C.f55119a;
            case 22:
                InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj;
                if (!(interfaceC5985X instanceof InterfaceC9564p)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (interfaceC5985X.getValue() != null) {
                    Object value = interfaceC5985X.getValue();
                    AbstractC16544l.m18091d(value);
                    objMo3665b = ((InterfaceC9019n) this.f21301Z).mo3665b(value);
                }
                InterfaceC5959J0 interfaceC5959J0Mo6406b = ((InterfaceC9564p) interfaceC5985X).mo6406b();
                AbstractC16544l.m18092e(interfaceC5959J0Mo6406b, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver$lambda$3?>");
                return C5997d.m6430Q(objMo3665b, interfaceC5959J0Mo6406b);
            case 23:
                InterfaceC9016k interfaceC9016k = ((C9013h) this.f21301Z).f27510c;
                return Boolean.valueOf(interfaceC9016k != null ? interfaceC9016k.mo609a(obj) : true);
            case 24:
                ((C21658D) this.f21301Z).m22063v0((InterfaceC7537b) obj);
                return C17296C.f55119a;
            case 25:
                C11370Z gizmos = (C11370Z) obj;
                AbstractC16544l.m18094g(gizmos, "gizmos");
                return C11370Z.m12781a(gizmos, null, (C21897B1) this.f21301Z, 3);
            case 26:
                C9571w c9571w = (C9571w) this.f21301Z;
                c9571w.getClass();
                synchronized (c9571w.f28800f) {
                    C9570v c9570v = c9571w.f28802h;
                    AbstractC16544l.m18091d(c9570v);
                    Object obj3 = c9570v.f28784b;
                    AbstractC16544l.m18091d(obj3);
                    int i13 = c9570v.f28786d;
                    C12948A c12948a = c9570v.f28785c;
                    if (c12948a == null) {
                        c12948a = new C12948A();
                        c9570v.f28785c = c12948a;
                        c9570v.f28788f.m14623i(obj3, c12948a);
                    }
                    c9570v.m10118c(obj, i13, obj3, c12948a);
                }
                return C17296C.f55119a;
            case 27:
                C0794y0 insets = (C0794y0) obj;
                AbstractC16544l.m18094g(insets, "insets");
                C18862c c18862cMo1755g = insets.f2209a.mo1755g(7);
                AbstractC16544l.m18093f(c18862cMo1755g, "getInsetsIgnoringVisibility(...)");
                FloatingActionButton floatingActionButton = ((C10075h) this.f21301Z).f29828a.f30824c;
                ViewGroup.LayoutParams layoutParams = floatingActionButton.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                }
                C16806e c16806e = (C16806e) layoutParams;
                ((ViewGroup.MarginLayoutParams) c16806e).bottomMargin = (int) ((16.0d / ((double) Resources.getSystem().getDisplayMetrics().density)) + ((double) c18862cMo1755g.f60089d));
                floatingActionButton.setLayoutParams(c16806e);
                return C17296C.f55119a;
            case 28:
                ((C13027j) this.f21301Z).cancel(false);
                return C17296C.f55119a;
            default:
                ((Boolean) obj).booleanValue();
                ((ChoosePlanViewModel) this.f21301Z).m14395k(C10358b.f30705a);
                return C17296C.f55119a;
        }
    }
}
