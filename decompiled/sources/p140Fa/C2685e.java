package p140Fa;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.CamcorderProfile;
import android.os.Parcel;
import androidx.camera.core.ImageProcessingUtil;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import ec.C13359a;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.security.Signature;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.InterfaceC0058e;
import p026Ao.C0654C;
import p029B0.C0714a;
import p051Bo.C1461g;
import p1036u9.InterfaceC20165k;
import p1113xn.AbstractC21329w;
import p113E7.InterfaceC2353a;
import p1156zj.C22195t0;
import p150Fk.AbstractC2894b;
import p178H.C3118K;
import p178H.C3124Q;
import p178H.C3150i0;
import p178H.InterfaceC3127U;
import p204I1.C3581L;
import p214Ib.C3676s;
import p238J9.BinderC4294b;
import p265Kb.InterfaceC4623p;
import p329N3.InterfaceC5633w;
import p356O9.AbstractC6145c;
import p356O9.C6146d;
import p356O9.C6147e;
import p372P3.InterfaceC6324f;
import p414R.C6768b;
import p446S6.C7024c;
import p523V9.AbstractC8064c6;
import p544W9.AbstractC8676n;
import p562X0.C9008c;
import p562X0.InterfaceC9019n;
import p571X9.AbstractC9288g0;
import p594Y9.C9868c5;
import p594Y9.InterfaceC9882e5;
import p700d8.C13044e;
import p746fa.C13599h;
import p782h9.InterfaceC14430a;
import p784hb.InterfaceC14441j;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p939p3.InterfaceC18292b;
import p972qm.InterfaceC18775h;
import tj.EnumC19999a;

/* JADX INFO: renamed from: Fa.e */
/* JADX INFO: loaded from: classes.dex */
public class C2685e implements InterfaceC0058e, InterfaceC9019n, InterfaceC4623p, InterfaceC5633w, InterfaceC20165k, InterfaceC6324f, InterfaceC18775h, InterfaceC18292b, InterfaceC2353a, InterfaceC9882e5, InterfaceC14430a, InterfaceC14441j {
    /* JADX INFO: renamed from: e */
    public static final boolean m3659e(C0654C c0654c) {
        C0654C c0654c2 = C1461g.f3841f;
        return !AbstractC21329w.m21725l(c0654c.m1318b(), ".class", true);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m3660i(C22195t0 renderProps) {
        AbstractC16544l.m18094g(renderProps, "renderProps");
        EnumC19999a enumC19999aM3662l = m3662l(renderProps);
        return enumC19999aM3662l == EnumC19999a.f63314Y || enumC19999aM3662l == EnumC19999a.f63315Z;
    }

    /* JADX INFO: renamed from: k */
    public static C7024c m3661k() {
        return new C7024c(new LinkedHashMap());
    }

    /* JADX INFO: renamed from: l */
    public static EnumC19999a m3662l(C22195t0 renderProps) {
        AbstractC16544l.m18094g(renderProps, "renderProps");
        VideoCaptureConfig videoCaptureConfig = renderProps.f70351q;
        if (!videoCaptureConfig.f40639b.contains(NextStep.GovernmentId.CaptureFileType.Video)) {
            return EnumC19999a.f63316o0;
        }
        List list = videoCaptureConfig.f40640c;
        if (AbstractC17680n.m19343S(list) == EnumC19999a.f63314Y && !((Boolean) AbstractC2894b.f8701a.getValue()).booleanValue()) {
            EnumC19999a enumC19999a = EnumC19999a.f63315Z;
            return list.contains(enumC19999a) ? enumC19999a : EnumC19999a.f63316o0;
        }
        EnumC19999a enumC19999a2 = EnumC19999a.f63315Z;
        if (list.contains(enumC19999a2)) {
            return enumC19999a2;
        }
        EnumC19999a enumC19999a3 = (EnumC19999a) AbstractC17680n.m19343S(list);
        return enumC19999a3 == null ? EnumC19999a.f63316o0 : enumC19999a3;
    }

    @Override // p784hb.InterfaceC14441j
    /* JADX INFO: renamed from: A */
    public Object mo3663A(Provider provider) {
        return provider == null ? Signature.getInstance("SHA-512") : Signature.getInstance("SHA-512", provider);
    }

    @Override // p265Kb.InterfaceC4623p
    /* JADX INFO: renamed from: R */
    public Object mo3263R() {
        return new TreeMap();
    }

    @Override // p562X0.InterfaceC9019n
    /* JADX INFO: renamed from: a */
    public Object mo3664a(C9008c c9008c, Object obj) {
        C0714a c0714a = (C0714a) obj;
        Integer numValueOf = Integer.valueOf(c0714a.f2061a);
        int i10 = C3581L.f10907c;
        long j10 = c0714a.f2064d;
        Integer numValueOf2 = Integer.valueOf((int) (j10 >> 32));
        Integer numValueOf3 = Integer.valueOf((int) (j10 & 4294967295L));
        long j11 = c0714a.f2065e;
        return AbstractC17681o.m19382k(numValueOf, c0714a.f2062b, c0714a.f2063c, numValueOf2, numValueOf3, Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) (4294967295L & j11)), Long.valueOf(c0714a.f2066f));
    }

    @Override // p1036u9.InterfaceC20165k
    public void accept(Object obj, Object obj2) {
        C6146d c6146d = (C6146d) ((C6147e) obj).m13209q();
        BinderC4294b binderC4294b = new BinderC4294b((C13599h) obj2, 2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = AbstractC6145c.f20030a;
        parcelObtain.writeStrongBinder(binderC4294b);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            c6146d.f20031a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // p562X0.InterfaceC9019n
    /* JADX INFO: renamed from: b */
    public Object mo3665b(Object obj) {
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj3;
        Object obj4 = list.get(2);
        AbstractC16544l.m18092e(obj4, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj4;
        Object obj5 = list.get(3);
        AbstractC16544l.m18092e(obj5, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) obj5).intValue();
        Object obj6 = list.get(4);
        AbstractC16544l.m18092e(obj6, "null cannot be cast to non-null type kotlin.Int");
        long jM9365b = AbstractC8676n.m9365b(iIntValue2, ((Integer) obj6).intValue());
        Object obj7 = list.get(5);
        AbstractC16544l.m18092e(obj7, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue3 = ((Integer) obj7).intValue();
        Object obj8 = list.get(6);
        AbstractC16544l.m18092e(obj8, "null cannot be cast to non-null type kotlin.Int");
        long jM9365b2 = AbstractC8676n.m9365b(iIntValue3, ((Integer) obj8).intValue());
        Object obj9 = list.get(7);
        AbstractC16544l.m18092e(obj9, "null cannot be cast to non-null type kotlin.Long");
        return new C0714a(iIntValue, str, str2, jM9365b, jM9365b2, ((Long) obj9).longValue(), false, 64);
    }

    @Override // p001A.InterfaceC0058e
    /* JADX INFO: renamed from: d */
    public CamcorderProfile mo236d(int i10, int i11) {
        return CamcorderProfile.get(i10, i11);
    }

    /* JADX INFO: renamed from: f */
    public Object m3667f(Object obj) throws Throwable {
        C3150i0 c3150i0;
        Bitmap bitmapCreateBitmap;
        C6768b c6768b = (C6768b) obj;
        C3150i0 c3150i1 = null;
        try {
            try {
                int i10 = c6768b.f21710c;
                Object obj2 = c6768b.f21708a;
                int i11 = c6768b.f21713f;
                if (i10 == 35) {
                    InterfaceC3127U interfaceC3127U = (InterfaceC3127U) obj2;
                    boolean z6 = i11 % 180 != 0;
                    c3150i0 = new C3150i0(AbstractC8064c6.m8472c(z6 ? interfaceC3127U.getHeight() : interfaceC3127U.getWidth(), z6 ? interfaceC3127U.getWidth() : interfaceC3127U.getHeight(), 1, 2));
                    try {
                        C3118K c3118kM11185d = ImageProcessingUtil.m11185d(interfaceC3127U, c3150i0, ByteBuffer.allocateDirect(interfaceC3127U.getWidth() * interfaceC3127U.getHeight() * 4), i11, false);
                        interfaceC3127U.close();
                        if (c3118kM11185d == null) {
                            throw new C3124Q("Can't covert YUV to RGB", null);
                        }
                        bitmapCreateBitmap = AbstractC9288g0.m9865b(c3118kM11185d);
                        c3118kM11185d.close();
                    } catch (UnsupportedOperationException e10) {
                        e = e10;
                        throw new C3124Q("Can't convert " + (c6768b.f21710c == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th2) {
                        th = th2;
                        c3150i1 = c3150i0;
                        if (c3150i1 != null) {
                            c3150i1.close();
                        }
                        throw th;
                    }
                } else {
                    if (i10 != 256) {
                        throw new IllegalArgumentException("Invalid postview image format : " + c6768b.f21710c);
                    }
                    InterfaceC3127U interfaceC3127U2 = (InterfaceC3127U) obj2;
                    Bitmap bitmapM9865b = AbstractC9288g0.m9865b(interfaceC3127U2);
                    interfaceC3127U2.close();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i11);
                    c3150i0 = null;
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapM9865b, 0, 0, bitmapM9865b.getWidth(), bitmapM9865b.getHeight(), matrix, true);
                }
                if (c3150i0 != null) {
                    c3150i0.close();
                }
                return bitmapCreateBitmap;
            } catch (UnsupportedOperationException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // p113E7.InterfaceC2353a
    /* JADX INFO: renamed from: g */
    public String mo3437g(Object obj) {
        C13044e model = (C13044e) obj;
        AbstractC16544l.m18094g(model, "model");
        C3676s c3676s = new C3676s();
        c3676s.m4394v("type", "view");
        c3676s.m4394v("viewId", model.f41453a);
        c3676s.m4393u(Long.valueOf(model.f41454b), "documentVersion");
        String string = c3676s.toString();
        AbstractC16544l.m18093f(string, "model.toJson().toString()");
        return string;
    }

    @Override // p782h9.InterfaceC14430a
    public long getTime() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: h */
    public int m3668h(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    @Override // p001A.InterfaceC0058e
    /* JADX INFO: renamed from: j */
    public boolean mo237j(int i10, int i11) {
        return CamcorderProfile.hasProfile(i10, i11);
    }

    @Override // p594Y9.InterfaceC9882e5
    /* JADX INFO: renamed from: t */
    public Object mo3670t(Object obj) {
        C9868c5 c9868c5 = (C9868c5) obj;
        return new C13359a(c9868c5.f29375Y, c9868c5.f29376Z, c9868c5.f29377o0, "");
    }

    @Override // p329N3.InterfaceC5633w
    /* JADX INFO: renamed from: o */
    public void mo3669o() {
    }

    @Override // p329N3.InterfaceC5633w
    public void onFirstFrameRendered() {
    }

    @Override // p372P3.InterfaceC6324f
    /* JADX INFO: renamed from: c */
    public long mo3666c(long j10) {
        return j10;
    }
}
