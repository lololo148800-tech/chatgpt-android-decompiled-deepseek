package p110E4;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC16544l;
import p134F4.AbstractC2664a;
import p470T4.C7248m;

/* JADX INFO: renamed from: E4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2311i {

    /* JADX INFO: renamed from: a */
    public final Context f7176a;

    /* JADX INFO: renamed from: b */
    public final String f7177b;

    /* JADX INFO: renamed from: f */
    public Executor f7181f;

    /* JADX INFO: renamed from: g */
    public Executor f7182g;

    /* JADX INFO: renamed from: h */
    public C7248m f7183h;

    /* JADX INFO: renamed from: i */
    public boolean f7184i;

    /* JADX INFO: renamed from: l */
    public boolean f7187l;

    /* JADX INFO: renamed from: p */
    public HashSet f7191p;

    /* JADX INFO: renamed from: c */
    public final ArrayList f7178c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f7179d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final ArrayList f7180e = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final int f7185j = 1;

    /* JADX INFO: renamed from: k */
    public boolean f7186k = true;

    /* JADX INFO: renamed from: m */
    public final long f7188m = -1;

    /* JADX INFO: renamed from: n */
    public final C2312j f7189n = new C2312j();

    /* JADX INFO: renamed from: o */
    public final LinkedHashSet f7190o = new LinkedHashSet();

    public C2311i(Context context, String str) {
        this.f7176a = context;
        this.f7177b = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m3415a(AbstractC2664a... abstractC2664aArr) {
        if (this.f7191p == null) {
            this.f7191p = new HashSet();
        }
        for (AbstractC2664a abstractC2664a : abstractC2664aArr) {
            HashSet hashSet = this.f7191p;
            AbstractC16544l.m18091d(hashSet);
            hashSet.add(Integer.valueOf(abstractC2664a.f8174a));
            HashSet hashSet2 = this.f7191p;
            AbstractC16544l.m18091d(hashSet2);
            hashSet2.add(Integer.valueOf(abstractC2664a.f8175b));
        }
        this.f7189n.m3416a((AbstractC2664a[]) Arrays.copyOf(abstractC2664aArr, abstractC2664aArr.length));
    }
}
