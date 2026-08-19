package p477Tb;

import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.javax.sip.C10808o;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.lifecycle.InterfaceC11070F;
import androidx.lifecycle.InterfaceC11112u;
import androidx.recyclerview.widget.RecyclerView;
import com.auth0.android.request.internal.C11845d;
import com.auth0.android.request.internal.C11850i;
import com.auth0.android.result.Credentials;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.gson.reflect.TypeToken;
import fo.C13711h;
import io.sentry.C15411n0;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17349p;
import mo.C17355v;
import mo.C17356w;
import p001A.C0088t;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0259j;
import p008A6.C0386f;
import p011A9.BinderC0416g;
import p011A9.C0410a;
import p011A9.C0414e;
import p011A9.C0417h;
import p011A9.C0418i;
import p011A9.p012Ra.ahZQMZ;
import p025An.AbstractC0575H;
import p025An.C0624m;
import p025An.C0636s;
import p030B2.C0755f;
import p030B2.InterfaceC0749c;
import p031B3.C0799c;
import p031B3.InterfaceC0798b;
import p033B5.InterfaceC0829m;
import p035B7.InterfaceC0847d;
import p077Cn.C1743k;
import p079D.AbstractC1762b;
import p080D0.C1826r;
import p080D0.C1837w0;
import p080D0.InterfaceC1812k;
import p084D4.AbstractC1933p0;
import p084D4.C1901Z;
import p084D4.C1902a;
import p084D4.C1911e0;
import p1016t3.AbstractC19780g;
import p1036u9.InterfaceC20165k;
import p1038uc.C20183a;
import p1050v.InterfaceC20412a;
import p1071w0.C20750g0;
import p1071w0.EnumC20730T;
import p109E3.C2292p;
import p1139z0.C21585H;
import p1159zo.C22221g;
import p115E9.C2360b;
import p133F3.C2656b;
import p133F3.C2658d;
import p162G6.AbstractC3005b;
import p167Gb.C3032c;
import p178H.C3118K;
import p182H3.InterfaceC3211l;
import p204I1.C3581L;
import p209I6.C3623a;
import p209I6.C3624b;
import p209I6.C3625c;
import p214Ib.C3669l;
import p214Ib.C3674q;
import p228J.C3847l0;
import p259K5.C4539a;
import p259K5.C4540b;
import p259K5.C4544f;
import p259K5.InterfaceC4545g;
import p265Kb.InterfaceC4623p;
import p301M.AbstractC5229k;
import p301M.InterfaceC5219a;
import p301M.InterfaceC5221c;
import p333N9.AbstractC5688i;
import p333N9.BinderC5683d;
import p333N9.C5682c;
import p333N9.C5684e;
import p333N9.C5693n;
import p334Na.C5701h;
import p350O1.C6045C;
import p357Oa.InterfaceC6150c;
import p375P6.AbstractTextureViewSurfaceTextureListenerC6373j;
import p375P6.InterfaceC6366c;
import p377P9.AbstractC6375a;
import p421R6.C6815a;
import p425Ra.AbstractC6829b;
import p446S6.C7022a;
import p446S6.C7023b;
import p446S6.C7024c;
import p449S9.AbstractC7057a;
import p472T6.C7259b;
import p476Ta.C7293c;
import p497U6.InterfaceC7569a;
import p499U9.C7591u;
import p521V6.C7802E;
import p521V6.C7822o;
import p521V6.C7829v;
import p523V9.AbstractC8017W3;
import p523V9.AbstractC8072d6;
import p541W6.C8433c;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p572Xa.C9418l;
import p588Y2.DialogInterfaceOnCancelListenerC9628l;
import p658b5.C11234e;
import p658b5.C11242m;
import p658b5.C11248s;
import p712dp.C13187c;
import p737f1.C13522n;
import p746fa.C13599h;
import p746fa.InterfaceC13596e;
import p747fb.InterfaceFutureC13608b;
import p784hb.C14437f;
import p791hj.C14522e;
import p813ij.C15026j;
import p817j$.util.DesugarCollections;
import p841k.C16288h;
import p867l8.C16831c;
import p960q9.C18655i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import tc.C19837b;
import vc.C20520d;
import vc.EnumC20518b;

/* JADX INFO: renamed from: Tb.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7296c implements InterfaceC20165k, InterfaceC0749c, InterfaceC0847d, InterfaceC1812k, InterfaceC5221c, InterfaceC3211l, InterfaceC4545g, InterfaceC4623p, InterfaceC5219a, InterfaceC6150c, InterfaceC6366c, InterfaceC7569a, InterfaceC13596e, InterfaceC11070F {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23103Y;

    /* JADX INFO: renamed from: Z */
    public Object f23104Z;

    public /* synthetic */ C7296c(C0417h c0417h, C0410a c0410a) {
        this.f23103Y = 2;
        this.f23104Z = c0410a;
    }

    /* JADX INFO: renamed from: L */
    public static String m7748L(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                AbstractC15256t.m16466d("PlayCore", "Unable to format ".concat(str2), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return AbstractC9306j0.m9890i(str, " : ", str2);
    }

    /* JADX INFO: renamed from: A */
    public int m7749A() {
        return 1;
    }

    /* JADX INFO: renamed from: B */
    public void m7750B(int i10, Object obj, int i11) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.f23104Z;
        int iM3076k = recyclerView.f33650t0.m3076k();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < iM3076k; i15++) {
            View viewM3075j = recyclerView.f33650t0.m3075j(i15);
            AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(viewM3075j);
            if (abstractC1933p0M12244L != null && !abstractC1933p0M12244L.m3102q() && (i13 = abstractC1933p0M12244L.f5682c) >= i10 && i13 < i14) {
                abstractC1933p0M12244L.m3086a(2);
                if (obj == null) {
                    abstractC1933p0M12244L.m3086a(1024);
                } else if ((1024 & abstractC1933p0M12244L.f5689j) == 0) {
                    if (abstractC1933p0M12244L.f5690k == null) {
                        ArrayList arrayList = new ArrayList();
                        abstractC1933p0M12244L.f5690k = arrayList;
                        abstractC1933p0M12244L.f5691l = DesugarCollections.unmodifiableList(arrayList);
                    }
                    abstractC1933p0M12244L.f5690k.add(obj);
                }
                ((C1901Z) viewM3075j.getLayoutParams()).f5559c = true;
            }
        }
        C1911e0 c1911e0 = recyclerView.f33644q0;
        ArrayList arrayList2 = c1911e0.f5588c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            AbstractC1933p0 abstractC1933p0 = (AbstractC1933p0) arrayList2.get(size);
            if (abstractC1933p0 != null && (i12 = abstractC1933p0.f5682c) >= i10 && i12 < i14) {
                abstractC1933p0.m3086a(2);
                c1911e0.m3032g(size);
            }
        }
        recyclerView.f33655v1 = true;
    }

    /* JADX INFO: renamed from: D */
    public void m7752D(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        RecyclerView recyclerView = (RecyclerView) this.f23104Z;
        int iM3076k = recyclerView.f33650t0.m3076k();
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        boolean z6 = false;
        for (int i20 = 0; i20 < iM3076k; i20++) {
            AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(recyclerView.f33650t0.m3075j(i20));
            if (abstractC1933p0M12244L != null && (i19 = abstractC1933p0M12244L.f5682c) >= i13 && i19 <= i12) {
                if (RecyclerView.f33581L1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i20 + " holder " + abstractC1933p0M12244L);
                }
                if (abstractC1933p0M12244L.f5682c == i10) {
                    abstractC1933p0M12244L.m3099n(i11 - i10, false);
                } else {
                    abstractC1933p0M12244L.m3099n(i14, false);
                }
                recyclerView.f33647r1.f5641f = true;
            }
        }
        C1911e0 c1911e0 = recyclerView.f33644q0;
        c1911e0.getClass();
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
            i17 = -1;
        } else {
            i15 = i10;
            i16 = i11;
            i17 = 1;
        }
        ArrayList arrayList = c1911e0.f5588c;
        int size = arrayList.size();
        int i21 = 0;
        while (i21 < size) {
            AbstractC1933p0 abstractC1933p0 = (AbstractC1933p0) arrayList.get(i21);
            if (abstractC1933p0 != null && (i18 = abstractC1933p0.f5682c) >= i16 && i18 <= i15) {
                if (i18 == i10) {
                    abstractC1933p0.m3099n(i11 - i10, z6);
                } else {
                    abstractC1933p0.m3099n(i17, z6);
                }
                if (RecyclerView.f33581L1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i21 + " holder " + abstractC1933p0);
                }
            }
            i21++;
            z6 = false;
        }
        recyclerView.requestLayout();
        recyclerView.f33653u1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: E */
    public Object m7753E(String str, List list, AbstractC19687c abstractC19687c) {
        C3623a c3623a;
        C22221g c22221gM19036c;
        C1743k c1743k;
        if (abstractC19687c instanceof C3623a) {
            c3623a = (C3623a) abstractC19687c;
            int i10 = c3623a.f11049q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3623a.f11049q0 = i10 - Integer.MIN_VALUE;
            } else {
                c3623a = new C3623a(this, abstractC19687c);
            }
        } else {
            c3623a = new C3623a(this, abstractC19687c);
        }
        Object obj = c3623a.f11047o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c3623a.f11049q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C1743k c1743kM8337a = AbstractC8017W3.m8337a(Integer.MAX_VALUE, 6, null);
            C0636s c0636sM1173b = AbstractC0575H.m1173b();
            C14522e c14522e = new C14522e(3);
            c14522e.m16010B(str);
            c14522e.m16025s(AbstractC3005b.m3830a(list));
            c22221gM19036c = ((C17356w) this.f23104Z).m19036c(c14522e.m16017i(), new C3625c(c0636sM1173b, c1743kM8337a));
            c3623a.f11045Y = c1743kM8337a;
            c3623a.f11046Z = c22221gM19036c;
            c3623a.f11049q0 = 1;
            if (c0636sM1173b.m1309u(c3623a) == enumC19250a) {
                return enumC19250a;
            }
            c1743k = c1743kM8337a;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22221gM19036c = c3623a.f11046Z;
            c1743k = c3623a.f11045Y;
            AbstractC9233X.m9807c(obj);
        }
        c1743k.mo2521j(new C0386f(c22221gM19036c, 5));
        return new C3624b(c1743k, c22221gM19036c);
    }

    /* JADX INFO: renamed from: G */
    public boolean m7755G(String str) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX INFO: renamed from: H */
    public boolean m7756H() {
        boolean z6;
        boolean z10 = false;
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = (TorchFlashRequiredFor3aUpdateQuirk) this.f23104Z;
        if (torchFlashRequiredFor3aUpdateQuirk != null) {
            if (Build.VERSION.SDK_INT < 28) {
                torchFlashRequiredFor3aUpdateQuirk.getClass();
            } else {
                if (C0088t.m292h(torchFlashRequiredFor3aUpdateQuirk.f32336a, 5) == 5) {
                    z6 = true;
                }
                if (!z6) {
                    z10 = true;
                }
            }
            z6 = false;
            if (!z6) {
                z10 = true;
            }
        }
        AbstractC8072d6.m8486c("UseFlashModeTorchFor3aUpdate", "shouldUseFlashModeTorch: " + z10);
        return z10;
    }

    /* JADX INFO: renamed from: I */
    public void m7757I(C6045C c6045c, long j10, boolean z6, C1826r c1826r) {
        ((C1837w0) this.f23104Z).m2690n(C3581L.m4267c(C1837w0.m2677a((C1837w0) this.f23104Z, c6045c, j10, z6, false, c1826r, false)) ? EnumC20730T.f65730o0 : EnumC20730T.f65729Z);
    }

    @Override // p301M.InterfaceC5221c
    /* JADX INFO: renamed from: J */
    public void mo3912J(Throwable th2) throws Exception {
        ((C3118K) this.f23104Z).close();
    }

    /* JADX INFO: renamed from: K */
    public void m7758K(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", m7748L((String) this.f23104Z, str, objArr));
        }
    }

    @Override // p265Kb.InterfaceC4623p
    /* JADX INFO: renamed from: R */
    public Object mo3263R() {
        Type type = (Type) this.f23104Z;
        if (!(type instanceof ParameterizedType)) {
            throw new C3674q("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new C3674q("Invalid EnumMap type: " + type.toString());
    }

    @Override // p357Oa.InterfaceC6150c
    /* JADX INFO: renamed from: a */
    public Object mo3914a() {
        switch (this.f23103Y) {
            case 20:
                return new C5701h((Context) ((C18655i) ((C3032c) this.f23104Z).f9127Z).f59414Z);
            default:
                if (AbstractC7057a.f22532b == null) {
                    AbstractC7057a.f22532b = new C2292p();
                }
                synchronized (AbstractC7057a.f22531a) {
                    break;
                }
                throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
        }
    }

    @Override // p1036u9.InterfaceC20165k
    public void accept(Object obj, Object obj2) {
        switch (this.f23103Y) {
            case 2:
                BinderC0416g binderC0416g = new BinderC0416g((C13599h) obj2, 1);
                C0414e c0414e = (C0414e) ((C0418i) obj).m13209q();
                C0410a c0410a = (C0410a) this.f23104Z;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(c0414e.f18446c);
                AbstractC6375a.m6990d(parcelObtain, binderC0416g);
                AbstractC6375a.m6989c(parcelObtain, c0410a);
                parcelObtain.writeStrongBinder(null);
                c0414e.m6112d(parcelObtain, 2);
                break;
            default:
                C5682c c5682c = (C5682c) this.f23104Z;
                BinderC5683d binderC5683d = new BinderC5683d((C13599h) obj2);
                C5693n c5693n = (C5693n) ((C5684e) obj).m13209q();
                Parcel parcelM6113i = c5693n.m6113i();
                int i10 = AbstractC5688i.f18460a;
                parcelM6113i.writeStrongBinder(binderC5683d);
                parcelM6113i.writeString(c5682c.f18451k);
                c5693n.m6114k(parcelM6113i, 2);
                break;
        }
    }

    @Override // p301M.InterfaceC5219a
    public InterfaceFutureC13608b apply(Object obj) {
        return AbstractC5229k.m5779c(((InterfaceC20412a) this.f23104Z).mo22421apply(obj));
    }

    @Override // p259K5.InterfaceC4545g
    /* JADX INFO: renamed from: b */
    public long mo5312b() {
        return 0L;
    }

    @Override // p030B2.InterfaceC0749c
    public C0755f build() {
        return new C0755f(new C10808o(((ContentInfo.Builder) this.f23104Z).build()));
    }

    @Override // p182H3.InterfaceC3211l
    /* JADX INFO: renamed from: c */
    public void mo4068c(int i10, C0799c c0799c, long j10, int i11) {
        ((MediaCodec) this.f23104Z).queueSecureInputBuffer(i10, 0, c0799c.f2222i, j10, i11);
    }

    @Override // p030B2.InterfaceC0749c
    /* JADX INFO: renamed from: d */
    public void mo1596d(Bundle bundle) {
        ((ContentInfo.Builder) this.f23104Z).setExtras(bundle);
    }

    @Override // p182H3.InterfaceC3211l
    /* JADX INFO: renamed from: e */
    public void mo4069e(int i10, int i11, int i12, long j10) {
        ((MediaCodec) this.f23104Z).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // p497U6.InterfaceC7569a
    /* JADX INFO: renamed from: f */
    public void mo7759f(C6815a c6815a) {
        switch (this.f23103Y) {
            case 25:
                C7259b error = (C7259b) c6815a;
                AbstractC16544l.m18094g(error, "error");
                ((C0624m) this.f23104Z).resumeWith(AbstractC9233X.m9806b(error));
                break;
            default:
                C7023b error2 = (C7023b) c6815a;
                AbstractC16544l.m18094g(error2, "error");
                boolean zEquals = "Unauthorized".equals(error2.m7419b());
                C7829v c7829v = (C7829v) this.f23104Z;
                if (zEquals) {
                    c7829v.f24723f.f22451a.getClass();
                    AbstractC15256t.m16465c("v", "Unable to complete authentication with PKCE. PKCE support can be enabled by setting Application Type to 'Native' and Token Endpoint Authentication Method to 'None' for this app at 'https://manage.auth0.com/#/applications/dBPYPHX8xGTuepNhXZJCycwsystDsw7Y/settings'.");
                }
                c7829v.f24718a.mo7759f(error2);
                break;
        }
    }

    @Override // p080D0.InterfaceC1812k
    /* JADX INFO: renamed from: g */
    public boolean mo461g(long j10, C1826r c1826r) {
        C20750g0 c20750g0;
        C1837w0 c1837w0 = (C1837w0) this.f23104Z;
        if (!c1837w0.m2684h() || c1837w0.m2686j().f19682a.f10934Y.length() == 0 || (c20750g0 = c1837w0.f5308d) == null || c20750g0.m21294d() == null) {
            return false;
        }
        m7757I(c1837w0.m2686j(), j10, false, c1826r);
        return true;
    }

    @Override // p030B2.InterfaceC0749c
    /* JADX INFO: renamed from: h */
    public void mo1597h(Uri uri) {
        ((ContentInfo.Builder) this.f23104Z).setLinkUri(uri);
    }

    @Override // p259K5.InterfaceC4545g
    /* JADX INFO: renamed from: j */
    public C4540b mo5314j(C4539a c4539a) {
        return null;
    }

    @Override // p030B2.InterfaceC0749c
    /* JADX INFO: renamed from: k */
    public void mo1598k(int i10) {
        ((ContentInfo.Builder) this.f23104Z).setFlags(i10);
    }

    @Override // p035B7.InterfaceC0847d
    /* JADX INFO: renamed from: l */
    public long mo1907l() {
        return System.currentTimeMillis();
    }

    @Override // p035B7.InterfaceC0847d
    /* JADX INFO: renamed from: m */
    public long mo1908m() {
        C19837b c19837b;
        C20520d c20520d = ((C20183a) this.f23104Z).f63921a;
        c20520d.m21185a();
        C21585H c21585h = c20520d.f65141e;
        C14437f c14437f = (C14437f) c21585h.f68344Z;
        long j10 = ((SharedPreferences) c14437f.f45413Y).getLong("com.lyft.kronos.cached_current_time", 0L);
        long j11 = ((SharedPreferences) c14437f.f45413Y).getLong("com.lyft.kronos.cached_elapsed_time", 0L);
        C15411n0 c15411n0 = j11 == 0 ? null : new C15411n0(j10, j11, ((SharedPreferences) c14437f.f45413Y).getLong("com.lyft.kronos.cached_offset", 0L), (C16831c) c21585h.f68345o0);
        if (((EnumC20518b) c20520d.f65137a.get()) == EnumC20518b.f65132Y && c15411n0 != null && Math.abs((c15411n0.f48031a - c15411n0.f48032b) - (System.currentTimeMillis() - SystemClock.elapsedRealtime())) >= 1000) {
            C21585H c21585h2 = c20520d.f65141e;
            synchronized (c21585h2) {
                ((SharedPreferences) ((C14437f) c21585h2.f68344Z).f45413Y).edit().clear().apply();
            }
            c15411n0 = null;
        }
        if (c15411n0 == null) {
            if (SystemClock.elapsedRealtime() - c20520d.f65138b.get() >= c20520d.f65145i) {
                c20520d.m21186b();
            }
            c19837b = null;
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - c15411n0.f48032b;
            if (jElapsedRealtime >= c20520d.f65146j && SystemClock.elapsedRealtime() - c20520d.f65138b.get() >= c20520d.f65145i) {
                c20520d.m21186b();
            }
            c19837b = new C19837b((SystemClock.elapsedRealtime() - c15411n0.f48032b) + c15411n0.f48031a + c15411n0.f48033c, Long.valueOf(jElapsedRealtime));
        }
        if (c19837b == null) {
            c19837b = new C19837b(System.currentTimeMillis(), null);
        }
        return c19837b.f62906a;
    }

    @Override // p259K5.InterfaceC4545g
    /* JADX INFO: renamed from: n */
    public boolean mo5315n(C4539a c4539a) {
        return false;
    }

    @Override // p301M.InterfaceC5221c, p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        boolean z6 = false;
        switch (this.f23103Y) {
            case 12:
                break;
            case 25:
                Credentials result = (Credentials) obj;
                AbstractC16544l.m18094g(result, "result");
                ((C0624m) this.f23104Z).resumeWith(result);
                break;
            case 27:
                Credentials credentials = (Credentials) obj;
                AbstractC16544l.m18094g(credentials, "credentials");
                String strM13171c = credentials.getIdToken();
                C7829v c7829v = (C7829v) this.f23104Z;
                C11248s c11248s = new C11248s(c7829v, credentials, z6, 14);
                c7829v.getClass();
                if (TextUtils.isEmpty(strM13171c)) {
                    c11248s.mo7759f(new C7822o());
                } else {
                    try {
                        AbstractC16544l.m18091d(strM13171c);
                        C11850i c11850i = new C11850i(strM13171c);
                        C11242m c11242m = new C11242m(c11248s, c7829v, c11850i);
                        C7022a c7022a = c7829v.f24723f;
                        String strValueOf = String.valueOf(c7022a.f22451a.f56322a);
                        C13187c c13187c = new C13187c(1);
                        c13187c.m14844f(null, strValueOf);
                        C13187c c13187cM19025f = c13187c.m14841c().m19025f();
                        c13187cM19025f.m14839a(".well-known");
                        c13187cM19025f.m14839a("jwks.json");
                        C17349p c17349pM14841c = c13187cM19025f.m14841c();
                        C3669l gson = c7022a.f22453c;
                        AbstractC16544l.m18094g(gson, "gson");
                        TypeToken<?> parameterized = TypeToken.getParameterized(Map.class, String.class, PublicKey.class);
                        AbstractC16544l.m18092e(parameterized, "null cannot be cast to non-null type com.google.gson.reflect.TypeToken<kotlin.collections.Map<kotlin.String, T of com.auth0.android.request.internal.GsonAdapter.Companion.forMapOf>>");
                        C11845d c11845d = new C11845d(gson, parameterized);
                        C13711h c13711h = c7022a.f22452b;
                        c13711h.getClass();
                        c13711h.m15190M(C8433c.f26257b, c17349pM14841c.f55294i, c11845d, (C7024c) c13711h.f43261p0).m65D(new C21585H(c11850i.f35985e, 9, c11242m));
                    } catch (Exception e10) {
                        c11248s.mo7759f(new C7802E(e10));
                        return;
                    }
                }
                break;
            default:
                ((C7293c) this.f23104Z).invoke(obj);
                break;
        }
    }

    @Override // p080D0.InterfaceC1812k
    /* JADX INFO: renamed from: p */
    public boolean mo463p(long j10, C1826r c1826r) {
        C20750g0 c20750g0;
        C1837w0 c1837w0 = (C1837w0) this.f23104Z;
        if (!c1837w0.m2684h() || c1837w0.m2686j().f19682a.f10934Y.length() == 0 || (c20750g0 = c1837w0.f5308d) == null || c20750g0.m21294d() == null) {
            return false;
        }
        C13522n c13522n = c1837w0.f5313i;
        if (c13522n != null) {
            c13522n.m15073b();
        }
        c1837w0.f5316l = j10;
        c1837w0.f5321q = -1;
        c1837w0.m2682f(true);
        m7757I(c1837w0.m2686j(), c1837w0.f5316l, true, c1826r);
        return true;
    }

    @Override // p259K5.InterfaceC4545g
    /* JADX INFO: renamed from: q */
    public void mo5316q(C4539a c4539a, InterfaceC0829m interfaceC0829m, Map map, long j10) {
        ((C4544f) this.f23104Z).m5309c(c4539a, interfaceC0829m, map, j10);
    }

    @Override // p182H3.InterfaceC3211l
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f23104Z).setParameters(bundle);
    }

    /* JADX INFO: renamed from: t */
    public void m7761t(C1902a c1902a) {
        int i10 = c1902a.f5561a;
        RecyclerView recyclerView = (RecyclerView) this.f23104Z;
        if (i10 == 1) {
            recyclerView.f33592B0.mo2940V(c1902a.f5562b, c1902a.f5564d);
            return;
        }
        if (i10 == 2) {
            recyclerView.f33592B0.mo2943Y(c1902a.f5562b, c1902a.f5564d);
        } else if (i10 == 4) {
            recyclerView.f33592B0.mo2944Z(c1902a.f5562b, c1902a.f5564d);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.f33592B0.mo2942X(c1902a.f5562b, c1902a.f5564d);
        }
    }

    @Override // androidx.lifecycle.InterfaceC11070F
    /* JADX INFO: renamed from: u */
    public void mo259u(Object obj) {
        if (((InterfaceC11112u) obj) != null) {
            DialogInterfaceOnCancelListenerC9628l dialogInterfaceOnCancelListenerC9628l = (DialogInterfaceOnCancelListenerC9628l) this.f23104Z;
            if (dialogInterfaceOnCancelListenerC9628l.f29017m1) {
                View viewM11744N = dialogInterfaceOnCancelListenerC9628l.m11744N();
                if (viewM11744N.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogInterfaceOnCancelListenerC9628l.f29021q1 != null) {
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC9628l.f29021q1);
                    }
                    dialogInterfaceOnCancelListenerC9628l.f29021q1.setContentView(viewM11744N);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public AbstractC1933p0 m7762v(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f23104Z;
        int iM3076k = recyclerView.f33650t0.m3076k();
        AbstractC1933p0 abstractC1933p0 = null;
        for (int i11 = 0; i11 < iM3076k; i11++) {
            AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(recyclerView.f33650t0.m3075j(i11));
            if (abstractC1933p0M12244L != null && !abstractC1933p0M12244L.m3095j() && abstractC1933p0M12244L.f5682c == i10) {
                if (!((ArrayList) recyclerView.f33650t0.f5616Z).contains(abstractC1933p0M12244L.f5680a)) {
                    abstractC1933p0 = abstractC1933p0M12244L;
                    break;
                }
                abstractC1933p0 = abstractC1933p0M12244L;
            }
        }
        if (abstractC1933p0 == null) {
            return null;
        }
        if (!((ArrayList) recyclerView.f33650t0.f5616Z).contains(abstractC1933p0.f5680a)) {
            return abstractC1933p0;
        }
        if (RecyclerView.f33581L1) {
            Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public InterfaceC0798b m7763w() {
        return null;
    }

    /* JADX INFO: renamed from: x */
    public C2656b m7764x() {
        return (C2656b) this.f23104Z;
    }

    /* JADX INFO: renamed from: y */
    public int m7765y() {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f23104Z;
        return Math.max(0, (sideSheetBehavior.f36689m - sideSheetBehavior.f36688l) - sideSheetBehavior.f36690n);
    }

    /* JADX INFO: renamed from: z */
    public UUID m7766z() {
        return AbstractC19780g.f62669a;
    }

    public /* synthetic */ C7296c(Object obj, int i10) {
        this.f23103Y = i10;
        this.f23104Z = obj;
    }

    /* JADX INFO: renamed from: C */
    public void m7751C(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.f23104Z;
        int iM3076k = recyclerView.f33650t0.m3076k();
        for (int i12 = 0; i12 < iM3076k; i12++) {
            AbstractC1933p0 abstractC1933p0M12244L = RecyclerView.m12244L(recyclerView.f33650t0.m3075j(i12));
            if (abstractC1933p0M12244L != null && !abstractC1933p0M12244L.m3102q() && abstractC1933p0M12244L.f5682c >= i10) {
                if (RecyclerView.f33581L1) {
                    Log.d("RecyclerView", ahZQMZ.RJFnjKtBIUtcA + i12 + " holder " + abstractC1933p0M12244L + " now at position " + (abstractC1933p0M12244L.f5682c + i11));
                }
                abstractC1933p0M12244L.m3099n(i11, false);
                recyclerView.f33647r1.f5641f = true;
            }
        }
        ArrayList arrayList = recyclerView.f33644q0.f5588c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC1933p0 abstractC1933p0 = (AbstractC1933p0) arrayList.get(i13);
            if (abstractC1933p0 != null && abstractC1933p0.f5682c >= i10) {
                if (RecyclerView.f33581L1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i13 + " holder " + abstractC1933p0 + " now at position " + (abstractC1933p0.f5682c + i11));
                }
                abstractC1933p0.m3099n(i11, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f33653u1 = true;
    }

    public C7296c(Context context) {
        this.f23103Y = 23;
        C2360b c2360b = new C2360b(context);
        C9418l c9418lM9995a = C9418l.m9995a(AbstractC6829b.f21910b);
        new C7591u(c2360b);
        C15026j c15026j = new C15026j();
        c15026j.f46724Y = c2360b;
        c15026j.f46725Z = c9418lM9995a;
        C9418l c9418lM9995a2 = C9418l.m9995a(c15026j);
        this.f23104Z = C9418l.m9995a(new C11234e(c9418lM9995a2, 13, C9418l.m9995a(new C3032c(c9418lM9995a2, 19))));
    }

    public C7296c(String str) {
        this.f23103Y = 21;
        this.f23104Z = AbstractC0168G.m532u("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
    }

    public C7296c(Set set) {
        this.f23103Y = 0;
        this.f23104Z = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C7295b c7295b = (C7295b) it.next();
            HashMap map = (HashMap) this.f23104Z;
            c7295b.getClass();
            map.put(AbstractC7294a.class, c7295b.f23102a);
        }
    }

    public C7296c(C16288h passportNfcReaderLauncher) {
        this.f23103Y = 26;
        AbstractC16544l.m18094g(passportNfcReaderLauncher, "passportNfcReaderLauncher");
        this.f23104Z = passportNfcReaderLauncher;
    }

    public C7296c(C3847l0 c3847l0) {
        this.f23103Y = 8;
        this.f23104Z = (TorchFlashRequiredFor3aUpdateQuirk) c3847l0.m4579f(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    @Override // p259K5.InterfaceC4545g
    public void clear() {
    }

    @Override // p182H3.InterfaceC3211l
    public void flush() {
    }

    @Override // p080D0.InterfaceC1812k
    /* JADX INFO: renamed from: o */
    public void mo462o() {
    }

    @Override // p182H3.InterfaceC3211l
    /* JADX INFO: renamed from: r */
    public void mo4070r() {
    }

    @Override // p182H3.InterfaceC3211l
    public void shutdown() {
    }

    @Override // p182H3.InterfaceC3211l
    public void start() {
    }

    public C7296c(int i10) {
        this.f23103Y = i10;
        switch (i10) {
            case 14:
                C17355v c17355v = (C17355v) AbstractC3005b.f9031a.getValue();
                c17355v.getClass();
                this.f23104Z = new C17356w(c17355v);
                break;
            case 15:
                this.f23104Z = null;
                break;
            default:
                this.f23104Z = (SmallDisplaySizeQuirk) AbstractC1762b.f5032a.m4579f(SmallDisplaySizeQuirk.class);
                break;
        }
    }

    /* JADX INFO: renamed from: F */
    public void m7754F(C2658d c2658d) {
    }

    @Override // p259K5.InterfaceC4545g
    /* JADX INFO: renamed from: i */
    public void mo5313i(long j10) {
    }

    /* JADX INFO: renamed from: s */
    public void m7760s(C2658d c2658d) {
    }

    public C7296c(ClipData clipData, int i10) {
        this.f23103Y = 3;
        this.f23104Z = AbstractC0259j.m841j(clipData, i10);
    }

    public C7296c(AbstractTextureViewSurfaceTextureListenerC6373j this$0) {
        this.f23103Y = 22;
        AbstractC16544l.m18094g(this$0, "this$0");
        this.f23104Z = this$0;
    }
}
