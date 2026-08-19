package p501Ub;

import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p011A9.C0410a;
import p011A9.C0417h;
import p013Ab.C0420b;
import p1009s9.C19501d;
import p1009s9.C19503f;
import p1022t9.C19820e;
import p1022t9.InterfaceC19817b;
import p1060v9.AbstractC20502t;
import p1147z9.C21817c;
import p166Ga.C3029c;
import p377P9.AbstractC6376b;
import p379Pb.LVf.efyhmdM;
import p477Tb.C7296c;
import p499U9.AbstractC7574d;
import p499U9.C7572b;
import p499U9.C7575e;
import p499U9.C7577g;
import p499U9.C7582l;
import p523V9.AbstractC7854B5;
import p594Y9.AbstractC9800S;
import p746fa.C13606o;

/* JADX INFO: renamed from: Ub.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7606h {

    /* JADX INFO: renamed from: a */
    public static final C19501d[] f24045a = new C19501d[0];

    /* JADX INFO: renamed from: b */
    public static final C19501d f24046b;

    /* JADX INFO: renamed from: c */
    public static final C19501d f24047c;

    /* JADX INFO: renamed from: d */
    public static final C19501d f24048d;

    /* JADX INFO: renamed from: e */
    public static final C7582l f24049e;

    /* JADX INFO: renamed from: f */
    public static final C7582l f24050f;

    static {
        C19501d c19501d = new C19501d(1L, "vision.barcode");
        f24046b = c19501d;
        C19501d c19501d2 = new C19501d(1L, "vision.custom.ica");
        C19501d c19501d3 = new C19501d(1L, "vision.face");
        f24047c = c19501d3;
        C19501d c19501d4 = new C19501d(1L, "vision.ica");
        C19501d c19501d5 = new C19501d(1L, "vision.ocr");
        f24048d = c19501d5;
        C19501d c19501d6 = new C19501d(1L, "mlkit.langid");
        C19501d c19501d7 = new C19501d(1L, "mlkit.nlclassifier");
        C19501d c19501d8 = new C19501d(1L, "tflite_dynamite");
        C19501d c19501d9 = new C19501d(1L, "mlkit.barcode.ui");
        C19501d c19501d10 = new C19501d(1L, efyhmdM.LfKMvXCeL);
        C0420b c0420b = new C0420b(5, (byte) 0);
        c0420b.m1044G("barcode", c19501d);
        c0420b.m1044G("custom_ica", c19501d2);
        c0420b.m1044G("face", c19501d3);
        c0420b.m1044G("ica", c19501d4);
        c0420b.m1044G("ocr", c19501d5);
        c0420b.m1044G("langid", c19501d6);
        c0420b.m1044G("nlclassifier", c19501d7);
        c0420b.m1044G("tflite_dynamite", c19501d8);
        c0420b.m1044G("barcode_ui", c19501d9);
        c0420b.m1044G("smart_reply", c19501d10);
        C7575e c7575e = (C7575e) c0420b.f1383p0;
        if (c7575e != null) {
            throw c7575e.m7924a();
        }
        C7582l c7582lM7925a = C7582l.m7925a(c0420b.f1381Z, (Object[]) c0420b.f1382o0, c0420b);
        C7575e c7575e2 = (C7575e) c0420b.f1383p0;
        if (c7575e2 != null) {
            throw c7575e2.m7924a();
        }
        f24049e = c7582lM7925a;
        C0420b c0420b2 = new C0420b(5, (byte) 0);
        c0420b2.m1044G("com.google.android.gms.vision.barcode", c19501d);
        c0420b2.m1044G("com.google.android.gms.vision.custom.ica", c19501d2);
        c0420b2.m1044G("com.google.android.gms.vision.face", c19501d3);
        c0420b2.m1044G("com.google.android.gms.vision.ica", c19501d4);
        c0420b2.m1044G("com.google.android.gms.vision.ocr", c19501d5);
        c0420b2.m1044G("com.google.android.gms.mlkit.langid", c19501d6);
        c0420b2.m1044G("com.google.android.gms.mlkit.nlclassifier", c19501d7);
        c0420b2.m1044G("com.google.android.gms.tflite_dynamite", c19501d8);
        c0420b2.m1044G("com.google.android.gms.mlkit_smartreply", c19501d10);
        C7575e c7575e3 = (C7575e) c0420b2.f1383p0;
        if (c7575e3 != null) {
            throw c7575e3.m7924a();
        }
        C7582l c7582lM7925a2 = C7582l.m7925a(c0420b2.f1381Z, (Object[]) c0420b2.f1382o0, c0420b2);
        C7575e c7575e4 = (C7575e) c0420b2.f1383p0;
        if (c7575e4 != null) {
            throw c7575e4.m7924a();
        }
        f24050f = c7582lM7925a2;
    }

    /* JADX INFO: renamed from: a */
    public static void m7953a(Context context, String str) {
        C7572b c7572b = AbstractC7574d.f23981Z;
        Object[] objArr = {str};
        AbstractC9800S.m10424b(1, objArr);
        m7954b(context, new C7577g(1, objArr));
    }

    /* JADX INFO: renamed from: b */
    public static void m7954b(Context context, List list) {
        C13606o c13606oM20770b;
        C19503f.f61952b.getClass();
        if (C19503f.m20600a(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(Separators.COMMA, list));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        C19501d[] c19501dArrM7955c = m7955c(f24049e, list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C7615q(c19501dArrM7955c, 1));
        AbstractC20502t.m21150a("APIs must not be empty.", !arrayList.isEmpty());
        C0417h c0417h = new C0417h(context, null, C0417h.f1374k, InterfaceC19817b.f62869l0, C19820e.f62871c);
        C0410a c0410aM1022b = C0410a.m1022b(arrayList, true);
        if (c0410aM1022b.f1366Y.isEmpty()) {
            c13606oM20770b = AbstractC7854B5.m8117e(new C21817c(0, false));
        } else {
            C3029c c3029cM3900d = C3029c.m3900d();
            c3029cM3900d.f9120e = new C19501d[]{AbstractC6376b.f20771c};
            c3029cM3900d.f9118c = true;
            c3029cM3900d.f9117b = 27304;
            c3029cM3900d.f9119d = new C7296c(c0417h, c0410aM1022b);
            c13606oM20770b = c0417h.m20770b(0, c3029cM3900d.m3904c());
        }
        c13606oM20770b.m15124c(C7600b.f24032o0);
    }

    /* JADX INFO: renamed from: c */
    public static C19501d[] m7955c(C7582l c7582l, List list) {
        C19501d[] c19501dArr = new C19501d[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            C19501d c19501d = (C19501d) c7582l.get(list.get(i10));
            AbstractC20502t.m21157h(c19501d);
            c19501dArr[i10] = c19501d;
        }
        return c19501dArr;
    }
}
