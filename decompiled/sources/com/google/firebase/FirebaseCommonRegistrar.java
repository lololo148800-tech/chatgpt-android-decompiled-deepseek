package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import lb.InterfaceC16837a;
import mm.C17305h;
import p1061vb.C20512c;
import p1061vb.C20513d;
import p1061vb.InterfaceC20514e;
import p1061vb.InterfaceC20515f;
import p117Eb.C2385o;
import p117Eb.C2386p;
import p167Gb.C3030a;
import p167Gb.C3031b;
import p331N6.C5676a;
import p523V9.AbstractC7950N5;
import p561X.C8990d;
import p832jb.C16187g;
import p890mb.C17204a;
import p890mb.C17212i;
import p890mb.C17220q;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: renamed from: a */
    public static String m13699a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        C5676a c5676aM18942a = C17204a.m18942a(C3031b.class);
        c5676aM18942a.m6108d(new C17212i(2, 0, C3030a.class));
        c5676aM18942a.f18435f = new C2385o(4);
        arrayList.add(c5676aM18942a.m6109e());
        C17220q c17220q = new C17220q(InterfaceC16837a.class, Executor.class);
        C5676a c5676a = new C5676a(C20512c.class, new Class[]{InterfaceC20514e.class, InterfaceC20515f.class});
        c5676a.m6108d(C17212i.m18950a(Context.class));
        c5676a.m6108d(C17212i.m18950a(C16187g.class));
        c5676a.m6108d(new C17212i(2, 0, C20513d.class));
        c5676a.m6108d(new C17212i(1, 1, C3031b.class));
        c5676a.m6108d(new C17212i(c17220q, 1, 0));
        c5676a.f18435f = new C2386p(c17220q, 1);
        arrayList.add(c5676a.m6109e());
        arrayList.add(AbstractC7950N5.m8239a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC7950N5.m8239a("fire-core", "21.0.0"));
        arrayList.add(AbstractC7950N5.m8239a("device-name", m13699a(Build.PRODUCT)));
        arrayList.add(AbstractC7950N5.m8239a("device-model", m13699a(Build.DEVICE)));
        arrayList.add(AbstractC7950N5.m8239a("device-brand", m13699a(Build.BRAND)));
        arrayList.add(AbstractC7950N5.m8240b("android-target-sdk", new C8990d(25)));
        arrayList.add(AbstractC7950N5.m8240b("android-min-sdk", new C8990d(26)));
        arrayList.add(AbstractC7950N5.m8240b("android-platform", new C8990d(27)));
        arrayList.add(AbstractC7950N5.m8240b("android-installer", new C8990d(28)));
        try {
            string = C17305h.f55128q0.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(AbstractC7950N5.m8239a("kotlin", string));
        }
        return arrayList;
    }
}
