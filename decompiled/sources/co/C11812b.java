package co;

import bo.C11528p;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.org.webrtc.WebrtcBuildVersion;
import p001A.C0042V0;
import p283L5.AbstractC4941g;

/* JADX INFO: renamed from: co.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C11812b extends AbstractC4941g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35811a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11831u f35812b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f35813c;

    /* JADX INFO: renamed from: d */
    public final Object f35814d;

    public C11812b(C11831u c11831u, String str) {
        this.f35812b = c11831u;
        this.f35813c = str;
        this.f35814d = c11831u.f35848b.f34844b;
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: C */
    public void mo5562C(long j10) {
        String str;
        switch (this.f35811a) {
            case 1:
                if (j10 == 0) {
                    str = WebrtcBuildVersion.maint_version;
                } else if (j10 > 0) {
                    str = Long.toString(j10, 10);
                } else {
                    char[] cArr = new char[64];
                    long j11 = (j10 >>> 1) / ((long) 5);
                    long j12 = 10;
                    int i10 = 63;
                    cArr[63] = Character.forDigit((int) (j10 - (j11 * j12)), 10);
                    while (j11 > 0) {
                        i10--;
                        cArr[i10] = Character.forDigit((int) (j11 % j12), 10);
                        j11 /= j12;
                    }
                    str = new String(cArr, i10, 64 - i10);
                }
                m13092U(str);
                break;
            default:
                super.mo5562C(j10);
                break;
        }
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: G */
    public void mo5566G(String value) {
        switch (this.f35811a) {
            case 0:
                AbstractC16544l.m18094g(value, "value");
                this.f35812b.mo13128O(this.f35813c, new C11528p(value, false, (SerialDescriptor) this.f35814d));
                break;
            default:
                super.mo5566G(value);
                break;
        }
    }

    /* JADX INFO: renamed from: U */
    public void m13092U(String s10) {
        AbstractC16544l.m18094g(s10, "s");
        this.f35812b.mo13128O(this.f35813c, new C11528p(s10, false, null));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: a */
    public final C0042V0 mo13069a() {
        switch (this.f35811a) {
            case 0:
                return this.f35812b.f35848b.f34844b;
            default:
                return (C0042V0) this.f35814d;
        }
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: h */
    public void mo5574h(short s10) {
        switch (this.f35811a) {
            case 1:
                m13092U(String.valueOf(s10 & 65535));
                break;
            default:
                super.mo5574h(s10);
                break;
        }
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: j */
    public void mo5576j(byte b) {
        switch (this.f35811a) {
            case 1:
                m13092U(String.valueOf(b & 255));
                break;
            default:
                super.mo5576j(b);
                break;
        }
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: x */
    public void mo5589x(int i10) {
        switch (this.f35811a) {
            case 1:
                m13092U(Long.toString(((long) i10) & 4294967295L, 10));
                break;
            default:
                super.mo5589x(i10);
                break;
        }
    }

    public C11812b(C11831u c11831u, String str, SerialDescriptor serialDescriptor) {
        this.f35812b = c11831u;
        this.f35813c = str;
        this.f35814d = serialDescriptor;
    }
}
