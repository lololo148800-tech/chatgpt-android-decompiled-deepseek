package p720e6;

import android.content.Context;
import android.content.IntentFilter;
import android.gov.nist.core.Separators;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0017I0;
import p001A.C0033Q0;
import p001A.C0100z;
import p001A.RunnableC0066i;
import p003A1.AbstractC0168G;
import p025An.C0624m;
import p084D4.AbstractC1893Q;
import p084D4.AbstractC1900Y;
import p084D4.C1901Z;
import p084D4.InterfaceC1953z0;
import p1009s9.C19506i;
import p1073w3.AbstractC20800b;
import p109E3.C2271L;
import p109E3.RunnableC2289m;
import p1138z.C21572a;
import p1139z0.C21585H;
import p126Ek.InterfaceC2568a;
import p167Gb.C3032c;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3830d;
import p228J.C3835f0;
import p228J.C3847l0;
import p228J.EnumC3803G;
import p228J.InterfaceC3805H;
import p228J.InterfaceC3856q;
import p265Kb.AbstractC4631x;
import p265Kb.InterfaceC4623p;
import p301M.InterfaceC5221c;
import p329N3.C5622l;
import p329N3.InterfaceC5633w;
import p329N3.RunnableC5632v;
import p334Na.C5696c;
import p357Oa.InterfaceC6150c;
import p444S4.C7011q;
import p468T2.InterfaceC7217i;
import p468T2.ThreadFactoryC7209a;
import p520V5.AbstractC7785n;
import p520V5.C7764B;
import p544W9.AbstractC8746y3;
import p566X4.AbstractC9050h;
import p566X4.C9048f;
import p571X9.AbstractC9172M3;
import p571X9.AbstractC9233X;
import p590Y4.AbstractC9647d;
import p590Y4.C9644a;
import p590Y4.C9648e;
import p590Y4.C9649f;
import p613Z4.AbstractC10159f;
import p613Z4.C10165l;
import p658b5.C11232c;
import p658b5.C11245p;
import p692d0.AbstractC12957J;
import p692d0.C12951D;
import p692d0.C12954G;
import p746fa.InterfaceC13595d;
import p779h6.AbstractC14413b;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p960q9.C18655i;

/* JADX INFO: renamed from: e6.c */
/* JADX INFO: loaded from: classes.dex */
public class C13288c implements InterfaceC5221c, InterfaceC1953z0, InterfaceC3856q, InterfaceC4623p, InterfaceC5633w, InterfaceC6150c, InterfaceC7217i, InterfaceC13595d {

    /* JADX INFO: renamed from: Y */
    public Object f42001Y;

    public /* synthetic */ C13288c(Object obj) {
        this.f42001Y = obj;
    }

    @Override // p084D4.InterfaceC1953z0
    /* JADX INFO: renamed from: A */
    public View mo3133A(int i10) {
        return ((AbstractC1900Y) this.f42001Y).m2983u(i10);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: H */
    public /* synthetic */ Set mo34H(C3828c c3828c) {
        return AbstractC0168G.m516e(this, c3828c);
    }

    @Override // p301M.InterfaceC5221c
    /* JADX INFO: renamed from: J */
    public void mo3912J(Throwable th2) {
        C0033Q0 c0033q0;
        C0033Q0 c0033q1 = (C0033Q0) this.f42001Y;
        c0033q1.m181q();
        c0033q1.f181u.m360D();
        C0017I0 c0017i0 = c0033q1.f162b;
        Iterator it = c0017i0.m82t().iterator();
        while (it.hasNext() && (c0033q0 = (C0033Q0) it.next()) != c0033q1) {
            c0033q0.m181q();
            c0033q0.f181u.m360D();
        }
        synchronized (c0017i0.f65Z) {
            ((LinkedHashSet) c0017i0.f68q0).remove(c0033q1);
        }
    }

    @Override // p084D4.InterfaceC1953z0
    /* JADX INFO: renamed from: L */
    public int mo3134L(View view) {
        C1901Z c1901z = (C1901Z) view.getLayoutParams();
        ((AbstractC1900Y) this.f42001Y).getClass();
        return view.getBottom() + ((C1901Z) view.getLayoutParams()).f5558b.bottom + ((ViewGroup.MarginLayoutParams) c1901z).bottomMargin;
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: M */
    public /* synthetic */ Object mo36M(C3828c c3828c, Object obj) {
        return AbstractC0168G.m520i(this, c3828c, obj);
    }

    /* JADX INFO: renamed from: N */
    public boolean m14913N(C11245p c11245p) {
        List list = (List) this.f42001Y;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            AbstractC9647d abstractC9647d = (AbstractC9647d) obj;
            abstractC9647d.getClass();
            if (abstractC9647d.mo10226b(c11245p) && abstractC9647d.mo10227c(abstractC9647d.f29073a.mo10755a())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            C7011q.m7408d().m7410a(AbstractC9050h.f27626a, "Work " + c11245p.f34041a + " constrained by " + AbstractC17680n.m19349Y(arrayList, null, null, null, 0, null, C9048f.f27621Y, 31));
        }
        return arrayList.isEmpty();
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: O */
    public /* synthetic */ boolean mo37O(C3828c c3828c) {
        return AbstractC0168G.m512a(this, c3828c);
    }

    @Override // p265Kb.InterfaceC4623p
    /* JADX INFO: renamed from: R */
    public Object mo3263R() {
        Class cls = (Class) this.f42001Y;
        try {
            return AbstractC4631x.f15080a.mo5373a(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }

    /* JADX INFO: renamed from: T */
    public C7764B m14914T(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        C7764B c7764bM8048f;
        C7764B c7764bM8045c;
        EnumC13286a enumC13286a;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean zContains = str2.contains("application/zip");
        C13287b c13287b = (C13287b) this.f42001Y;
        if (zContains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            AbstractC14413b.m15912a();
            EnumC13286a enumC13286a2 = EnumC13286a.f41995o0;
            if (str3 != null) {
                File fileM14912w = c13287b.m14912w(str, inputStream, enumC13286a2);
                c7764bM8048f = AbstractC7785n.m8048f(context, new ZipInputStream(AbstractC8746y3.m9492c(fileM14912w, new FileInputStream(fileM14912w))), str);
            } else {
                c7764bM8048f = AbstractC7785n.m8048f(context, new ZipInputStream(inputStream), null);
            }
            c7764bM8045c = c7764bM8048f;
            enumC13286a = enumC13286a2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            AbstractC14413b.m15912a();
            enumC13286a = EnumC13286a.GZIP;
            if (str3 != null) {
                File fileM14912w2 = c13287b.m14912w(str, inputStream, enumC13286a);
                c7764bM8045c = AbstractC7785n.m8045c(new GZIPInputStream(AbstractC8746y3.m9492c(fileM14912w2, new FileInputStream(fileM14912w2))), str);
            } else {
                c7764bM8045c = AbstractC7785n.m8045c(new GZIPInputStream(inputStream), null);
            }
        } else {
            AbstractC14413b.m15912a();
            enumC13286a = EnumC13286a.JSON;
            if (str3 != null) {
                String absolutePath = c13287b.m14912w(str, inputStream, enumC13286a).getAbsolutePath();
                c7764bM8045c = AbstractC7785n.m8045c(AbstractC8746y3.m9494e(new FileInputStream(absolutePath), absolutePath), str);
            } else {
                c7764bM8045c = AbstractC7785n.m8045c(inputStream, null);
            }
        }
        if (str3 != null && c7764bM8045c.f24539a != null) {
            File file = new File(c13287b.m14909r(), C13287b.m14898h(str, enumC13286a, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            AbstractC14413b.m15912a();
            if (!zRenameTo) {
                AbstractC14413b.m15913b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + Separators.DOT);
            }
        }
        return c7764bM8045c;
    }

    /* JADX INFO: renamed from: U */
    public ByteBuffer m14915U() {
        return ((Image.Plane) this.f42001Y).getBuffer();
    }

    /* JADX INFO: renamed from: V */
    public int m14916V() {
        return ((Image.Plane) this.f42001Y).getPixelStride();
    }

    /* JADX INFO: renamed from: W */
    public int m14917W() {
        return ((Image.Plane) this.f42001Y).getRowStride();
    }

    /* JADX INFO: renamed from: X */
    public void m14918X() {
        if (((C3835f0) getConfig()).mo36M(InterfaceC3856q.f11665f, null) != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m14919Y(Exception exc) {
        AbstractC20800b.m21325m("MediaCodecAudioRenderer", "Audio sink error", exc);
        C21585H c21585h = ((C2271L) this.f42001Y).f7007R1;
        Handler handler = (Handler) c21585h.f68344Z;
        if (handler != null) {
            handler.post(new RunnableC2289m(c21585h, exc, 5));
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m14920Z(int i10, int i11) {
        ((AbstractC1893Q) this.f42001Y).f5529a.m2907e(i10, i11);
    }

    @Override // p357Oa.InterfaceC6150c
    /* JADX INFO: renamed from: a */
    public Object mo3914a() {
        Context context = (Context) ((C18655i) ((C3032c) this.f42001Y).f9127Z).f59414Z;
        AbstractC0168G.m532u("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("AppUpdateListenerRegistry");
        new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        C5696c c5696c = new C5696c();
        new HashSet();
        context.getApplicationContext();
        return c5696c;
    }

    /* JADX INFO: renamed from: a0 */
    public void m14921a0(int i10, int i11) {
        ((AbstractC1893Q) this.f42001Y).f5529a.m2908f(i10, i11);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object mo39b(C3828c c3828c) {
        return AbstractC0168G.m519h(this, c3828c);
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m14922b0(Object obj, Object obj2) {
        C12951D c12951d = (C12951D) this.f42001Y;
        Object objM14619e = c12951d.m14619e(obj);
        if (objM14619e == null) {
            return false;
        }
        if (!(objM14619e instanceof C12954G)) {
            if (!objM14619e.equals(obj2)) {
                return false;
            }
            c12951d.m14621g(obj);
            return true;
        }
        C12954G c12954g = (C12954G) objM14619e;
        boolean zM14633j = c12954g.m14633j(obj2);
        if (zM14633j && c12954g.m14630g()) {
            c12951d.m14621g(obj);
        }
        return zM14633j;
    }

    /* JADX INFO: renamed from: c0 */
    public void m14923c0(Object obj) {
        boolean zM14630g;
        C12951D c12951d = (C12951D) this.f42001Y;
        long[] jArr = c12951d.f41123a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = c12951d.f41124b[i13];
                        Object obj3 = c12951d.f41125c[i13];
                        if (obj3 instanceof C12954G) {
                            AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            C12954G c12954g = (C12954G) obj3;
                            c12954g.m14633j(obj);
                            zM14630g = c12954g.m14630g();
                        } else {
                            zM14630g = obj3 == obj;
                        }
                        if (zM14630g) {
                            c12951d.m14622h(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // p084D4.InterfaceC1953z0
    /* JADX INFO: renamed from: d */
    public int mo3135d(View view) {
        C1901Z c1901z = (C1901Z) view.getLayoutParams();
        ((AbstractC1900Y) this.f42001Y).getClass();
        return (view.getTop() - ((C1901Z) view.getLayoutParams()).f5558b.top) - ((ViewGroup.MarginLayoutParams) c1901z).topMargin;
    }

    /* JADX INFO: renamed from: d0 */
    public void m14924d0(CaptureRequest.Key key, Object obj) {
        C3828c c3828cM21847d0 = C21572a.m21847d0(key);
        C19506i c19506i = (C19506i) this.f42001Y;
        ((C3825a0) c19506i.f61960Z).m4560t(c3828cM21847d0, EnumC3803G.f11502Y, obj);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void mo41e(C0100z c0100z) {
        AbstractC0168G.m513b(this, c0100z);
    }

    @Override // p228J.InterfaceC3849m0
    public InterfaceC3805H getConfig() {
        return C3835f0.f11603o0;
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: h */
    public /* synthetic */ EnumC3803G mo42h(C3828c c3828c) {
        return AbstractC0168G.m515d(this, c3828c);
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: k */
    public /* synthetic */ Set mo44k() {
        return AbstractC0168G.m517f(this);
    }

    @Override // p329N3.InterfaceC5633w
    /* JADX INFO: renamed from: o */
    public void mo3669o() {
        ((C5622l) this.f42001Y).m6021G0(0, 1);
    }

    @Override // p746fa.InterfaceC13595d
    public void onFailure(Exception exc) {
        ((C0624m) this.f42001Y).resumeWith(AbstractC9233X.m9806b(exc));
    }

    @Override // p329N3.InterfaceC5633w
    public void onFirstFrameRendered() {
        C5622l c5622l = (C5622l) this.f42001Y;
        AbstractC20800b.m21321i(c5622l.f18222e2);
        Surface surface = c5622l.f18222e2;
        C11232c c11232c = c5622l.f18211S1;
        Handler handler = (Handler) c11232c.f33996Y;
        if (handler != null) {
            handler.post(new RunnableC5632v(c11232c, surface, SystemClock.elapsedRealtime(), 0));
        }
        c5622l.f18225h2 = true;
    }

    @Override // p301M.InterfaceC5221c, p746fa.InterfaceC13596e
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // p228J.InterfaceC3805H
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object mo49q(C3828c c3828c, EnumC3803G enumC3803G) {
        return AbstractC0168G.m521j(this, c3828c, enumC3803G);
    }

    @Override // p084D4.InterfaceC1953z0
    /* JADX INFO: renamed from: t */
    public int mo3136t() {
        return ((AbstractC1900Y) this.f42001Y).m2927E();
    }

    @Override // p468T2.InterfaceC7217i
    /* JADX INFO: renamed from: x */
    public void mo7608x(AbstractC9172M3 abstractC9172M3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC7209a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0066i(this, abstractC9172M3, threadPoolExecutor, 15));
    }

    /* JADX INFO: renamed from: y */
    public void m14925y(Object obj, Object obj2) {
        C12951D c12951d = (C12951D) this.f42001Y;
        int iM14618d = c12951d.m14618d(obj);
        boolean z6 = iM14618d < 0;
        Object obj3 = z6 ? null : c12951d.f41125c[iM14618d];
        if (obj3 != null) {
            if (obj3 instanceof C12954G) {
                ((C12954G) obj3).m14624a(obj2);
            } else if (obj3 != obj2) {
                C12954G c12954g = new C12954G();
                c12954g.m14624a(obj3);
                c12954g.m14624a(obj2);
                obj2 = c12954g;
            }
            obj2 = obj3;
        }
        if (!z6) {
            c12951d.f41125c[iM14618d] = obj2;
            return;
        }
        int i10 = ~iM14618d;
        c12951d.f41124b[i10] = obj;
        c12951d.f41125c[i10] = obj2;
    }

    @Override // p084D4.InterfaceC1953z0
    /* JADX INFO: renamed from: z */
    public int mo3137z() {
        AbstractC1900Y abstractC1900Y = (AbstractC1900Y) this.f42001Y;
        return abstractC1900Y.f5556o - abstractC1900Y.m2924B();
    }

    public C13288c(InterfaceC2568a service) {
        AbstractC16544l.m18094g(service, "service");
        this.f42001Y = service;
    }

    public C13288c(int i10) {
        switch (i10) {
            case 17:
                this.f42001Y = new CopyOnWriteArrayList();
                break;
            case 23:
                long[] jArr = AbstractC12957J.f41150a;
                this.f42001Y = new C12951D();
                break;
            default:
                this.f42001Y = new C3830d(new Object());
                break;
        }
    }

    public C13288c(int i10, C3847l0 c3847l0) {
        switch (i10) {
            case 21:
                this.f42001Y = (IncorrectJpegMetadataQuirk) c3847l0.m4579f(IncorrectJpegMetadataQuirk.class);
                break;
            default:
                this.f42001Y = (CaptureSessionOnClosedNotCalledQuirk) c3847l0.m4579f(CaptureSessionOnClosedNotCalledQuirk.class);
                break;
        }
    }

    public C13288c(C10165l trackers) {
        AbstractC16544l.m18094g(trackers, "trackers");
        C9644a c9644a = new C9644a(trackers.f30100a, 0);
        C9644a c9644a2 = new C9644a(trackers.f30101b);
        C9644a c9644a3 = new C9644a(trackers.f30103d, 4);
        AbstractC10159f abstractC10159f = trackers.f30102c;
        this.f42001Y = AbstractC17681o.m19382k(c9644a, c9644a2, c9644a3, new C9644a(abstractC10159f, 2), new C9644a(abstractC10159f, 3), new C9649f(abstractC10159f), new C9648e(abstractC10159f));
    }
}
