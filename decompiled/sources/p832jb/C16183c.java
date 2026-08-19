package p832jb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import p065Cb.C1623a;
import p1037ub.InterfaceC20181a;
import p1061vb.C20516g;
import p1104xb.InterfaceC21170a;
import p658b5.C11238i;
import p817j$.util.DesugarCollections;
import p890mb.C17204a;
import p890mb.C17209f;
import p890mb.C17212i;
import p890mb.C17220q;
import p890mb.InterfaceC17207d;
import p913o2.AbstractC17800a;

/* JADX INFO: renamed from: jb.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16183c implements InterfaceC21170a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50226a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f50227b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f50228c;

    public /* synthetic */ C16183c(Context context, String str) {
        this.f50226a = 2;
        this.f50228c = context;
        this.f50227b = str;
    }

    @Override // p1104xb.InterfaceC21170a
    public final Object get() {
        boolean z6;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f50226a) {
            case 0:
                C16187g c16187g = (C16187g) this.f50227b;
                String strM17795c = c16187g.m17795c();
                Context contextM19549a = (Context) this.f50228c;
                C1623a c1623a = new C1623a();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    contextM19549a = i10 >= 24 ? AbstractC17800a.m19549a(contextM19549a) : null;
                }
                SharedPreferences sharedPreferences = contextM19549a.getSharedPreferences("com.google.firebase.common.prefs:" + strM17795c, 0);
                boolean z10 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z6 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextM19549a.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextM19549a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    z6 = z10;
                }
                c1623a.f4606a = z6;
                return c1623a;
            case 1:
                C17209f c17209f = (C17209f) this.f50227b;
                c17209f.getClass();
                C17204a c17204a = (C17204a) this.f50228c;
                InterfaceC17207d interfaceC17207d = c17204a.f54925f;
                C11238i c11238i = new C11238i();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                for (C17212i c17212i : c17204a.f54922c) {
                    int i11 = c17212i.f54945c;
                    boolean z11 = i11 == 0;
                    int i12 = c17212i.f54944b;
                    C17220q c17220q = c17212i.f54943a;
                    if (z11) {
                        if (i12 == 2) {
                            hashSet4.add(c17220q);
                        } else {
                            hashSet.add(c17220q);
                        }
                    } else if (i11 == 2) {
                        hashSet3.add(c17220q);
                    } else if (i12 == 2) {
                        hashSet5.add(c17220q);
                    } else {
                        hashSet2.add(c17220q);
                    }
                }
                if (!c17204a.f54926g.isEmpty()) {
                    hashSet.add(C17220q.m18953a(InterfaceC20181a.class));
                }
                c11238i.f34008Y = DesugarCollections.unmodifiableSet(hashSet);
                c11238i.f34009Z = DesugarCollections.unmodifiableSet(hashSet2);
                DesugarCollections.unmodifiableSet(hashSet3);
                c11238i.f34010o0 = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                c11238i.f34011p0 = c17209f;
                return interfaceC17207d.mo391g(c11238i);
            default:
                return new C20516g((Context) this.f50228c, (String) this.f50227b);
        }
    }

    public /* synthetic */ C16183c(Object obj, int i10, Object obj2) {
        this.f50226a = i10;
        this.f50227b = obj;
        this.f50228c = obj2;
    }
}
