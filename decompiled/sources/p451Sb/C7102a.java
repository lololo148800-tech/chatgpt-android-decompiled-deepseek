package p451Sb;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.graphics.Path;
import android.hardware.camera2.CaptureResult;
import android.media.CamcorderProfile;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Parcel;
import com.google.protobuf.InterfaceC12163j0;
import ec.C13359a;
import io.sentry.android.core.InterfaceC15190H;
import java.io.IOException;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.Provider;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.TreeSet;
import javax.crypto.Cipher;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.InterfaceC0058e;
import p003A1.AbstractC0168G;
import p030B2.C0742X;
import p032B4.InterfaceC0808c;
import p1036u9.InterfaceC20165k;
import p1141z2.AbstractC21725d;
import p140Fa.C2685e;
import p182H3.InterfaceC3224y;
import p228J.C3875z0;
import p228J.EnumC3848m;
import p228J.EnumC3850n;
import p228J.EnumC3852o;
import p228J.InterfaceC3854p;
import p238J9.BinderC4294b;
import p253K.C4498i;
import p265Kb.InterfaceC4623p;
import p310M9.AbstractC5307a;
import p310M9.C5308b;
import p310M9.C5309c;
import p360Od.EnumC6173e;
import p372P3.InterfaceC6310B;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6335q;
import p447S7.InterfaceC7027c;
import p523V9.AbstractC8199t5;
import p530Vi.C8312h;
import p594Y9.AbstractC9710C4;
import p594Y9.AbstractC9852a3;
import p594Y9.C9847Z4;
import p594Y9.InterfaceC9882e5;
import p746fa.C13599h;
import p775h2.AbstractC14376f;
import p784hb.InterfaceC14441j;
import p793ho.EnumC14686X2;
import p849k7.C16354g;
import sj.hJY.CsqksqyPE;
import tm.C20007b;

/* JADX INFO: renamed from: Sb.a */
/* JADX INFO: loaded from: classes.dex */
public class C7102a implements InterfaceC0058e, InterfaceC0808c, InterfaceC3224y, InterfaceC3854p, InterfaceC4623p, InterfaceC20165k, InterfaceC6335q, InterfaceC7027c, InterfaceC9882e5, InterfaceC14441j, InterfaceC12163j0, InterfaceC15190H {

    /* JADX INFO: renamed from: Z */
    public static C7102a f22599Z;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22600Y;

    public /* synthetic */ C7102a(int i10) {
        this.f22600Y = i10;
    }

    /* JADX INFO: renamed from: r */
    public static EnumC6173e m7512r(String str) {
        Object next;
        C20007b c20007b = EnumC6173e.f20098C0;
        c20007b.getClass();
        C0742X c0742x = new C0742X(c20007b, 8);
        while (c0742x.hasNext()) {
            next = c0742x.next();
            if (((EnumC6173e) next).f20111Y.equals(str)) {
                return (EnumC6173e) next;
            }
        }
        next = null;
        return (EnumC6173e) next;
    }

    /* JADX INFO: renamed from: v */
    public static Path m7513v(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        return path;
    }

    /* JADX INFO: renamed from: y */
    public static HttpURLConnection m7514y(String url) throws IOException {
        AbstractC16544l.m18094g(url, "url");
        try {
            URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
            AbstractC16544l.m18092e(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(201000);
            httpURLConnection.setRequestProperty(SIPHeaderNames.USER_AGENT, "analytics-kotlin/1.18.2");
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        } catch (MalformedURLException e10) {
            IOException iOException = new IOException("Attempted to use malformed url: ".concat(url), e10);
            AbstractC9852a3.m10502c(C8312h.Companion, iOException);
            throw iOException;
        }
    }

    @Override // p784hb.InterfaceC14441j
    /* JADX INFO: renamed from: A */
    public Object mo3663A(Provider provider) {
        return provider == null ? Cipher.getInstance("SHA-512") : Cipher.getInstance("SHA-512", provider);
    }

    @Override // p372P3.InterfaceC6335q
    /* JADX INFO: renamed from: D */
    public InterfaceC6316H mo3044D(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // p372P3.InterfaceC6335q
    /* JADX INFO: renamed from: F */
    public void mo3045F(InterfaceC6310B interfaceC6310B) {
        throw new UnsupportedOperationException();
    }

    @Override // p265Kb.InterfaceC4623p
    /* JADX INFO: renamed from: R */
    public Object mo3263R() {
        switch (this.f22600Y) {
            case 9:
                return new TreeSet();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // com.google.protobuf.InterfaceC12163j0
    /* JADX INFO: renamed from: a */
    public Object mo7515a(Object obj) {
        EnumC14686X2 enumC14686X2M16045a = EnumC14686X2.m16045a(((Integer) obj).intValue());
        return enumC14686X2M16045a == null ? EnumC14686X2.UNRECOGNIZED : enumC14686X2M16045a;
    }

    @Override // p1036u9.InterfaceC20165k
    public void accept(Object obj, Object obj2) {
        C5309c c5309c = (C5309c) ((C5308b) obj).m13209q();
        BinderC4294b binderC4294b = new BinderC4294b((C13599h) obj2, 1);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i10 = AbstractC5307a.f17480a;
        parcelObtain.writeInt(1);
        AbstractC8199t5.m8812k(parcelObtain, AbstractC8199t5.m8811j(parcelObtain, 20293));
        parcelObtain.writeStrongBinder(binderC4294b);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            c5309c.f17481a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // p182H3.InterfaceC3224y
    /* JADX INFO: renamed from: b */
    public MediaCodecInfo mo4115b(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: c */
    public C3875z0 mo4345c() {
        return C3875z0.f11717b;
    }

    @Override // p001A.InterfaceC0058e
    /* JADX INFO: renamed from: d */
    public CamcorderProfile mo236d(int i10, int i11) {
        return CamcorderProfile.get(i10, i11);
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void mo4346e(C4498i c4498i) {
        AbstractC0168G.m518g(this, c4498i);
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: f */
    public long mo4347f() {
        return -1L;
    }

    @Override // p182H3.InterfaceC3224y
    /* JADX INFO: renamed from: g */
    public boolean mo4116g(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // p447S7.InterfaceC7027c
    /* JADX INFO: renamed from: h */
    public void mo7425h(C16354g c16354g, int i10) {
        AbstractC14376f.m15825D(i10, "reportTarget");
    }

    @Override // p001A.InterfaceC0058e
    /* JADX INFO: renamed from: j */
    public boolean mo237j(int i10, int i11) {
        return CamcorderProfile.hasProfile(i10, i11);
    }

    @Override // p182H3.InterfaceC3224y
    /* JADX INFO: renamed from: k */
    public boolean mo4117k(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: l */
    public EnumC3852o mo4348l() {
        return EnumC3852o.f11647Y;
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: m */
    public int mo4349m() {
        return 1;
    }

    @Override // p182H3.InterfaceC3224y
    /* JADX INFO: renamed from: o */
    public int mo4118o() {
        return MediaCodecList.getCodecCount();
    }

    @Override // p182H3.InterfaceC3224y
    /* JADX INFO: renamed from: p */
    public boolean mo4119p() {
        return false;
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: q */
    public EnumC3848m mo4350q() {
        return EnumC3848m.f11630Y;
    }

    @Override // p372P3.InterfaceC6335q
    /* JADX INFO: renamed from: s */
    public void mo3061s() {
        throw new UnsupportedOperationException();
    }

    @Override // p594Y9.InterfaceC9882e5
    /* JADX INFO: renamed from: t */
    public Object mo3670t(Object obj) {
        C9847Z4 c9847z4 = (C9847Z4) obj;
        C13359a c13359a = new C13359a(c9847z4.f29346Y, c9847z4.f29347Z, c9847z4.f29348o0, c9847z4.f29349p0);
        ArrayList arrayList = c9847z4.f29352s0;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        AbstractC9710C4.m10304b(arrayList, new C2685e());
        return c13359a;
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: u */
    public CaptureResult mo4351u() {
        return null;
    }

    @Override // p228J.InterfaceC3854p
    /* JADX INFO: renamed from: w */
    public EnumC3850n mo4352w() {
        return EnumC3850n.f11637Y;
    }

    /* JADX INFO: renamed from: x */
    public boolean mo7516x(CharSequence charSequence) {
        return charSequence instanceof AbstractC21725d;
    }

    /* JADX INFO: renamed from: z */
    public HttpURLConnection mo7517z(String apiHost) throws IOException {
        AbstractC16544l.m18094g(apiHost, "apiHost");
        HttpURLConnection httpURLConnectionM7514y = m7514y("https://" + apiHost + "/b");
        httpURLConnectionM7514y.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "text/plain");
        httpURLConnectionM7514y.setRequestProperty(CsqksqyPE.EPCXPXNlDiBRfy, "gzip");
        httpURLConnectionM7514y.setDoOutput(true);
        httpURLConnectionM7514y.setChunkedStreamingMode(0);
        return httpURLConnectionM7514y;
    }

    @Override // p032B4.InterfaceC0808c
    /* JADX INFO: renamed from: n */
    public void mo1847n() {
    }

    @Override // p032B4.InterfaceC0808c
    /* JADX INFO: renamed from: i */
    public void mo1846i(Serializable serializable, int i10) {
    }
}
