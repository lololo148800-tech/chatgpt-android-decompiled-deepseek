package p206I3;

import p1016t3.C19788o;
import p571X9.AbstractC9306j0;
import p594Y9.AbstractC9997x4;
import p612Z3.C10153b;
import p673c4.C11645a;
import p696d4.C13010h;
import p740f4.C13534c;

/* JADX INFO: renamed from: I3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3612a {

    /* JADX INFO: renamed from: a */
    public static final C3612a f11020a = new C3612a();

    /* JADX INFO: renamed from: a */
    public final AbstractC9997x4 m4322a(C19788o c19788o) {
        String str = c19788o.f62752m;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new C10153b(0);
                case "application/x-icy":
                    return new C11645a();
                case "application/id3":
                    return new C13010h(null);
                case "application/x-emsg":
                    return new C10153b(1);
                case "application/x-scte35":
                    return new C13534c();
            }
        }
        throw new IllegalArgumentException(AbstractC9306j0.m9889h("Attempted to create decoder for unsupported MIME type: ", str));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4323b(C19788o c19788o) {
        String str = c19788o.f62752m;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
