package p387Pl;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16549q;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.RTCStatsReport;
import p003A1.C0201R0;
import p003A1.C0227a;
import p025An.C0624m;
import p225Im.InterfaceC3776x;
import p297Ll.C5125f;
import p523V9.AbstractC8154o0;
import p533Vl.C8398j;
import p583Xl.AbstractC9537d;
import p594Y9.AbstractC9873d3;
import p658b5.C11248s;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Pl.O */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6468O {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC3776x[] f20981h = {AbstractC16526C.f51263a.mo5697f(new C16549q(AbstractC6468O.class, "streamState", "getStreamState()Lio/livekit/android/room/track/Track$StreamState;", 0))};

    /* JADX INFO: renamed from: a */
    public final C11248s f20982a;

    /* JADX INFO: renamed from: b */
    public final C11248s f20983b;

    /* JADX INFO: renamed from: c */
    public String f20984c;

    /* JADX INFO: renamed from: d */
    public final EnumC6462I f20985d;

    /* JADX INFO: renamed from: e */
    public String f20986e;

    /* JADX INFO: renamed from: f */
    public final C8398j f20987f;

    /* JADX INFO: renamed from: g */
    public AbstractC16546n f20988g;

    public AbstractC6468O(String str, EnumC6462I enumC6462I, MediaStreamTrack mediaStreamTrack) {
        C11248s c11248s = new C11248s(6);
        this.f20982a = c11248s;
        this.f20983b = c11248s;
        this.f20984c = str;
        this.f20985d = enumC6462I;
        this.f20987f = AbstractC9873d3.m10527a(EnumC6466M.f20975Z, new C0227a(this, 20));
    }

    /* JADX INFO: renamed from: a */
    public void mo7038a() {
        if (m7052d()) {
            return;
        }
        AbstractC9537d.m10030a(new C6467N(this, this, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX INFO: renamed from: b */
    public final Object m7050b(AbstractC19687c abstractC19687c) {
        ?? r6 = this.f20988g;
        if (r6 == 0) {
            return null;
        }
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(abstractC19687c));
        c0624m.m1262r();
        r6.invoke(new C5125f(c0624m, 2));
        Object objM1261q = c0624m.m1261q();
        return objM1261q == EnumC19250a.f61036Y ? objM1261q : (RTCStatsReport) objM1261q;
    }

    /* JADX INFO: renamed from: c */
    public abstract MediaStreamTrack mo7051c();

    /* JADX INFO: renamed from: d */
    public final boolean m7052d() {
        return mo7051c().isDisposed();
    }

    /* JADX INFO: renamed from: e */
    public final void m7053e(boolean z6) {
        if (m7052d()) {
            return;
        }
        AbstractC9537d.m10030a(new C0201R0(this, this, z6, 1));
    }

    /* JADX INFO: renamed from: f */
    public void mo7039f() {
        m7053e(false);
    }
}
