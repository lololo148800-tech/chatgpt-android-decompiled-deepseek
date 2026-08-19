package p544W9;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC11112u;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.C15387c;
import io.sentry.internal.gestures.EnumC15386b;
import io.sentry.internal.gestures.InterfaceC15385a;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p153Fn.C2925c;
import p292Lg.C5034f;
import p294Li.C5079a;
import p294Li.C5080b;
import p341Ni.C5783h;
import p341Ni.C5785i;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p914o3.AbstractC17814e;

/* JADX INFO: renamed from: W9.o3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8686o3 {
    /* JADX INFO: renamed from: a */
    public static final void m9382a(String str, boolean z6, boolean z10, InterfaceC1436k onAudioData, C6021p c6021p, int i10) {
        int i11;
        float f10;
        AbstractC16544l.m18094g(onAudioData, "onAudioData");
        c6021p.m6526U(-1988495370);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onAudioData) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue()) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C5079a(str, z6, z10, onAudioData, i10, 0);
                    return;
                }
                return;
            }
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            C2925c c2925c = ((C6035w) objM6514H).f19668Y;
            c6021p.m6524S(242533);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == obj) {
                objM6514H2 = new C5785i(context, c2925c, onAudioData, z10);
                c6021p.m6537c0(objM6514H2);
            }
            C5785i c5785i = (C5785i) objM6514H2;
            c6021p.m6553p(false);
            if (z6) {
                f10 = 0.0f;
            } else {
                f10 = z10 ? 0.3f : 1.0f;
            }
            AbstractC0575H.m1156D(c5785i.f18875a, null, null, new C5783h(c5785i, f10, null), 3);
            c6021p.m6524S(248520);
            boolean zM6545h = ((i11 & 14) == 4) | c6021p.m6545h(c5785i);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h || objM6514H3 == obj) {
                objM6514H3 = new C5080b(c5785i, str, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, str);
            Object obj2 = (InterfaceC11112u) c6021p.m6548k(AbstractC17814e.f56807a);
            c6021p.m6524S(253198);
            boolean zM6545h2 = c6021p.m6545h(c5785i) | c6021p.m6545h(obj2);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6545h2 || objM6514H4 == obj) {
                objM6514H4 = new C5034f(obj2, 1, c5785i);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            C5997d.m6444c(obj2, (InterfaceC1436k) objM6514H4, c6021p);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C5079a(str, z6, z10, onAudioData, i10, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C15387c m9383b(SentryAndroidOptions sentryAndroidOptions, View view, float f10, float f11, EnumC15386b enumC15386b) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        C15387c c15387c = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            AbstractC8483G3.m9133c(view2, "view is required");
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    linkedList.add(viewGroup.getChildAt(i10));
                }
            }
            Iterator<InterfaceC15385a> it = sentryAndroidOptions.getGestureTargetLocators().iterator();
            while (it.hasNext()) {
                C15387c c15387cMo16426a = it.next().mo16426a(view2, f10, f11, enumC15386b);
                if (c15387cMo16426a != null) {
                    if (enumC15386b != EnumC15386b.CLICKABLE) {
                        return c15387cMo16426a;
                    }
                    c15387c = c15387cMo16426a;
                }
            }
        }
        return c15387c;
    }

    /* JADX INFO: renamed from: c */
    public static String m9384c(View view) {
        int id2 = view.getId();
        if (id2 == -1 || (((-16777216) & id2) == 0 && (16777215 & id2) != 0)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id2) : "";
    }
}
