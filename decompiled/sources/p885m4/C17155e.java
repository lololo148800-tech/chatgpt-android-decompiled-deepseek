package p885m4;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1004s4.C19445e;
import p1007s7.C19462a;
import p1007s7.C19463b;
import p1007s7.InterfaceC19469h;
import p1016t3.C19788o;
import p1017t4.C19800a;
import p1035u7.C20144b;
import p1056v5.InterfaceC20460e;
import p1100x7.InterfaceC21155a;
import p117Eb.C2391u;
import p569X7.EnumC9072a;
import p571X9.AbstractC9306j0;
import p594Y9.C9895g4;
import p633a.AbstractC10441a;
import p676c7.C11682a;
import p758g0.C13775m0;
import p813ij.C15026j;
import p817j$.util.Objects;
import p915o4.C17822h;
import p957q4.C18622a;
import p981r4.C18872a;

/* JADX INFO: renamed from: m4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C17155e implements InterfaceC17161k, InterfaceC19469h, InterfaceC20460e, InterfaceC21155a {
    @Override // p1056v5.InterfaceC20460e
    /* JADX INFO: renamed from: a */
    public boolean mo15192a() {
        return true;
    }

    @Override // p885m4.InterfaceC17161k
    /* JADX INFO: renamed from: b */
    public InterfaceC17163m mo17936b(C19788o c19788o) {
        String str = c19788o.f62752m;
        if (str != null) {
            List list = c19788o.f62755p;
            switch (str) {
                case "application/dvbsubs":
                    return new C17822h(list);
                case "application/pgs":
                    return new C2391u(20);
                case "application/x-mp4-vtt":
                    return new C9895g4(19);
                case "text/vtt":
                    return new C15026j(19);
                case "application/x-quicktime-tx3g":
                    return new C19800a(list);
                case "text/x-ssa":
                    return new C18622a(list);
                case "application/x-subrip":
                    return new C18872a();
                case "application/ttml+xml":
                    return new C19445e();
            }
        }
        throw new IllegalArgumentException(AbstractC9306j0.m9889h("Unsupported MIME type: ", str));
    }

    @Override // p885m4.InterfaceC17161k
    /* JADX INFO: renamed from: d */
    public boolean mo17937d(C19788o c19788o) {
        String str = c19788o.f62752m;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // p1007s7.InterfaceC19469h
    /* JADX INFO: renamed from: f */
    public void mo18917f(C11682a datadogContext, boolean z6, C13775m0 c13775m0) {
        AbstractC16544l.m18094g(datadogContext, "datadogContext");
    }

    @Override // p1007s7.InterfaceC19469h
    /* JADX INFO: renamed from: g */
    public C19462a mo18918g() {
        return null;
    }

    @Override // p1100x7.InterfaceC21155a
    /* JADX INFO: renamed from: h */
    public EnumC9072a mo13164h() {
        return EnumC9072a.f27783Y;
    }

    @Override // p885m4.InterfaceC17161k
    /* JADX INFO: renamed from: l */
    public int mo17941l(C19788o c19788o) {
        String str = c19788o.f62752m;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(AbstractC9306j0.m9889h("Unsupported MIME type: ", str));
    }

    @Override // p1100x7.InterfaceC21155a
    /* JADX INFO: renamed from: c */
    public void mo13163c() {
    }

    @Override // p1100x7.InterfaceC21155a
    /* JADX INFO: renamed from: i */
    public void mo13165i() {
    }

    @Override // p1056v5.InterfaceC20460e
    public void shutdown() {
    }

    @Override // p1100x7.InterfaceC21155a
    /* JADX INFO: renamed from: j */
    public void mo13166j(C20144b c20144b) {
    }

    @Override // p1100x7.InterfaceC21155a
    /* JADX INFO: renamed from: k */
    public void mo13167k(C20144b c20144b) {
    }

    @Override // p1007s7.InterfaceC19469h
    /* JADX INFO: renamed from: e */
    public void mo18916e(C19463b c19463b, AbstractC10441a abstractC10441a, boolean z6) {
    }
}
