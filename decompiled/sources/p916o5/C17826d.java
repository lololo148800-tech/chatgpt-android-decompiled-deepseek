package p916o5;

import java.io.IOException;
import java.util.ArrayList;
import p026Ao.C0654C;
import p110E4.C2307e;

/* JADX INFO: renamed from: o5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C17826d {

    /* JADX INFO: renamed from: a */
    public final String f56864a;

    /* JADX INFO: renamed from: b */
    public final long[] f56865b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f56866c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f56867d;

    /* JADX INFO: renamed from: e */
    public boolean f56868e;

    /* JADX INFO: renamed from: f */
    public boolean f56869f;

    /* JADX INFO: renamed from: g */
    public C2307e f56870g;

    /* JADX INFO: renamed from: h */
    public int f56871h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C17830h f56872i;

    public C17826d(C17830h c17830h, String str) {
        this.f56872i = c17830h;
        this.f56864a = str;
        c17830h.getClass();
        this.f56865b = new long[2];
        c17830h.getClass();
        this.f56866c = new ArrayList(2);
        c17830h.getClass();
        this.f56867d = new ArrayList(2);
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        c17830h.getClass();
        for (int i10 = 0; i10 < 2; i10++) {
            sb2.append(i10);
            this.f56866c.add(this.f56872i.f56880Y.m1321e(sb2.toString()));
            sb2.append(".tmp");
            this.f56867d.add(this.f56872i.f56880Y.m1321e(sb2.toString()));
            sb2.setLength(length);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C17827e m19575a() {
        if (!this.f56868e || this.f56870g != null || this.f56869f) {
            return null;
        }
        ArrayList arrayList = this.f56866c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            C17830h c17830h = this.f56872i;
            if (i10 >= size) {
                this.f56871h++;
                return new C17827e(c17830h, this);
            }
            if (!c17830h.f56879B0.m1463d((C0654C) arrayList.get(i10))) {
                try {
                    c17830h.m19582W(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i10++;
        }
    }
}
