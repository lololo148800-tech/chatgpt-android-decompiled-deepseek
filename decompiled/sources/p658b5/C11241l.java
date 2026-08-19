package p658b5;

import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import android.view.animation.Animation;
import androidx.cardview.widget.CardView;
import fo.C13711h;
import io.sentry.C15175X0;
import io.sentry.C15321b1;
import io.sentry.protocol.C15445r;
import io.sentry.protocol.C15447t;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p001A.C0093v0;
import p001A.C0100z;
import p003A1.AbstractC0168G;
import p025An.AbstractC0593T;
import p028B.C0694a;
import p028B.C0700g;
import p028B.C0707n;
import p032B4.C0806a;
import p053C.C1473h;
import p053C.C1474i;
import p053C.C1487v;
import p053C.InterfaceC1486u;
import p060C6.AbstractC1604a;
import p060C6.C1607d;
import p084D4.C1920j;
import p092Dc.C1991h;
import p1020t7.InterfaceC19806d;
import p1027tp.C20048M;
import p1027tp.C20069m;
import p1027tp.InterfaceC20059c;
import p1027tp.InterfaceC20062f;
import p1027tp.RunnableC20068l;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2184i;
import p1055v4.C20427A;
import p1055v4.C20455z;
import p1055v4.InterfaceC20454y;
import p1073w3.C20811m;
import p1073w3.C20816r;
import p1113xn.AbstractC21322p;
import p1140z1.C21658D;
import p1140z1.C21709o0;
import p143Fd.InterfaceC2719i;
import p167Gb.C3032c;
import p178H.C3152j0;
import p178H.InterfaceC3127U;
import p202I.C3535k;
import p209I6.C3632j;
import p228J.C3875z0;
import p228J.EnumC3848m;
import p228J.EnumC3850n;
import p228J.EnumC3852o;
import p228J.InterfaceC3819V;
import p228J.InterfaceC3820W;
import p228J.InterfaceC3854p;
import p253K.C4498i;
import p301M.InterfaceC5221c;
import p326N.C5561c;
import p334Na.C5700g;
import p334Na.C5701h;
import p357Oa.InterfaceC6150c;
import p372P3.C6318J;
import p372P3.InterfaceC6335q;
import p403Qd.AbstractC6605K;
import p403Qd.AbstractC6653q0;
import p403Qd.C6600F;
import p403Qd.C6627d0;
import p403Qd.EnumC6606L;
import p414R.C6771e;
import p414R.C6778l;
import p414R.C6779m;
import p451Sb.C7102a;
import p470T4.C7241f;
import p470T4.C7246k;
import p479Td.AbstractC7343b0;
import p479Td.C7351f0;
import p523V9.AbstractC8042a0;
import p523V9.AbstractC8072d6;
import p523V9.AbstractC8206u4;
import p530Vi.C8321q;
import p544W9.AbstractC8483G3;
import p571X9.AbstractC9189P2;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9393x3;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p661b7.InterfaceC11256c;
import p674c5.RunnableC11657j;
import p719e5.C13285a;
import p734ep.C13458b;
import p784hb.AbstractC14434c;
import p900n6.C17504a;
import p900n6.C17506c;
import p900n6.C17507d;
import p909nm.AbstractC17680n;
import p917o6.C17851d;
import p917o6.C17852e;
import p917o6.C17853f;
import p917o6.InterfaceC17842J;
import p960q9.C18655i;
import p996rm.EnumC19250a;
import sk.C19665d;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: b5.l */
/* JADX INFO: loaded from: classes.dex */
public class C11241l implements InterfaceC3854p, InterfaceC2719i, InterfaceC3820W, InterfaceC6150c, InterfaceC5221c, InterfaceC20062f, InterfaceC20454y, InterfaceC19806d {

    /* JADX INFO: renamed from: Y */
    public Object f34016Y;

    /* JADX INFO: renamed from: Z */
    public Object f34017Z;

    public /* synthetic */ C11241l(Object obj, Object obj2) {
        this.f34016Y = obj;
        this.f34017Z = obj2;
    }

    /* JADX INFO: renamed from: O */
    public static ArrayList m12583O(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1474i) it.next()).f3883a.mo2116e());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public static void m12584z(CameraDevice cameraDevice, C1487v c1487v) {
        cameraDevice.getClass();
        InterfaceC1486u interfaceC1486u = c1487v.f3907a;
        interfaceC1486u.mo2128f().getClass();
        List listMo2129g = interfaceC1486u.mo2129g();
        if (listMo2129g == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (interfaceC1486u.mo2126d() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        String id2 = cameraDevice.getId();
        Iterator it = listMo2129g.iterator();
        while (it.hasNext()) {
            String strMo2115d = ((C1474i) it.next()).f3883a.mo2115d();
            if (strMo2115d != null && !strMo2115d.isEmpty()) {
                AbstractC8072d6.m8492i("CameraDeviceCompat", AbstractC0010F.m20d("Camera ", id2, ": Camera doesn't support physicalCameraId ", strMo2115d, ". Ignoring."));
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public boolean m12585A(C21658D c21658d, boolean z6) {
        boolean zContains = ((C21709o0) ((C19665d) this.f34016Y).f62330o0).contains(c21658d);
        if (z6) {
            return zContains;
        }
        return zContains || ((C21709o0) ((C19665d) this.f34017Z).f62330o0).contains(c21658d);
    }

    /* JADX INFO: renamed from: B */
    public void mo1478B(C1487v c1487v) throws C0694a {
        CameraDevice cameraDevice = (CameraDevice) this.f34016Y;
        m12584z(cameraDevice, c1487v);
        InterfaceC1486u interfaceC1486u = c1487v.f3907a;
        C0700g c0700g = new C0700g(interfaceC1486u.mo2126d(), interfaceC1486u.mo2128f());
        ArrayList arrayListM12583O = m12583O(interfaceC1486u.mo2129g());
        C0707n c0707n = (C0707n) this.f34017Z;
        c0707n.getClass();
        C1473h c1473hMo2125c = interfaceC1486u.mo2125c();
        Handler handler = c0707n.f2050a;
        try {
            if (c1473hMo2125c != null) {
                InputConfiguration inputConfiguration = c1473hMo2125c.f3882a.f3881a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSession(inputConfiguration, arrayListM12583O, c0700g, handler);
            } else {
                if (interfaceC1486u.mo2127e() == 1) {
                    cameraDevice.createConstrainedHighSpeedCaptureSession(arrayListM12583O, c0700g, handler);
                    return;
                }
                try {
                    cameraDevice.createCaptureSession(arrayListM12583O, c0700g, handler);
                } catch (CameraAccessException e10) {
                    throw new C0694a(e10);
                }
            }
        } catch (CameraAccessException e11) {
            throw new C0694a(e11);
        }
    }

    /* JADX INFO: renamed from: C */
    public C3152j0 m12586C(InterfaceC3127U interfaceC3127U) {
        C3875z0 c3875z0;
        if (interfaceC3127U == null) {
            return null;
        }
        if (((C3535k) this.f34017Z) == null) {
            c3875z0 = C3875z0.f11717b;
        } else {
            C3535k c3535k = (C3535k) this.f34017Z;
            Pair pair = new Pair(c3535k.f10696h, c3535k.f10697i.get(0));
            C3875z0 c3875z1 = C3875z0.f11717b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            c3875z0 = new C3875z0(arrayMap);
        }
        this.f34017Z = null;
        return new C3152j0(interfaceC3127U, new Size(interfaceC3127U.getWidth(), interfaceC3127U.getHeight()), new C5561c(new C3632j(null, c3875z0, interfaceC3127U.mo3968k0().mo3966f())));
    }

    /* JADX INFO: renamed from: D */
    public EnumC6606L mo3705D() {
        return AbstractC8042a0.m8415c((ArrayList) this.f34016Y);
    }

    /* JADX INFO: renamed from: E */
    public AbstractC6653q0 mo3703E(C1991h c1991h) {
        return new C6627d0((String) null, false, 7);
    }

    /* JADX INFO: renamed from: G */
    public boolean m12588G() {
        return !(((C21709o0) ((C19665d) this.f34017Z).f62330o0).isEmpty() && ((C21709o0) ((C19665d) this.f34016Y).f62330o0).isEmpty());
    }

    /* JADX INFO: renamed from: H */
    public AbstractC7343b0 mo3706H() {
        return (AbstractC7343b0) this.f34017Z;
    }

    /* JADX INFO: renamed from: I */
    public void m12589I(int i10, int i11, int i12, int i13) {
        CardView cardView = (CardView) this.f34017Z;
        cardView.f32364r0.set(i10, i11, i12, i13);
        Rect rect = cardView.f32363q0;
        super/*android.widget.FrameLayout*/.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
    }

    @Override // p301M.InterfaceC5221c
    /* JADX INFO: renamed from: J */
    public void mo3912J(Throwable th2) {
        int i10 = ((C6778l) this.f34016Y).f21767f;
        if (i10 == 2 && (th2 instanceof CancellationException)) {
            AbstractC8072d6.m8486c("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
            return;
        }
        AbstractC8072d6.m8493j("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + AbstractC9189P2.m9750b(i10), th2);
    }

    /* JADX INFO: renamed from: K */
    public C8321q m12590K(String cdnHost) throws IOException {
        InputStream errorStream;
        AbstractC16544l.m18094g(cdnHost, "cdnHost");
        ((C7102a) this.f34017Z).getClass();
        String writeKey = (String) this.f34016Y;
        AbstractC16544l.m18094g(writeKey, "writeKey");
        HttpURLConnection httpURLConnectionM7514y = C7102a.m7514y("https://" + cdnHost + "/projects/" + writeKey + "/settings");
        httpURLConnectionM7514y.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "application/json; charset=utf-8");
        int responseCode = httpURLConnectionM7514y.getResponseCode();
        if (responseCode == 200) {
            try {
                errorStream = httpURLConnectionM7514y.getInputStream();
            } catch (IOException unused) {
                errorStream = httpURLConnectionM7514y.getErrorStream();
            }
            return new C8321q(httpURLConnectionM7514y, errorStream, null, 0);
        }
        httpURLConnectionM7514y.disconnect();
        StringBuilder sbM11057o = AbstractC10763a.m11057o(responseCode, "HTTP ", ": ");
        sbM11057o.append(httpURLConnectionM7514y.getResponseMessage());
        throw new IOException(sbM11057o.toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: L */
    public Object m12591L(InterfaceC2184i interfaceC2184i, AbstractC19687c abstractC19687c) {
        C17504a c17504a;
        if (abstractC19687c instanceof C17504a) {
            c17504a = (C17504a) abstractC19687c;
            int i10 = c17504a.f55986o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17504a.f55986o0 = i10 - Integer.MIN_VALUE;
            } else {
                c17504a = new C17504a(this, abstractC19687c);
            }
        } else {
            c17504a = new C17504a(this, abstractC19687c);
        }
        Object objM3200D = c17504a.f55984Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17504a.f55986o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3200D);
            c17504a.f55986o0 = 1;
            objM3200D = AbstractC2124C.m3200D(interfaceC2184i, c17504a);
            if (objM3200D == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM3200D);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : (List) objM3200D) {
            if (((C17853f) obj).f56935e != null) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        if (size != 0) {
            if (size == 1) {
                return (C17853f) AbstractC17680n.m19341Q(arrayList2);
            }
            throw new C1607d("The operation returned multiple items, use .toFlow() instead of .execute()", null);
        }
        int size2 = arrayList.size();
        if (size2 == 0) {
            throw new C1607d("The operation did not emit any item, check your interceptor chain", null);
        }
        if (size2 == 1) {
            return (C17853f) AbstractC17680n.m19341Q(arrayList);
        }
        C17853f c17853f = (C17853f) AbstractC17680n.m19341Q(arrayList);
        C0806a c0806aM19598a = c17853f.m19598a();
        List listM19336L = AbstractC17680n.m19336L(arrayList, 1);
        AbstractC1604a abstractC1604a = c17853f.f56935e;
        AbstractC16544l.m18091d(abstractC1604a);
        Iterator it = listM19336L.iterator();
        while (it.hasNext()) {
            AbstractC1604a abstractC1604a2 = ((C17853f) it.next()).f56935e;
            AbstractC16544l.m18091d(abstractC1604a2);
            AbstractC9221V.m9789a(abstractC1604a, abstractC1604a2);
        }
        c0806aM19598a.f2241g = abstractC1604a;
        return c0806aM19598a.m1843b();
    }

    /* JADX INFO: renamed from: M */
    public void m12592M(C7246k workSpecId, int i10) {
        AbstractC16544l.m18094g(workSpecId, "workSpecId");
        ((C13285a) this.f34017Z).m14897a(new RunnableC11657j((C7241f) this.f34016Y, workSpecId, false, i10));
    }

    /* JADX INFO: renamed from: N */
    public InterfaceC2184i m12593N() {
        C17852e c17852eM19596a = ((C17851d) this.f34017Z).m19596a();
        C17507d c17507d = (C17507d) this.f34016Y;
        c17507d.getClass();
        return AbstractC2124C.m3208g(AbstractC2124C.m3224w(AbstractC2124C.m3210i(new C17506c(c17507d, c17852eM19596a, null)), AbstractC0593T.f1825b), Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: P */
    public C8321q m12594P(String apiHost) throws IOException {
        OutputStream outputStream;
        AbstractC16544l.m18094g(apiHost, "apiHost");
        HttpURLConnection httpURLConnectionMo7517z = ((C7102a) this.f34017Z).mo7517z(apiHost);
        String requestProperty = httpURLConnectionMo7517z.getRequestProperty(SIPHeaderNames.CONTENT_ENCODING);
        if (requestProperty == null) {
            requestProperty = "";
        }
        if (AbstractC21322p.m21667A(requestProperty, "gzip", false)) {
            outputStream = new GZIPOutputStream(httpURLConnectionMo7517z.getOutputStream());
        } else {
            outputStream = httpURLConnectionMo7517z.getOutputStream();
            AbstractC16544l.m18093f(outputStream, "{\n            this.outputStream\n        }");
        }
        return new C8321q(httpURLConnectionMo7517z, null, outputStream, 1);
    }

    @Override // p357Oa.InterfaceC6150c
    /* JADX INFO: renamed from: a */
    public Object mo3914a() {
        return new C5700g((Context) ((C18655i) ((C3032c) this.f34016Y).f9127Z).f59414Z, (C5701h) ((InterfaceC6150c) this.f34017Z).mo3914a());
    }

    @Override // p1055v4.InterfaceC20454y
    /* JADX INFO: renamed from: b */
    public void mo3067b(C20811m c20811m) {
        if (c20811m.m21365t() != 0 || (c20811m.m21365t() & 128) == 0) {
            return;
        }
        c20811m.m21345G(6);
        int iM21346a = c20811m.m21346a() / 4;
        int i10 = 0;
        while (true) {
            C20427A c20427a = (C20427A) this.f34017Z;
            if (i10 >= iM21346a) {
                c20427a.getClass();
                c20427a.f64617g.remove(0);
                return;
            }
            C6318J c6318j = (C6318J) this.f34016Y;
            c20811m.m21350e(c6318j.f20467d, 0, 4);
            c6318j.m6880q(0);
            int iM6872i = c6318j.m6872i(16);
            c6318j.m6883t(3);
            if (iM6872i == 0) {
                c6318j.m6883t(13);
            } else {
                int iM6872i2 = c6318j.m6872i(13);
                if (c20427a.f64617g.get(iM6872i2) == null) {
                    c20427a.f64617g.put(iM6872i2, new C20455z(new C1920j(c20427a, iM6872i2)));
                    c20427a.f64623m++;
                }
            }
            i10++;
        }
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: c */
    public C3875z0 mo4345c() {
        return (C3875z0) this.f34016Y;
    }

    @Override // p228J.InterfaceC3820W
    public void close() {
        ((C0093v0) this.f34016Y).close();
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: e */
    public void mo4346e(C4498i c4498i) {
        String strValueOf;
        Integer num;
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) this.f34017Z;
        AbstractC0168G.m518g(this, c4498i);
        try {
            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num2 != null) {
                c4498i.m5236d(num2.intValue());
            }
        } catch (BufferUnderflowException unused) {
            AbstractC8072d6.m8492i("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        ArrayList arrayList = c4498i.f14674a;
        if (l4 != null) {
            c4498i.m5235c("ExposureTime", String.valueOf(l4.longValue() / TimeUnit.SECONDS.toNanos(1L)), arrayList);
        }
        Float f10 = (Float) totalCaptureResult.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            c4498i.m5235c("FNumber", String.valueOf(f10.floatValue()), arrayList);
        }
        Integer numValueOf = (Integer) totalCaptureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num.intValue() / 100.0f)));
            }
            int iIntValue = numValueOf.intValue();
            c4498i.m5235c("SensitivityType", String.valueOf(3), arrayList);
            c4498i.m5235c("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)), arrayList);
        }
        Float f11 = (Float) totalCaptureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            c4498i.m5235c("FocalLength", ((long) (f11.floatValue() * 1000.0f)) + "/1000", arrayList);
        }
        Integer num3 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            int iM24h = AbstractC0010F.m24h(num3.intValue() == 0 ? 2 : 1);
            if (iM24h != 0) {
                strValueOf = iM24h != 1 ? null : String.valueOf(1);
            } else {
                strValueOf = String.valueOf(0);
            }
            c4498i.m5235c("WhiteBalance", strValueOf, arrayList);
        }
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: f */
    public long mo4347f() {
        Long l4 = (Long) ((TotalCaptureResult) this.f34017Z).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l4 == null) {
            return -1L;
        }
        return l4.longValue();
    }

    @Override // p143Fd.InterfaceC2719i
    /* JADX INFO: renamed from: g */
    public List mo3550g(C1991h c1991h, EnumC6606L replaceInProgress) {
        AbstractC16544l.m18094g(replaceInProgress, "replaceInProgress");
        ArrayList arrayList = (ArrayList) this.f34016Y;
        AbstractC7343b0 abstractC7343b0Mo3706H = mo3706H();
        EnumC6606L enumC6606LMo3705D = mo3705D();
        if (AbstractC6605K.f21326a[enumC6606LMo3705D.ordinal()] != 1) {
            replaceInProgress = enumC6606LMo3705D;
        }
        return AbstractC9393x3.m9974d(new C6600F(replaceInProgress, arrayList, abstractC7343b0Mo3706H, mo3703E(c1991h)));
    }

    @Override // p228J.InterfaceC3820W
    public int getHeight() {
        return ((C0093v0) this.f34016Y).getHeight();
    }

    @Override // p228J.InterfaceC3820W
    public Surface getSurface() {
        return ((C0093v0) this.f34016Y).getSurface();
    }

    @Override // p228J.InterfaceC3820W
    public int getWidth() {
        return ((C0093v0) this.f34016Y).getWidth();
    }

    @Override // p143Fd.InterfaceC2719i
    /* JADX INFO: renamed from: h */
    public boolean mo3551h(C7351f0 c7351f0) {
        ((ArrayList) this.f34016Y).add(c7351f0);
        if (!AbstractC8042a0.m8419g(c7351f0) && !AbstractC8042a0.m8418f(c7351f0)) {
            return false;
        }
        this.f34017Z = c7351f0.f23291f;
        return true;
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: i */
    public InterfaceC3127U mo342i() {
        return m12586C(((C0093v0) this.f34016Y).mo342i());
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: j */
    public int mo343j() {
        return ((C0093v0) this.f34016Y).mo343j();
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: k */
    public void mo344k() {
        ((C0093v0) this.f34016Y).mo344k();
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: l */
    public EnumC3852o mo4348l() {
        Integer num = (Integer) ((TotalCaptureResult) this.f34017Z).get(CaptureResult.CONTROL_AWB_STATE);
        EnumC3852o enumC3852o = EnumC3852o.f11647Y;
        if (num == null) {
            return enumC3852o;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC3852o.f11648Z;
        }
        if (iIntValue == 1) {
            return EnumC3852o.f11649o0;
        }
        if (iIntValue == 2) {
            return EnumC3852o.f11650p0;
        }
        if (iIntValue == 3) {
            return EnumC3852o.f11651q0;
        }
        AbstractC8072d6.m8487d("C2CameraCaptureResult", "Undefined awb state: " + num);
        return enumC3852o;
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: m */
    public int mo4349m() {
        Integer num = (Integer) ((TotalCaptureResult) this.f34017Z).get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return 1;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return 2;
        }
        if (iIntValue == 2) {
            return 3;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return 4;
        }
        AbstractC8072d6.m8487d("C2CameraCaptureResult", "Undefined flash state: " + num);
        return 1;
    }

    @Override // p1020t7.InterfaceC19806d
    /* JADX INFO: renamed from: n */
    public File mo12595n(File file) {
        return null;
    }

    @Override // p1020t7.InterfaceC19806d
    /* JADX INFO: renamed from: o */
    public File mo12596o(boolean z6) {
        File file = (File) this.f34016Y;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            AbstractC8206u4.m8827i(parentFile, (InterfaceC11256c) this.f34017Z);
        }
        return file;
    }

    @Override // p301M.InterfaceC5221c, p746fa.InterfaceC13596e
    public void onSuccess(Object obj) {
        C6779m c6779m = (C6779m) obj;
        c6779m.getClass();
        ((C6771e) ((C11242m) this.f34017Z).f34018Y).mo7202b(c6779m);
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: p */
    public void mo347p(InterfaceC3819V interfaceC3819V, Executor executor) {
        ((C0093v0) this.f34016Y).mo347p(new C0100z(this, 16, interfaceC3819V), executor);
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: q */
    public EnumC3848m mo4350q() {
        Integer num = (Integer) ((TotalCaptureResult) this.f34017Z).get(CaptureResult.CONTROL_AE_STATE);
        EnumC3848m enumC3848m = EnumC3848m.f11630Y;
        if (num == null) {
            return enumC3848m;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC3848m.f11631Z;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return EnumC3848m.f11634q0;
            }
            if (iIntValue == 3) {
                return EnumC3848m.f11635r0;
            }
            if (iIntValue == 4) {
                return EnumC3848m.f11633p0;
            }
            if (iIntValue != 5) {
                AbstractC8072d6.m8487d("C2CameraCaptureResult", "Undefined ae state: " + num);
                return enumC3848m;
            }
        }
        return EnumC3848m.f11632o0;
    }

    @Override // p1020t7.InterfaceC19806d
    /* JADX INFO: renamed from: r */
    public File mo12597r() {
        return null;
    }

    @Override // p1027tp.InterfaceC20062f
    /* JADX INFO: renamed from: s */
    public void mo3626s(InterfaceC20059c interfaceC20059c, Throwable th2) {
        ((C20069m) this.f34017Z).f63560Y.execute(new RunnableC20068l(this, (InterfaceC20062f) this.f34016Y, th2, 0));
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: t */
    public int mo350t() {
        return ((C0093v0) this.f34016Y).mo350t();
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: u */
    public CaptureResult mo4351u() {
        return (TotalCaptureResult) this.f34017Z;
    }

    @Override // p1027tp.InterfaceC20062f
    /* JADX INFO: renamed from: v */
    public void mo3627v(InterfaceC20059c interfaceC20059c, C20048M c20048m) {
        ((C20069m) this.f34017Z).f63560Y.execute(new RunnableC20068l(this, (InterfaceC20062f) this.f34016Y, c20048m, 1));
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: w */
    public EnumC3850n mo4352w() {
        Integer num = (Integer) ((TotalCaptureResult) this.f34017Z).get(CaptureResult.CONTROL_AF_STATE);
        EnumC3850n enumC3850n = EnumC3850n.f11637Y;
        if (num == null) {
            return enumC3850n;
        }
        switch (num.intValue()) {
            case 0:
                return EnumC3850n.f11638Z;
            case 1:
            case 3:
                return EnumC3850n.f11639o0;
            case 2:
                return EnumC3850n.f11640p0;
            case 4:
                return EnumC3850n.f11642r0;
            case 5:
                return EnumC3850n.f11643s0;
            case 6:
                return EnumC3850n.f11641q0;
            default:
                AbstractC8072d6.m8487d("C2CameraCaptureResult", "Undefined af state: " + num);
                return enumC3850n;
        }
    }

    @Override // p228J.InterfaceC3820W
    /* JADX INFO: renamed from: x */
    public InterfaceC3127U mo354x() {
        return m12586C(((C0093v0) this.f34016Y).mo354x());
    }

    /* JADX INFO: renamed from: y */
    public void m12598y(C21658D c21658d, boolean z6) {
        C19665d c19665d = (C19665d) this.f34017Z;
        C19665d c19665d2 = (C19665d) this.f34016Y;
        if (z6) {
            c19665d2.m20640c(c21658d);
            c19665d.m20640c(c21658d);
        } else {
            if (((C21709o0) c19665d2.f62330o0).contains(c21658d)) {
                return;
            }
            c19665d.m20640c(c21658d);
        }
    }

    public /* synthetic */ C11241l(Object obj, Object obj2, boolean z6) {
        this.f34017Z = obj;
        this.f34016Y = obj2;
    }

    /* JADX INFO: renamed from: F */
    public int m12587F() {
        Integer num = (Integer) ((TotalCaptureResult) this.f34017Z).get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return 1;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return 3;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return 4;
            }
            if (iIntValue != 5) {
                AbstractC8072d6.m8487d(tpXhEMGxfXFVSh.mzLIhakXCTavh, "Undefined af mode: " + num);
                return 1;
            }
        }
        return 2;
    }

    public C11241l(String writeKey, C7102a requestFactory) {
        AbstractC16544l.m18094g(writeKey, "writeKey");
        AbstractC16544l.m18094g(requestFactory, "requestFactory");
        this.f34016Y = writeKey;
        this.f34017Z = requestFactory;
    }

    public C11241l(File file, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f34016Y = file;
        this.f34017Z = internalLogger;
    }

    public C11241l(int i10) {
        switch (i10) {
            case 13:
                C11241l c11241l = AbstractC14434c.f45398a;
                this.f34016Y = new C13711h((C13711h) c11241l.f34016Y);
                this.f34017Z = Arrays.copyOf((long[]) c11241l.f34017Z, 10);
                break;
            case 20:
                this.f34016Y = new C19665d(6);
                this.f34017Z = new C19665d(6);
                break;
            default:
                this.f34016Y = new ArrayList();
                break;
        }
    }

    public C11241l(C15175X0 c15175x0, Collection collection) {
        AbstractC8483G3.m9133c(c15175x0, "SentryEnvelopeHeader is required.");
        this.f34016Y = c15175x0;
        AbstractC8483G3.m9133c(collection, "SentryEnvelope items are required.");
        this.f34017Z = collection;
    }

    public C11241l(CameraDevice cameraDevice, C0707n c0707n) {
        cameraDevice.getClass();
        this.f34016Y = cameraDevice;
        this.f34017Z = c0707n;
    }

    public C11241l(C17507d apolloClient, InterfaceC17842J interfaceC17842J) {
        AbstractC16544l.m18094g(apolloClient, "apolloClient");
        C17851d c17851d = new C17851d(interfaceC17842J);
        AbstractC16544l.m18094g(apolloClient, "apolloClient");
        this.f34016Y = apolloClient;
        this.f34017Z = c17851d;
    }

    public C11241l(C15447t c15447t, C15445r c15445r, C15321b1 c15321b1) {
        this.f34016Y = new C15175X0(c15447t, c15445r, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c15321b1);
        this.f34017Z = arrayList;
    }

    public C11241l(C7241f c7241f, C13285a workTaskExecutor) {
        AbstractC16544l.m18094g(c7241f, tpXhEMGxfXFVSh.YijEgD);
        AbstractC16544l.m18094g(workTaskExecutor, "workTaskExecutor");
        this.f34016Y = c7241f;
        this.f34017Z = workTaskExecutor;
    }

    public C11241l(Animation animation) {
        this.f34016Y = animation;
        this.f34017Z = null;
    }

    @Override // p1055v4.InterfaceC20454y
    /* JADX INFO: renamed from: d */
    public void mo3069d(C20816r c20816r, InterfaceC6335q interfaceC6335q, C13458b c13458b) {
    }
}
