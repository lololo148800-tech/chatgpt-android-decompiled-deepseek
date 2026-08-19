package p178H;

import android.gov.nist.core.Separators;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.javax.sip.C10808o;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p001A.AbstractC0010F;
import p001A.C0011F0;
import p003A1.AbstractC0168G;
import p028B.RunnableC0696c;
import p1138z.C21572a;
import p117Eb.C2392v;
import p202I.C3525a;
import p202I.C3530f;
import p202I.C3539o;
import p228J.AbstractC3794B0;
import p228J.C3815Q;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3832e;
import p228J.C3835f0;
import p228J.C3836g;
import p228J.C3857q0;
import p228J.C3859r0;
import p228J.InterfaceC3798D0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3805H;
import p228J.InterfaceC3806H0;
import p228J.InterfaceC3816S;
import p228J.InterfaceC3818U;
import p228J.InterfaceC3866v;
import p228J.InterfaceC3870x;
import p253K.AbstractC4503n;
import p283L5.AbstractC4941g;
import p326N.C5567i;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8488H2;
import p544W9.AbstractC8577W2;
import p720e6.C13287b;
import p720e6.C13288c;
import p806ia.nJAW.FpwNpGDhomXHZ;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;

/* JADX INFO: renamed from: H.P */
/* JADX INFO: loaded from: classes.dex */
public final class C3123P extends AbstractC3174u0 {

    /* JADX INFO: renamed from: z */
    public static final C3120M f9401z = new C3120M();

    /* JADX INFO: renamed from: o */
    public final int f9402o;

    /* JADX INFO: renamed from: p */
    public final AtomicReference f9403p;

    /* JADX INFO: renamed from: q */
    public final int f9404q;

    /* JADX INFO: renamed from: r */
    public final int f9405r;

    /* JADX INFO: renamed from: s */
    public Rational f9406s;

    /* JADX INFO: renamed from: t */
    public final C5567i f9407t;

    /* JADX INFO: renamed from: u */
    public C3857q0 f9408u;

    /* JADX INFO: renamed from: v */
    public C2392v f9409v;

    /* JADX INFO: renamed from: w */
    public C3539o f9410w;

    /* JADX INFO: renamed from: x */
    public C3859r0 f9411x;

    /* JADX INFO: renamed from: y */
    public final C10808o f9412y;

    public C3123P(C3815Q c3815q) {
        super(c3815q);
        this.f9403p = new AtomicReference(null);
        this.f9405r = -1;
        this.f9406s = null;
        this.f9412y = new C10808o(this, 10);
        C3815Q c3815q2 = (C3815Q) this.f9565f;
        C3828c c3828c = C3815Q.f11548Z;
        if (c3815q2.mo37O(c3828c)) {
            this.f9402o = ((Integer) AbstractC0168G.m519h(c3815q2, c3828c)).intValue();
        } else {
            this.f9402o = 1;
        }
        this.f9404q = ((Integer) c3815q2.mo36M(C3815Q.f11555u0, 0)).intValue();
        this.f9407t = new C5567i((InterfaceC3122O) c3815q2.mo36M(C3815Q.f11557w0, null));
    }

    /* JADX INFO: renamed from: E */
    public static boolean m3955E(int i10, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i10))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    public final void m3956B(boolean z6) {
        C3539o c3539o;
        Log.d("ImageCapture", "clearPipeline");
        AbstractC8488H2.m9140a();
        C3859r0 c3859r0 = this.f9411x;
        if (c3859r0 != null) {
            c3859r0.m4587b();
            this.f9411x = null;
        }
        C2392v c2392v = this.f9409v;
        if (c2392v != null) {
            c2392v.m3558o();
            this.f9409v = null;
        }
        if (z6 || (c3539o = this.f9410w) == null) {
            return;
        }
        c3539o.m4221b();
        this.f9410w = null;
    }

    /* JADX INFO: renamed from: C */
    public final C3857q0 m3957C(String str, C3815Q c3815q, C3836g c3836g) {
        AbstractC8488H2.m9140a();
        Log.d("ImageCapture", "createPipeline(cameraId: " + str + ", streamSpec: " + c3836g + Separators.RPAREN);
        Size size = c3836g.f11606a;
        InterfaceC3870x interfaceC3870xM4009b = m4009b();
        Objects.requireNonNull(interfaceC3870xM4009b);
        boolean zMo120p = interfaceC3870xM4009b.mo120p() ^ true;
        if (this.f9409v != null) {
            AbstractC4941g.m5559R(null, zMo120p);
            this.f9409v.m3558o();
        }
        if (((Boolean) this.f9565f.mo36M(C3815Q.f11558x0, Boolean.FALSE)).booleanValue()) {
            ((C13288c) m4009b().mo112h()).m14918X();
        }
        this.f9409v = new C2392v(c3815q, size, zMo120p);
        if (this.f9410w == null) {
            this.f9410w = new C3539o(this.f9412y);
        }
        C3539o c3539o = this.f9410w;
        C2392v c2392v = this.f9409v;
        c3539o.getClass();
        AbstractC8488H2.m9140a();
        c3539o.f10715o0 = c2392v;
        c2392v.getClass();
        AbstractC8488H2.m9140a();
        C2392v c2392v2 = (C2392v) c2392v.f7438p0;
        c2392v2.getClass();
        AbstractC8488H2.m9140a();
        AbstractC4941g.m5559R("The ImageReader is not initialized.", ((C3150i0) c2392v2.f7437o0) != null);
        C3150i0 c3150i0 = (C3150i0) c2392v2.f7437o0;
        synchronized (c3150i0.f9475Y) {
            c3150i0.f9480r0 = c3539o;
        }
        C2392v c2392v3 = this.f9409v;
        C3857q0 c3857q0M4583d = C3857q0.m4583d((C3815Q) c2392v3.f7436Z, c3836g.f11606a);
        C3525a c3525a = (C3525a) c2392v3.f7440r0;
        C3162o0 c3162o0 = c3525a.f10654b;
        Objects.requireNonNull(c3162o0);
        C3175v c3175v = C3175v.f9575d;
        C2392v c2392vM4567a = C3832e.m4567a(c3162o0);
        c2392vM4567a.f7440r0 = c3175v;
        c3857q0M4583d.f11655a.add(c2392vM4567a.m3556m());
        C3162o0 c3162o1 = c3525a.f10655c;
        if (c3162o1 != null) {
            c3857q0M4583d.f11662h = C3832e.m4567a(c3162o1).m3556m();
        }
        if (this.f9402o == 2 && !c3836g.f11610e) {
            m4010c().mo296E(c3857q0M4583d);
        }
        C21572a c21572a = c3836g.f11609d;
        if (c21572a != null) {
            c3857q0M4583d.f11656b.m243c(c21572a);
        }
        C3859r0 c3859r0 = this.f9411x;
        if (c3859r0 != null) {
            c3859r0.m4587b();
        }
        C3859r0 c3859r1 = new C3859r0(new C0011F0(this, 2));
        this.f9411x = c3859r1;
        c3857q0M4583d.f11660f = c3859r1;
        return c3857q0M4583d;
    }

    /* JADX INFO: renamed from: D */
    public final int m3958D() {
        int iIntValue;
        synchronized (this.f9403p) {
            iIntValue = this.f9405r;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((C3815Q) this.f9565f).mo36M(C3815Q.f11549o0, 2)).intValue();
            }
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: F */
    public final void m3959F(C2392v c2392v, Executor executor, InterfaceC3121N interfaceC3121N) {
        Rect rect;
        int iRound;
        int i10;
        int i11;
        int i12;
        int iIntValue;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            AbstractC8577W2.m9243e().execute(new RunnableC0696c(this, c2392v, executor, interfaceC3121N, 3));
            return;
        }
        AbstractC8488H2.m9140a();
        if (m3958D() == 3 && this.f9407t.f18056a == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        Log.d("ImageCapture", "takePictureInternal");
        InterfaceC3870x interfaceC3870xM4009b = m4009b();
        Rect rect2 = null;
        if (interfaceC3870xM4009b == null) {
            interfaceC3121N.mo3915c(new C3124Q("Not bound to a valid Camera [" + this + "]", null));
            return;
        }
        C3539o c3539o = this.f9410w;
        Objects.requireNonNull(c3539o);
        Rect rect3 = this.f9568i;
        C3836g c3836g = this.f9566g;
        Size size = c3836g != null ? c3836g.f11606a : null;
        Objects.requireNonNull(size);
        if (rect3 != null) {
            rect = rect3;
        } else {
            Rational rational = this.f9406s;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            } else {
                InterfaceC3870x interfaceC3870xM4009b2 = m4009b();
                Objects.requireNonNull(interfaceC3870xM4009b2);
                int iM4013g = m4013g(interfaceC3870xM4009b2, false);
                Rational rational2 = new Rational(this.f9406s.getDenominator(), this.f9406s.getNumerator());
                if (!AbstractC4503n.m5247c(iM4013g)) {
                    rational2 = this.f9406s;
                }
                if (rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) {
                    AbstractC8072d6.m8492i("ImageUtil", "Invalid view ratio.");
                } else {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    float f10 = width;
                    float f11 = height;
                    float f12 = f10 / f11;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f12) {
                        int iRound2 = Math.round((f10 / numerator) * denominator);
                        i12 = (height - iRound2) / 2;
                        i11 = iRound2;
                        iRound = width;
                        i10 = 0;
                    } else {
                        iRound = Math.round((f11 / denominator) * numerator);
                        i10 = (width - iRound) / 2;
                        i11 = height;
                        i12 = 0;
                    }
                    rect2 = new Rect(i10, i12, iRound + i10, i11 + i12);
                }
                Objects.requireNonNull(rect2);
            }
            rect = rect2;
        }
        Matrix matrix = this.f9569j;
        int iM4013g2 = m4013g(interfaceC3870xM4009b, false);
        C3815Q c3815q = (C3815Q) this.f9565f;
        C3828c c3828c = C3815Q.f11556v0;
        if (c3815q.mo37O(c3828c)) {
            iIntValue = ((Integer) ((C3835f0) c3815q.getConfig()).mo39b(c3828c)).intValue();
        } else {
            int i13 = this.f9402o;
            if (i13 == 0) {
                iIntValue = 100;
            } else {
                if (i13 != 1 && i13 != 2) {
                    throw new IllegalStateException(AbstractC0010F.m19c(i13, "CaptureMode ", " is invalid"));
                }
                iIntValue = 95;
            }
        }
        int i14 = iIntValue;
        List listUnmodifiableList = DesugarCollections.unmodifiableList(this.f9408u.f11659e);
        AbstractC4941g.m5554M("onDiskCallback and outputFileOptions should be both null or both non-null.", !false);
        C3530f c3530f = new C3530f(executor, interfaceC3121N, c2392v, rect, matrix, iM4013g2, i14, this.f9402o, listUnmodifiableList);
        AbstractC8488H2.m9140a();
        c3539o.f10713Y.offer(c3530f);
        c3539o.m4222c();
    }

    /* JADX INFO: renamed from: G */
    public final void m3960G() {
        synchronized (this.f9403p) {
            try {
                if (this.f9403p.get() != null) {
                    return;
                }
                m4010c().mo307l(m3958D());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: e */
    public final InterfaceC3800E0 mo3936e(boolean z6, InterfaceC3806H0 interfaceC3806H0) {
        f9401z.getClass();
        C3815Q c3815q = C3120M.f9400a;
        c3815q.getClass();
        InterfaceC3805H interfaceC3805HMo248a = interfaceC3806H0.mo248a(AbstractC3794B0.m4476a(c3815q), this.f9402o);
        if (z6) {
            interfaceC3805HMo248a = AbstractC0168G.m509D(interfaceC3805HMo248a, c3815q);
        }
        if (interfaceC3805HMo248a == null) {
            return null;
        }
        return new C3815Q(C3835f0.m4568a((C3825a0) ((C13287b) mo3937j(interfaceC3805HMo248a)).f42000Z));
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: i */
    public final Set mo3961i() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: j */
    public final InterfaceC3798D0 mo3937j(InterfaceC3805H interfaceC3805H) {
        return new C13287b(C3825a0.m4559o(interfaceC3805H));
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: p */
    public final void mo3938p() {
        AbstractC4941g.m5558Q(m4009b(), "Attached camera cannot be null");
        if (m3958D() == 3) {
            InterfaceC3870x interfaceC3870xM4009b = m4009b();
            if ((interfaceC3870xM4009b != null ? interfaceC3870xM4009b.mo105a().mo141f() : -1) != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: q */
    public final void mo3962q() {
        AbstractC8072d6.m8486c("ImageCapture", "onCameraControlReady");
        m3960G();
        m4010c().mo314u(this.f9407t);
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: t */
    public final void mo3963t() {
        C5567i c5567i = this.f9407t;
        c5567i.m5976c();
        c5567i.m5975b();
        C3539o c3539o = this.f9410w;
        if (c3539o != null) {
            c3539o.m4221b();
        }
    }

    public final String toString() {
        return "ImageCapture:".concat(m4012f());
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: u */
    public final C3836g mo3940u(C21572a c21572a) {
        this.f9408u.m4584a(c21572a);
        Object[] objArr = {this.f9408u.m4586c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4007A(DesugarCollections.unmodifiableList(arrayList));
        C2392v c2392vM4569a = this.f9566g.m4569a();
        c2392vM4569a.f7439q0 = c21572a;
        return c2392vM4569a.m3557n();
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: v */
    public final C3836g mo3941v(C3836g c3836g, C3836g c3836g2) {
        C3857q0 c3857q0M3957C = m3957C(m4011d(), (C3815Q) this.f9565f, c3836g);
        this.f9408u = c3857q0M3957C;
        Object[] objArr = {c3857q0M3957C.m4586c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4007A(DesugarCollections.unmodifiableList(arrayList));
        m4017m();
        return c3836g;
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: w */
    public final void mo3942w() {
        C5567i c5567i = this.f9407t;
        c5567i.m5976c();
        c5567i.m5975b();
        C3539o c3539o = this.f9410w;
        if (c3539o != null) {
            c3539o.m4221b();
        }
        m3956B(false);
        m4010c().mo314u(null);
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: r */
    public final InterfaceC3800E0 mo3939r(InterfaceC3866v interfaceC3866v, InterfaceC3798D0 interfaceC3798D0) {
        Object objMo39b;
        Object objMo39b2;
        Object objMo39b3;
        if (interfaceC3866v.mo145j().m4578e(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            C3825a0 c3825a0Mo3780o = interfaceC3798D0.mo3780o();
            C3828c c3828c = C3815Q.f11554t0;
            Object objMo39b4 = Boolean.TRUE;
            c3825a0Mo3780o.getClass();
            try {
                objMo39b4 = c3825a0Mo3780o.mo39b(c3828c);
            } catch (IllegalArgumentException unused) {
            }
            if (bool.equals(objMo39b4)) {
                AbstractC8072d6.m8492i("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                String strM8491h = AbstractC8072d6.m8491h("ImageCapture");
                if (AbstractC8072d6.m8490g(4, strM8491h)) {
                    Log.i(strM8491h, "Requesting software JPEG due to device quirk.");
                }
                interfaceC3798D0.mo3780o().m4561x(C3815Q.f11554t0, Boolean.TRUE);
            }
        }
        C3825a0 c3825a0Mo3780o2 = interfaceC3798D0.mo3780o();
        Boolean bool2 = Boolean.TRUE;
        C3828c c3828c2 = C3815Q.f11554t0;
        Object objMo39b5 = Boolean.FALSE;
        c3825a0Mo3780o2.getClass();
        try {
            objMo39b5 = c3825a0Mo3780o2.mo39b(c3828c2);
        } catch (IllegalArgumentException unused2) {
        }
        boolean zEquals = bool2.equals(objMo39b5);
        Object objMo39b6 = null;
        boolean z6 = false;
        if (zEquals) {
            if (m4009b() != null) {
                ((C13288c) m4009b().mo112h()).m14918X();
            }
            try {
                objMo39b3 = c3825a0Mo3780o2.mo39b(C3815Q.f11551q0);
            } catch (IllegalArgumentException unused3) {
                objMo39b3 = null;
            }
            Integer num = (Integer) objMo39b3;
            if (num != null && num.intValue() != 256) {
                AbstractC8072d6.m8492i("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            } else {
                z6 = true;
            }
            if (!z6) {
                AbstractC8072d6.m8492i("ImageCapture", FpwNpGDhomXHZ.kwyXC);
                c3825a0Mo3780o2.m4561x(C3815Q.f11554t0, Boolean.FALSE);
            }
        }
        C3825a0 c3825a0Mo3780o3 = interfaceC3798D0.mo3780o();
        C3828c c3828c3 = C3815Q.f11551q0;
        c3825a0Mo3780o3.getClass();
        try {
            objMo39b = c3825a0Mo3780o3.mo39b(c3828c3);
        } catch (IllegalArgumentException unused4) {
            objMo39b = null;
        }
        Integer num2 = (Integer) objMo39b;
        int iIntValue = 35;
        if (num2 != null) {
            if (m4009b() != null) {
                ((C13288c) m4009b().mo112h()).m14918X();
            }
            C3825a0 c3825a0Mo3780o4 = interfaceC3798D0.mo3780o();
            C3828c c3828c4 = InterfaceC3816S.f11560j;
            if (!z6) {
                iIntValue = num2.intValue();
            }
            c3825a0Mo3780o4.m4561x(c3828c4, Integer.valueOf(iIntValue));
        } else {
            C3825a0 c3825a0Mo3780o5 = interfaceC3798D0.mo3780o();
            C3828c c3828c5 = C3815Q.f11552r0;
            c3825a0Mo3780o5.getClass();
            try {
                objMo39b2 = c3825a0Mo3780o5.mo39b(c3828c5);
            } catch (IllegalArgumentException unused5) {
                objMo39b2 = null;
            }
            if (Objects.equals(objMo39b2, 1)) {
                interfaceC3798D0.mo3780o().m4561x(InterfaceC3816S.f11560j, 4101);
                interfaceC3798D0.mo3780o().m4561x(InterfaceC3816S.f11561k, C3175v.f9574c);
            } else if (z6) {
                interfaceC3798D0.mo3780o().m4561x(InterfaceC3816S.f11560j, 35);
            } else {
                C3825a0 c3825a0Mo3780o6 = interfaceC3798D0.mo3780o();
                C3828c c3828c6 = InterfaceC3818U.f11570s;
                c3825a0Mo3780o6.getClass();
                try {
                    objMo39b6 = c3825a0Mo3780o6.mo39b(c3828c6);
                } catch (IllegalArgumentException unused6) {
                }
                List list = (List) objMo39b6;
                if (list == null || m3955E(256, list)) {
                    interfaceC3798D0.mo3780o().m4561x(InterfaceC3816S.f11560j, 256);
                } else if (m3955E(35, list)) {
                    interfaceC3798D0.mo3780o().m4561x(InterfaceC3816S.f11560j, 35);
                }
            }
        }
        return interfaceC3798D0.mo3781x();
    }
}
