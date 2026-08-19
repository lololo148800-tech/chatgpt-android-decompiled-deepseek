package p001A;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import livekit.org.webrtc.WebrtcBuildVersion;
import p028B.C0694a;
import p028B.C0710q;
import p084D4.C1920j;
import p165G9.AbstractC3021g;
import p178H.AbstractC3137c;
import p178H.C3129W;
import p178H.C3163p;
import p178H.C3165q;
import p228J.C3793B;
import p228J.C3826b;
import p228J.InterfaceC3866v;
import p523V9.AbstractC8072d6;
import p813ij.C15026j;

/* JADX INFO: renamed from: A.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0090u {

    /* JADX INFO: renamed from: a */
    public final Context f391a;

    /* JADX INFO: renamed from: b */
    public final C1920j f392b;

    /* JADX INFO: renamed from: c */
    public final C3826b f393c;

    /* JADX INFO: renamed from: d */
    public final C3793B f394d;

    /* JADX INFO: renamed from: e */
    public final C0710q f395e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f396f;

    /* JADX INFO: renamed from: g */
    public final C0089t0 f397g;

    /* JADX INFO: renamed from: h */
    public final long f398h;

    /* JADX INFO: renamed from: i */
    public final HashMap f399i = new HashMap();

    public C0090u(Context context, C3826b c3826b, C3163p c3163p, long j10) throws C3129W {
        String strM3979b;
        this.f391a = context;
        this.f393c = c3826b;
        C0710q c0710qM1480a = C0710q.m1480a(context, c3826b.f11586b);
        this.f395e = c0710qM1480a;
        this.f397g = C0089t0.m316b(context);
        try {
            ArrayList<String> arrayList = new ArrayList();
            C15026j c15026j = c0710qM1480a.f2058a;
            c15026j.getClass();
            try {
                List<String> listAsList = Arrays.asList(((CameraManager) c15026j.f46724Y).getCameraIdList());
                if (c3163p == null) {
                    Iterator it = listAsList.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) it.next());
                    }
                } else {
                    try {
                        strM3979b = AbstractC3137c.m3979b(c0710qM1480a, c3163p.m3994b(), listAsList);
                    } catch (IllegalStateException unused) {
                        strM3979b = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : listAsList) {
                        if (!str.equals(strM3979b)) {
                            arrayList2.add(m322b(str));
                        }
                    }
                    Iterator it2 = c3163p.m3993a(arrayList2).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((InterfaceC3866v) it2.next()).mo137b());
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : arrayList) {
                    if (str2.equals(WebrtcBuildVersion.maint_version) || str2.equals("1")) {
                        arrayList3.add(str2);
                    } else if (AbstractC3021g.m3874b(this.f395e, str2)) {
                        arrayList3.add(str2);
                    } else {
                        AbstractC8072d6.m8486c("Camera2CameraFactory", "Camera " + str2 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                    }
                }
                this.f396f = arrayList3;
                C1920j c1920j = new C1920j(this.f395e);
                this.f392b = c1920j;
                C3793B c3793b = new C3793B(c1920j);
                this.f394d = c3793b;
                ((ArrayList) c1920j.f5616Z).add(c3793b);
                this.f398h = j10;
            } catch (CameraAccessException e10) {
                throw new C0694a(e10);
            }
        } catch (C0694a e11) {
            throw new C3129W(new C3165q(e11));
        } catch (C3165q e12) {
            throw new C3129W(e12);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0018J m321a(String str) throws C3165q {
        if (!this.f396f.contains(str)) {
            throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
        }
        C0022L c0022lM322b = m322b(str);
        C3826b c3826b = this.f393c;
        Executor executor = c3826b.f11585a;
        return new C0018J(this.f391a, this.f395e, str, c0022lM322b, this.f392b, this.f394d, executor, c3826b.f11586b, this.f397g, this.f398h);
    }

    /* JADX INFO: renamed from: b */
    public final C0022L m322b(String str) throws C3165q {
        HashMap map = this.f399i;
        try {
            C0022L c0022l = (C0022L) map.get(str);
            if (c0022l != null) {
                return c0022l;
            }
            C0022L c0022l2 = new C0022L(this.f395e, str);
            map.put(str, c0022l2);
            return c0022l2;
        } catch (C0694a e10) {
            throw new C3165q(e10);
        }
    }
}
