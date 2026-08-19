package p001A;

import android.hardware.camera2.CameraCaptureSession;
import android.text.Layout;
import android.util.Log;
import android.util.SparseBooleanArray;
import androidx.lifecycle.InterfaceC11070F;
import co.AbstractC11809J;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.google.android.gms.internal.play_billing.C11986n2;
import io.sentry.android.replay.util.InterfaceC15308a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p013Ab.C0420b;
import p083D3.C1865c;
import p1006s6.C19457g;
import p1006s6.C19461k;
import p1006s6.EnumC19454d;
import p1006s6.InterfaceC19455e;
import p1006s6.InterfaceC19456f;
import p1009s9.C19506i;
import p1016t3.C19786m;
import p102Dm.AbstractC2119a;
import p1073w3.AbstractC20800b;
import p1101x8.C21156a;
import p1141z2.AbstractC21727f;
import p1141z2.C21726e;
import p204I1.C3578I;
import p204I1.C3599o;
import p204I1.C3601q;
import p230J1.AbstractC4173A;
import p230J1.C4198y;
import p277L.ExecutorC4836i;
import p301M.AbstractC5229k;
import p301M.C5231m;
import p301M.C5233o;
import p477Tb.C7296c;
import p522V8.C7834a;
import p522V8.EnumC7837d;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC7849B0;
import p544W9.AbstractC8577W2;
import p544W9.AbstractC8640h;
import p571X9.C9148I3;
import p571X9.EnumC9357r3;
import p571X9.EnumC9363s3;
import p571X9.InterfaceC9161K4;
import p593Y8.C9690q;
import p594Y9.C9895g4;
import p594Y9.C9901h4;
import p594Y9.EnumC9960r3;
import p594Y9.EnumC9966s3;
import p594Y9.InterfaceC9776N4;
import p610Z1.C10145l;
import p615Z6.C10252z0;
import p720e6.C13287b;
import p729ej.C13414e;
import p747fb.InterfaceFutureC13608b;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;
import p826j6.C16137F;
import p917o6.C17867t;
import p917o6.InterfaceC17848a;
import p960q9.C18650d;

/* JADX INFO: renamed from: A.w0 */
/* JADX INFO: loaded from: classes.dex */
public class C0095w0 implements InterfaceC9161K4, InterfaceC9776N4, InterfaceC15308a, InterfaceC17848a, InterfaceC11070F {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f409Y;

    /* JADX INFO: renamed from: Z */
    public boolean f410Z;

    /* JADX INFO: renamed from: o0 */
    public Object f411o0;

    public /* synthetic */ C0095w0(Object obj, boolean z6, int i10) {
        this.f409Y = i10;
        this.f411o0 = obj;
        this.f410Z = z6;
    }

    @Override // io.sentry.android.replay.util.InterfaceC15308a
    /* JADX INFO: renamed from: A */
    public int mo357A(int i10) {
        return ((C3578I) this.f411o0).m4256f(i10, true);
    }

    /* JADX INFO: renamed from: B */
    public void m358B(boolean z6) {
        if (z6 == this.f410Z) {
            return;
        }
        this.f410Z = z6;
        if (z6) {
            return;
        }
        synchronized (((C13287b) this.f411o0).f42000Z) {
        }
    }

    /* JADX INFO: renamed from: D */
    public void m360D() {
        LinkedList linkedList = new LinkedList((List) this.f411o0);
        while (!linkedList.isEmpty()) {
            InterfaceFutureC13608b interfaceFutureC13608b = (InterfaceFutureC13608b) linkedList.poll();
            Objects.requireNonNull(interfaceFutureC13608b);
            interfaceFutureC13608b.cancel(true);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m362F(C11986n2 c11986n2) {
        if (this.f410Z) {
            AbstractC11988o0.m13512g("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((C9690q) this.f411o0).m10281a(new C7834a(c11986n2, EnumC7837d.f24731Y, null));
        } catch (Throwable unused) {
            AbstractC11988o0.m13512g("BillingLogger", "logging failed.");
        }
    }

    @Override // io.sentry.android.replay.util.InterfaceC15308a
    /* JADX INFO: renamed from: J */
    public int mo363J(int i10) {
        C3599o c3599o = ((C3578I) this.f411o0).f10893b;
        c3599o.m4317k(i10);
        ArrayList arrayList = c3599o.f10965h;
        Layout layout = ((C3601q) arrayList.get(AbstractC8640h.m9305d(i10, arrayList))).f10968a.f10918d.f13640f;
        C4198y c4198y = AbstractC4173A.f13587a;
        return layout.getEllipsisCount(i10) > 0 ? 1 : 0;
    }

    @Override // p594Y9.InterfaceC9776N4
    /* JADX INFO: renamed from: a */
    public C0420b mo364a() {
        C10252z0 c10252z0 = new C10252z0();
        c10252z0.f30456o0 = this.f410Z ? EnumC9960r3.TYPE_THICK : EnumC9960r3.TYPE_THIN;
        C9895g4 c9895g4 = new C9895g4();
        c9895g4.f29409Y = (EnumC9966s3) this.f411o0;
        c10252z0.f30458q0 = new C9901h4(c9895g4);
        return new C0420b(c10252z0, 0, (byte) 0);
    }

    @Override // p571X9.InterfaceC9161K4
    /* JADX INFO: renamed from: b */
    public C0420b mo365b() {
        C0017I0 c0017i0 = new C0017I0();
        c0017i0.f66o0 = this.f410Z ? EnumC9357r3.TYPE_THICK : EnumC9357r3.TYPE_THIN;
        C19506i c19506i = new C19506i((char) 0, 22);
        c19506i.f61960Z = (EnumC9363s3) this.f411o0;
        c0017i0.f68q0 = new C9148I3(c19506i);
        return new C0420b(c0017i0, 0);
    }

    /* JADX INFO: renamed from: c */
    public void m366c(int i10) {
        AbstractC20800b.m21320h(!this.f410Z);
        ((SparseBooleanArray) this.f411o0).append(i10, true);
    }

    /* JADX INFO: renamed from: d */
    public C19786m m367d() {
        AbstractC20800b.m21320h(!this.f410Z);
        this.f410Z = true;
        return new C19786m((SparseBooleanArray) this.f411o0);
    }

    /* JADX INFO: renamed from: e */
    public CameraCaptureSession.CaptureCallback m368e(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.f410Z) {
            return captureCallback;
        }
        C0084r c0084r = new C0084r(3);
        List list = (List) this.f411o0;
        C10145l c10145l = (C10145l) c0084r.f335b;
        list.add(c10145l);
        Log.d("RequestMonitor", "RequestListener " + c0084r + " monitoring " + this);
        c10145l.f30070Z.mo5766a(new RunnableC0066i(this, c0084r, c10145l, 7), AbstractC8577W2.m9240b());
        return new C0024M(Arrays.asList(c0084r, captureCallback));
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: f */
    public void mo369f(InterfaceC19456f writer, C17867t customScalarAdapters, Object obj) {
        AbstractC16544l.m18094g(writer, "writer");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        boolean z6 = this.f410Z;
        InterfaceC17848a interfaceC17848a = (InterfaceC17848a) this.f411o0;
        if (!z6 || (writer instanceof C19461k)) {
            writer.mo20554o();
            interfaceC17848a.mo369f(writer, customScalarAdapters, obj);
            writer.mo20551j();
            return;
        }
        C19461k c19461k = new C19461k();
        c19461k.mo20554o();
        interfaceC17848a.mo369f(c19461k, customScalarAdapters, obj);
        c19461k.mo20551j();
        Object objM20589e = c19461k.m20589e();
        AbstractC16544l.m18091d(objM20589e);
        AbstractC7849B0.m8108c(writer, objM20589e);
    }

    /* JADX INFO: renamed from: g */
    public boolean m370g() {
        return this.f410Z;
    }

    @Override // io.sentry.android.replay.util.InterfaceC15308a
    public int getLineCount() {
        return ((C3578I) this.f411o0).f10893b.f10963f;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceFutureC13608b m371h() {
        List list = (List) this.f411o0;
        if (list.isEmpty()) {
            return C5231m.f16977o0;
        }
        C5233o c5233o = new C5233o(new ArrayList(new ArrayList(list)), false, AbstractC8577W2.m9240b());
        C1865c c1865c = new C1865c(27);
        return AbstractC5229k.m5780d(AbstractC5229k.m5782f(c5233o, new C7296c(c1865c, 18), AbstractC8577W2.m9240b()));
    }

    /* JADX INFO: renamed from: i */
    public void mo372i() {
        this.f410Z = true;
    }

    @Override // p917o6.InterfaceC17848a
    /* JADX INFO: renamed from: j */
    public Object mo373j(InterfaceC19455e reader, C17867t customScalarAdapters) {
        AbstractC16544l.m18094g(reader, "reader");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        if (this.f410Z) {
            if (reader instanceof C19457g) {
                reader = (C19457g) reader;
            } else {
                EnumC19454d enumC19454dPeek = reader.peek();
                if (enumC19454dPeek != EnumC19454d.f61736o0) {
                    throw new IllegalStateException(("Failed to buffer json reader, expected `BEGIN_OBJECT` but found `" + enumC19454dPeek + "` json token").toString());
                }
                ArrayList arrayListMo20578n = reader.mo20578n();
                Object objM8091c = AbstractC7841A0.m8091c(reader);
                AbstractC16544l.m18092e(objM8091c, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                reader = new C19457g(arrayListMo20578n, (Map) objM8091c);
            }
        }
        reader.mo20579o();
        Object objMo373j = ((InterfaceC17848a) this.f411o0).mo373j(reader, customScalarAdapters);
        reader.mo20574j();
        return objMo373j;
    }

    @Override // io.sentry.android.replay.util.InterfaceC15308a
    /* JADX INFO: renamed from: k */
    public int mo374k(int i10) {
        return AbstractC2119a.m3195i(((C3578I) this.f411o0).f10893b.m4312d(i10));
    }

    @Override // io.sentry.android.replay.util.InterfaceC15308a
    /* JADX INFO: renamed from: l */
    public float mo375l(int i10, int i11) {
        C3578I c3578i = (C3578I) this.f411o0;
        float fM4255e = c3578i.m4255e(i11, true);
        return (this.f410Z || getLineCount() != 1) ? fM4255e : fM4255e - c3578i.m4258h(i10);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX INFO: renamed from: m */
    public boolean m376m(int i10, CharSequence charSequence) {
        if (charSequence == null || i10 < 0 || charSequence.length() - i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (((C21726e) this.f411o0) == null) {
            return m370g();
        }
        char c9 = 0;
        c9 = 2;
        for (int i11 = 0; i11 < i10 && c9 == 2; i11++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i11));
            C0095w0 c0095w0 = AbstractC21727f.f68922a;
            if (directionality == 0) {
                c9 = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c9 = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        c9 = 2;
                        continue;
                }
            }
        }
        if (c9 == 0) {
            return true;
        }
        if (c9 != 1) {
            return m370g();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void mo377n() {
        this.f410Z = false;
    }

    /* JADX INFO: renamed from: o */
    public void mo378o() {
        this.f410Z = false;
    }

    /* JADX INFO: renamed from: p */
    public void mo379p(byte b) {
        ((C16137F) this.f411o0).m17700u(String.valueOf(b));
    }

    /* JADX INFO: renamed from: q */
    public void m380q(char c9) {
        C16137F c16137f = (C16137F) this.f411o0;
        c16137f.m17690e(c16137f.f50063Z, 1);
        char[] cArr = (char[]) c16137f.f50064o0;
        int i10 = c16137f.f50063Z;
        c16137f.f50063Z = i10 + 1;
        cArr[i10] = c9;
    }

    @Override // io.sentry.android.replay.util.InterfaceC15308a
    /* JADX INFO: renamed from: r */
    public int mo381r(int i10) {
        return AbstractC2119a.m3195i(((C3578I) this.f411o0).f10893b.m4310b(i10));
    }

    /* JADX INFO: renamed from: s */
    public void mo382s(int i10) {
        ((C16137F) this.f411o0).m17700u(String.valueOf(i10));
    }

    /* JADX INFO: renamed from: t */
    public void mo383t(long j10) {
        ((C16137F) this.f411o0).m17700u(String.valueOf(j10));
    }

    public String toString() {
        switch (this.f409Y) {
            case 10:
                return this.f410Z ? "FALL_THROUGH" : String.valueOf(this.f411o0);
            case 11:
                return ((C13414e) this.f411o0).toString();
            default:
                return super.toString();
        }
    }

    @Override // androidx.lifecycle.InterfaceC11070F
    /* JADX INFO: renamed from: u */
    public void mo259u(Object obj) {
        this.f410Z = true;
        C13414e c13414e = (C13414e) this.f411o0;
        c13414e.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) c13414e.f42490Y;
        signInHubActivity.setResult(signInHubActivity.f36041O0, signInHubActivity.f36042P0);
        signInHubActivity.finish();
    }

    @Override // io.sentry.android.replay.util.InterfaceC15308a
    /* JADX INFO: renamed from: v */
    public int mo384v(int i10) {
        return ((C3578I) this.f411o0).m4260j(i10);
    }

    /* JADX INFO: renamed from: w */
    public void m385w(String v2) {
        AbstractC16544l.m18094g(v2, "v");
        ((C16137F) this.f411o0).m17700u(v2);
    }

    /* JADX INFO: renamed from: x */
    public void mo386x(short s10) {
        ((C16137F) this.f411o0).m17700u(String.valueOf(s10));
    }

    /* JADX INFO: renamed from: y */
    public void mo387y(String value) {
        byte b;
        AbstractC16544l.m18094g(value, "value");
        C16137F c16137f = (C16137F) this.f411o0;
        c16137f.m17690e(c16137f.f50063Z, value.length() + 2);
        char[] cArr = (char[]) c16137f.f50064o0;
        int i10 = c16137f.f50063Z;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c9 = cArr[i13];
            byte[] bArr = AbstractC11809J.f35797b;
            if (c9 < bArr.length && bArr[c9] != 0) {
                int length2 = value.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    c16137f.m17690e(i13, 2);
                    char cCharAt = value.charAt(i14);
                    byte[] bArr2 = AbstractC11809J.f35797b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i15 = i13 + 1;
                        ((char[]) c16137f.f50064o0)[i13] = cCharAt;
                        i13 = i15;
                    } else if (b == 1) {
                        String str = AbstractC11809J.f35796a[cCharAt];
                        AbstractC16544l.m18091d(str);
                        c16137f.m17690e(i13, str.length());
                        str.getChars(0, str.length(), (char[]) c16137f.f50064o0, i13);
                        int length3 = str.length() + i13;
                        c16137f.f50063Z = length3;
                        i13 = length3;
                    } else {
                        char[] cArr2 = (char[]) c16137f.f50064o0;
                        cArr2[i13] = '\\';
                        cArr2[i13 + 1] = (char) b;
                        i13 += 2;
                        c16137f.f50063Z = i13;
                    }
                }
                c16137f.m17690e(i13, 1);
                ((char[]) c16137f.f50064o0)[i13] = '\"';
                c16137f.f50063Z = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        c16137f.f50063Z = i12 + 1;
    }

    @Override // io.sentry.android.replay.util.InterfaceC15308a
    /* JADX INFO: renamed from: z */
    public Integer mo388z() {
        return null;
    }

    public /* synthetic */ C0095w0(boolean z6, Enum r6, int i10) {
        this.f409Y = i10;
        this.f410Z = z6;
        this.f411o0 = r6;
    }

    public C0095w0(C3578I layout, boolean z6) {
        this.f409Y = 6;
        AbstractC16544l.m18094g(layout, "layout");
        this.f411o0 = layout;
        this.f410Z = z6;
    }

    public C0095w0(C16137F c16137f) {
        this.f409Y = 3;
        this.f411o0 = c16137f;
        this.f410Z = true;
    }

    public C0095w0(int i10) {
        this.f409Y = i10;
        switch (i10) {
            case 12:
                this.f411o0 = new SparseBooleanArray();
                break;
            case 14:
                C21156a c21156a = C21156a.f67231a;
                this.f410Z = true;
                this.f411o0 = c21156a;
                break;
        }
    }

    public C0095w0(boolean z6) {
        this.f409Y = 2;
        this.f411o0 = DesugarCollections.synchronizedList(new ArrayList());
        this.f410Z = z6;
    }

    public C0095w0(C0088t c0088t, ExecutorC4836i executorC4836i) {
        this.f409Y = 0;
        this.f410Z = false;
        this.f411o0 = new C13287b(1);
    }

    public C0095w0(C21726e c21726e, boolean z6) {
        this.f409Y = 15;
        this.f409Y = 15;
        this.f411o0 = c21726e;
        this.f410Z = z6;
    }

    public C0095w0(C18650d c18650d, C13414e c13414e) {
        this.f409Y = 11;
        this.f410Z = false;
        this.f411o0 = c13414e;
    }

    /* JADX INFO: renamed from: C */
    public void mo359C() {
    }

    /* JADX INFO: renamed from: E */
    public void mo361E() {
    }

    public C0095w0(InterfaceC17848a wrappedAdapter, boolean z6) {
        this.f409Y = 9;
        AbstractC16544l.m18094g(wrappedAdapter, "wrappedAdapter");
        this.f411o0 = wrappedAdapter;
        this.f410Z = z6;
    }
}
