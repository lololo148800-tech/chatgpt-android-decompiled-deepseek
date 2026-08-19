package p1139z0;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ge.C14016A0;
import io.sentry.C15411n0;
import io.sentry.C15476t0;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import mm.EnumC17307j;
import p001A.C0095w0;
import p001A.RunnableC0066i;
import p001A.RunnableC0074m;
import p007A5.C0376k;
import p025An.AbstractC0575H;
import p029B0.C0714a;
import p029B0.C0715b;
import p030B2.C0790w0;
import p030B2.C0794y0;
import p030B2.InterfaceC0783t;
import p033B5.AbstractC0833q;
import p033B5.C0828l;
import p033B5.C0840x;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p057C3.C1545X;
import p057C3.C1546Y;
import p057C3.C1556e;
import p057C3.C1557e0;
import p057C3.RunnableC1542U;
import p057C3.RunnableC1543V;
import p1009s9.C19506i;
import p1016t3.AbstractC19754D;
import p1016t3.C19788o;
import p1022t9.C19819d;
import p103Dn.AbstractC2124C;
import p103Dn.C2146N;
import p103Dn.C2153Q0;
import p1071w0.C20714I0;
import p1073w3.AbstractC20817s;
import p1073w3.C20815q;
import p1095x1.C21085g0;
import p1095x1.InterfaceC21087h0;
import p133F3.InterfaceC2659e;
import p165G9.C3018d;
import p182H3.C3201b;
import p182H3.C3202c;
import p182H3.C3205f;
import p182H3.C3208i;
import p182H3.InterfaceC3209j;
import p182H3.InterfaceC3211l;
import p228J.C3796C0;
import p228J.C3836g;
import p228J.C3863t0;
import p228J.C3865u0;
import p228J.InterfaceC3800E0;
import p232J3.C4244p;
import p232J3.C4249u;
import p232J3.C4253y;
import p232J3.InterfaceC4203C;
import p301M.InterfaceC5221c;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p374P5.AbstractC6356i;
import p374P5.C6354g;
import p374P5.C6361n;
import p397Q5.C6579h;
import p421R6.C6815a;
import p477Tb.C7296c;
import p496U5.AbstractC7562d;
import p496U5.AbstractC7568j;
import p496U5.C7564f;
import p496U5.InterfaceC7561c;
import p497U6.InterfaceC7569a;
import p521V6.C7798A;
import p521V6.C7808a;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8483G3;
import p562X0.C9008c;
import p562X0.InterfaceC9019n;
import p571X9.AbstractC9131F4;
import p571X9.AbstractC9137G4;
import p571X9.AbstractC9227W;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9567s;
import p586Y0.C9566r;
import p620Zc.InterfaceC10277b;
import p658b5.C11242m;
import p746fa.C13599h;
import p784hb.C14437f;
import p787he.C14459O;
import p817j$.util.DesugarCollections;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17686t;
import p953q0.C18553K;
import p956q3.C18621a;
import p972qm.AbstractC18773f;
import p979r2.C18862c;
import za.AbstractC21828k;

/* JADX INFO: renamed from: z0.H */
/* JADX INFO: loaded from: classes.dex */
public final class C21585H implements InterfaceC5221c, InterfaceC4203C, InterfaceC2659e, InterfaceC3209j, InterfaceC7569a, InterfaceC9019n, InterfaceC15127H, InterfaceC21087h0, InterfaceC0783t {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68343Y;

    /* JADX INFO: renamed from: Z */
    public Object f68344Z;

    /* JADX INFO: renamed from: o0 */
    public Object f68345o0;

    public /* synthetic */ C21585H(Object obj, int i10, Object obj2) {
        this.f68343Y = i10;
        this.f68344Z = obj;
        this.f68345o0 = obj2;
    }

    /* JADX INFO: renamed from: A */
    public C6361n m21920A(C6361n c6361n) {
        C0828l c0828l;
        boolean z6;
        C0828l c0828l2 = c6361n.f20706j;
        C19506i c19506i = AbstractC6356i.f20686c;
        if (!AbstractC9131F4.m9673b((Bitmap.Config) AbstractC0833q.m1892e(c6361n, c19506i)) || ((InterfaceC7561c) this.f68345o0).mo1008a()) {
            c0828l = c0828l2;
            z6 = false;
        } else {
            c0828l2.getClass();
            LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(c0828l2.f2309a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMapM19256r.put(c19506i, config);
            } else {
                linkedHashMapM19256r.remove(c19506i);
            }
            C0828l c0828l3 = new C0828l(AbstractC9137G4.m9681c(linkedHashMapM19256r));
            z6 = true;
            c0828l = c0828l3;
        }
        if (!z6) {
            return c6361n;
        }
        return new C6361n(c6361n.f20697a, c6361n.f20698b, c6361n.f20699c, c6361n.f20700d, c6361n.f20701e, c6361n.f20702f, c6361n.f20703g, c6361n.f20704h, c6361n.f20705i, c0828l);
    }

    /* JADX INFO: renamed from: B */
    public void m21921B(String str, C3865u0 c3865u0, InterfaceC3800E0 interfaceC3800E0, C3836g c3836g, List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f68345o0;
        if (linkedHashMap.containsKey(str)) {
            C3796C0 c3796c0 = new C3796C0(c3865u0, interfaceC3800E0, c3836g, list);
            C3796C0 c3796c1 = (C3796C0) linkedHashMap.get(str);
            c3796c0.f11476e = c3796c1.f11476e;
            c3796c0.f11477f = c3796c1.f11477f;
            linkedHashMap.put(str, c3796c0);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m21922C(boolean z6, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f68344Z)) {
            map = new HashMap((Map) this.f68344Z);
        }
        synchronized (((Map) this.f68345o0)) {
            map2 = new HashMap((Map) this.f68345o0);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z6 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m13185e(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z6 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C13599h) entry2.getKey()).m15115c(new C19819d(status));
            }
        }
    }

    @Override // p232J3.InterfaceC4203C
    /* JADX INFO: renamed from: H */
    public void mo2750H(int i10, C4253y c4253y, C4249u c4249u) {
        Pair pairM21929s = m21929s(i10, c4253y);
        if (pairM21929s != null) {
            ((C20815q) ((C1546Y) this.f68345o0).f4246j).m21377c(new RunnableC0066i(this, pairM21929s, c4249u, 6));
        }
    }

    @Override // p232J3.InterfaceC4203C
    /* JADX INFO: renamed from: I */
    public void mo2751I(int i10, C4253y c4253y, C4244p c4244p, C4249u c4249u, IOException iOException, boolean z6) {
        Pair pairM21929s = m21929s(i10, c4253y);
        if (pairM21929s != null) {
            ((C20815q) ((C1546Y) this.f68345o0).f4246j).m21377c(new RunnableC1543V(this, pairM21929s, c4244p, c4249u, iOException, z6, 0));
        }
    }

    @Override // p301M.InterfaceC5221c
    /* JADX INFO: renamed from: J */
    public void mo3912J(Throwable th2) {
        throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
    }

    @Override // p232J3.InterfaceC4203C
    /* JADX INFO: renamed from: L */
    public void mo2752L(int i10, C4253y c4253y, C4244p c4244p, C4249u c4249u) {
        Pair pairM21929s = m21929s(i10, c4253y);
        if (pairM21929s != null) {
            ((C20815q) ((C1546Y) this.f68345o0).f4246j).m21377c(new RunnableC1542U(this, pairM21929s, c4244p, c4249u, 0));
        }
    }

    @Override // p562X0.InterfaceC9019n
    /* JADX INFO: renamed from: a */
    public Object mo3664a(C9008c c9008c, Object obj) {
        return ((InterfaceC1439n) this.f68344Z).invoke(c9008c, obj);
    }

    @Override // p562X0.InterfaceC9019n
    /* JADX INFO: renamed from: b */
    public Object mo3665b(Object obj) {
        return ((InterfaceC1436k) this.f68345o0).invoke(obj);
    }

    @Override // p1095x1.InterfaceC21087h0
    /* JADX INFO: renamed from: c */
    public boolean mo21573c(Object obj, Object obj2) {
        C18553K c18553k = (C18553K) this.f68344Z;
        return AbstractC16544l.m18089b(c18553k.m19934b(obj), c18553k.m19934b(obj2));
    }

    @Override // p1095x1.InterfaceC21087h0
    /* JADX INFO: renamed from: d */
    public void mo21574d(C21085g0 c21085g0) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f68345o0;
        linkedHashMap.clear();
        Iterator it = c21085g0.f67008Y.iterator();
        while (it.hasNext()) {
            Object objM19934b = ((C18553K) this.f68344Z).m19934b(it.next());
            Integer num = (Integer) linkedHashMap.get(objM19934b);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 7) {
                it.remove();
            } else {
                linkedHashMap.put(objM19934b, Integer.valueOf(iIntValue + 1));
            }
        }
    }

    @Override // p182H3.InterfaceC3209j
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C3202c mo3448z(C3208i c3208i) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        InterfaceC3211l c7296c;
        int i10;
        String str = c3208i.f9697a.f9703a;
        C3202c c3202c = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                C19788o c19788o = c3208i.f9699c;
                int i11 = AbstractC20817s.f66106a;
                if (i11 >= 34 && (i11 >= 35 || AbstractC19754D.m20710h(c19788o.f62752m))) {
                    c7296c = new C7296c(mediaCodecCreateByCodecName, 13);
                    i10 = 4;
                } else {
                    c7296c = new C3205f(mediaCodecCreateByCodecName, (HandlerThread) ((C3201b) this.f68345o0).get());
                    i10 = 0;
                }
                C3202c c3202c2 = new C3202c(mediaCodecCreateByCodecName, (HandlerThread) ((C3201b) this.f68344Z).get(), c7296c);
                try {
                    Trace.endSection();
                    C3202c.m4054a(c3202c2, c3208i.f9698b, c3208i.f9700d, c3208i.f9701e, i10);
                    return c3202c2;
                } catch (Exception e10) {
                    e = e10;
                    c3202c = c3202c2;
                    if (c3202c != null) {
                        c3202c.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // p497U6.InterfaceC7569a
    /* JADX INFO: renamed from: f */
    public void mo7759f(C6815a c6815a) {
        ((C11242m) this.f68345o0).mo7759f(new C7798A((String) this.f68344Z));
    }

    @Override // io.sentry.InterfaceC15127H
    /* JADX INFO: renamed from: g */
    public void mo16296g(EnumC15375i1 enumC15375i1, Throwable th2, String str, Object... objArr) {
        InterfaceC15127H interfaceC15127H = (InterfaceC15127H) this.f68345o0;
        if (interfaceC15127H == null || !mo16299p(enumC15375i1)) {
            return;
        }
        interfaceC15127H.mo16296g(enumC15375i1, th2, str, objArr);
    }

    @Override // io.sentry.InterfaceC15127H
    /* JADX INFO: renamed from: h */
    public void mo16297h(EnumC15375i1 enumC15375i1, String str, Throwable th2) {
        InterfaceC15127H interfaceC15127H = (InterfaceC15127H) this.f68345o0;
        if (interfaceC15127H == null || !mo16299p(enumC15375i1)) {
            return;
        }
        interfaceC15127H.mo16297h(enumC15375i1, str, th2);
    }

    /* JADX INFO: renamed from: i */
    public void m21924i(C1556e c1556e) {
        synchronized (c1556e) {
        }
        Handler handler = (Handler) this.f68344Z;
        if (handler != null) {
            handler.post(new RunnableC0074m(this, 13, c1556e));
        }
    }

    @Override // p232J3.InterfaceC4203C
    /* JADX INFO: renamed from: j */
    public void mo2762j(int i10, C4253y c4253y, C4244p c4244p, C4249u c4249u) {
        Pair pairM21929s = m21929s(i10, c4253y);
        if (pairM21929s != null) {
            ((C20815q) ((C1546Y) this.f68345o0).f4246j).m21377c(new RunnableC1542U(this, pairM21929s, c4244p, c4249u, 1));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m21925k() {
        C9566r c9566r;
        C6002f0 c6002f0 = (C6002f0) this.f68345o0;
        AbstractC9556h abstractC9556hM10108d = AbstractC9567s.m10108d();
        InterfaceC1436k interfaceC1436kMo10046f = abstractC9556hM10108d != null ? abstractC9556hM10108d.mo10046f() : null;
        AbstractC9556h abstractC9556hM10109e = AbstractC9567s.m10109e(abstractC9556hM10108d);
        try {
            C0714a c0714a = (C0714a) c6002f0.getValue();
            AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
            if (c0714a != null) {
                C0715b c0715b = (C0715b) this.f68344Z;
                c0715b.f2071c.clear();
                while (true) {
                    int size = c0715b.f2071c.size() + c0715b.f2070b.size();
                    int i10 = c0715b.f2069a - 1;
                    c9566r = c0715b.f2070b;
                    if (size <= i10) {
                        break;
                    } else {
                        AbstractC17686t.m19395C(c9566r);
                    }
                }
                c9566r.add(c0714a);
            }
            c6002f0.setValue(null);
        } catch (Throwable th2) {
            AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    @Override // p030B2.InterfaceC0783t
    /* JADX INFO: renamed from: l */
    public C0794y0 mo1773l(View view, C0794y0 c0794y0) {
        boolean z6;
        C3018d c3018d = (C3018d) this.f68345o0;
        int i10 = c3018d.f9092a;
        C0095w0 c0095w0 = (C0095w0) this.f68344Z;
        C0790w0 c0790w0 = c0794y0.f2209a;
        C18862c c18862cMo1754f = c0790w0.mo1754f(7);
        C18862c c18862cMo1754f2 = c0790w0.mo1754f(32);
        int i11 = c18862cMo1754f.f60087b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0095w0.f411o0;
        bottomSheetBehavior.f36465x = i11;
        boolean zM22310e = AbstractC21828k.m22310e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z10 = bottomSheetBehavior.f36457p;
        if (z10) {
            int iM1813a = c0794y0.m1813a();
            bottomSheetBehavior.f36464w = iM1813a;
            paddingBottom = iM1813a + c3018d.f9094c;
        }
        int i12 = c3018d.f9093b;
        boolean z11 = bottomSheetBehavior.f36458q;
        int i13 = c18862cMo1754f.f60086a;
        if (z11) {
            paddingLeft = (zM22310e ? i12 : i10) + i13;
        }
        boolean z12 = bottomSheetBehavior.f36459r;
        int i14 = c18862cMo1754f.f60088c;
        if (z12) {
            if (!zM22310e) {
                i10 = i12;
            }
            paddingRight = i10 + i14;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z13 = true;
        if (!bottomSheetBehavior.f36461t || marginLayoutParams.leftMargin == i13) {
            z6 = false;
        } else {
            marginLayoutParams.leftMargin = i13;
            z6 = true;
        }
        if (bottomSheetBehavior.f36462u && marginLayoutParams.rightMargin != i14) {
            marginLayoutParams.rightMargin = i14;
            z6 = true;
        }
        if (bottomSheetBehavior.f36463v) {
            int i15 = marginLayoutParams.topMargin;
            int i16 = c18862cMo1754f.f60087b;
            if (i15 != i16) {
                marginLayoutParams.topMargin = i16;
            } else {
                z13 = z6;
            }
        } else {
            z13 = z6;
        }
        if (z13) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z14 = c0095w0.f410Z;
        if (z14) {
            bottomSheetBehavior.f36455n = c18862cMo1754f2.f60089d;
        }
        if (z10 || z14) {
            bottomSheetBehavior.m13593H();
        }
        return c0794y0;
    }

    /* JADX INFO: renamed from: m */
    public C3863t0 m21926m() {
        C3863t0 c3863t0 = new C3863t0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f68345o0).entrySet()) {
            C3796C0 c3796c0 = (C3796C0) entry.getValue();
            if (c3796c0.f11476e) {
                c3863t0.m4588a(c3796c0.f11472a);
                arrayList.add((String) entry.getKey());
            }
        }
        AbstractC8072d6.m8486c("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + ((String) this.f68344Z));
        return c3863t0;
    }

    /* JADX INFO: renamed from: n */
    public Collection m21927n() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f68345o0).entrySet()) {
            if (((C3796C0) entry.getValue()).f11476e) {
                arrayList.add(((C3796C0) entry.getValue()).f11472a);
            }
        }
        return DesugarCollections.unmodifiableCollection(arrayList);
    }

    @Override // io.sentry.InterfaceC15127H
    /* JADX INFO: renamed from: o */
    public void mo16298o(EnumC15375i1 enumC15375i1, String str, Object... objArr) {
        InterfaceC15127H interfaceC15127H = (InterfaceC15127H) this.f68345o0;
        if (interfaceC15127H == null || !mo16299p(enumC15375i1)) {
            return;
        }
        interfaceC15127H.mo16298o(enumC15375i1, str, objArr);
    }

    @Override // p301M.InterfaceC5221c, p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        switch (this.f68343Y) {
            case 1:
                ((Surface) this.f68344Z).release();
                ((SurfaceTexture) this.f68345o0).release();
                break;
            default:
                C11242m c11242m = (C11242m) this.f68345o0;
                String str = (String) this.f68344Z;
                try {
                    c11242m.onSuccess(new C7808a((PublicKey) ((Map) obj).get(str)));
                } catch (InvalidKeyException unused) {
                    c11242m.mo7759f(new C7798A(str));
                }
                break;
        }
    }

    @Override // io.sentry.InterfaceC15127H
    /* JADX INFO: renamed from: p */
    public boolean mo16299p(EnumC15375i1 enumC15375i1) {
        C15524y1 c15524y1 = (C15524y1) this.f68344Z;
        return enumC15375i1 != null && c15524y1.isDebug() && enumC15375i1.ordinal() >= c15524y1.getDiagnosticLevel().ordinal();
    }

    /* JADX INFO: renamed from: q */
    public Collection m21928q() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f68345o0).entrySet()) {
            if (((C3796C0) entry.getValue()).f11476e) {
                arrayList.add(((C3796C0) entry.getValue()).f11473b);
            }
        }
        return DesugarCollections.unmodifiableCollection(arrayList);
    }

    @Override // p232J3.InterfaceC4203C
    /* JADX INFO: renamed from: r */
    public void mo2770r(int i10, C4253y c4253y, C4244p c4244p, C4249u c4249u) {
        Pair pairM21929s = m21929s(i10, c4253y);
        if (pairM21929s != null) {
            ((C20815q) ((C1546Y) this.f68345o0).f4246j).m21377c(new RunnableC1542U(this, pairM21929s, c4244p, c4249u, 2));
        }
    }

    /* JADX INFO: renamed from: s */
    public Pair m21929s(int i10, C4253y c4253y) {
        C4253y c4253yM5016a;
        C1545X c1545x = (C1545X) this.f68344Z;
        C4253y c4253y2 = null;
        if (c4253y != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= c1545x.f4234c.size()) {
                    c4253yM5016a = null;
                    break;
                }
                if (((C4253y) c1545x.f4234c.get(i11)).f13898d == c4253y.f13898d) {
                    Object obj = c1545x.f4233b;
                    int i12 = C1557e0.f4323k;
                    c4253yM5016a = c4253y.m5016a(Pair.create(obj, c4253y.f13895a));
                    break;
                }
                i11++;
            }
            if (c4253yM5016a == null) {
                return null;
            }
            c4253y2 = c4253yM5016a;
        }
        return Pair.create(Integer.valueOf(i10 + c1545x.f4235d), c4253y2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    /* JADX INFO: renamed from: t */
    public InputMethodManager m21930t() {
        return (InputMethodManager) this.f68345o0.getValue();
    }

    /* JADX INFO: renamed from: u */
    public boolean m21931u(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f68345o0;
        if (linkedHashMap.containsKey(str)) {
            return ((C3796C0) linkedHashMap.get(str)).f11476e;
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public Properties m21932v() {
        String str = (String) this.f68344Z;
        try {
            File file = new File(str);
            if (!file.isFile() || !file.canRead()) {
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            ((C15476t0) this.f68345o0).mo16296g(EnumC15375i1.ERROR, e10, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0039  */
    /* JADX INFO: renamed from: w */
    public C6361n m21933w(C6354g c6354g, C6579h c6579h) {
        boolean z6;
        Context context = c6354g.f20661a;
        C19506i c19506i = AbstractC6356i.f20686c;
        Bitmap.Config config = (Bitmap.Config) AbstractC0833q.m1891d(c6354g, c19506i);
        C19506i c19506i2 = AbstractC6356i.f20692i;
        boolean zBooleanValue = ((Boolean) AbstractC0833q.m1891d(c6354g, c19506i2)).booleanValue();
        C19506i c19506i3 = AbstractC6356i.f20684a;
        boolean z10 = false;
        if (((List) AbstractC0833q.m1891d(c6354g, c19506i3)).isEmpty()) {
            z6 = true;
        } else {
            if (AbstractC17678l.m19298e((Bitmap.Config) AbstractC0833q.m1891d(c6354g, c19506i), AbstractC7568j.f23971a)) {
                z6 = true;
            } else {
                z6 = false;
            }
        }
        boolean z11 = !AbstractC9131F4.m9673b((Bitmap.Config) AbstractC0833q.m1891d(c6354g, c19506i)) || ((!AbstractC9131F4.m9673b((Bitmap.Config) AbstractC0833q.m1891d(c6354g, c19506i)) || ((Boolean) AbstractC0833q.m1891d(c6354g, AbstractC6356i.f20691h)).booleanValue()) && ((InterfaceC7561c) this.f68345o0).mo1011c(c6579h));
        if (!z6 || !z11) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (zBooleanValue && ((List) AbstractC0833q.m1891d(c6354g, c19506i3)).isEmpty() && config != Bitmap.Config.ALPHA_8) {
            z10 = true;
        }
        LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r(AbstractC17659D.m19248j(c6354g.f20681u.f20651n.f2309a, c6354g.f20679s.f2309a));
        if (config != ((Bitmap.Config) AbstractC0833q.m1891d(c6354g, c19506i))) {
            if (config != null) {
                linkedHashMapM19256r.put(c19506i, config);
            } else {
                linkedHashMapM19256r.remove(c19506i);
            }
        }
        if (z10 != ((Boolean) AbstractC0833q.m1891d(c6354g, c19506i2)).booleanValue()) {
            linkedHashMapM19256r.put(c19506i2, Boolean.valueOf(z10));
        }
        return new C6361n(context, c6579h, c6354g.f20677q, c6354g.f20678r, null, c6354g.f20665e, c6354g.f20670j, c6354g.f20671k, c6354g.f20672l, new C0828l(AbstractC9137G4.m9681c(linkedHashMapM19256r)));
    }

    /* JADX INFO: renamed from: x */
    public void m21934x(C0714a c0714a) {
        C6002f0 c6002f0 = (C6002f0) this.f68345o0;
        AbstractC9556h abstractC9556hM10108d = AbstractC9567s.m10108d();
        C0714a c0714a2 = null;
        InterfaceC1436k interfaceC1436kMo10046f = abstractC9556hM10108d != null ? abstractC9556hM10108d.mo10046f() : null;
        AbstractC9556h abstractC9556hM10109e = AbstractC9567s.m10109e(abstractC9556hM10108d);
        try {
            C0714a c0714a3 = (C0714a) c6002f0.getValue();
            AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
            if (c0714a3 == null) {
                c6002f0.setValue(c0714a);
                return;
            }
            if (c0714a3.f2067g && c0714a.f2067g) {
                long j10 = c0714a.f2066f;
                long j11 = c0714a3.f2066f;
                if (j10 >= j11 && j10 - j11 < 5000) {
                    String str = c0714a3.f2063c;
                    if (!AbstractC16544l.m18089b(str, Separators.RETURN) && !AbstractC16544l.m18089b(str, Separators.NEWLINE)) {
                        String str2 = c0714a.f2063c;
                        if (!AbstractC16544l.m18089b(str2, Separators.RETURN) && !AbstractC16544l.m18089b(str2, Separators.NEWLINE)) {
                            int i10 = c0714a.f2068h;
                            int i11 = c0714a3.f2068h;
                            if (i11 == i10) {
                                int i12 = c0714a3.f2061a;
                                int i13 = c0714a.f2061a;
                                if (i11 == 1 && str.length() + i12 == i13) {
                                    c0714a2 = new C0714a(c0714a3.f2061a, "", AbstractC10763a.m11052j(str, str2), c0714a3.f2064d, c0714a.f2065e, c0714a3.f2066f, false, 64);
                                } else if (i11 == 2 && c0714a3.m1488a() == c0714a.m1488a() && (c0714a3.m1488a() == 1 || c0714a3.m1488a() == 2)) {
                                    String str3 = c0714a.f2062b;
                                    int length = str3.length() + i13;
                                    String str4 = c0714a3.f2062b;
                                    if (i12 == length) {
                                        c0714a2 = new C0714a(c0714a.f2061a, AbstractC10763a.m11052j(str3, str4), "", c0714a3.f2064d, c0714a.f2065e, c0714a3.f2066f, false, 64);
                                    } else {
                                        int i14 = c0714a3.f2061a;
                                        if (i14 == i13) {
                                            c0714a2 = new C0714a(i14, AbstractC10763a.m11052j(str4, str3), "", c0714a3.f2064d, c0714a.f2065e, c0714a3.f2066f, false, 64);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (c0714a2 != null) {
                c6002f0.setValue(c0714a2);
            } else {
                m21925k();
                c6002f0.setValue(c0714a);
            }
        } catch (Throwable th2) {
            AbstractC9567s.m10112h(abstractC9556hM10108d, abstractC9556hM10109e, interfaceC1436kMo10046f);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m21935y(C15411n0 c15411n0) {
        synchronized (this) {
            C14437f c14437f = (C14437f) this.f68344Z;
            ((SharedPreferences) c14437f.f45413Y).edit().putLong("com.lyft.kronos.cached_current_time", c15411n0.f48031a).apply();
            C14437f c14437f2 = (C14437f) this.f68344Z;
            ((SharedPreferences) c14437f2.f45413Y).edit().putLong("com.lyft.kronos.cached_elapsed_time", c15411n0.f48032b).apply();
            C14437f c14437f3 = (C14437f) this.f68344Z;
            ((SharedPreferences) c14437f3.f45413Y).edit().putLong("com.lyft.kronos.cached_offset", c15411n0.f48033c).apply();
        }
    }

    public C21585H(boolean z6) {
        this.f68343Y = 18;
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(Boolean.valueOf(z6));
        this.f68344Z = c2153q0M3204c;
        this.f68345o0 = new C2146N(c2153q0M3204c, 0);
    }

    public C21585H(C14459O conversationCoordinator, C18621a c18621a, InterfaceC10277b interfaceC10277b, Application application) {
        this.f68343Y = 13;
        AbstractC16544l.m18094g(conversationCoordinator, "conversationCoordinator");
        this.f68344Z = interfaceC10277b;
        if (AbstractC18773f.m20050b(application)) {
            AbstractC0575H.m1156D(c18621a, null, null, new C14016A0(conversationCoordinator, this, null), 3);
        }
    }

    public C21585H(C15524y1 c15524y1, InterfaceC15127H interfaceC15127H) {
        this.f68343Y = 14;
        AbstractC8483G3.m9133c(c15524y1, "SentryOptions is required.");
        this.f68344Z = c15524y1;
        this.f68345o0 = interfaceC15127H;
    }

    public C21585H(C0840x c0840x) {
        Object c0376k;
        int i10 = 8;
        this.f68343Y = 7;
        boolean z6 = false;
        this.f68344Z = c0840x;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            boolean z10 = AbstractC7562d.f23962a;
        } else {
            if (!AbstractC7562d.f23962a) {
                if (i11 != 26 && i11 != 27) {
                    c0376k = new C0376k(true, i10);
                } else {
                    c0376k = new C7564f();
                }
            }
            this.f68345o0 = c0376k;
        }
        c0376k = new C0376k(z6, i10);
        this.f68345o0 = c0376k;
    }

    public C21585H(C0714a c0714a, C0715b c0715b) {
        this.f68343Y = 21;
        this.f68344Z = c0715b;
        this.f68345o0 = C5997d.m6430Q(c0714a, C5975S.f19448r0);
    }

    public C21585H(String str) {
        this.f68343Y = 5;
        this.f68345o0 = new LinkedHashMap();
        this.f68344Z = str;
    }

    public C21585H(int i10, byte b) {
        this.f68343Y = i10;
        switch (i10) {
            case 12:
                this.f68344Z = new ArrayList();
                this.f68345o0 = new HashMap(32);
                break;
            case 16:
                break;
            case 19:
                this.f68344Z = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.f68345o0 = DesugarCollections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.f68344Z = null;
                this.f68345o0 = null;
                break;
        }
    }

    public C21585H(View view) {
        this.f68343Y = 0;
        this.f68344Z = view;
        this.f68345o0 = AbstractC9227W.m9799b(EnumC17307j.f55134Z, new C20714I0(this, 6));
    }

    public C21585H(int i10) {
        this.f68343Y = 4;
        C3201b c3201b = new C3201b(i10, 0);
        C3201b c3201b2 = new C3201b(i10, 1);
        this.f68344Z = c3201b;
        this.f68345o0 = c3201b2;
    }

    public C21585H(C18553K c18553k) {
        this.f68343Y = 17;
        this.f68344Z = c18553k;
        this.f68345o0 = new LinkedHashMap();
    }

    public C21585H(C1546Y c1546y, C1545X c1545x) {
        this.f68343Y = 2;
        this.f68345o0 = c1546y;
        this.f68344Z = c1545x;
    }
}
