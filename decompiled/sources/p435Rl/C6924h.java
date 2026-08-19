package p435Rl;

import android.content.Context;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.CameraEnumerator;
import p033B5.C0842z;
import p049Bm.InterfaceC1436k;
import p292Lg.C5034f;
import p387Pl.EnumC6481b;
import p404Qe.C6665a;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Rl.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C6924h {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f22195a;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6921e());
        arrayList.add(new C6922f());
        f22195a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static String m7309a(CameraEnumerator cameraEnumerator, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(cameraEnumerator, "<this>");
        String[] deviceNames = cameraEnumerator.getDeviceNames();
        AbstractC16544l.m18093f(deviceNames, "getDeviceNames(...)");
        for (String str : deviceNames) {
            AbstractC16544l.m18091d(str);
            if (((Boolean) interfaceC1436k.invoke(str)).booleanValue()) {
                return str;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m7310b(CameraEnumerator cameraEnumerator, String str, EnumC6481b enumC6481b, boolean z6) {
        AbstractC16544l.m18094g(cameraEnumerator, "<this>");
        String strM7309a = str != null ? m7309a(cameraEnumerator, new C6665a(str, 2)) : null;
        if (strM7309a == null && enumC6481b != null) {
            strM7309a = m7309a(cameraEnumerator, new C5034f(cameraEnumerator, 24, enumC6481b));
        }
        if (strM7309a == null && z6) {
            strM7309a = m7309a(cameraEnumerator, C6923g.f22194Y);
        }
        if (strM7309a == null) {
            return null;
        }
        return strM7309a;
    }

    /* JADX INFO: renamed from: c */
    public static EnumC6481b m7311c(CameraEnumerator cameraEnumerator, String str) {
        AbstractC16544l.m18094g(cameraEnumerator, "<this>");
        if (str == null) {
            return null;
        }
        if (cameraEnumerator.isBackFacing(str)) {
            return EnumC6481b.f21035Z;
        }
        if (cameraEnumerator.isFrontFacing(str)) {
            return EnumC6481b.f21034Y;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC6919c m7312d(Context context) {
        for (InterfaceC6919c interfaceC6919c : AbstractC17680n.m19370t0(f22195a, new C0842z(8))) {
            if (interfaceC6919c.isSupported(context)) {
                return interfaceC6919c;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
