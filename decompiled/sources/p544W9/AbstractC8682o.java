package p544W9;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.InterfaceC11112u;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p204I1.AbstractC3575F;
import p204I1.AbstractC3605u;
import p204I1.C3573D;
import p204I1.C3574E;
import p204I1.C3582M;
import p204I1.C3604t;
import p328N1.AbstractC5599o;
import p328N1.C5605u;
import p328N1.C5606v;
import p328N1.C5609y;
import p371P1.AbstractC6308d;
import p371P1.C6306b;
import p467T1.C7191a;
import p467T1.C7194d;
import p467T1.C7195e;
import p467T1.C7199i;
import p467T1.C7200j;
import p467T1.C7201k;
import p467T1.C7205o;
import p467T1.C7206p;
import p467T1.C7207q;
import p467T1.InterfaceC7204n;
import p488Tn.C7518a;
import p492U1.EnumC7546k;
import p523V9.AbstractC7841A0;
import p571X9.AbstractC9119D4;
import p769gj.ViewOnAttachStateChangeListenerC14169k;
import p772h.InterfaceC14216G;
import p774h1.C14338P;
import p821j1.AbstractC16040e;
import p821j1.C16042g;

/* JADX INFO: renamed from: W9.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8682o {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.content.Context] */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC14216G m9378a(Context context) {
        while (!(context instanceof InterfaceC14216G)) {
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == 0) {
                return null;
            }
        }
        return (InterfaceC14216G) context;
    }

    /* JADX INFO: renamed from: b */
    public static final C3582M m9379b(C3582M c3582m, EnumC7546k enumC7546k) {
        int i10;
        C3573D c3573d = c3582m.f10910a;
        InterfaceC7204n interfaceC7204n = AbstractC3575F.f10879d;
        InterfaceC7204n interfaceC7204nMo7589c = c3573d.f10859a.mo7589c(C3574E.f10875Y);
        long j10 = c3573d.f10860b;
        if (AbstractC9119D4.m9651d(j10)) {
            j10 = AbstractC3575F.f10876a;
        }
        long j11 = j10;
        C5609y c5609y = c3573d.f10861c;
        if (c5609y == null) {
            c5609y = C5609y.f18155r0;
        }
        C5609y c5609y2 = c5609y;
        C5605u c5605u = c3573d.f10862d;
        C5605u c5605u2 = new C5605u(c5605u != null ? c5605u.f18148a : 0);
        C5606v c5606v = c3573d.f10863e;
        C5606v c5606v2 = new C5606v(c5606v != null ? c5606v.f18149a : 1);
        AbstractC5599o abstractC5599o = c3573d.f10864f;
        if (abstractC5599o == null) {
            abstractC5599o = AbstractC5599o.f18131Y;
        }
        AbstractC5599o abstractC5599o2 = abstractC5599o;
        String str = c3573d.f10865g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j12 = c3573d.f10866h;
        if (AbstractC9119D4.m9651d(j12)) {
            j12 = AbstractC3575F.f10877b;
        }
        long j13 = j12;
        C7191a c7191a = c3573d.f10867i;
        C7191a c7191a2 = new C7191a(c7191a != null ? c7191a.f22846a : 0.0f);
        C7205o c7205o = c3573d.f10868j;
        if (c7205o == null) {
            c7205o = C7205o.f22871c;
        }
        C7205o c7205o2 = c7205o;
        C6306b c6306bMo5855i = c3573d.f10869k;
        if (c6306bMo5855i == null) {
            C6306b c6306b = C6306b.f20437o0;
            c6306bMo5855i = AbstractC6308d.f20440a.mo5855i();
        }
        C6306b c6306b2 = c6306bMo5855i;
        long j14 = c3573d.f10870l;
        if (j14 == 16) {
            j14 = AbstractC3575F.f10878c;
        }
        long j15 = j14;
        C7200j c7200j = c3573d.f10871m;
        if (c7200j == null) {
            c7200j = C7200j.f22863b;
        }
        C7200j c7200j2 = c7200j;
        C14338P c14338p = c3573d.f10872n;
        if (c14338p == null) {
            c14338p = C14338P.f45000d;
        }
        C14338P c14338p2 = c14338p;
        AbstractC16040e abstractC16040e = c3573d.f10874p;
        if (abstractC16040e == null) {
            abstractC16040e = C16042g.f49483a;
        }
        C3573D c3573d2 = new C3573D(interfaceC7204nMo7589c, j11, c5609y2, c5605u2, c5606v2, abstractC5599o2, str2, j13, c7191a2, c7205o2, c6306b2, j15, c7200j2, c14338p2, c3573d.f10873o, abstractC16040e);
        int i11 = AbstractC3605u.f10988b;
        C3604t c3604t = c3582m.f10911b;
        int i12 = 5;
        int i13 = C7199i.m7596a(c3604t.f10978a, Integer.MIN_VALUE) ? 5 : c3604t.f10978a;
        int i14 = c3604t.f10979b;
        if (C7201k.m7598a(i14, 3)) {
            int iOrdinal = enumC7546k.ordinal();
            if (iOrdinal == 0) {
                i12 = 4;
                i10 = 1;
            } else {
                if (iOrdinal != 1) {
                    throw new C0644w();
                }
                i10 = 1;
            }
        } else if (C7201k.m7598a(i14, Integer.MIN_VALUE)) {
            int iOrdinal2 = enumC7546k.ordinal();
            if (iOrdinal2 != 0) {
                i10 = 1;
                if (iOrdinal2 != 1) {
                    throw new C0644w();
                }
                i12 = 2;
            } else {
                i10 = 1;
                i12 = 1;
            }
        } else {
            i10 = 1;
            i12 = i14;
        }
        long j16 = c3604t.f10980c;
        if (AbstractC9119D4.m9651d(j16)) {
            j16 = AbstractC3605u.f10987a;
        }
        C7206p c7206p = c3604t.f10981d;
        if (c7206p == null) {
            c7206p = C7206p.f22874c;
        }
        int i15 = c3604t.f10984g;
        if (i15 == 0) {
            i15 = C7195e.f22851b;
        }
        int i16 = c3604t.f10985h;
        if (C7194d.m7592a(i16, Integer.MIN_VALUE)) {
            i16 = i10;
        }
        C7207q c7207q = c3604t.f10986i;
        if (c7207q == null) {
            c7207q = C7207q.f22877c;
        }
        return new C3582M(c3573d2, new C3604t(i13, i12, j16, c7206p, c3604t.f10982e, c3604t.f10983f, i15, i16, c7207q), c3582m.f10912c);
    }

    /* JADX INFO: renamed from: c */
    public static final void m9380c(InterfaceC1426a interfaceC1426a, View view) {
        Object obj;
        AbstractC11105n abstractC11105nMo7809i;
        AbstractC11105n abstractC11105nMo7809i2;
        AbstractC16544l.m18094g(view, "<this>");
        ViewOnAttachStateChangeListenerC14169k viewOnAttachStateChangeListenerC14169k = (ViewOnAttachStateChangeListenerC14169k) view.getTag(R.id.view_back_handler);
        if (viewOnAttachStateChangeListenerC14169k != null) {
            viewOnAttachStateChangeListenerC14169k.f44553o0.m15540b();
            View view2 = viewOnAttachStateChangeListenerC14169k.f44551Y;
            view2.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC14169k);
            InterfaceC11112u interfaceC11112uM8090b = AbstractC7841A0.m8090b(view2);
            if (interfaceC11112uM8090b != null && (abstractC11105nMo7809i2 = interfaceC11112uM8090b.mo7809i()) != null) {
                abstractC11105nMo7809i2.mo7808c(viewOnAttachStateChangeListenerC14169k);
            }
        }
        if (interfaceC1426a == null) {
            obj = null;
        } else {
            ViewOnAttachStateChangeListenerC14169k viewOnAttachStateChangeListenerC14169k2 = new ViewOnAttachStateChangeListenerC14169k(interfaceC1426a, view);
            Context context = view.getContext();
            AbstractC16544l.m18093f(context, "view.context");
            InterfaceC14216G interfaceC14216GM9378a = m9378a(context);
            if (interfaceC14216GM9378a != null) {
                interfaceC14216GM9378a.mo10191a().m15516a(interfaceC14216GM9378a, viewOnAttachStateChangeListenerC14169k2.f44553o0);
                view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC14169k2);
                if (view.isAttachedToWindow()) {
                    viewOnAttachStateChangeListenerC14169k2.onViewAttachedToWindow(view);
                }
                InterfaceC11112u interfaceC11112uM8090b2 = AbstractC7841A0.m8090b(view);
                if (interfaceC11112uM8090b2 != null && (abstractC11105nMo7809i = interfaceC11112uM8090b2.mo7809i()) != null) {
                    abstractC11105nMo7809i.mo7806a(viewOnAttachStateChangeListenerC14169k2);
                }
            }
            obj = viewOnAttachStateChangeListenerC14169k2;
        }
        view.setTag(R.id.view_back_handler, obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m9381d(C7518a c7518a, byte[] buffer) {
        int length = buffer.length;
        AbstractC16544l.m18094g(buffer, "buffer");
        c7518a.m7815P(buffer, 0, length);
    }
}
