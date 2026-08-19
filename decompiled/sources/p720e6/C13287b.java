package p720e6;

import android.content.ClipDescription;
import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.clientauthutils.DigestServerAuthenticationHelper;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.view.PreviewView;
import ba.C11271c;
import com.openai.chatgpt.R;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import io.sentry.instrumentation.file.C15379d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p001A.C0042V0;
import p001A.C0083q0;
import p001A.RunnableC0000A;
import p025An.C0624m;
import p028B.C0703j;
import p030B2.RunnableC0789w;
import p053C.AbstractC1466a;
import p053C.C1469d;
import p053C.C1470e;
import p079D.AbstractC1762b;
import p082D2.C1861h;
import p084D4.AbstractC1900Y;
import p084D4.C1901Z;
import p084D4.InterfaceC1953z0;
import p1036u9.InterfaceC20165k;
import p167Gb.C3032c;
import p178H.C3120M;
import p178H.C3123P;
import p178H.C3170s0;
import p178H.C3175v;
import p178H.InterfaceC3140d0;
import p189Ha.AbstractC3276j;
import p195Hh.C3430e;
import p221Ii.C3723b;
import p221Ii.C3725d;
import p221Ii.RunnableC3724c;
import p228J.AbstractC3817T;
import p228J.C3815Q;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3835f0;
import p228J.EnumC3804G0;
import p228J.InterfaceC3798D0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3816S;
import p228J.InterfaceC3818U;
import p228J.InterfaceC3866v;
import p228J.InterfaceC3870x;
import p260K6.C4547b;
import p265Kb.InterfaceC4623p;
import p283L5.AbstractC4941g;
import p301M.C5233o;
import p308M6.InterfaceC5300b;
import p310M9.C5311e;
import p326N.InterfaceC5566h;
import p326N.InterfaceC5569k;
import p331N6.C5676a;
import p333N9.AbstractC5688i;
import p333N9.BinderC5681b;
import p333N9.C5682c;
import p333N9.C5684e;
import p333N9.C5693n;
import p335Nb.AbstractC5704c;
import p348O.AbstractC5939a;
import p349O0.C5997d;
import p375P6.AbstractTextureViewSurfaceTextureListenerC6373j;
import p375P6.C6368e;
import p421R6.C6815a;
import p446S6.C7023b;
import p470T4.C7248m;
import p475T9.AbstractC7279b;
import p475T9.BinderC7280c;
import p475T9.C7281d;
import p475T9.C7290m;
import p497U6.InterfaceC7569a;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8160o6;
import p544W9.AbstractC8488H2;
import p544W9.AbstractC8577W2;
import p544W9.AbstractC8633f4;
import p544W9.AbstractC8752z3;
import p561X.AbstractC8995i;
import p561X.C8996j;
import p561X.C9003q;
import p561X.C9005s;
import p561X.EnumC8992f;
import p571X9.AbstractC9141H2;
import p571X9.AbstractC9233X;
import p588Y2.C9637u;
import p610Z1.C10142i;
import p610Z1.InterfaceC10143j;
import p658b5.C11234e;
import p666bl.InterfaceC11491g;
import p746fa.C13599h;
import p817j$.util.Objects;
import p826j6.C16137F;
import p903n9.C17533g;
import p909nm.AbstractC17680n;
import p913o2.AbstractC17803d;

/* JADX INFO: renamed from: e6.b */
/* JADX INFO: loaded from: classes.dex */
public class C13287b implements InterfaceC1953z0, InterfaceC3798D0, InterfaceC4623p, InterfaceC10143j, InterfaceC20165k, InterfaceC11491g, InterfaceC7569a, InterfaceC3140d0 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f41999Y;

    /* JADX INFO: renamed from: Z */
    public final Object f42000Z;

    public /* synthetic */ C13287b(C5682c c5682c, C17533g c17533g) {
        this.f41999Y = 19;
        this.f42000Z = c17533g;
    }

    /* JADX INFO: renamed from: h */
    public static String m14898h(String str, EnumC13286a enumC13286a, boolean z6) {
        String strConcat = enumC13286a.f41998Y;
        if (z6) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance(DigestServerAuthenticationHelper.DEFAULT_ALGORITHM).digest(strReplaceAll.getBytes());
                StringBuilder sb2 = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb2.append(String.format("%02x", Byte.valueOf(b)));
                }
                strReplaceAll = sb2.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return AbstractC10763a.m11054l("lottie_cache_", strReplaceAll, strConcat);
    }

    /* JADX INFO: renamed from: i */
    public static C13287b m14899i(C0703j c0703j) {
        DynamicRangeProfiles dynamicRangeProfilesM2091k;
        int i10 = Build.VERSION.SDK_INT;
        C13287b c13287b = null;
        if (i10 >= 33 && (dynamicRangeProfilesM2091k = AbstractC1466a.m2091k(c0703j.m1476a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            AbstractC4941g.m5559R("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i10 >= 33);
            c13287b = new C13287b(new C1469d(dynamicRangeProfilesM2091k), 4);
        }
        return c13287b == null ? C1470e.f3879a : c13287b;
    }

    @Override // p084D4.InterfaceC1953z0
    /* JADX INFO: renamed from: A */
    public View mo3133A(int i10) {
        return ((AbstractC1900Y) this.f42000Z).m2983u(i10);
    }

    @Override // p084D4.InterfaceC1953z0
    /* JADX INFO: renamed from: L */
    public int mo3134L(View view) {
        C1901Z c1901z = (C1901Z) view.getLayoutParams();
        ((AbstractC1900Y) this.f42000Z).getClass();
        return view.getRight() + ((C1901Z) view.getLayoutParams()).f5558b.right + ((ViewGroup.MarginLayoutParams) c1901z).rightMargin;
    }

    @Override // p265Kb.InterfaceC4623p
    /* JADX INFO: renamed from: R */
    public Object mo3263R() {
        Constructor constructor = (Constructor) this.f42000Z;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e10) {
            AbstractC8633f4 abstractC8633f4 = AbstractC5704c.f18489a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC5704c.m6148b(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC5704c.m6148b(constructor) + "' with no args", e12.getCause());
        }
    }

    @Override // p178H.InterfaceC3140d0
    /* JADX INFO: renamed from: a */
    public void mo3482a(C3170s0 c3170s0) {
        AbstractC8995i c9003q;
        if (!AbstractC8488H2.m9141b()) {
            AbstractC17803d.m19557d(((PreviewView) this.f42000Z).getContext()).execute(new RunnableC3724c(this, 22, c3170s0));
            return;
        }
        AbstractC8072d6.m8486c("PreviewView", "Surface requested by Preview.");
        InterfaceC3870x interfaceC3870x = c3170s0.f9537d;
        ((PreviewView) this.f42000Z).f32355w0 = interfaceC3870x.mo122r();
        C8996j c8996j = ((PreviewView) this.f42000Z).f32354v0;
        Rect rectMo305j = interfaceC3870x.mo111g().mo305j();
        c8996j.getClass();
        new Rational(rectMo305j.width(), rectMo305j.height());
        synchronized (c8996j) {
            c8996j.f27454b = rectMo305j;
        }
        c3170s0.m4000b(AbstractC17803d.m19557d(((PreviewView) this.f42000Z).getContext()), new C0083q0(this, interfaceC3870x, c3170s0, 6));
        PreviewView previewView = (PreviewView) this.f42000Z;
        AbstractC8995i abstractC8995i = previewView.f32348p0;
        EnumC8992f enumC8992f = previewView.f32347o0;
        if (!(abstractC8995i instanceof C9003q) || PreviewView.m11193b(c3170s0, enumC8992f)) {
            PreviewView previewView2 = (PreviewView) this.f42000Z;
            if (PreviewView.m11193b(c3170s0, previewView2.f32347o0)) {
                PreviewView previewView3 = (PreviewView) this.f42000Z;
                C9005s c9005s = new C9005s(previewView3, previewView3.f32350r0);
                c9005s.f27478i = false;
                c9005s.f27480k = new AtomicReference();
                c9003q = c9005s;
            } else {
                PreviewView previewView4 = (PreviewView) this.f42000Z;
                c9003q = new C9003q(previewView4, previewView4.f32350r0);
            }
            previewView2.f32348p0 = c9003q;
        }
        InterfaceC3866v interfaceC3866vMo122r = interfaceC3870x.mo122r();
        PreviewView previewView5 = (PreviewView) this.f42000Z;
        C0042V0 c0042v0 = new C0042V0(interfaceC3866vMo122r, previewView5.f32352t0, previewView5.f32348p0);
        ((PreviewView) this.f42000Z).f32353u0.set(c0042v0);
        interfaceC3870x.mo106b().mo4563e(AbstractC17803d.m19557d(((PreviewView) this.f42000Z).getContext()), c0042v0);
        ((PreviewView) this.f42000Z).f32348p0.mo9585e(c3170s0, new C0083q0(this, c0042v0, interfaceC3870x, 7));
        PreviewView previewView6 = (PreviewView) this.f42000Z;
        if (previewView6.indexOfChild(previewView6.f32349q0) == -1) {
            PreviewView previewView7 = (PreviewView) this.f42000Z;
            previewView7.addView(previewView7.f32349q0);
        }
        ((PreviewView) this.f42000Z).getClass();
    }

    @Override // p1036u9.InterfaceC20165k
    public void accept(Object obj, Object obj2) {
        Object obj3 = this.f42000Z;
        switch (this.f41999Y) {
            case 19:
                BinderC5681b binderC5681b = new BinderC5681b((C13599h) obj2, 2);
                C5693n c5693n = (C5693n) ((C5684e) obj).m13209q();
                Parcel parcelM6113i = c5693n.m6113i();
                int i10 = AbstractC5688i.f18460a;
                parcelM6113i.writeStrongBinder(binderC5681b);
                AbstractC5688i.m6133c(parcelM6113i, (C17533g) obj3);
                c5693n.m6114k(parcelM6113i, 3);
                break;
            default:
                C7290m c7290m = (C7290m) ((C7281d) obj).m13209q();
                BinderC7280c binderC7280c = new BinderC7280c((C13599h) obj2, 0);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                int i11 = AbstractC7279b.f23071a;
                parcelObtain.writeInt(1);
                ((C11271c) obj3).writeToParcel(parcelObtain, 0);
                parcelObtain.writeStrongBinder(binderC7280c);
                parcelObtain.writeString(null);
                c7290m.m7743d(parcelObtain, 63);
                break;
        }
    }

    @Override // p610Z1.InterfaceC10143j
    /* JADX INFO: renamed from: b */
    public Object mo169b(C10142i c10142i) {
        C5233o c5233o = (C5233o) this.f42000Z;
        AbstractC4941g.m5559R("The result can only set once!", c5233o.f16989r0 == null);
        c5233o.f16989r0 = c10142i;
        return "ListFuture[" + this + "]";
    }

    /* JADX INFO: renamed from: c */
    public void m14900c(int i10) {
        List list = (List) this.f42000Z;
        if (list.isEmpty() || !(((Number) list.get(0)).intValue() == i10 || ((Number) list.get(list.size() - 1)).intValue() == i10)) {
            int size = list.size();
            list.add(Integer.valueOf(i10));
            while (size > 0) {
                int i11 = ((size + 1) >>> 1) - 1;
                int iIntValue = ((Number) list.get(i11)).intValue();
                if (i10 <= iIntValue) {
                    break;
                }
                list.set(size, Integer.valueOf(iIntValue));
                size = i11;
            }
            list.set(size, Integer.valueOf(i10));
        }
    }

    @Override // p084D4.InterfaceC1953z0
    /* JADX INFO: renamed from: d */
    public int mo3135d(View view) {
        C1901Z c1901z = (C1901Z) view.getLayoutParams();
        ((AbstractC1900Y) this.f42000Z).getClass();
        return (view.getLeft() - ((C1901Z) view.getLayoutParams()).f5558b.left) - ((ViewGroup.MarginLayoutParams) c1901z).leftMargin;
    }

    /* JADX INFO: renamed from: e */
    public C3123P m14901e() {
        Object objMo39b;
        Object objMo39b2;
        Object objMo39b3;
        C3828c c3828c = C3815Q.f11551q0;
        C3825a0 c3825a0 = (C3825a0) this.f42000Z;
        c3825a0.getClass();
        Object objMo39b4 = null;
        try {
            objMo39b = c3825a0.mo39b(c3828c);
        } catch (IllegalArgumentException unused) {
            objMo39b = null;
        }
        Integer num = (Integer) objMo39b;
        if (num != null) {
            c3825a0.m4561x(InterfaceC3816S.f11560j, num);
        } else {
            C3120M c3120m = C3123P.f9401z;
            try {
                objMo39b2 = c3825a0.mo39b(C3815Q.f11552r0);
            } catch (IllegalArgumentException unused2) {
                objMo39b2 = null;
            }
            if (Objects.equals(objMo39b2, 1)) {
                c3825a0.m4561x(InterfaceC3816S.f11560j, 4101);
                c3825a0.m4561x(InterfaceC3816S.f11561k, C3175v.f9574c);
            } else {
                c3825a0.m4561x(InterfaceC3816S.f11560j, 256);
            }
        }
        C3815Q c3815q = new C3815Q(C3835f0.m4568a(c3825a0));
        AbstractC3817T.m4557e(c3815q);
        C3123P c3123p = new C3123P(c3815q);
        try {
            objMo39b3 = c3825a0.mo39b(InterfaceC3818U.f11567p);
        } catch (IllegalArgumentException unused3) {
            objMo39b3 = null;
        }
        Size size = (Size) objMo39b3;
        if (size != null) {
            c3123p.f9406s = new Rational(size.getWidth(), size.getHeight());
        }
        C3828c c3828c2 = InterfaceC5566h.f18055P;
        Object objM9242d = AbstractC8577W2.m9242d();
        try {
            objM9242d = c3825a0.mo39b(c3828c2);
        } catch (IllegalArgumentException unused4) {
        }
        AbstractC4941g.m5558Q((Executor) objM9242d, "The IO executor can't be null");
        C3828c c3828c3 = C3815Q.f11549o0;
        if (c3825a0.f11604Y.containsKey(c3828c3)) {
            Integer num2 = (Integer) c3825a0.mo39b(c3828c3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            }
            if (num2.intValue() == 3) {
                try {
                    objMo39b4 = c3825a0.mo39b(C3815Q.f11557w0);
                } catch (IllegalArgumentException unused5) {
                }
                if (objMo39b4 == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
        }
        return c3123p;
    }

    @Override // p497U6.InterfaceC7569a
    /* JADX INFO: renamed from: f */
    public void mo7759f(C6815a c6815a) {
        C7023b error = (C7023b) c6815a;
        AbstractC16544l.m18094g(error, "error");
        ((C0624m) this.f42000Z).resumeWith(AbstractC9233X.m9806b(error));
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m14902g() {
        ((SharedPreferences) this.f42000Z).edit().clear().commit();
    }

    /* JADX INFO: renamed from: j */
    public File m14903j(String str) {
        File file = new File(m14909r(), m14898h(str, EnumC13286a.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m14909r(), m14898h(str, EnumC13286a.f41995o0, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(m14909r(), m14898h(str, EnumC13286a.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public int m14904k(byte[] bArr) {
        int i10;
        byte b;
        if (((LargeJpegImageQuirk) this.f42000Z) == null || !(("Samsung".equalsIgnoreCase(Build.BRAND) && LargeJpegImageQuirk.f32343a.contains(Build.MODEL.toUpperCase(Locale.US))) || LargeJpegImageQuirk.m11192b() || bArr.length > 10000000)) {
            return bArr.length;
        }
        int i11 = 2;
        while (i11 + 4 <= bArr.length && (b = bArr[i11]) == -1) {
            int i12 = i11 + 2;
            int i13 = ((bArr[i12] & 255) << 8) | (bArr[i11 + 3] & 255);
            if (b == -1 && bArr[i11 + 1] == -38) {
                while (true) {
                    i10 = i12 + 2;
                    if (i10 > bArr.length) {
                        break;
                    }
                    if (bArr[i12] != -1 || bArr[i12 + 1] != -39) {
                        i12++;
                    }
                    if (i10 != -1) {
                        return i10;
                    }
                    return bArr.length;
                }
            }
            i11 += i13 + 2;
        }
        i10 = -1;
        if (i10 != -1) {
            return i10;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: l */
    public void mo1818l() {
        View view = (View) this.f42000Z;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m14905m() {
        ((C9637u) this.f42000Z).f29053p0.m11775L();
    }

    /* JADX INFO: renamed from: n */
    public void m14906n(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((AbstractC3276j) this.f42000Z).m4150a(0);
    }

    @Override // p178H.InterfaceC3177w
    /* JADX INFO: renamed from: o */
    public C3825a0 mo3780o() {
        return (C3825a0) this.f42000Z;
    }

    @Override // p497U6.InterfaceC7569a
    public void onSuccess(Object obj) {
        ((C0624m) this.f42000Z).resumeWith(C17296C.f55119a);
    }

    /* JADX INFO: renamed from: q */
    public void m14908q() {
        Integer num;
        switch (this.f41999Y) {
            case 13:
                C3725d c3725d = (C3725d) this.f42000Z;
                boolean z6 = c3725d.f11303Q0;
                C3723b c3723b = c3725d.f11306T0;
                if (z6) {
                    Integer num2 = c3725d.f11297K0;
                    if (num2 != null) {
                        int iIntValue = num2.intValue();
                        c3723b.f11283b.m17697r();
                        C16137F c16137f = c3723b.f11283b;
                        c16137f.getClass();
                        C3032c c3032c = new C3032c(16, false);
                        c3032c.f9127Z = c16137f;
                        Context context = c3725d.getContext();
                        AbstractC16544l.m18093f(context, "getContext(...)");
                        Integer num3 = c3725d.f11296J0;
                        if (num3 == null) {
                            throw new IllegalStateException("No vertex shader set");
                        }
                        c3032c.m3918g(context, num3.intValue(), iIntValue);
                        InterfaceC5300b interfaceC5300b = c3725d.f11300N0;
                        if (interfaceC5300b != null) {
                            C16137F c16137f2 = (C16137F) c3032c.f9127Z;
                            c16137f2.getClass();
                            c16137f2.f50064o0 = interfaceC5300b;
                        }
                        c3725d.f11303Q0 = true;
                        C16137F c16137f3 = (C16137F) c3032c.f9127Z;
                        AbstractC16544l.m18094g(c16137f3, "<set-?>");
                        c3723b.f11283b = c16137f3;
                    }
                    Integer num4 = c3725d.f11298L0;
                    if (num4 != null) {
                        int iIntValue2 = num4.intValue();
                        c3723b.f11282a.m17697r();
                        C16137F c16137f4 = c3723b.f11282a;
                        c16137f4.getClass();
                        C3032c c3032c2 = new C3032c(16, false);
                        c3032c2.f9127Z = c16137f4;
                        Context context2 = c3725d.getContext();
                        AbstractC16544l.m18093f(context2, "getContext(...)");
                        Integer num5 = c3725d.f11296J0;
                        if (num5 == null) {
                            throw new IllegalStateException("No vertex shader set");
                        }
                        c3032c2.m3918g(context2, num5.intValue(), iIntValue2);
                        InterfaceC5300b interfaceC5300b2 = c3725d.f11299M0;
                        if (interfaceC5300b2 != null) {
                            C16137F c16137f5 = (C16137F) c3032c2.f9127Z;
                            c16137f5.getClass();
                            c16137f5.f50064o0 = interfaceC5300b2;
                        }
                        c3725d.f11303Q0 = true;
                        C16137F c16137f6 = (C16137F) c3032c2.f9127Z;
                        AbstractC16544l.m18094g(c16137f6, "<set-?>");
                        c3723b.f11282a = c16137f6;
                    }
                }
                c3723b.f11282a.m17688a(c3725d.getResources());
                c3723b.f11283b.m17688a(c3725d.getResources());
                c3725d.post(new RunnableC0000A(c3725d, 22));
                return;
            default:
                C4547b c4547b = (C4547b) this.f42000Z;
                boolean z10 = c4547b.f14861O0;
                C5676a c5676a = c4547b.f14864R0;
                if (z10 && (num = c4547b.f14857K0) != null) {
                    int iIntValue3 = num.intValue();
                    ((C16137F) c5676a.f18432c).m17697r();
                    C16137F c16137f7 = (C16137F) c5676a.f18432c;
                    c16137f7.getClass();
                    C3032c c3032c3 = new C3032c(16, false);
                    c3032c3.f9127Z = c16137f7;
                    Context context3 = c4547b.getContext();
                    AbstractC16544l.m18093f(context3, "context");
                    Integer vertexShaderRawResId = c4547b.getVertexShaderRawResId();
                    c3032c3.m3918g(context3, vertexShaderRawResId == null ? R.raw.quad_vert : vertexShaderRawResId.intValue(), iIntValue3);
                    InterfaceC5300b shaderParams = c4547b.getShaderParams();
                    if (shaderParams != null) {
                        C16137F c16137f8 = (C16137F) c3032c3.f9127Z;
                        c16137f8.getClass();
                        c16137f8.f50064o0 = shaderParams;
                    }
                    c4547b.f14861O0 = true;
                    C16137F c16137f9 = (C16137F) c3032c3.f9127Z;
                    AbstractC16544l.m18094g(c16137f9, "<set-?>");
                    c5676a.f18432c = c16137f9;
                }
                ((C16137F) c5676a.f18432c).m17688a(c4547b.getResources());
                c4547b.post(new RunnableC0000A(c4547b, 29));
                return;
        }
    }

    /* JADX INFO: renamed from: r */
    public File m14909r() {
        C7248m c7248m = (C7248m) this.f42000Z;
        c7248m.getClass();
        File file = new File(c7248m.f22989Y.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: s */
    public void mo1819s() {
        View viewFindViewById;
        View view = (View) this.f42000Z;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(android.R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new RunnableC0789w(viewFindViewById, 0));
    }

    @Override // p084D4.InterfaceC1953z0
    /* JADX INFO: renamed from: t */
    public int mo3136t() {
        return ((AbstractC1900Y) this.f42000Z).m2925C();
    }

    /* JADX INFO: renamed from: u */
    public int m14910u() {
        int iIntValue;
        List list = (List) this.f42000Z;
        if (!(list.size() > 0)) {
            C5997d.m6470z("Set is empty");
            throw null;
        }
        int iIntValue2 = ((Number) list.get(0)).intValue();
        while (!list.isEmpty() && ((Number) list.get(0)).intValue() == iIntValue2) {
            list.set(0, AbstractC17680n.m19351a0(list));
            list.remove(list.size() - 1);
            int size = list.size();
            int size2 = list.size() >>> 1;
            int i10 = 0;
            while (i10 < size2) {
                int iIntValue3 = ((Number) list.get(i10)).intValue();
                int i11 = (i10 + 1) * 2;
                int i12 = i11 - 1;
                int iIntValue4 = ((Number) list.get(i12)).intValue();
                if (i11 < size && (iIntValue = ((Number) list.get(i11)).intValue()) > iIntValue4) {
                    if (iIntValue <= iIntValue3) {
                        break;
                    }
                    list.set(i10, Integer.valueOf(iIntValue));
                    list.set(i11, Integer.valueOf(iIntValue3));
                    i10 = i11;
                } else {
                    if (iIntValue4 <= iIntValue3) {
                        break;
                    }
                    list.set(i10, Integer.valueOf(iIntValue4));
                    list.set(i12, Integer.valueOf(iIntValue3));
                    i10 = i12;
                }
            }
        }
        return iIntValue2;
    }

    /* JADX INFO: renamed from: v */
    public synchronized void m14911v(C6368e thread) {
        AbstractC16544l.m18094g(thread, "thread");
        AbstractTextureViewSurfaceTextureListenerC6373j abstractTextureViewSurfaceTextureListenerC6373j = (AbstractTextureViewSurfaceTextureListenerC6373j) this.f42000Z;
        ReentrantLock reentrantLock = abstractTextureViewSurfaceTextureListenerC6373j.f20761w0;
        reentrantLock.lock();
        try {
            if (abstractTextureViewSurfaceTextureListenerC6373j.getEnableLogThreads$lib_release()) {
                String message = "exiting tid=" + thread.getId();
                AbstractC16544l.m18094g(message, "message");
                if (AbstractC9141H2.f27918a) {
                    Log.i("GLThreadManager", message);
                }
            }
            thread.f20729Z = true;
            abstractTextureViewSurfaceTextureListenerC6373j.f20762x0.signalAll();
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: w */
    public File m14912w(String str, InputStream inputStream, EnumC13286a enumC13286a) throws IOException {
        File file = new File(m14909r(), m14898h(str, enumC13286a, true));
        try {
            C15379d c15379dM9509d = AbstractC8752z3.m9509d(new FileOutputStream(file), file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        c15379dM9509d.flush();
                        c15379dM9509d.close();
                        inputStream.close();
                        return file;
                    }
                    c15379dM9509d.write(bArr, 0, i10);
                }
            } catch (Throwable th2) {
                c15379dM9509d.close();
                throw th2;
            }
        } catch (Throwable th3) {
            inputStream.close();
            throw th3;
        }
    }

    @Override // p228J.InterfaceC3798D0
    /* JADX INFO: renamed from: x */
    public InterfaceC3800E0 mo3781x() {
        return new C3815Q(C3835f0.m4568a((C3825a0) this.f42000Z));
    }

    @Override // p666bl.InterfaceC11491g
    /* JADX INFO: renamed from: y */
    public void mo12523y(String message) {
        AbstractC16544l.m18094g(message, "message");
        AbstractC8160o6.m8726a((C3430e) this.f42000Z, message, null, 6);
    }

    @Override // p084D4.InterfaceC1953z0
    /* JADX INFO: renamed from: z */
    public int mo3137z() {
        AbstractC1900Y abstractC1900Y = (AbstractC1900Y) this.f42000Z;
        return abstractC1900Y.f5555n - abstractC1900Y.m2926D();
    }

    public /* synthetic */ C13287b(Object obj, int i10) {
        this.f41999Y = i10;
        this.f42000Z = obj;
    }

    /* JADX INFO: renamed from: p */
    public void m14907p(InterfaceC5300b shaderParams) {
        switch (this.f41999Y) {
            case 13:
                AbstractC16544l.m18094g(shaderParams, YladLSetV.QBd);
                C3725d c3725d = (C3725d) this.f42000Z;
                c3725d.post(new RunnableC3724c(c3725d, 0, shaderParams));
                break;
            default:
                AbstractC16544l.m18094g(shaderParams, "shaderParams");
                C4547b c4547b = (C4547b) this.f42000Z;
                c4547b.post(new RunnableC3724c(c4547b, 6, shaderParams));
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13287b(int i10) {
        this(C3825a0.m4558d());
        this.f41999Y = i10;
        switch (i10) {
            case 7:
                this.f42000Z = (ExtraSupportedSurfaceCombinationsQuirk) AbstractC1762b.f5032a.m4579f(ExtraSupportedSurfaceCombinationsQuirk.class);
                break;
            case 11:
                break;
            case 20:
                this.f42000Z = new ArrayList();
                break;
            case 21:
                this.f42000Z = (LargeJpegImageQuirk) AbstractC5939a.f19323a.m4579f(LargeJpegImageQuirk.class);
                break;
            case 23:
                this.f42000Z = new SparseArray(10);
                break;
            default:
                this.f42000Z = new Object();
                break;
        }
    }

    public C13287b(Context context) {
        boolean zIsEmpty;
        this.f41999Y = 9;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f42000Z = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                m14902g();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    public C13287b(EditText editText) {
        this.f41999Y = 26;
        this.f42000Z = new C11234e(editText);
    }

    public C13287b(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f41999Y = 5;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f42000Z = new C1861h(uri, clipDescription, uri2);
        } else {
            this.f42000Z = new C5311e(uri, clipDescription, uri2, 3);
        }
    }

    public C13287b(AbstractTextureViewSurfaceTextureListenerC6373j this$0) {
        this.f41999Y = 22;
        AbstractC16544l.m18094g(this$0, "this$0");
        this.f42000Z = this$0;
    }

    public C13287b(C3825a0 c3825a0) {
        Object objMo39b;
        this.f41999Y = 11;
        this.f42000Z = c3825a0;
        Object objMo39b2 = null;
        try {
            objMo39b = c3825a0.mo39b(InterfaceC5569k.f18065a0);
        } catch (IllegalArgumentException unused) {
            objMo39b = null;
        }
        Class cls = (Class) objMo39b;
        if (cls != null && !cls.equals(C3123P.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        ((C3825a0) this.f42000Z).m4561x(InterfaceC3800E0.f11493G, EnumC3804G0.f11507Y);
        C3828c c3828c = InterfaceC5569k.f18065a0;
        C3825a0 c3825a1 = (C3825a0) this.f42000Z;
        c3825a1.m4561x(c3828c, C3123P.class);
        try {
            objMo39b2 = c3825a1.mo39b(InterfaceC5569k.f18064W);
        } catch (IllegalArgumentException unused2) {
        }
        if (objMo39b2 == null) {
            ((C3825a0) this.f42000Z).m4561x(InterfaceC5569k.f18064W, C3123P.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }
}
