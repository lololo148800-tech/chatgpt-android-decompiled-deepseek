package p959q8;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.Editable;
import android.text.Selection;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import com.auth0.android.request.internal.C11845d;
import com.auth0.android.request.internal.C11846e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import javax.crypto.Mac;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0284r0;
import p025An.C0624m;
import p026Ao.AbstractC0668b;
import p026Ao.C0678l;
import p035B7.InterfaceC0847d;
import p051Bo.AbstractC1456b;
import p1009s9.C19506i;
import p1111xl.C21296a;
import p1113xn.C21307a;
import p127El.ExecutorC2575a;
import p131F1.C2630h;
import p132F2.C2643g;
import p132F2.C2648l;
import p132F2.C2650n;
import p132F2.InterfaceC2646j;
import p157G2.C2978d;
import p165G9.C3018d;
import p165G9.InterfaceC3017c;
import p165G9.InterfaceC3019e;
import p178H.C3124Q;
import p178H.InterfaceC3127U;
import p202I.C3528d;
import p202I.C3535k;
import p207I4.C3615b;
import p207I4.InterfaceC3616c;
import p207I4.InterfaceC3617d;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p228J.C3799E;
import p228J.C3828c;
import p228J.InterfaceC3854p;
import p233J4.C4260f;
import p253K.AbstractC4503n;
import p253K.C4494e;
import p265Kb.InterfaceC4623p;
import p283L5.AbstractC4941g;
import p326N.C5561c;
import p328N1.C5574A;
import p328N1.C5605u;
import p328N1.C5609y;
import p328N1.InterfaceC5575B;
import p348O.AbstractC5939a;
import p351O2.C6087a;
import p351O2.InterfaceC6088b;
import p355O7.InterfaceC6142d;
import p384Ph.C6413c;
import p384Ph.C6416f;
import p384Ph.C6417g;
import p414R.C6768b;
import p434Rk.C6911c;
import p451Sb.C7102a;
import p468T2.C7231w;
import p517V2.C7741b;
import p523V9.AbstractC8154o0;
import p538W2.C8422g;
import p556Wk.C8915b0;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9288g0;
import p623Zf.C10313i;
import p758g0.C13788t;
import p784hb.InterfaceC14441j;
import p909nm.AbstractC17678l;
import p939p3.InterfaceC18292b;
import p996rm.EnumC19250a;
import pl.C18506a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: q8.a */
/* JADX INFO: loaded from: classes.dex */
public class C18639a implements InterfaceC18644f, InterfaceC0847d, InterfaceC3019e, InterfaceC3616c, InterfaceC4623p, InterfaceC5575B, InterfaceC6142d, InterfaceC6088b, InterfaceC18292b, InterfaceC14441j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59379Y;

    public /* synthetic */ C18639a(int i10) {
        this.f59379Y = i10;
    }

    /* JADX INFO: renamed from: g */
    public static final float[] m19993g() {
        float[] fArr = C13788t.f43537s;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[91];
        C13788t.f43537s = fArr2;
        return fArr2;
    }

    /* JADX INFO: renamed from: j */
    public static Typeface m19994j(String str, C5609y c5609y, int i10) {
        if (C5605u.m5992a(i10, 0) && AbstractC16544l.m18089b(c5609y, C5609y.f18155r0) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c5609y.f18160Y, C5605u.m5992a(i10, 1));
    }

    /* JADX INFO: renamed from: k */
    public static C0678l m19995k(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (AbstractC1456b.m2061a(str.charAt(i11 + 1)) + (AbstractC1456b.m2061a(str.charAt(i11)) << 4));
        }
        return new C0678l(bArr);
    }

    /* JADX INFO: renamed from: n */
    public static C0678l m19996n(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        byte[] bytes = str.getBytes(C21307a.f67720a);
        AbstractC16544l.m18093f(bytes, "getBytes(...)");
        C0678l c0678l = new C0678l(bytes);
        c0678l.f1974o0 = str;
        return c0678l;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m19997s(C7741b c7741b, Editable editable, int i10, int i11, boolean z6) {
        int iMin;
        if (editable == null || i10 < 0 || i11 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z6) {
            int iMax = Math.max(i10, 0);
            int length = editable.length();
            if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                loop0: while (true) {
                    boolean z10 = false;
                    while (true) {
                        if (iMax == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart < 0) {
                            if (!z10) {
                                selectionStart = 0;
                                break loop0;
                            }
                            break loop0;
                        }
                        char cCharAt = editable.charAt(selectionStart);
                        if (z10) {
                            if (Character.isHighSurrogate(cCharAt)) {
                                iMax--;
                            }
                        } else if (!Character.isSurrogate(cCharAt)) {
                            iMax--;
                        } else if (!Character.isHighSurrogate(cCharAt)) {
                            z10 = true;
                        }
                        selectionStart = -1;
                        break loop0;
                    }
                }
            }
            selectionStart = -1;
            break loop0;
            int iMax2 = Math.max(i11, 0);
            iMin = editable.length();
            if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                loop2: while (true) {
                    boolean z11 = false;
                    while (true) {
                        if (iMax2 != 0) {
                            if (selectionEnd >= iMin) {
                                if (!z11) {
                                    break loop2;
                                }
                                break loop2;
                            }
                            char cCharAt2 = editable.charAt(selectionEnd);
                            if (z11) {
                                if (Character.isLowSurrogate(cCharAt2)) {
                                    iMax2--;
                                    selectionEnd++;
                                }
                            } else if (!Character.isSurrogate(cCharAt2)) {
                                iMax2--;
                                selectionEnd++;
                            } else if (!Character.isLowSurrogate(cCharAt2)) {
                                selectionEnd++;
                                z11 = true;
                            }
                            iMin = -1;
                            break loop2;
                        }
                        iMin = selectionEnd;
                        break loop2;
                    }
                }
            }
            iMin = -1;
            break loop2;
            if (selectionStart == -1 || iMin == -1) {
                return false;
            }
        } else {
            selectionStart = Math.max(selectionStart - i10, 0);
            iMin = Math.min(selectionEnd + i11, editable.length());
        }
        C7231w[] c7231wArr = (C7231w[]) editable.getSpans(selectionStart, iMin, C7231w.class);
        if (c7231wArr == null || c7231wArr.length <= 0) {
            return false;
        }
        for (C7231w c7231w : c7231wArr) {
            int spanStart = editable.getSpanStart(c7231w);
            int spanEnd = editable.getSpanEnd(c7231w);
            selectionStart = Math.min(spanStart, selectionStart);
            iMin = Math.max(spanEnd, iMin);
        }
        int iMax3 = Math.max(selectionStart, 0);
        int iMin2 = Math.min(iMin, editable.length());
        c7741b.beginBatchEdit();
        editable.delete(iMax3, iMin2);
        c7741b.endBatchEdit();
        return true;
    }

    /* JADX INFO: renamed from: t */
    public static C0678l m19998t(byte[] bArr, int i10, int i11) {
        if (i11 == -1234567890) {
            i11 = bArr.length;
        }
        AbstractC0668b.m1405e(bArr.length, i10, i11);
        return new C0678l(AbstractC17678l.m19309p(bArr, i10, i11 + i10));
    }

    @Override // p784hb.InterfaceC14441j
    /* JADX INFO: renamed from: A */
    public Object mo3663A(Provider provider) {
        return provider == null ? Mac.getInstance("SHA-512") : Mac.getInstance("SHA-512", provider);
    }

    @Override // p265Kb.InterfaceC4623p
    /* JADX INFO: renamed from: R */
    public Object mo3263R() {
        return new ConcurrentSkipListMap();
    }

    @Override // p355O7.InterfaceC6142d
    /* JADX INFO: renamed from: a */
    public void mo6709a(int i10, String message, Throwable th2, LinkedHashMap linkedHashMap, HashSet hashSet, Long l4) {
        AbstractC16544l.m18094g(message, "message");
    }

    @Override // p959q8.InterfaceC18644f
    public boolean accept(Object obj) {
        Activity component = (Activity) obj;
        AbstractC16544l.m18094g(component, "component");
        return true;
    }

    @Override // p207I4.InterfaceC3616c
    /* JADX INFO: renamed from: b */
    public InterfaceC3617d mo4327b(C3615b c3615b) {
        return new C4260f(c3615b.f11032a, c3615b.f11033b, c3615b.f11034c, c3615b.f11035d, c3615b.f11036e);
    }

    @Override // p328N1.InterfaceC5575B
    /* JADX INFO: renamed from: c */
    public Typeface mo5982c(C5609y c5609y, int i10) {
        return m19994j(null, c5609y, i10);
    }

    @Override // p165G9.InterfaceC3019e
    /* JADX INFO: renamed from: d */
    public C3018d mo3864d(Context context, String str, InterfaceC3017c interfaceC3017c) {
        C3018d c3018d = new C3018d();
        int iMo3862e = interfaceC3017c.mo3862e(context, str, true);
        c3018d.f9093b = iMo3862e;
        if (iMo3862e != 0) {
            c3018d.f9094c = 1;
        } else {
            int iMo3863f = interfaceC3017c.mo3863f(context, str);
            c3018d.f9092a = iMo3863f;
            if (iMo3863f != 0) {
                c3018d.f9094c = -1;
            }
        }
        return c3018d;
    }

    public boolean equals(Object obj) {
        switch (this.f59379Y) {
            case 0:
                if (this == obj) {
                    return true;
                }
                return C18639a.class.equals(obj != null ? obj.getClass() : null);
            default:
                return super.equals(obj);
        }
    }

    @Override // p959q8.InterfaceC18644f
    /* JADX INFO: renamed from: f */
    public void mo8899f(Activity component) {
        AbstractC16544l.m18094g(component, "component");
    }

    /* JADX INFO: renamed from: h */
    public Object m19999h(Object obj) throws C3124Q {
        C4494e c4494e;
        int i10 = 8;
        C3528d c3528d = (C3528d) obj;
        InterfaceC3127U interfaceC3127U = c3528d.f10669b;
        C3535k c3535k = c3528d.f10668a;
        if (AbstractC9288g0.m9866c(interfaceC3127U.mo3969t())) {
            try {
                C0284r0 c0284r0 = C4494e.f14655b;
                ByteBuffer byteBufferM14915U = interfaceC3127U.mo3970v()[0].m14915U();
                byteBufferM14915U.rewind();
                byte[] bArr = new byte[byteBufferM14915U.capacity()];
                byteBufferM14915U.get(bArr);
                c4494e = new C4494e(new C8422g(new ByteArrayInputStream(bArr)));
                interfaceC3127U.mo3970v()[0].m14915U().rewind();
            } catch (IOException e10) {
                throw new C3124Q("Failed to extract EXIF data.", e10);
            }
        } else {
            c4494e = null;
        }
        if (((ImageCaptureRotationOptionQuirk) AbstractC5939a.f19323a.m4579f(ImageCaptureRotationOptionQuirk.class)) != null) {
            C3828c c3828c = C3799E.f11479i;
        } else if (AbstractC9288g0.m9866c(interfaceC3127U.mo3969t())) {
            AbstractC4941g.m5558Q(c4494e, "JPEG image must have exif.");
            Size size = new Size(interfaceC3127U.getWidth(), interfaceC3127U.getHeight());
            int iM5228b = c3535k.f10692d - c4494e.m5228b();
            Size size2 = AbstractC4503n.m5247c(AbstractC4503n.m5251g(iM5228b)) ? new Size(size.getHeight(), size.getWidth()) : size;
            Matrix matrixM5245a = AbstractC4503n.m5245a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), iM5228b, false);
            RectF rectF = new RectF(c3535k.f10691c);
            matrixM5245a.mapRect(rectF);
            rectF.sort();
            Rect rect = new Rect();
            rectF.round(rect);
            int iM5228b2 = c4494e.m5228b();
            Matrix matrix = new Matrix(c3535k.f10694f);
            matrix.postConcat(matrixM5245a);
            InterfaceC3854p c7102a = interfaceC3127U.mo3968k0() instanceof C5561c ? ((C5561c) interfaceC3127U.mo3968k0()).f18029a : new C7102a(i10);
            interfaceC3127U.mo3969t();
            return new C6768b(interfaceC3127U, c4494e, interfaceC3127U.mo3969t(), size2, rect, iM5228b2, matrix, c7102a);
        }
        Rect rect2 = c3535k.f10691c;
        InterfaceC3854p c7102a2 = interfaceC3127U.mo3968k0() instanceof C5561c ? ((C5561c) interfaceC3127U.mo3968k0()).f18029a : new C7102a(i10);
        int i11 = c3535k.f10692d;
        Matrix matrix2 = c3535k.f10694f;
        Size size3 = new Size(interfaceC3127U.getWidth(), interfaceC3127U.getHeight());
        if (AbstractC9288g0.m9866c(interfaceC3127U.mo3969t())) {
            AbstractC4941g.m5558Q(c4494e, "JPEG image must have Exif.");
        }
        return new C6768b(interfaceC3127U, c4494e, interfaceC3127U.mo3969t(), size3, rect2, i11, matrix2, c7102a2);
    }

    public int hashCode() {
        switch (this.f59379Y) {
            case 0:
                return C18639a.class.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // p328N1.InterfaceC5575B
    /* JADX INFO: renamed from: i */
    public Typeface mo5983i(C5574A c5574a, C5609y c5609y, int i10) {
        return m19994j(c5574a.f18075p0, c5609y, i10);
    }

    @Override // p035B7.InterfaceC0847d
    /* JADX INFO: renamed from: l */
    public long mo1907l() {
        return System.currentTimeMillis();
    }

    @Override // p035B7.InterfaceC0847d
    /* JADX INFO: renamed from: m */
    public long mo1908m() {
        return System.currentTimeMillis();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: o */
    public Serializable m20000o(C8915b0 c8915b0, AbstractC19687c abstractC19687c) {
        C6413c c6413c;
        InterfaceC3777y interfaceC3777yM18075c;
        if (abstractC19687c instanceof C6413c) {
            c6413c = (C6413c) abstractC19687c;
            int i10 = c6413c.f20861p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6413c.f20861p0 = i10 - Integer.MIN_VALUE;
            } else {
                c6413c = new C6413c(this, abstractC19687c);
            }
        } else {
            c6413c = new C6413c(this, abstractC19687c);
        }
        Object objM7294a = c6413c.f20859Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6413c.f20861p0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(objM7294a);
                C6911c c6911cMo7303b = c8915b0.f27285Y.mo7303b();
                InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C6416f.class);
                try {
                    interfaceC3777yM18075c = AbstractC16526C.m18075c(C6416f.class);
                } catch (Throwable unused) {
                    interfaceC3777yM18075c = null;
                }
                C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
                c6413c.f20858Y = c8915b0;
                c6413c.f20861p0 = 1;
                objM7294a = c6911cMo7303b.m7294a(c21296a, c6413c);
                if (objM7294a == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c8915b0 = c6413c.f20858Y;
                AbstractC9233X.m9807c(objM7294a);
            }
            if (objM7294a != null) {
                return new C6417g(c8915b0, ((C6416f) objM7294a).f20863a);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.openai.network.cloudflare.CloudflareGenericError.Detail");
        } catch (IllegalArgumentException | C18506a unused2) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0049 A[PHI: r3
      0x0049: PHI (r3v1 F2.l) = (r3v0 F2.l), (r3v3 F2.l) binds: [B:12:0x004d, B:7:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: p */
    public Object m20001p(Activity context, C2650n c2650n, C10313i c10313i) throws PackageManager.NameNotFoundException {
        InterfaceC2646j interfaceC2646jM20614a0;
        InterfaceC2646j interfaceC2646j;
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c10313i));
        c0624m.m1262r();
        CancellationSignal cancellationSignal = new CancellationSignal();
        c0624m.m1264u(new C2630h(cancellationSignal, 1));
        C2643g c2643g = new C2643g(c0624m);
        ExecutorC2575a executorC2575a = new ExecutorC2575a(1);
        AbstractC16544l.m18094g(context, "context");
        C19506i c19506i = new C19506i(context);
        int i10 = Build.VERSION.SDK_INT;
        C2648l c2648l = null;
        if (i10 >= 34) {
            C2648l c2648l2 = new C2648l(context);
            c2648l = c2648l2.isAvailableOnDevice() ? c2648l2 : null;
            if (c2648l == null) {
                interfaceC2646jM20614a0 = c19506i.m20614a0();
                interfaceC2646j = interfaceC2646jM20614a0;
            } else {
                interfaceC2646j = c2648l;
            }
        } else if (i10 <= 33) {
            interfaceC2646jM20614a0 = c19506i.m20614a0();
            interfaceC2646j = interfaceC2646jM20614a0;
        } else {
            interfaceC2646j = c2648l;
        }
        if (interfaceC2646j == null) {
            c2643g.m3624a(new C2978d((CharSequence) "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"));
        } else {
            interfaceC2646j.onGetCredential(context, c2650n, cancellationSignal, executorC2575a, c2643g);
        }
        Object objM1261q = c0624m.m1261q();
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        return objM1261q;
    }

    /* JADX INFO: renamed from: q */
    public C11845d m20002q() {
        if (C11845d.f35975c != null) {
            C11845d c11845d = C11845d.f35975c;
            AbstractC16544l.m18091d(c11845d);
            return c11845d;
        }
        synchronized (this) {
            if (C11845d.f35975c == null) {
                C11845d.f35975c = new C11845d(new C11846e(0));
            }
        }
        C11845d c11845d2 = C11845d.f35975c;
        AbstractC16544l.m18091d(c11845d2);
        return c11845d2;
    }

    /* JADX INFO: renamed from: r */
    public Signature[] mo7602r(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // p351O2.InterfaceC6088b
    /* JADX INFO: renamed from: e */
    public Object mo6660e(C6087a c6087a) throws C6087a {
        throw c6087a;
    }
}
