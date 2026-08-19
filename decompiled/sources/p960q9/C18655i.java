package p960q9;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import androidx.profileinstaller.ProfileInstallReceiver;
import co.C11829s;
import com.google.gson.reflect.TypeToken;
import io.sentry.android.core.AbstractC15256t;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import np.AbstractC17712d;
import np.InterfaceC17710b;
import p028B.C0705l;
import p028B.C0706m;
import p028B.C0707n;
import p032B4.InterfaceC0808c;
import p056C2.C1512f;
import p056C2.C1513g;
import p056C2.C1514h;
import p079D.AbstractC1762b;
import p100Dk.InterfaceC2094u;
import p178H.C3124Q;
import p178H.InterfaceC3127U;
import p202I.C3526b;
import p214Ib.AbstractC3673p;
import p214Ib.C3669l;
import p228J.C3847l0;
import p253K.AbstractC4503n;
import p253K.C4494e;
import p254K0.C4516m;
import p254K0.C4525v;
import p277L.ExecutorC4836i;
import p288Lb.C4986s;
import p301M.InterfaceC5221c;
import p308M6.C5299a;
import p308M6.C5303e;
import p308M6.InterfaceC5300b;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.InterfaceC5982V0;
import p391Q.C6541a;
import p393Q1.C6556h;
import p393Q1.C6560l;
import p409Qk.C6752c;
import p414R.C6768b;
import p468T2.C7218j;
import p476Ta.C7293c;
import p538W2.C8422g;
import p544W9.AbstractC8512L2;
import p571X9.AbstractC9288g0;
import p588Y2.C9602F;
import p588Y2.C9606J;
import p594Y9.C9895g4;
import p607Yo.C10129r;
import p610Z1.C10142i;
import p658b5.C11241l;
import p666bl.InterfaceC11491g;
import p720e6.C13288c;
import p746fa.C13606o;
import p746fa.InterfaceC13596e;
import p756fp.AbstractC13719a;
import p758g0.C13788t;
import p817j$.util.Objects;
import p817j$.util.concurrent.ConcurrentHashMap;
import p841k.C16281a;
import p841k.C16288h;
import p841k.InterfaceC16282b;
import p881m0.InterfaceC17139p;
import p951pp.AbstractC18535e;
import p951pp.AbstractC18539i;
import p951pp.C18538h;

/* JADX INFO: renamed from: q9.i */
/* JADX INFO: loaded from: classes.dex */
public class C18655i implements InterfaceC0808c, InterfaceC5221c, InterfaceC17139p, InterfaceC13596e, InterfaceC16282b, InterfaceC11491g {

    /* JADX INFO: renamed from: o0 */
    public static C18655i f59412o0;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59413Y;

    /* JADX INFO: renamed from: Z */
    public Object f59414Z;

    public /* synthetic */ C18655i(int i10, boolean z6) {
        this.f59413Y = i10;
    }

    /* JADX INFO: renamed from: c */
    public static void m20021c(C18655i c18655i, String str) {
        ((C5303e) ((InterfaceC5300b) c18655i.f59414Z)).m5837a(str, new C5299a(1, null));
    }

    /* JADX INFO: renamed from: s */
    public static C6768b m20022s(C3526b c3526b) throws C3124Q {
        C6768b c6768b = c3526b.f10662a;
        InterfaceC3127U interfaceC3127U = (InterfaceC3127U) c6768b.f21708a;
        Rect rect = c6768b.f21712e;
        try {
            byte[] bArrM9867d = AbstractC9288g0.m9867d(interfaceC3127U, rect, c3526b.f10663b, c6768b.f21713f);
            try {
                C4494e c4494e = new C4494e(new C8422g(new ByteArrayInputStream(bArrM9867d)));
                Size size = new Size(rect.width(), rect.height());
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                Matrix matrix = c6768b.f21714g;
                RectF rectF = AbstractC4503n.f14693a;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-rect.left, -rect.top);
                return new C6768b(bArrM9867d, c4494e, 256, size, rect2, c6768b.f21713f, matrix2, c6768b.f21715h);
            } catch (IOException e10) {
                throw new C3124Q("Failed to extract Exif from YUV-generated JPEG", e10);
            }
        } catch (C6541a e11) {
            throw new C3124Q("Failed to encode the image to JPEG.", e11);
        }
    }

    /* JADX INFO: renamed from: t */
    public static synchronized C18655i m20023t(Context context) {
        return m20024v(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: v */
    public static synchronized C18655i m20024v(Context context) {
        C18655i c18655i = f59412o0;
        if (c18655i != null) {
            return c18655i;
        }
        C18655i c18655i2 = new C18655i(context);
        f59412o0 = c18655i2;
        return c18655i2;
    }

    @Override // p301M.InterfaceC5221c
    /* JADX INFO: renamed from: J */
    public void mo3912J(Throwable th2) {
        boolean z6 = th2 instanceof TimeoutException;
        C10142i c10142i = (C10142i) this.f59414Z;
        if (z6) {
            c10142i.m10748b(th2);
        } else {
            c10142i.m10747a(Collections.emptyList());
        }
    }

    @Override // p881m0.InterfaceC17139p
    /* JADX INFO: renamed from: a */
    public int mo18903a(int i10, int i11, int i12, int i13, int i14, int i15) {
        return AbstractC8512L2.m9172b((C4525v) ((C4516m) this.f59414Z).f14757d.getValue(), i14, i15);
    }

    @Override // p841k.InterfaceC16282b
    /* JADX INFO: renamed from: d */
    public void mo3484d(Object obj) {
        C16281a c16281a = (C16281a) obj;
        C9606J c9606j = (C9606J) this.f59414Z;
        C9602F c9602f = (C9602F) c9606j.f33173D.pollLast();
        if (c9602f == null) {
            AbstractC15256t.m16482t("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = c9602f.f28898Y;
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000aM11836c = c9606j.f33186c.m11836c(str);
        if (abstractComponentCallbacksC11000aM11836c != null) {
            abstractComponentCallbacksC11000aM11836c.mo11760x(c9602f.f28899Z, c16281a.f50448Y, c16281a.f50449Z);
        } else {
            AbstractC15256t.m16482t("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m20025e(String str, float[] fArr) {
        ((C5303e) ((InterfaceC5300b) this.f59414Z)).m5837a(str, new C5299a(5, fArr));
    }

    /* JADX INFO: renamed from: f */
    public void m20026f(String str, float[] fArr) {
        ((C5303e) ((InterfaceC5300b) this.f59414Z)).m5837a(str, new C5299a(6, fArr));
    }

    /* JADX INFO: renamed from: g */
    public Object m20027g(Object obj) throws Exception {
        C6768b c6768bM20022s;
        C3526b c3526b = (C3526b) obj;
        C6768b c6768b = c3526b.f10662a;
        try {
            int i10 = c6768b.f21710c;
            Object obj2 = c6768b.f21708a;
            if (i10 == 35) {
                c6768bM20022s = m20022s(c3526b);
            } else {
                if (i10 != 256 && i10 != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + i10);
                }
                c6768bM20022s = m20033r(c3526b, i10);
            }
            ((InterfaceC3127U) obj2).close();
            return c6768bM20022s;
        } catch (Throwable th2) {
            ((InterfaceC3127U) c6768b.f21708a).close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m20028h() {
        ((C13606o) ((C9895g4) this.f59414Z).f29409Y).m15137p(null);
    }

    @Override // p032B4.InterfaceC0808c
    /* JADX INFO: renamed from: i */
    public void mo1846i(Serializable serializable, int i10) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            AbstractC15256t.m16466d("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f59414Z).setResultCode(i10);
    }

    /* JADX INFO: renamed from: j */
    public C1512f mo561j(int i10) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public Object m20029k(AbstractC3673p abstractC3673p, Type type) {
        C3669l c3669l = ((C4986s) this.f59414Z).f16252b;
        c3669l.getClass();
        return c3669l.m4368b(abstractC3673p, TypeToken.get(type));
    }

    /* JADX INFO: renamed from: l */
    public C1512f mo562l(int i10) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public Object m20030m(SerialDescriptor descriptor, C11829s c11829s) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) this.f59414Z).get(descriptor);
        Object obj = map != null ? map.get(c11829s) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // p032B4.InterfaceC0808c
    /* JADX INFO: renamed from: n */
    public void mo1847n() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    /* JADX INFO: renamed from: o */
    public InterfaceC5982V0 m20031o() {
        C7218j c7218jM7609a = C7218j.m7609a();
        if (c7218jM7609a.m7611b() == 1) {
            return new C6560l(true);
        }
        C6002f0 c6002f0M6430Q = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
        c7218jM7609a.m7615g(new C6556h(c6002f0M6430Q, this));
        return c6002f0M6430Q;
    }

    @Override // p301M.InterfaceC5221c, p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        switch (this.f59413Y) {
            case 9:
                List list = (List) obj;
                list.getClass();
                ((C10142i) this.f59414Z).m10747a(new ArrayList(list));
                break;
            default:
                ((C7293c) this.f59414Z).invoke(obj);
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public C3847l0 m20032p() {
        AbstractC13719a abstractC13719a = (AbstractC13719a) this.f59414Z;
        if (!(abstractC13719a instanceof C10129r)) {
            return new C3847l0(1);
        }
        ArrayList arrayList = ((C10129r) abstractC13719a).f30032b.f30015b;
        C3847l0 c3847l0 = new C3847l0(1);
        c3847l0.f11629a.addAll(arrayList);
        return c3847l0;
    }

    /* JADX INFO: renamed from: q */
    public boolean mo563q(int i10, int i11, Bundle bundle) {
        return false;
    }

    /* JADX INFO: renamed from: r */
    public C6768b m20033r(C3526b c3526b, int i10) {
        byte[] bArrCopyOfRange;
        byte b;
        C6768b c6768b = c3526b.f10662a;
        InterfaceC3127U interfaceC3127U = (InterfaceC3127U) c6768b.f21708a;
        int i11 = 0;
        if (((IncorrectJpegMetadataQuirk) ((C13288c) this.f59414Z).f42001Y) == null) {
            ByteBuffer byteBufferM14915U = interfaceC3127U.mo3970v()[0].m14915U();
            bArrCopyOfRange = new byte[byteBufferM14915U.capacity()];
            byteBufferM14915U.rewind();
            byteBufferM14915U.get(bArrCopyOfRange);
        } else {
            ByteBuffer byteBufferM14915U2 = interfaceC3127U.mo3970v()[0].m14915U();
            int iCapacity = byteBufferM14915U2.capacity();
            byte[] bArr = new byte[iCapacity];
            byteBufferM14915U2.rewind();
            byteBufferM14915U2.get(bArr);
            int i12 = 2;
            int i13 = 2;
            while (true) {
                if (i13 + 4 > iCapacity || (b = bArr[i13]) != -1) {
                    while (true) {
                        int i14 = i12 + 1;
                        if (i14 <= iCapacity) {
                            if (bArr[i12] == -1 && bArr[i14] == -40) {
                                i11 = i12;
                                break;
                            }
                            i12 = i14;
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    if (i11 == -1) {
                        bArrCopyOfRange = bArr;
                    }
                } else if (b != -1 || bArr[i13 + 1] != -38) {
                    i13 += (((bArr[i13 + 2] & 255) << 8) | (bArr[i13 + 3] & 255)) + 2;
                }
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i11, byteBufferM14915U2.limit());
            }
        }
        byte[] bArr2 = bArrCopyOfRange;
        C4494e c4494e = c6768b.f21709b;
        Objects.requireNonNull(c4494e);
        return new C6768b(bArr2, c4494e, i10, c6768b.f21711d, c6768b.f21712e, c6768b.f21713f, c6768b.f21714g, c6768b.f21715h);
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m20034u() {
        C18648b c18648b = (C18648b) this.f59414Z;
        ReentrantLock reentrantLock = c18648b.f59392a;
        reentrantLock.lock();
        try {
            c18648b.f59393b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // p666bl.InterfaceC11491g
    /* JADX INFO: renamed from: y */
    public void mo12523y(String message) {
        AbstractC16544l.m18094g(message, "message");
        ((InterfaceC17710b) this.f59414Z).mo19441f(message);
    }

    public /* synthetic */ C18655i(Object obj, int i10) {
        this.f59413Y = i10;
        this.f59414Z = obj;
    }

    public C18655i(Context context) {
        this.f59413Y = 0;
        C18648b c18648bM20005a = C18648b.m20005a(context);
        this.f59414Z = c18648bM20005a;
        c18648bM20005a.m20007b();
        c18648bM20005a.m20008c();
    }

    public C18655i(C16288h openDocumentResultLauncher) {
        this.f59413Y = 15;
        AbstractC16544l.m18094g(openDocumentResultLauncher, "openDocumentResultLauncher");
        this.f59414Z = openDocumentResultLauncher;
    }

    public C18655i(ExecutorC4836i executorC4836i) {
        this.f59413Y = 1;
        this.f59414Z = new AtomicInteger(0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029 A[PHI: r11
      0x0029: PHI (r11v1 int) = (r11v0 int), (r11v6 int), (r11v7 int) binds: [B:5:0x001a, B:10:0x0023, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    public C18655i(int[] iArr, float[] fArr, float[][] fArr2) {
        this.f59413Y = 29;
        int length = fArr.length - 1;
        C13788t[][] c13788tArr = new C13788t[length][];
        int i10 = 1;
        int i11 = 1;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            int i14 = 3;
            if (i13 == 0) {
                i11 = i14;
            } else if (i13 == 1) {
                i10 = 1;
                i11 = i10;
            } else {
                if (i13 != 2) {
                    if (i13 != 3) {
                        i14 = 4;
                        if (i13 != 4) {
                            i14 = 5;
                            if (i13 == 5) {
                                i11 = i14;
                            }
                        } else {
                            i11 = i14;
                        }
                    } else {
                        if (i10 != 1) {
                            i10 = 1;
                        }
                        i11 = i10;
                    }
                }
                i10 = 2;
                i11 = i10;
            }
            float[] fArr3 = fArr2[i12];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            C13788t[] c13788tArr2 = new C13788t[length2];
            int i15 = 0;
            while (i15 < length2) {
                int i16 = i15 * 2;
                float f10 = fArr[i12];
                int i17 = i12 + 1;
                float f11 = fArr[i17];
                float[] fArr4 = fArr2[i12];
                float f12 = fArr4[i16];
                int i18 = i16 + 1;
                float f13 = fArr4[i18];
                float[] fArr5 = fArr2[i17];
                int i19 = i15;
                c13788tArr2[i19] = new C13788t(i11, f10, f11, f12, f13, fArr5[i16], fArr5[i18]);
                i15 = i19 + 1;
            }
            c13788tArr[i12] = c13788tArr2;
        }
        this.f59414Z = c13788tArr;
    }

    public C18655i(InterfaceC2094u uiService) {
        this.f59413Y = 6;
        AbstractC16544l.m18094g(uiService, "uiService");
        this.f59414Z = uiService;
    }

    public C18655i(C3847l0 c3847l0) {
        this.f59413Y = 8;
        this.f59414Z = new C13288c(21, c3847l0);
    }

    public C18655i(CameraDevice cameraDevice, Handler handler) {
        this.f59413Y = 2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            cameraDevice.getClass();
            this.f59414Z = new C0706m(cameraDevice, null);
        } else if (i10 >= 24) {
            this.f59414Z = new C0705l(cameraDevice, new C0707n(handler));
        } else {
            this.f59414Z = new C11241l(cameraDevice, new C0707n(handler));
        }
    }

    public C18655i(int i10) {
        int i11;
        int i12 = 0;
        this.f59413Y = i10;
        switch (i10) {
            case 7:
                this.f59414Z = (ExtraCroppingQuirk) AbstractC1762b.f5032a.m4579f(ExtraCroppingQuirk.class);
                return;
            case 12:
                this.f59414Z = new C5303e();
                return;
            case 19:
                this.f59414Z = new HashSet();
                return;
            case 25:
                int i13 = AbstractC17712d.f56544a;
                InterfaceC17710b interfaceC17710bMo19435a = AbstractC17712d.m19445b().m19898a().mo19435a(C6752c.class.getName());
                if (AbstractC17712d.f56547d) {
                    C18538h c18538h = AbstractC18539i.f59064a;
                    Class cls = null;
                    if (c18538h == null) {
                        if (AbstractC18539i.f59065b) {
                            c18538h = null;
                        } else {
                            try {
                                c18538h = new C18538h();
                            } catch (SecurityException unused) {
                                c18538h = null;
                            }
                            AbstractC18539i.f59064a = c18538h;
                            AbstractC18539i.f59065b = true;
                        }
                    }
                    if (c18538h != null) {
                        Class[] classContext = c18538h.getClassContext();
                        String name = AbstractC18539i.class.getName();
                        while (i12 < classContext.length && !name.equals(classContext[i12].getName())) {
                            i12++;
                        }
                        if (i12 < classContext.length && (i11 = i12 + 2) < classContext.length) {
                            cls = classContext[i11];
                        } else {
                            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                        }
                    }
                    if (cls != null && !cls.isAssignableFrom(C6752c.class)) {
                        AbstractC18535e.m19902d("Detected logger name mismatch. Given name: \"" + interfaceC17710bMo19435a.getName() + "\"; computed name: \"" + cls.getName() + "\".");
                        AbstractC18535e.m19902d("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
                    }
                    break;
                }
                this.f59414Z = interfaceC17710bMo19435a;
                return;
            case 26:
                this.f59414Z = new ConcurrentHashMap(16);
                return;
            case 28:
                this.f59414Z = new C9895g4(5);
                return;
            default:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f59414Z = new C1514h(this);
                    return;
                } else {
                    this.f59414Z = new C1513g(this);
                    return;
                }
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo560b(int i10, C1512f c1512f, String str, Bundle bundle) {
    }
}
