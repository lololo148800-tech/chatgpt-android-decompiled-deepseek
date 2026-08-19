package p387Pl;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16549q;
import livekit.LivekitModels$TrackInfo;
import p003A1.AbstractC0168G;
import p225Im.InterfaceC3776x;
import p344Nl.AbstractC5821C;
import p533Vl.C8398j;
import p594Y9.AbstractC9873d3;
import p658b5.C11248s;
import p793ho.EnumC14686X2;
import p793ho.EnumC14692Y2;

/* JADX INFO: renamed from: Pl.Q */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6470Q {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ InterfaceC3776x[] f20989j;

    /* JADX INFO: renamed from: a */
    public final C8398j f20990a;

    /* JADX INFO: renamed from: b */
    public String f20991b;

    /* JADX INFO: renamed from: c */
    public String f20992c;

    /* JADX INFO: renamed from: d */
    public EnumC6462I f20993d;

    /* JADX INFO: renamed from: e */
    public final C11248s f20994e;

    /* JADX INFO: renamed from: f */
    public final C8398j f20995f;

    /* JADX INFO: renamed from: g */
    public EnumC6464K f20996g;

    /* JADX INFO: renamed from: h */
    public LivekitModels$TrackInfo f20997h;

    /* JADX INFO: renamed from: i */
    public final WeakReference f20998i;

    static {
        C16549q c16549q = new C16549q(AbstractC6470Q.class, "track", "getTrack()Lio/livekit/android/room/track/Track;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f20989j = new InterfaceC3776x[]{c16527d.mo5697f(c16549q), AbstractC0168G.m528q(AbstractC6470Q.class, "muted", "getMuted()Z", 0, c16527d)};
    }

    public AbstractC6470Q(LivekitModels$TrackInfo info, AbstractC6468O abstractC6468O, AbstractC5821C abstractC5821C) {
        AbstractC16544l.m18094g(info, "info");
        this.f20990a = AbstractC9873d3.m10527a(abstractC6468O, null);
        this.f20994e = new C11248s(6);
        this.f20995f = AbstractC9873d3.m10527a(Boolean.FALSE, null);
        this.f20996g = EnumC6464K.f20972p0;
        String sid = info.getSid();
        AbstractC16544l.m18093f(sid, "getSid(...)");
        this.f20992c = sid;
        String name = info.getName();
        AbstractC16544l.m18093f(name, "getName(...)");
        this.f20991b = name;
        C6461H c6461h = EnumC6462I.Companion;
        EnumC14692Y2 type = info.getType();
        AbstractC16544l.m18093f(type, "getType(...)");
        c6461h.getClass();
        int iOrdinal = type.ordinal();
        this.f20993d = iOrdinal != 0 ? iOrdinal != 1 ? EnumC6462I.UNRECOGNIZED : EnumC6462I.VIDEO : EnumC6462I.AUDIO;
        this.f20998i = new WeakReference(abstractC5821C);
        m7056e(info);
    }

    /* JADX INFO: renamed from: a */
    public boolean m7054a() {
        return ((Boolean) this.f20995f.m8943c(f20989j[1])).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public boolean mo7035b() {
        return m7055c() != null;
    }

    /* JADX INFO: renamed from: c */
    public AbstractC6468O m7055c() {
        return (AbstractC6468O) this.f20990a.m8943c(f20989j[0]);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo7036d(boolean z6);

    /* JADX INFO: renamed from: e */
    public final void m7056e(LivekitModels$TrackInfo info) {
        EnumC6462I enumC6462I;
        EnumC6464K enumC6464K;
        AbstractC16544l.m18094g(info, "info");
        String sid = info.getSid();
        AbstractC16544l.m18093f(sid, "getSid(...)");
        this.f20992c = sid;
        String name = info.getName();
        AbstractC16544l.m18093f(name, "getName(...)");
        this.f20991b = name;
        C6461H c6461h = EnumC6462I.Companion;
        EnumC14692Y2 type = info.getType();
        AbstractC16544l.m18093f(type, "getType(...)");
        c6461h.getClass();
        int iOrdinal = type.ordinal();
        if (iOrdinal != 0) {
            enumC6462I = iOrdinal != 1 ? EnumC6462I.UNRECOGNIZED : EnumC6462I.VIDEO;
        } else {
            enumC6462I = EnumC6462I.AUDIO;
        }
        this.f20993d = enumC6462I;
        mo7036d(info.getMuted());
        C6463J c6463j = EnumC6464K.Companion;
        EnumC14686X2 source = info.getSource();
        AbstractC16544l.m18093f(source, "getSource(...)");
        c6463j.getClass();
        int iOrdinal2 = source.ordinal();
        if (iOrdinal2 == 1) {
            enumC6464K = EnumC6464K.f20969Y;
        } else if (iOrdinal2 != 2) {
            enumC6464K = iOrdinal2 != 3 ? EnumC6464K.f20972p0 : EnumC6464K.f20971o0;
        } else {
            enumC6464K = EnumC6464K.f20970Z;
        }
        this.f20996g = enumC6464K;
        if (this.f20993d == EnumC6462I.VIDEO) {
            info.getSimulcast();
            info.getWidth();
            info.getHeight();
        }
        info.getMimeType();
        this.f20997h = info;
    }
}
