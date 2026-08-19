package p135F5;

import java.io.IOException;
import java.util.ArrayList;
import p026Ao.C0654C;
import p110E4.C2307e;

/* JADX INFO: renamed from: F5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2665a {

    /* JADX INFO: renamed from: a */
    public final String f8176a;

    /* JADX INFO: renamed from: b */
    public final long[] f8177b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f8178c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f8179d;

    /* JADX INFO: renamed from: e */
    public boolean f8180e;

    /* JADX INFO: renamed from: f */
    public boolean f8181f;

    /* JADX INFO: renamed from: g */
    public C2307e f8182g;

    /* JADX INFO: renamed from: h */
    public int f8183h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2669e f8184i;

    public C2665a(C2669e c2669e, String str) {
        this.f8184i = c2669e;
        this.f8176a = str;
        c2669e.getClass();
        this.f8177b = new long[2];
        c2669e.getClass();
        this.f8178c = new ArrayList(2);
        c2669e.getClass();
        this.f8179d = new ArrayList(2);
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        c2669e.getClass();
        for (int i10 = 0; i10 < 2; i10++) {
            sb2.append(i10);
            this.f8178c.add(this.f8184i.f8193Y.m1321e(sb2.toString()));
            sb2.append(".tmp");
            this.f8179d.add(this.f8184i.f8193Y.m1321e(sb2.toString()));
            sb2.setLength(length);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C2666b m3640a() {
        if (!this.f8180e || this.f8182g != null || this.f8181f) {
            return null;
        }
        ArrayList arrayList = this.f8178c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            C2669e c2669e = this.f8184i;
            if (i10 >= size) {
                this.f8183h++;
                return new C2666b(c2669e, this);
            }
            if (!c2669e.f8192C0.m1463d((C0654C) arrayList.get(i10))) {
                try {
                    c2669e.m3647W(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i10++;
        }
    }
}
